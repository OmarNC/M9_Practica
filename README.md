# Modulo 9 Ejercicio sobre API REST

### Integrantes del equipo
* Manuel Mérida Aguilar
* Ernesto Velasco Arciniega
* Rodrigo Ivan  Olvera Martinez
* Omar Nieto Crisóstomo

### Introduccion

En el ejercicio se desarrolla una API REST básica para el registro de Vuelos utilizando Spring Boot.


### Simulación de la base de datos

Se creo una lista de vuelos con la colección HashMap y la clase POJO de Vuelos  como se muestra en 
las siguientes imagenes.

<image src="/images/Vuelo.png" alt="Clase POJO  Vuelo">

<strong> Figura 1</strong>  Clase POJO de Vuelo.

<image src="/images/end_point_y_listadb.PNG" alt="EndPoint y lista de Vuelos para simular una base de datos">

<strong>Figura 2 </strong>  Lista de vuelos con la colección HashMap.

### Creditos

Para mostrar lso créditos se debe ingresar en el navegador la siguiente ruta:
* http://localhost:8080/api/vuelos/creditos

La siguinte figura muestra la salida al acceder con un navegador
<image src="/images/creditos.png" alt="acceso al endpoint creditos">

<strong> Figura 3</strong> Acceso a la ruta de creditos con un navegador web.

### Listar todos los registros (GET)

El siguiente endpoint se emplea para obtener todos los registros:
* http://localhost:8080/api/vuelos/

La siguinte figura muestra la salida al acceder con postman 
<image src="/images/findAll_vuelos_postman.png" alt="Respuesta en postman al solicitar todos los registros">

<strong> Figura 4</strong> Salida en postman al listar todos los registros.

### Obtener un registro (GET)

El siguiente endpoint se utiliza para obtener a un solo registro:
* http://localhost:8080/api/vuelos/id

Las siguientes figuras muestran la respuesta en postman al solicitar un registro existente
y uno que no se encuentra en la lista, respectivamente.

<image src="/images/findById_vuelos_ok_postman.png" alt="Respuesta en postman cuando se solicita un registro existente">

<strong> Figura 5</strong> Respuesta en postman cuando se solicita un registro existente.

<image src="/images/findById_vuelos_notFound_postman.png" alt="Respuesta en postman cuando se solicita un registro NO existente">

<strong> Figura 6</strong> Respuesta en postman cuando se solicita un registro NO existente.

<image src="/images/getAll_getById.png" alt="Código para las peticiones GET de todos los registro y de uno solo">

<strong> Figura 7</strong> Código para las peticiones GET de todos los registro y de uno solo.


### Crear un registro (POST)

El siguiente endpoint se utiliza para agregar un registro con el método POST:
* http://localhost:8080/api/vuelos/

Las siguientes figuras muestran la petición en postman al enviar un nuevo registro.

<image src="/images/agregarVuelo_ok_postman.png" alt="Petición y Respuesta en postman cuando al crear un registro">

<strong> Figura 8</strong> Petición y Respuesta en postman cuando al crear un registro.

<image src="/images/agregarVuelo.png" alt="Código que implementa el método POST">

<strong> Figura 9</strong> Código que implementa el método POST.

### Actualizar un registro (PUT)

El siguiente endpoint se utiliza para actualizar un registro existente con el método PUT:
* http://localhost:8080/api/vuelos/id

Las siguientes figuras muestran la petición en postman.

<image src="/images/actualizarVuelo_ok_postman.png" alt="Petición y Respuesta en postman cuando se modifica 
un registro con el método PUT">

<strong> Figura 10</strong> Petición y Respuesta en postman cuando se modifica un registro con el método PUT.

<image src="/images/actualizarVuelo_notFound_postman.png" alt="Petición y Respuesta en postman cuando 
se desea modificar un registro no existente (PUT)">

<strong> Figura 11</strong> Petición y Respuesta en postman cuando 
se desea modificar un registro no existente (PUT).

<image src="/images/actualizarVuelo_badRequest_postman.png" alt="Petición y Respuesta en postman cuando 
se desea modificar un registro sin el envio del objeto JSON en body">

<strong> Figura 12</strong>Petición y Respuesta en postman cuando 
se desea modificar un registro sin el envio del objeto JSON en body.

<image src="/images/actualizarVuelo.png" alt="Código que implementa el método PUT">

<strong> Figura 13</strong> Código que implementa el método PUT.

### Modificación parcial de un registro (PATCH)

El siguiente endpoint se utiliza para modificar un registro existente de forma parcial con el método PATCH:
* http://localhost:8080/api/vuelos/id

Las siguientes figuras muestran la petición en postman .

<image src="/images/modificarVuelo_ok_postman.png" alt="Petición y Respuesta en postman cuando se modifica
un registro con el método PATCH">

<strong> Figura 14</strong> Petición y Respuesta en postman cuando se modifica un registro con el método PATCH.

<image src="/images/modificarVuelo_notFound_postman.png" alt="Petición y Respuesta en postman cuando
se desea modificar un registro no existente (PATCH)">

<strong> Figura 15</strong> Petición y Respuesta en postman cuando 
se desea modificar un registro no existente (PATCH).

<image src="/images/modificarVuelo_badRequest_postman.png" alt="Petición y Respuesta en postman cuando
se desea modificar un registro sin el envio del objeto JSON en body">

<strong> Figura 16</strong> Petición y Respuesta en postman cuando 
se desea modificar un registro sin el envio del objeto JSON en body.

<image src="/images/actualizarVuelo.png" alt="Código que implementa el método PATCH">

<strong> Figura 17</strong> Código que implementa el método PATCH.



### Borrar un registro (DELETE)

El siguiente endpoint se utiliza para eliminar un registro existente con el método DELETE:
* http://localhost:8080/api/vuelos/id

Las siguientes figuras muestran la petición en postman.

<image src="/images/deleteVuelo_ok_postman.png" alt="Petición y Respuesta en postman cuando se borra
un registro con el método DELETE">

<strong> Figura 18</strong> Petición y Respuesta en postman cuando se borra
un registro con el método DELETE.

<image src="/images/deleteVuelo_notFound_postman.png" alt="Petición y Respuesta en postman cuando
se desea borrar un registro no existente (DELETE)">

<strong> Figura 19</strong> Petición y Respuesta en postman cuando
se desea borrar un registro no existente (DELETE).

<image src="/images/deleteVuelo.png" alt="Código que implementa el método DELETE">

<strong> Figura 20</strong> Código que implementa el método DELETE.







