// script.js

// Función para agregar una transacción al historial
function agregarTransaccion(fecha, descripcion, monto, tipo) {
    // Obtener la referencia a la tabla
    var tablaTransacciones = document.getElementById("tablaTransacciones");
    
    // Crear una nueva fila para la tabla
    var fila = document.createElement("tr");
    
    // Crear celdas para la fila
    var celdaFecha = document.createElement("td");
    celdaFecha.textContent = fecha;
    
    var celdaDescripcion = document.createElement("td");
    celdaDescripcion.textContent = descripcion;
    
    var celdaMonto = document.createElement("td");
    celdaMonto.textContent = monto;
    
    var celdaTipo = document.createElement("td");
    celdaTipo.textContent = tipo;
    
    // Agregar las celdas a la fila
    fila.appendChild(celdaFecha);
    fila.appendChild(celdaDescripcion);
    fila.appendChild(celdaMonto);
    fila.appendChild(celdaTipo);
    
    // Agregar la fila a la tabla
    tablaTransacciones.appendChild(fila);
  }
  
  // Ejemplo de uso: agregar algunas transacciones al historial
  // Esto es solo para demostración, en una aplicación real estas transacciones se obtendrían de la base de datos o algún otro almacenamiento
  agregarTransaccion("2024-03-01", "Depósito", "$100.00", "Ingreso");
  agregarTransaccion("2024-03-02", "Retiro", "$50.00", "Egreso");
  agregarTransaccion("2024-03-03", "Envío a Cuenta XYZ", "$30.00", "Transferencia");