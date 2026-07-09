Cristian se encargará de la parte de los paquetes, es decir, de representar los objetos que se van a enviar dentro del sistema.

Su trabajo principal será crear una clase abstracta llamada Paquete, donde se guardarán los datos básicos de cualquier paquete, como el nombre del destinatario y el peso en kilogramos. También deberá agregar dentro de esta clase una variable de tipo EstrategiaEnvio, que será el objeto encargado de calcular el costo del envío.

Cristian no debe calcular directamente el precio del envío dentro de Paquete. En lugar de eso, debe crear un método llamado obtenerCostoEnvio(), el cual llamará al método calcularCosto() de la estrategia correspondiente. Esto permite aplicar correctamente el patrón Strategy, porque el paquete solo guarda la información y delega el cálculo a otra clase.

También debe validar que el peso del paquete sea mayor a 0. Si el usuario intenta crear un paquete con peso negativo o igual a cero, el constructor debe lanzar un error usando IllegalArgumentException.

Además, Cristian puede crear clases hijas como PaqueteEstandar, PaqueteExpress y PaqueteInternacional. Estas clases heredan de Paquete y sirven para crear paquetes con una estrategia de envío ya asignada. Por ejemplo, PaqueteExpress usaría automáticamente new EnvioExpress().
