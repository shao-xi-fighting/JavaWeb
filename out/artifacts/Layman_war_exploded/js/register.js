window.onload = function () {
    var signUpButton = document.getElementById('signUp')
    var signInButton = document.getElementById('signIn')
    var container = document.getElementById('dowebok')

    signUpButton.addEventListener('click', function () {
        container.classList.add('right-panel-active')
    })

    signInButton.addEventListener('click', function () {
        container.classList.remove('right-panel-active')
    })
    var uname = document.querySelector('.uname');
    var remindName = document.querySelector('.remind-name');
    var pass = document.querySelector('.upass');
    var remindPass = document.querySelector('.remind-pass');
    var rgName = /^[a-zA-Z0-9_-]{3,12}/;
    uname.onblur = function (){
        if(!rgName.test(uname.value)){
            remindName.innerHTML = '用户名格式错误，长度3~12位';
            remindName.style.color = '#ff416c'
            return false;
        }else {
            remindName.innerHTML = '用户名格式正确'
            remindName.style.color = '#00b894'
        }
    }
    pass.onblur = function () {
        if(!rgName.test(pass.value)){
            remindPass.style.color = '#ff416c';
            remindPass.innerHTML ='密码格式错误，长度3~12位';
            return false;
        }else {
            remindPass.style.color = '#00b894';
            remindPass.innerHTML = '密码格式正确';
        }
    }
}