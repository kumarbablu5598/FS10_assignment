# Doctor Application
### Frameworks and Language used:
 

* Spring
* Spring boot
* Postman
* Java
* mysql

### Data Flow 
* Controller :
    * In this Application 4 Controllers class   AddressController,ProductController,OrderController and UserController
* Model :
    * In this Application 4 Models class User,Product,Order and Address
* Service
  * In this Application 4 Serivce class AddressSerivce,ProductSerivce,OrderSerivce and UserSerivce.
* Repository
  * In this Application 4 Repository class AddressRepo,ProductRepo,OrderRepo and UserRepo.
* Database
  * I used mysql Database In this Application And Created data.sql file to upload data in table at the start of Application.
* Util Class
  * I am apply validation in this application all the validation class store in util package.
 
    
### Swagger UI :
http://localhost:8080/swagger-ui/index.html
    

### Project Summery

The Springboot Doctor Application is a web-based application built using the Spring Boot framework. It provides a platform for doctors and medical professionals to manage patient information, appointments, and medical records in a convenient and efficient manner.

# Links

### links of Mappings and endpoints.

    addAddress/addProduct/addOrder/addUser
        PostMapping- http://localhost:8080/api/address/addaddress
        PostMapping- http://localhost:8080/api/order/addorder
        PostMapping- http://localhost:8080/api/product/addproduct
        PostMapping- http://localhost:8080/api/user/adduser
     
    Get Address by Id / Get Product by Id/ Get Order by Id / Get User by Id
        GetMapping- http://localhost:8080/api/address/getbyid/1
        GetMapping- http://localhost:8080/api/order/getbyid/1
        GetMapping- http://localhost:8080/api/product/getbyId/1
        GetMapping- http://localhost:8080/api/user/getbyId/1
    
    Get all Address/ Get all Products/Get all Orders/ Get all Users
        GetMapping- http://localhost:8080/api/address/getAll
        GetMapping- http://localhost:8080/api/order/getAll
        GetMapping- http://localhost:8080/api/product/getAll
        GetMapping- http://localhost:8080/api/user/getAll
    
    
    deleteAddress/deleteUser/deleteProduct/deleteOrder
       DeleteMapping- http://localhost:8080/api/address/delete/1
       DeleteMapping- http://localhost:8080/api/order/delete/1
       DeleteMapping- http://localhost:8080/api/product/delete/1
       DeleteMapping- http://localhost:8080/api/user/delete/1
      
