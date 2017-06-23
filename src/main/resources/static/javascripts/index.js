function cambiar_login() {
    document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_login";
    document.querySelector('.cont_form_login').style.display = "block";
    document.querySelector('.cont_form_sign_up').style.opacity = "0";

    setTimeout(function () {
        document.querySelector('.cont_form_login').style.opacity = "1";
    }, 400);

    setTimeout(function () {
        document.querySelector('.cont_form_sign_up').style.display = "none";
    }, 200);
}

function cambiar_sign_up() {
    document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_sign_up";
    document.querySelector('.cont_form_sign_up').style.display = "block";
    document.querySelector('.cont_form_login').style.opacity = "0";

    setTimeout(function () {
        document.querySelector('.cont_form_sign_up').style.opacity = "1";
    }, 100);

    setTimeout(function () {
        document.querySelector('.cont_form_login').style.display = "none";
    }, 400);


}


function ocultar_login_sign_up() {

    document.querySelector('.cont_forms').className = "cont_forms";
    document.querySelector('.cont_form_sign_up').style.opacity = "0";
    document.querySelector('.cont_form_login').style.opacity = "0";

    setTimeout(function () {
        document.querySelector('.cont_form_sign_up').style.display = "none";
        document.querySelector('.cont_form_login').style.display = "none";
    }, 500);

}

//登录处理
function real_login() {
    var username = $("#username").val();
    var password = $("#password").val();
    $.post("/login.do", {
            userName: username,
            password: password
        },
        function (data, status) {
            console.log(data);
            switch (data) {
                case "请注册！":
                    cambiar_sign_up();
                    break;
                case "进入主页面":
                    window.location.href = "/main.do";
                    break;
            }

        }
    );
}

//注册处理
function real_register() {
    var username = $("#username1").val();
    var password = $("#password1").val();
    var confirmPassword = $("#confirmPassword").val();
    var email = $("#email").val();


    if (confirmPassword === password) {
        $.post("/register.do", {
                userName: username,
                password: password,
                userEmail: email
            },
            function (data, status) {
                console.log(data);
                switch (data) {
                    case  "该用户已经存在！":
                        layer.alert('该账号已经使用！', {
                            icon: 5,
                            skin: 'layer-ext-moon'
                        });
                        break;
                    case "register success":
                        cambiar_login();
                        break;
                }
            }
        );
    } else {
        layer.alert('两次密码不一致！', {
            icon: 5,
            skin: 'layer-ext-moon'
        });
    }
}