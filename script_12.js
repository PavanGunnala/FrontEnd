const x = document.getElementById("demo");

document.getElementById("appName").innerHTML = 
"navigator.appName is " + navigator.appName;

localStorage.setItem("name","John Doe");
document.getElementById("ls").innerHTML = localStorage.getItem("name");
sessionStorage.setItem("name","John Doe");
document.getElementById("ss").innerHTML = sessionStorage.getItem("name");


function getLocation() {
  try {
    navigator.geolocation.getCurrentPosition(showPosition);
  } catch {
    x.innerHTML = err;
  }
}

function showPosition(position) {
  x.innerHTML = "Latitude: " + position.coords.latitude + 
  "<br>Longitude: " + position.coords.longitude;
}

function showError(error) {
    switch(error.code) {
      case error.PERMISSION_DENIED:
        x.innerHTML = "User denied the request for Geolocation."
        break;
      case error.POSITION_UNAVAILABLE:
        x.innerHTML = "Location information is unavailable."
        break;
      case error.TIMEOUT:
        x.innerHTML = "The request to get user location timed out."
        break;
      case error.UNKNOWN_ERROR:
        x.innerHTML = "An unknown error occurred."
        break;
    }
  }


function history() {
  window.history.back();
}

function history2(){
    window.history.go(-2);
}

