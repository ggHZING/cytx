//alert("你好");
window.onload=function ()
{
	
	var otxt=document.getElementById('strategy_txt');//获取输入文本
	var obtn=document.getElementById('strategy_report');//发表按钮
	var oUl=document.getElementById('strategy_comment_txt');//内容发表到的地方
	var sum = document.getElementById('strategy_number');//评论数量
	
	obtn.onclick=function (){
		var oLi=document.createElement('div');
		var aLi=oUl.getElementsByTagName('div');
		
		oLi.innerHTML=otxt.value;
		
		if(aLi.length == 0)
		{
			oUl.appendChild(oLi);
			
		}
		else
		{
			oUl.insertBefore(oLi, aLi[0]);
			
		}
		if (otxt.value != "") {
			sum.value = parseInt(sum.value) + 1;
		}
		else{
			alert("请输入内容");
		}
        otxt.value = "";
	}

}

