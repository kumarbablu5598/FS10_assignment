# Mapping Practice
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

Ecommerce API application is RESTAPI Application in this you can fetch the data of all Address ,Product ,Order and Users , find Adress Products,Users,and Order ById , created 4 seperate models class User,Product,Order and Address You can go through the Code to do the CRUD Commands to add delete update aur get the data of User,Product,Order and Address. You can also use Mysql-Database to see the table we have created in the database and to get the data of table.

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
      
