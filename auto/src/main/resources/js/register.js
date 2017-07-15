/**
 * Created by win7 on 2017/6/24.
 */
function register()
{

    var user = {"username":$("#username").val(),
    "password":$("#password").val(),
    "age":$("#age").val(),
    "mobileno":$("#mobileno").val()};
  
    $.ajax({
        type: "POST",
        url: "/users/add",
        contentType: "application/json; charset=utf-8",
        data:{

        },
        success: function (message) {
            if (message != null) {
                alert("请求已提交！我们会尽快与您取得联系");
            }
        },
        error: function (message) {
            alert("error="+message)
        }
    });

}
