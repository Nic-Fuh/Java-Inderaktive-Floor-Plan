const dbParam = JSON.stringify({table:"test", limit:20});
const xmlhttp = new XMLHttpRequest();

var Person_ID_Array = new Array();
var Room_ID;

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

        var tablerow = "<tr onclick='selectPerson(" + id + ")'>";
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

        var tablerow = "<tr onclick='selectRoom(" + id + ")'>";
        tablerow += "<td>" + id + "</td>";
        tablerow += "<td>" + nummer + "</td>";
        tablerow += "</tr>";

        document.getElementById("raum_table").innerHTML += tablerow;
        
        console.log(tablerow);
    }
}

function selectPerson(id){
    Person_ID_Array.push(id);
    document.getElementById("testArray").innerHTML += id + ", ";
}

function clearArray(){
    Person_ID_Array = [];
    document.getElementById("testArray").innerHTML = "";
}

function selectRoom(id){
    Room_ID = id;
}

function merge(){

    if (Room_ID > 0 && Person_ID_Array.length > 0){

        var personen = "";

        for (var i = 0; i < Person_ID_Array.length; i++){
            personen += Person_ID_Array[i] + ", ";
        }
        
        alert("Room: " + Room_ID + " with Person: " + personen);

        // JSON body erstellen und zu http://localhost:8081/addzuweisung/ schicken
    }
}
