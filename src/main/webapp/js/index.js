// alert("nihao");
   /* window.onload = function(){

               //满意度滚动
                var area =document.getElementById('scrollBox');
                var con1 = document.getElementById('con1');
                var con2 = document.getElementById('con2');
                con2.innerHTML=con1.innerHTML;
                function scrollUp(){
                if(area.scrollTop>=con1.offsetHeight){
                    area.scrollTop=0;
                }else{
                    area.scrollTop++
                }
                }                
                var time = 50;
                var mytimer=setInterval(scrollUp,time);
                area.onmouseover=function(){
                    clearInterval(mytimer);
                }
                area.onmouseout=function(){
                    mytimer=setInterval(scrollUp,time);
                }
    }*/

    window.onload = function(){
        var div1 = document.getElementById('strategy_1');
        var title1 = document.getElementById('title1');
        var check1 = document.getElementById('check1');

        var div2 = document.getElementById('strategy_2');
        var title2 = document.getElementById('title2');
        var check2 = document.getElementById('check2');

        var div3 = document.getElementById('strategy_3');
        var title3 = document.getElementById('title3');
        var check3 = document.getElementById('check3');

        var div4 = document.getElementById('strategy_4');
        var title4 = document.getElementById('title4');
        var check4 = document.getElementById('check4');

        div1.onmouseover = function(){
            startMove(div1,{opacity:80});
            startMove(title1,{opacity:100,paddingTop:50});
            disp1();
             
        }
        div1.onmouseout = function(){
             startMove(div1,{opacity:100});
             startMove(title1,{paddingTop:0});
             hid1();
        }


        div2.onmouseover = function(){
            startMove(div2,{opacity:80});
            startMove(title2,{opacity:100,paddingTop:50});
            startMove(check2,{});
            disp2();
             
        }
        div2.onmouseout = function(){
             startMove(div2,{opacity:100});
             startMove(title2,{paddingTop:0});
             hid2();
        }

        div3.onmouseover = function(){
            startMove(div3,{opacity:80});
            startMove(title3,{opacity:100,paddingTop:50});
            startMove(check3,{});
            disp3();
             
        }
        div3.onmouseout = function(){
             startMove(div3,{opacity:100});
             startMove(title3,{paddingTop:0});
             hid3();
        }

        div4.onmouseover = function(){
            startMove(div4,{opacity:80});
            startMove(title4,{opacity:100,paddingTop:50});
            startMove(check4,{});
            disp4();
             
        }
        div4.onmouseout = function(){
             startMove(div4,{opacity:100});
             startMove(title4,{paddingTop:0});
             hid4();
        }

     }



    function disp1(){
        document.getElementById("check1").style.display = 'block';
    }

    function hid1(){
        document.getElementById("check1").style.display = 'none';
    }


     function disp2(){
        document.getElementById("check2").style.display = 'block';
    }

    function hid2(){
        document.getElementById("check2").style.display = 'none';
    }


    function disp3(){
        document.getElementById("check3").style.display = 'block';
    }

    function hid3(){
        document.getElementById("check3").style.display = 'none';
    }


    function disp4(){
        document.getElementById("check4").style.display = 'block';
    }

    function hid4(){
        document.getElementById("check4").style.display = 'none';
    }
         /* 运动框架*/
    function getStyle(obj,attr){
      return getComputedStyle ? getComputedStyle(obj,false)[attr] : obj.currentStyle[attr];
    }

    function startMove(obj, json, fnEnd){
    clearInterval(obj.timer);
    obj.timer=setInterval(function (){
        var bStop=true;        //假设：所有值都已经到了
        
        for(var attr in json)
        {
            var cur=0;
            
            if(attr=='opacity')
            {
                cur=Math.round(parseFloat(getStyle(obj, attr))*100);
            }
            else
            {
                cur=parseInt(getStyle(obj, attr));
            }  
            var speed=(json[attr]-cur)/6;
            speed=speed>0?Math.ceil(speed):Math.floor(speed);
            
            if(cur!=json[attr])
                bStop=false;
            
            if(attr=='opacity')
            {
                obj.style.filter='alpha(opacity:'+(cur+speed)+')';
                obj.style.opacity=(cur+speed)/100;
            }
            else
            {
                obj.style[attr]=cur+speed+'px';
            }
        } 
        if(bStop)
        {
            clearInterval(obj.timer);         
            if(fnEnd)fnEnd();
        }
    }, 30);
}



   
    //alert("nihao");





    
 