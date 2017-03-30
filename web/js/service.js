/**
 * service js
 * Created by fsweb on 17-3-29.
 */
var xmlHttp = new XMLHttpRequest();

function checkYZM() {
    var yzm = document.getElementById("yzm").value;
    if (yzm == "")
        return false;
    xmlHttp.open("POST", "checkYZM", true);
    xmlHttp.onreadystatechange = YZMCallback;
    xmlHttp.send("yzm=" + yzm);
}

function YZMCallback() {
    if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
        var result = xmlHttp.responseText;
        if (result == "true") {
            alert("true");
            return true;
        }
        else {
            alert("false");
            return false;
        }
    }
}

function buyProduct(pid) {
    xmlHttp.open("POST", "/buyCar", true);
    xmlHttp.onreadystatechange = carCallback;
    xmlHttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xmlHttp.send("pid=" + pid+"&count=1");
}

function carCallback() {
    if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
        alert(xmlHttp.responseText);
}