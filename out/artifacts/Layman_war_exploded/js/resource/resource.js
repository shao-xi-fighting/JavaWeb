window.onload = function (){
  //table栏切换
  var items = document.querySelector('.resources-nav').querySelectorAll('li');
  var itemsContent = document.querySelector('.itemsUL').children;
  for(var i=0;i<items.length;i++){
    items[i].addEventListener('click',function(){
      for(var j=0;j<items.length;j++){
        itemsContent[j].style.display = 'none';
        if(this==items[j]){
          itemsContent[j].style.display = 'block';
        }
      }
    })
  }

}