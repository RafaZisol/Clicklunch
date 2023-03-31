function contras() {
    let contra = document.getElementById("inputcontra").value;
    let cont = document.getElementById("inputcontra1").value;
    if (contra.length >= 8) {
        if (contra == cont) {
            alert("BUENA")
        }
        else {
            alert("ERROR")
        }
    }
    else {
        alert("Verifique el tamaño de la contraseña")
    }
}

function nombre(){
    let nombre = document.getElementsById("inputusuario").value;
    if (nombre.length<=20){
        alert("Usuario Correcto")
    }
}

function validarMail() { 
    validar = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,4})+$/;
    let email = document.getElementsById("inputcorreo").value;
    if(validar.test(email)){
        
    }
  }