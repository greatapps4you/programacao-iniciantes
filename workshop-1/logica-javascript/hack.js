    
    var theUrl = "https://api.ipify.org";

    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", theUrl, false );
    xmlHttp.send( null );
    document.write("<br>IP hacked: " + "<h1 style='color:red'>" + xmlHttp.responseText + "</h1><br>");
