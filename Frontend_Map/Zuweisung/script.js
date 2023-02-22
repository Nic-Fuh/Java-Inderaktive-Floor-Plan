const dbParam = JSON.stringify({table:"test", limit:20});
const xmlhttp = new XMLHttpRequest();

window.onload = function (){
    getPersonen();
    getRooms();
}

function getRequest(url){
    xmlhttp.open("GET", url, false);
    xmlhttp.send('');
    //console.log(xmlhttp.responseText);
    return xmlhttp.responseText;
}

function getPersonen(){
    var data = getRequest("http://localhost:8081/personen");

    var myObj = JSON.parse(data);

    for (var i = 0; i < Object.keys(myObj).length; i++){

        var id = myObj[i]["id"];
        var gender = myObj[i]["gender"];
        var person = myObj[i]["person"];
        var vorname = myObj[i]["vorname"];

        var tablerow = "<tr>";
        tablerow += "<td>" + id + "</td>";
        tablerow += "<td>" + gender + "</td>";
        tablerow += "<td>" + person + "</td>";
        tablerow += "<td>" + vorname + "</td>";
        tablerow += "</tr>";

        document.getElementById("person_table").innerHTML += tablerow;
        
        console.log(tablerow);
    }
}

function getRooms(){
    var data = getRequest("http://localhost:8081/rooms");

    var myObj = JSON.parse(data);

    for (var i = 0; i < Object.keys(myObj).length; i++){

        var id = myObj[i]["id"];
        var nummer = myObj[i]["nummer"];

        var tablerow = "<tr>";
        tablerow += "<td>" + id + "</td>";
        tablerow += "<td>" + nummer + "</td>";
        tablerow += "</tr>";

        document.getElementById("raum_table").innerHTML += tablerow;
        
        console.log(tablerow);
    }
}

