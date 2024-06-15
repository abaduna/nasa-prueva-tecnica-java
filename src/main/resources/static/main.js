function createMap() {
    moveRover(2,3)

    createRock(1,5)
}
function moveRover(x,y) {
    document.getElementById("rover").style.top = (y *100) + "px"
    document.getElementById("rover").style.left = (x *100) + "px"
}
let posX = 0
let posY = 0
function createRock(x,y) {
    let Rock = document.createElement("img")
    Rock.setAttribute("src","./img/rock.jfif")
    Rock.setAttribute("class","rock")
    let container = document.getElementById("container")
    container.appendChild(Rock)

    Rock.style.top = (5 *100) + "px"
    Rock.style.left = (5 *100) + "px"
}
function clickBtnForward( ) {
    posX++;
    moveRover(posX,posY)
    
}
function clickBtnback( ) {
    posX--;
    moveRover(posX,posY)
    
}
function clickBtnspin( ) {
    alert("clickBtnspin")
}