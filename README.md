# Employee address
### Frameworks and Language used:
 

* Spring
* Spring boot
* Postman
* Java
* mysql

### Data Flow 
* Controller :
    * In this Application two Controllers class one is AddressController and second one is EmployeeController
* Model :
    * In this Application two Models class one is Address  and second one is Employee
* Service
  * In this Application two Serivce class one is AddressSerivce and second one is EmployeeSerivce.
* Repository
  * In this Application two Repository class one is IAddressRepo and second one is IEmployeeRepo.
* Database
  * I used mysql Database In this Application And Created data.sql file to upload data in table at the start of Application.
* Util Class
  * I am apply validation in this application all the validation class store in util package.
 
    
### Swagger UI :
http://localhost:8080/swagger-ui/index.html
    

### Project Summery

Employee address application is RESTAPI Application in this you can fetch the data of all Address and Employee , find Adress and Employee ById , created two seperate models one is of Address  and second one is Employee. You can go through the Code to do the CRUD Commands to add delete update aur get the data of Address  and Employee.. You can also use Mysql-Database to see the table we have created in the database and to get the data of table.

# Links

### links of Mappings and endpoints.

    addAddress/addEmployee
        PostMapping- http://localhost:8080/api/address/addone
        PostMapping- http://localhost:8080/api/employee/addone
     
    Get Address by Id / Get Employee by Id
        GetMapping- http://localhost:8080/api/address/getbyId/8
        GetMapping- http://localhost:8080/api/employee/getbyId/1
    
    Get all Address/ Get all Employee
        GetMapping- http://localhost:8080/api/address/getall
        GetMapping- http://localhost:8080/api/employee/getall
    
    updateAddress/updateEmployee
       PutMapping- http://localhost:8080/api/address/update/102
       PutMapping- http://localhost:8080/api/employee/update/5
    
    deleteAddress/deleteEmployee
       DeleteMapping- http://localhost:8080/api/address/delete/10
       DeleteMapping- http://localhost:8080/api/employee/delete/5
      
