var temp;

function currencyConverter() {
    var to = document.getElementById("toCountry").value;
    var xmlhttp = new XMLHttpRequest();
    var url = "https://openexchangerates.org/api/latest.json" +
        "?app_id=0866c26b9f944eb6a9e0b8bab2aa528a" +
        "&symbols=" + to;
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            var result = xmlhttp.responseText;
            var jsResult = JSON.parse(result);
            temp = jsResult["rates"][to];
            document.getElementById("display").innerHTML = `${`${temp.toFixed(2)} ${to}`}`;
        }
    }

}

function calculate() {
    var send = document.getElementById("sendAmount").value;
    var receive = send * temp.toFixed(2);
    document.getElementById("receiveAmount").value = receive.toFixed(2);
}