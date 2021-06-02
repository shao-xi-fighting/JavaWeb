var layer=layui.layer
// layer.alert('更改个人信息成功');
layer.msg("更改用户信息成功")
var succ = document.querySelector('#succ');
var timer = 3;
forward();
setInterval(forward,1000);
function forward (){
  if(timer==0){
    location.href = '/Layman/user/personalHome.html';
  }else {
    succ.innerHTML = timer+'秒钟后跳转到个人中心';
    timer--;
  }
}
