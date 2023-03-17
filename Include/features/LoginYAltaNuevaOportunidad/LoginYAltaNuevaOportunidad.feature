#language:es

@tag
Característica: Flujo de trabajo de oportunidades
  
  Antecedentes: 
    Dado que el usuario ingresa al sitio web

  Esquema del escenario: Creación de una nueva oportunidad
    Cuando el usuario ingresa sus credenciales de manera correcta <usuario> y <contraseña>
    Entonces se visualiza que ingresó correctamente a la plataforma
    Y crea una nueva oportunidad completando el formulario correspondiente 
    
    Ejemplos: 
      |            usuario           |         contraseña       |
      | ecosistemas.prueba@gmail.com | cavWDAa0EbnZjXBQ12k5kg== |



  Esquema del escenario: Nueva Oportunidad a Preventa 

    Cuando el usuario ingresa sus credenciales de manera correcta <usuario> y <contraseña>
    Entonces se visualiza que ingresó correctamente a la plataforma
    Y envía la nueva oportunidad a Preventa
    
    Ejemplos: 
      |            usuario           |         contraseña       |
      | ecosistemas.prueba@gmail.com | cavWDAa0EbnZjXBQ12k5kg== |
      
      
  Esquema del escenario: Cambiar usuario de Comercial a Preventa
  
  	Cuando el usuario ingresa sus credenciales de manera correcta <usuario> y <contraseña>
    Entonces se visualiza que ingresó correctamente a la plataforma
    Y modifica el tipo de usuario a Preventa
  	
    Ejemplos: 
      |            usuario           |         contraseña       |
      | ecosistemas.prueba@gmail.com | cavWDAa0EbnZjXBQ12k5kg== |
      
  Esquema del escenario: Nueva Oportunidad de Preventa a Comercial
  	Cuando el usuario ingresa sus credenciales de manera correcta <usuario> y <contraseña>
    Entonces se visualiza que ingresó correctamente a la plataforma
    Y envía la nueva oportunidad de Preventa a Comercial
    
    Ejemplos: 
      |            usuario           |         contraseña       |
      | ecosistemas.prueba@gmail.com | cavWDAa0EbnZjXBQ12k5kg== |
  	
  	
  Esquema del escenario: Edición de nueva oportunidad
    Cuando el usuario ingresa sus credenciales de manera correcta <usuario> y <contraseña>
    Entonces se visualiza que ingresó correctamente a la plataforma
     
    
    Ejemplos: 
      |            usuario           |         contraseña       |
      | ecosistemas.prueba@gmail.com | cavWDAa0EbnZjXBQ12k5kg== |
  	