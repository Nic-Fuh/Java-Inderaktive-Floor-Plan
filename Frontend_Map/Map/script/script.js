const dbParam = JSON.stringify({table:"test", limit:20});
const xmlhttp = new XMLHttpRequest();

function getRequest(url){
    xmlhttp.open("GET", url, false);
    xmlhttp.send('');
    console.log(xmlhttp.responseText)
    return xmlhttp.responseText;
}

function onRoomClick(roomnumber){
    var data = getRequest("http://localhost:8081/rwp/number/" + roomnumber);
    var myObj = JSON.parse(data);
    var myObjPersonen = myObj["personen"];
    var text = "<table border='1'>";
    // text += "<tr><td>Raum Nr:</td><td>" + myObj["nummer"] + "</td></tr>";
    text += "<tr><td>Raum Nr:</td><td>" + roomnumber + "</td></tr>";
    text += "<tr><td>Personen:</td><td>";
    for (var i = 0; i < Object.keys(myObjPersonen).length; i++){
        text += "" + myObjPersonen[i]["person"] + ", " + myObjPersonen[i]["vorname"] + " | ";
    }
    text += "</td></tr>"
    text += "</table>";
    document.getElementById("Table_Test").innerHTML = text;
}

$(function(){
    $("#EtagenView").load("EG.html");
});
function chooseFloor(data){
    if (data == "2") {
        $("#EtagenView").load("2.OG.html");
        document.getElementById("EtagenText").innerHTML = "2.OG";
    }else if (data == "1") {
        $("#EtagenView").load("1.OG.html");
        document.getElementById("EtagenText").innerHTML = "1.OG";
    }else if (data == "0") {
        $("#EtagenView").load("EG.html");
        document.getElementById("EtagenText").innerHTML = "EG";
    }else{
        $("#EtagenView").load("EG.html");
        document.getElementById("EtagenText").innerHTML = "EG";
    }
}

