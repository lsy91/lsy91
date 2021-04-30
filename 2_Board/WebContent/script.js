function writeSave() {
	
	if($('input[name="writer"]').val() == '') {
		alert("이름을 작성하세요.");
		$('input[name="writer"]').focus();
		return false;
	}
	
	if($('input[name="subject"]').val() == '') {
		alert("제목을 작성하세요.");
		$('input[name="subject"]').focus();
		return false;
	}
	
	if($('input[name="email"]').val() == '') {
		alert("email을 작성하세요.");
		$('input[name="email"]').focus();
		return false;
	}
	
	if($('textarea[name="content"]').val() == '') {
		alert("내용을 작성하세요.");
		$('#ct').focus();
		return false;
	}
	
	if($('input[name="passwd"]').val() == '') {
		alert("패스워드를 작성하세요.");
		$('input[name="passwd"]').focus();
		return false;
	}
}