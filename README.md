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

<img src="/images/Vuelo.png" alt="Clase POJO  Vuelo"> <br>
<strong> Figura 1</strong>  Clase POJO de Vuelo.

<img src="/images/end_point_y_listadb2.png" alt="EndPoint y lista de Vuelos para simular una base de datos"> <br>
<strong>Figura 2 </strong>  Lista de vuelos con la colección HashMap.

### Creditos

Para mostrar lso créditos se debe ingresar en el navegador la siguiente ruta:
* http://localhost:8080/api/vuelos/creditos

La siguinte figura muestra la salida al acceder con un navegador

<img src="/images/creditos.png" alt="acceso al endpoint creditos"> <br>
<strong> Figura 3</strong> Acceso a la ruta de creditos con un navegador web.

### Listar todos los registros (GET)

El siguiente endpoint se emplea para obtener todos los registros:
* http://localhost:8080/api/vuelos/

La siguinte figura muestra la salida al acceder con postman 
<img src="/images/findAll_vuelos_postman.png" alt="Respuesta en postman al solicitar todos los registros"> <br>
<strong> Figura 4</strong> Salida en postman al listar todos los registros.

### Obtener un registro (GET)

El siguiente endpoint se utiliza para obtener a un solo registro:
* http://localhost:8080/api/vuelos/id

Las siguientes figuras muestran la respuesta en postman al solicitar un registro existente
y uno que no se encuentra en la lista, respectivamente.

<img src="/images/findById_vuelos_ok_postman.png" alt="Respuesta en postman cuando se solicita un registro existente">  <br>
<strong> Figura 5</strong> Respuesta en postman cuando se solicita un registro existente.

<img src="/images/findById_vuelos_notFound_postman.png" alt="Respuesta en postman cuando se solicita un registro NO existente">  <br>
<strong> Figura 6</strong> Respuesta en postman cuando se solicita un registro NO existente.

<img src="/images/getAll_getById.png" alt="Código para las peticiones GET de todos los registro y de uno solo"> <br>
<strong> Figura 7</strong> Código para las peticiones GET de todos los registro y de uno solo.


### Crear un registro (POST)

El siguiente endpoint se utiliza para agregar un registro con el método POST:
* http://localhost:8080/api/vuelos/

Las siguientes figuras muestran la petición en postman al enviar un nuevo registro.

<img src="/images/agregarVuelo_ok_postman.png" alt="Petición y Respuesta en postman cuando al crear un registro"> <br>
<strong> Figura 8</strong> Petición y Respuesta en postman cuando se crear un registro.

<img src="/images/AgregarVuelo_Post_NotNull_postman.png" alt="Respuesta en postman cuando se trata de agregar un vuelo con el campo origen en nulo usando el método  POST"> <br>
<strong> Figura 9</strong> Respuesta en postman cuando se trata de agregar un vuelo con el campo origen en nulo usando el método  POST.


<img src="/images/agregarVuelo.png" alt="Código que implementa el método POST"> <br>
<strong> Figura 10</strong> Código que implementa el método POST.


### Actualizar un registro (PUT)

El siguiente endpoint se utiliza para actualizar un registro existente con el método PUT:
* http://localhost:8080/api/vuelos/id

Las siguientes figuras muestran la petición en postman.

<img src="/images/actualizarVuelo_ok_postman.png" alt="Petición y Respuesta en postman cuando se modifica un registro con el método PUT"> <br>
<strong> Figura 11</strong> Petición y Respuesta en postman cuando se modifica un registro con el método PUT.

<img src="/images/actualizarVuelo_notFound_postman.png" alt="Petición y Respuesta en postman cuando se desea modificar un registro no existente (PUT)"> <br>
<strong> Figura 12</strong> Petición y Respuesta en postman cuando se desea modificar un registro no existente (PUT).

<img src="/images/actualizarVuelo_badRequest_postman.png" alt="Petición y Respuesta en postman cuando se desea modificar un registro sin el envio del objeto JSON en body"> <br>
<strong> Figura 13</strong> Petición y Respuesta en postman cuando se desea modificar un registro sin el envio del objeto JSON en body.

<img src="/images/actualizarVuelo_NotBlank_postman.png" alt="Respuesta en postman cuando se trata de actualizar un vuelo con el campo horaSalida en blanco usando el método  PUT"> <br>
<strong> Figura 14</strong> Respuesta en postman cuando se trata de actualizar un vuelo con el campo horaSalida en blanco usando el método  PUT.


<img src="/images/updateVuelo.png" alt="Código que implementa el método PUT"> <br>
<strong> Figura 15</strong> Código que implementa el método PUT.

### Modificación parcial de un registro (PATCH)

El siguiente endpoint se utiliza para modificar un registro existente de forma parcial con el método PATCH:
* http://localhost:8080/api/vuelos/id

Las siguientes figuras muestran la petición en postman .

<img src="/images/modificarVuelo_ok_postman.png" alt="Petición y Respuesta en postman cuando se modifica un registro con el método PATCH"> <br>
<strong> Figura 16</strong> Petición y Respuesta en postman cuando se modifica un registro con el método PATCH.

<img src="/images/modificarVuelo_notFound_postman.png" alt="Petición y Respuesta en postman cuando se desea modificar un registro no existente (PATCH)"> <br>
<strong> Figura 17</strong> Petición y Respuesta en postman cuando se desea modificar un registro no existente (PATCH).

<img src="/images/modificarVuelo_badRequest_postman.png" alt="Petición y Respuesta en postman cuando se desea modificar un registro sin el envio del objeto JSON en body"> <br>
<strong> Figura 18</strong> Petición y Respuesta en postman cuando se desea modificar un registro sin el envio del objeto JSON en body.

<img src="/images/actualizarVuelo.png" alt="Código que implementa el método PATCH"> <br>
<strong> Figura 19</strong> Código que implementa el método PATCH.



### Borrar un registro (DELETE)

El siguiente endpoint se utiliza para eliminar un registro existente con el método DELETE:
* http://localhost:8080/api/vuelos/id

Las siguientes figuras muestran la petición en postman.

<img src="/images/deleteVuelo_ok_postman.png" alt="Petición y Respuesta en postman cuando se borra  un registro con el método DELETE"> <br>
<strong> Figura 20</strong> Petición y Respuesta en postman cuando se borra un registro con el método DELETE.

<img src="/images/deleteVuelo_notFound_postman.png" alt="Petición y Respuesta en postman cuando se desea borrar un registro no existente (DELETE)"> <br>
<strong> Figura 21</strong> Petición y Respuesta en postman cuando se desea borrar un registro no existente (DELETE).

<img src="/images/deleteVuelo.png" alt="Código que implementa el método DELETE" > <br>
<strong> Figura 22</strong> Código que implementa el método DELETE.







