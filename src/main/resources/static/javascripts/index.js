$().ready(function () {
    var form = $("form.ajaxforms");
    $("#signupForm").validate({
        rules: {
            'inputAccount': {
                required: true,
                minlength: 2
            },
            'inputPassword': {
                required: true,
                minlength: 5
            }
        },
        //验证未通过提示消息
        messages: {
            'inputAccount': {
                required: '请输入用户名'
            },
            'inputPassword': {
                required: '请输入密码'
            }
        }
        // submitHandler: function (form) {
        //     $(form).ajaxSubmit({
        //         url: form.getAttribute('action'),
        //         dataType: 'json',
        //         type: 'post',
        //         data: {
        //             userName: $('#inputAccount').val(),
        //             password: $('#inputPassword').val()
        //         },
        //         success: function (data, statusText, xhr, $form) {
        //         }
        //     });
        // }
    });
});