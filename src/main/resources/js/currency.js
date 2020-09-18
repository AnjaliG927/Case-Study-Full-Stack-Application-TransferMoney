function currencyConverter(){
    var to=document.getElementById("to").value;
    var xmlhttp=new XMLHttpRequest();
    var url="https://openexchangerates.org/api/latest.json"+
        "?app_id=0866c26b9f944eb6a9e0b8bab2aa528a"+
    "&symbols="+to;
    xmlhttp.open("GET",url,true);
    xmlhttp.send();
    xmlhttp.onreadystatechange=function(){
        if(xmlhttp.readyState==4 && xmlhttp.status==200){
           var result=xmlhttp.responseText;
           alert(result);
           var jsResult=JSON.parse(result);
        }
    }
}