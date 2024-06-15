async function createMap() {
    Rover()
    let rocks = await fetch("http://localhost:8080/api/obstacle/")
    let rocksJson = await rocks.json()
    
    for (let i = 0; i < rocksJson.length; i++) {
       
        createRock(rocksJson[i].x,rocksJson[i].y)
    }
    
}
 async function Rover() {
    console.log("rover");
    let rover = await fetch("http://localhost:8080/api/rover/")
    let roverJson = await rover.json()
    console.log('roverJson', roverJson)
    document.getElementById("rover").style.top = (roverJson.y) + "px"
    document.getElementById("rover").style.left = (roverJson.x) + "px"
}
let posX = 0
let posY = 0
function createRock(x,y) {
    console.log("createRock");
    let Rock = document.createElement("img")
    Rock.setAttribute("src","./img/rock.jfif")
    Rock.setAttribute("class","rock")
    let container = document.getElementById("container")
    container.appendChild(Rock)

    Rock.style.top = (x) + "px"
    Rock.style.left = (y) + "px"
}
async function clickBtnForward( ) {
    try {
        const response = await fetch("http://localhost:8080/api/rover/comand/", {
          method: 'POST', 
          headers: {
            'Content-Type': 'application/json' 
          },
          body: JSON.stringify({
            "direction": "E"
          }) 
        });
    
        // Verificar si la respuesta del servidor fue exitosa
        if (!response.ok) {
          throw new Error('Error en la solicitud: ' + response.statusText);
        }
    
        
        Rover()
      } catch (error) {
        console.error('Hubo un problema con la solicitud fetch:', error);
       
      }
     
    
}
async function clickBtnback( ) {
    const response = await fetch("http://localhost:8080/api/rover/comand/", {
        method: 'POST', 
        headers: {
          'Content-Type': 'application/json' 
        },
        body: JSON.stringify({
          "direction": "W"
        }) 
      });
      Rover()
}
async function clickBtnUp(){
    const response = await fetch("http://localhost:8080/api/rover/comand/", {
        method: 'POST', 
        headers: {
          'Content-Type': 'application/json' 
        },
        body: JSON.stringify({
          "direction": "N"
        }) 
      });
      Rover()
}
async function clickBtnDown( ) {
    const response = await fetch("http://localhost:8080/api/rover/comand/", {
        method: 'POST', 
        headers: {
          'Content-Type': 'application/json' 
        },
        body: JSON.stringify({
          "direction": "S"
        }) 
      });
      Rover()
}
function clickBtnspin( ) {
    alert("clickBtnspin")
}
createMap()