/*writeForm.jsp 유효성 검사*/

function writeSave() {
	if($('input[name="writer"]').val() == ""){
		alert("이름을 입력하세요.");
		$('input[name="writer"]').focus();
		return false;
	}
	
	if($('input[name="subject"]').val() == "") {
		alert("제목을 입력하세요.");
		$('input[name="subject"]').focus();
		return false;
	}
	
	if($('input[name="email"]').val() == "") {
		alert("이메일을 입력하세요.");
		$('input[name="email"]').focus();
		return false;
	}
	
	if($('input[name="email"]').val().indexOf('@') == -1) {
		alert("이메일 형식이 올바르지 않습니다.");
		$('input[name="email"]').val("").focus();
		return false;
	}
	
	if($('textarea').val() == "") {
		alert("내용을 작성하세요.");
		$('textarea').focus();
		return false;
	}
	
	if($('input[name="passwd"]').val() == "") {
		alert("비밀번호를 입력하세요.");
		$('input[name="passwd"]').focus();
		return false;
	}
}