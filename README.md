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
  * I used H2 Database In this Application And Created data.sql file to upload data in table at the start of Application.
* Util Class
  * I am apply validation in this application all the validation class store in util package.

### Project Summery

University Event Management application is RESTAPI Application in this you can fetch the data of all Students and find Event By Date , created two seperate models one is of Students and one is Event. You can go through the Code to do the CRUD Commands to add delete update aur get the data of Students and Event. You can also use H2-Database to see the table we have created in the database and to get the data of table.

# Links

### links of Mappings and endpoints.

    addStudents/addEvent
        PostMapping-http://localhost:8080/api/students/addstudent
        PostMapping-http://localhost:8080/api/events/addevent
     
    Get Students by Id / Get Events by Id
        GetMapping-http://localhost:8080/api/students/getstudent/2
        GetMapping-http://localhost:8080/api/events/getevent/1
    
    Get all Students/ Get all Events
        GetMapping-http://localhost:8080/api/students/getallstudent
        GetMapping-http://localhost:8080/api/events/getallevent
    
    updateStudent/updateEvent
       PutMapping-http://localhost:8080/api/students/updateStudent/1
       PutMapping-http://localhost:8080/api/events/updateEvent/1
    
    deleteStudent/deleteEvent
       DeleteMapping-http://localhost:8080/api/students/deleteStudent/1
       DeleteMapping-http://localhost:8080/api/events/deleteEvent/1
      
