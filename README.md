# Mapping Practice
### Frameworks and Language used:
 

* Spring
* Spring boot
* Postman
* Java
* mysql

### Data Flow 
* Controller :
    * In this Application 5 Controllers class   AddressController,StudentController,LaptopController,BookController and CourseController.
* Model :
    * In this Application 5 Models class Address,Student,Laptop,Book and Course.
* Service
  * In this Application 5 Serivce class AddressSerivce,StudentSerivce,LaptopSerivce,BookSerivce and CourseSerivce.
* Repository
  * In this Application 5 Repository class AddressRepo,StudentRepo,LaptopRepo,BookRepo and CourseRepo.
* Database
  * I used mysql Database In this Application And Created data.sql file to upload data in table at the start of Application.
* Util Class
  * I am apply validation in this application all the validation class store in util package.
 
    
### Swagger UI :
http://localhost:8080/swagger-ui/index.html
    

### Project Summery

It is RESTAPI Application in this you can fetch the data of all Address ,Laptops,Books,Courses and Students , find Address ,Laptop,Book,Course and Student ById , created 5 seperate models class Address,Student,Laptop,Book and Course. You can go through the Code to do the CRUD Commands to add delete update aur get the data of Address,Student,Laptop,Book and Course. You can also use Mysql-Database to see the table we have created in the database and to get the data of table.

# Links

### links of Mappings and endpoints.

    addAddress/addLaptop/addBook/addCourse/addStudent
        PostMapping- http://localhost:8080/api/address/addaddress
        PostMapping- http://localhost:8080/api/student/addstudent
        PostMapping- http://localhost:8080/api/laptop/addlaptop
        PostMapping- http://localhost:8080/api/course/addcourse
        PostMapping- http://localhost:8080/api/book/addbook
     
    Get Address by Id / Get Course by Id/ Get Laptop by Id / Get Student by Id/Get Book by Id
        GetMapping- http://localhost:8080/api/address/getbyid/1
        GetMapping- http://localhost:8080/api/student/getbyid/1
        GetMapping- http://localhost:8080/api/laptop/getbyId/1
        GetMapping- http://localhost:8080/api/course/getbyId/1
        GetMapping- http://localhost:8080/api/book/getbyid/1
    
    Get all Address/ Get all Books/Get all Courses/ Get all Laptops/Get all Students
        GetMapping- http://localhost:8080/api/address/getAll
        GetMapping- http://localhost:8080/api/student/getAll
        GetMapping- http://localhost:8080/api/laptop/getAll
        GetMapping- http://localhost:8080/api/course/getAll
        GetMapping- http://localhost:8080/api/book/getAll
    
    
    deleteAddress/deleteLaptop/deleteStudent/deleteCourse/deleteBook
       DeleteMapping- http://localhost:8080/api/address/delete/1
       DeleteMapping- http://localhost:8080/api/student/delete/1
       DeleteMapping- http://localhost:8080/api/laptop/delete/1
       DeleteMapping- http://localhost:8080/api/course/delete/1
       DeleteMapping- http://localhost:8080/api/book/delete/1
      
