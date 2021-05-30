// 用户点击亮度字体图标，切换日间模式或者夜间模式
// 点击产生两个效果，一是body背景改变，适应日夜间，二是字体图标改变，象征日夜间模式切换
var flag= true; //   var flag=true;//日间背景
function changeBg() { 
    var r = document.querySelector(':root');
    var dayLight = document.getElementById('day-light');
    var fontDayLight = document.getElementById('day-light-btn');
    console.log(fontDayLight);
    console.log(dayLight);
 
    if(flag) {
        document.body.style.backgroundColor = '#1e272e';
       fontDayLight.style.color = '#485460';
        r.style.setProperty('--mainColor', '#2f3542');
        r.style.setProperty('--circle','#747d8c');
        flag = false;
    }
    else {
        document.body.style.backgroundColor = '#f1f2f6';
        fontDayLight.style.color = '#fa983a';
        r.style.setProperty('--mainColor', '#8daeb7');
        r.style.setProperty('--circle','#fff');
        flag =true;
    }
 }
