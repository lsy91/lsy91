package utility;

public class Paging2 {
	
	private int totalCount = 0; // 총 레코드 건수
	private int totalPage = 0; // 전체 페이지 수
	private int pageNumber = 0; // 보여줄 페이지 넘버 (표현 가능한 페이지는 1부터 totalPage까지이다.)
	private int pageSize = 0; // 한 페이지에 보여줄 건수
	private int beginRow = 0; // 현재 페이지의 시작 행
	private int endRow = 0; // 현재 페이지의 끝 행
	private int pageCount = 3; // 한 화면에 보여줄 페이지 링크 수 (페이지 개수) => 레코드 개수 아님
	private int beginPage = 0; // 페이징 처리 끝 페이지 번호
	private int endPage = 0; // 페이징 처리 끝 페이지 번호
	private int offset = 0; // 건너 뛰어야 하는 페이지 개수
	private int limit = 0;
	private String url = ""; // 예시 ==> http://localhost:8080/MyServlet/list.ab
	private String pagingHtml = ""; // 하단의 숫자 페이지 링크 [맨처음][이전]
	// 검색을 위한 변수 추가
	private String whatColumn = ""; //검색 모드(작성자, 글제목, 전체 검색은 all) 등등
	private String keyword = ""; // 검색할 단어
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getBeginRow() {
		return beginRow;
	}
	public void setBeginRow(int beginRow) {
		this.beginRow = beginRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getBeginPage() {
		return beginPage;
	}
	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPagingHtml() {
		return pagingHtml;
	}
	public void setPagingHtml(String pageingHtml) {
		this.pagingHtml = pageingHtml;
	}
	public String getWhatColumn() {
		return whatColumn;
	}
	public void setWhatColumn(String whatColumn) {
		this.whatColumn = whatColumn;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public Paging2(
			String _pageNumber,
			String _pageSize,
			int totalCount,
			String url,
			String whatColumn,
			String keyword) {
		
		if( _pageNumber == null || _pageNumber.equals("null") || _pageNumber.equals("") ) {
			System.out.println("_pageNumber:" + _pageNumber); // null
			_pageNumber = "1";
		}
		this.pageNumber = Integer.parseInt( _pageNumber );
		
		if( _pageSize == null || _pageSize.equals("null") || _pageSize.equals("") ) {
			_pageSize = "10"; // 한 페이지에 보여줄 레코드 개수
		}
		this.pageSize = Integer.parseInt( _pageSize );
		
		this.limit = pageSize; // 한 페이지에 보여줄 레코드 개수
		
		this.totalCount = totalCount;
		
		this.totalPage = (int)Math.ceil((double)this.totalCount / this.pageSize);
		
		this.beginRow = ( this.pageNumber - 1) * this.pageSize + 1; // 1,3
		this.endRow = this.pageNumber * this.pageSize; // 2,4
		
		if( this.pageNumber > this.totalPage) {
			this.pageNumber = this.totalPage;
		}
		
		this.offset = ( pageNumber - 1 ) * pageSize; // 1:0, 2:2, 3:4
		
		if(this.endRow > this.totalCount) {
			this.endRow = this.totalCount;
		}
		
		this.beginPage = ( this.pageNumber - 1 ) / this.pageCount * this.pageCount + 1;
		this.endPage = this.beginPage + this.pageCount - 1;
		
		System.out.println("pageNumber:" + pageNumber + "/totalPage:" + totalPage);
		
		if( this.endPage > this.totalPage) {
			this.endPage = this.totalPage;
		}
		
		System.out.println("pageNumber2:" + pageNumber + "/totalPage2:" + totalPage);
		
		this.url = url; //   /ex/list.bd
		this.whatColumn = whatColumn;
		this.keyword = keyword;
		System.out.println("whatColumn:" + whatColumn + "/keyword:" + keyword);
		
		this.pagingHtml = getPagingHtml(url);
		
	} 
	
	private String getPagingHtml( String url ) {
		
		System.out.println("getPagingHtml url:" + url);
		
		String result ="";
		// added_param 변수 : 검색 관련하여 추가되는 파라미터 리스트
		String added_param = "&whatColumn=" + whatColumn + "&keyword=" + keyword;
		
		if( this.beginPage != 1) {
			result += "&nbsp;<a href='" + url
					+ "?pageNumber=" + ( 1 ) + "&pageSize=" + this.pageSize
					+ added_param + "'>맨 처음</a>&nbsp;";
			
			result += "&nbsp;<a href='" + url
					+ "?pageNumber=" + ( 1 ) + "&pageSize=" + this.pageSize
					+ added_param + "'>이전</a>&nbsp;";
		}
		
		for(int i = this.beginPage; i <= this.endPage; i++) {
			if( i == this.pageNumber) {
				result += "&nbsp;<font color='red'>" + i + "</font>&nbsp;";
			}
			else {
				result += "&nbsp;<a href='" + url
						+ "?pageNumber=" + i + "&pageSize=" + this.pageSize
						+ added_param + "'>" + i + "</a>&nbsp;";
			}
		}
		
		System.out.println("result : " + result);
		System.out.println();
		
		if( this.endPage != this.totalPage) {
			
			result += "&nbsp;<a href='" + url
					+ "?pageNumber=" + (this.endPage + 1) + "&pageSize=" + this.pageSize
					+ added_param + "'>다음</a>&nbsp;";
			
			result += "&nbsp;<a href='" + url
					+ "?pageNumber=" + (this.totalPage) + "&pageSize=" + this.pageSize
					+ added_param + "'>맨 끝</a>&nbsp;";
		}
		
		System.out.println("result2:" + result);
		
		return result;
	}
	
}
