# Doctor Application
### Frameworks and Language used:
 

* Spring
* Spring boot
* Postman
* Java
* mysql

### Data Flow 
* Controller :
    * In this Application 4 Controllers class   AdminController,DoctorController,PatientController and AppointmentController
* Model :
    * In this Application 5 Models class Admin,Doctor,Patient , Appointment and AuthenticationToken.
* DTO :
    * In this Application 2 class SignInInput and SignUpOutput
* Service
  * In this Application 5 Serivce class AdminSerivce,DoctorSerivce,PatientSerivce , AppointmentSerivce and AuthenticationTokenSerivce.
* Repository
  * In this Application 5 Repository class AdminRepo,DoctorRepo,PatientRepo , AppointmentRepo and AuthenticationTokenRepo.
* Database
  * I used mysql Database In this Application And Created data.sql file to upload data in table at the start of Application.
* Util Class
  * I am apply validation in this application all the validation class store in util package.
 
    
### Swagger UI :
http://localhost:8080/swagger-ui/index.html
    

### Project Summery

The Springboot Doctor Application is a web-based application built using the Spring Boot framework. It provides a platform for doctors and medical professionals to manage patient information, appointments, and medical records in a convenient and efficient manner.

# Features
The application includes the following features:
### User Authentication:-
Doctors can register and log in to the system using their credentials. Authentication is implemented using Spring Security, ensuring secure access to the application.
### Patient Management:-
Doctors can create, update, and view patient profiles. Each patient profile includes personal information, medical history, and contact details. Doctors can easily search for patients and access their information.
### Appointment Scheduling:-
Doctors can manage appointments by creating, updating, and canceling appointments. The application provides a calendar view for easy visualization of upcoming appointments. Doctors can also receive notifications or reminders for upcoming appointments.
### Medical Records:-
Doctors can maintain and update medical records for each patient. They can add diagnosis details, treatment plans, prescriptions, and other relevant information. Medical records are securely stored and can be accessed whenever needed.
### Communication and Messaging:-
Doctors can communicate with patients through the application using messaging or email features. This facilitates easy and secure communication, allowing doctors to share important information or follow-up instructions.

 
