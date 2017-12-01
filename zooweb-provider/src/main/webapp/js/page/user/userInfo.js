(document).ready(function() {
	alert("OK...");
})

function httpGet(userId){
    $.ajax({
        type : 'GET',
        url : 'http://localhost:8089/userRest/userInfo',
		async : true,//异步
        data : JSON.stringify({'userId':userId}),
        contentType: 'application/json;charset=utf-8', //默认: "application/x-www-form-urlencoded"
        dataType : 'json',
        success : function(data,textStatus) {
			alert(JSON.stringify(data));
        },
		error : function(msg,textStatus){
			alert(JSON.stringify(msg));
		}
    });
}
