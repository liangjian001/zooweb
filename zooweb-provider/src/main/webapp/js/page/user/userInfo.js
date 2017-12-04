(document).ready(function() {
	alert("OK...");
})

function httpGet(userId){
    $.ajax({
        type : 'GET',
        url : 'http://localhost:8089/userRest/userInfo/'+userId,
		async : true,//异步
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

function httpPost(){
    $.ajax({
        type : 'POST',
        url : 'http://localhost:8089/userRest/user',
        async : true,//异步
        //data: $("#editForm").serialize(),
        data : JSON.stringify({
            'userId':'1233eee',
            'userPassword':'123456',
            'userName':'smith',
            'userRemark':' 测试数据',
            'userPhone':'123123445523',
            'userEmail':'qwe@abc.com',
            'userStatus':'Y'
        }),
        contentType: 'application/json;charset=utf-8', //默认: "application/x-www-form-urlencoded"
        dataType : 'json',
        success : function(result,textStatus) {
            alert(JSON.stringify(result));
        },
        error : function(msg,textStatus){
            alert(JSON.stringify(msg));
        }
    });
}