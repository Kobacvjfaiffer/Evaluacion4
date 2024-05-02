const form = document.getElementById('loginForm');
const correo = document.getElementById('email');
const contrasena =document.getElementById('clave');

function login(e){
 e.preventDefault();
 const logged = correo.value === 'victo@gmail.com'&& contrasena.value === '1234'
 if(logged){
   sessionStorage.setItem('auth', true);
   location.href='./../inicio.html';
 }
else{ 
  alert('usuario y/o contraseña incorrectos');

}
}

form.addEventListener('submit',login);




