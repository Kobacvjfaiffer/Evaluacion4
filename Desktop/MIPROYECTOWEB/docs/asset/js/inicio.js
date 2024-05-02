// script.js

document.addEventListener("DOMContentLoaded", function() {
    
    var index = 0;
    var images = document.querySelectorAll('.carousel img');
    var totalImages = images.length;
    var interval = setInterval(function() {
      images[index].style.display = 'none';
      index = (index + 1) % totalImages;
      images[index].style.display = 'block';
    }, 3000); 
    
    
    var activos = [
      { nombre: 'Bitcoin', precio: '$50,000', variacion: '+5%' },
      { nombre: 'Ethereum', precio: '$2,000', variacion: '+3%' },
      
    ];
  
    var tablaActivos = document.querySelector('.container table tbody');
    activos.forEach(function(activo) {
      var fila = document.createElement('tr');
      fila.innerHTML = `
        <td>${activo.nombre}</td>
        <td>${activo.precio}</td>
        <td>${activo.variacion}</td>
      `;
      tablaActivos.appendChild(fila);
    });
  
    
   
  });