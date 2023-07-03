#  Job Search Portal
### Frameworks and Language used:
 

* Spring
* Spring boot
* Postman
* Java

### Data Flow 
* Controller :
    * In this Application one Controller  class , JobController.
* Model :
    * In this Application one Model , Job model one is Enum Jobtype.
* Service
  * In this Application one Serivce class it is JobSerivce.
* Repository
  * In this Application one Repository Interface,JobRepo
* Database
  * I used H2 Database In this Application And Created data.sql file to upload data in table at the start of Application.
* Util Class
  * I am apply validation in this application all the validation class store in util package.

### Project Summery

Job Search Portal is RESTAPI Application in this you can fetch the data of all jobs and find job  By Id , created one model Job and one Enum for JobType  . You can go through the Code to do the CRUD Commands to add delete update aur get the data of jobs. You can also use H2-Database to see the table we have created in the database and to get the data of table.

# Links

### links of Mappings and endpoints.

    addjobs/addjob
        PostMapping- http://localhost:8080/api/addjob
        PostMapping- http://localhost:8080/api/addjobs
    Get job by Id
        GetMapping- http://localhost:8080/api/job/2
       
    Get all jobs
        GetMapping- http://localhost:8080/api/getalljobs
    
    update job By Id
       PutMapping- http://localhost:8080/api/update/2
    
    delete Job By Id
       DeleteMapping- http://localhost:8080/api/delete/1
      
 
 

 
