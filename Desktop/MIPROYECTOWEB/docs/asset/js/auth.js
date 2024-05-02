const logged = sessionStorage.getItem('auth')

if(!logged)
  location.href ='./../registro.html';