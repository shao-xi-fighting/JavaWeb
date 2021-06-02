window.onload = function (){
  //表单验证
  var form=layui.form
  var layer=layui.layer
  form.verify({
    pwd: [
      /^[\S]{6,12}$/
      ,'密码必须6到12位，且不能出现空格'
    ],
    //   校验两次密码是否一致
    repwd: function (value) {
      //通过形参拿到确认面膜框中的内容
      // 需要拿到密码框中的内容，再进行比较，不等则返回提示信息
      var pwd = $('#user_infoset [name=password]').val()
      if(pwd!==value){
        return '两次输入密码不一致！'
      }
    }
  })
  //验证码验证
  var userForm = document.getElementById("user_infoset")
  var imaVerify = document.getElementById("imgValidate")
  imaVerify.addEventListener('click',function (){
    this.src="../JSP/user_infoset.jsp"
  })

}