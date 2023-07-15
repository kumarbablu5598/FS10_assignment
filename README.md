# Restaurant management API

### Frameworks and Language used:
 

* Spring
* Spring boot
* Postman
* Java
* mysql

### Data Flow 
* Controller :
    * In this Application 3 Controllers class   FoodItemController,OrdersController and UserController
* Model :
    * In this Application 3 Models class User,Orders and FoodItem.
* Service
  * In this Application 3 Serivce class FoodItemSerivce,OrdersSerivce and UserSerivce.
* Repository
  * In this Application 3 Repository interface IFoofItemRepo ,IOrdersRepo and IUserRepo.
* Database
  * I used mysql Database In this Application And Created data.sql file to upload data in table at the start of Application.
* Util Class
  * I am apply validation in this application all the validation class store in util package.
 
    
### Swagger UI :
http://localhost:8080/swagger-ui/index.html
    

### Project Summery

Restaurant management API application is RESTAPI Application in this you can fetch the data of all FoodItem ,Orders and User , find FoodItem,Users,and Orders ById , created 3seperate models class User,Orders and FoodItem You can go through the Code to do the CRUD Commands to add delete update aur get the data of User,Orders and FoodItem. You can also use Mysql-Database to see the table we have created in the database and to get the data of table.

# Links

### links of Mappings and endpoints.

    addFoodItem/addOrder/addUser
        PostMapping- http://localhost:8080/api/user/adduser
        PostMapping- http://localhost:8080/api/orders/addorder
        PostMapping- http://localhost:8080/api/foodItem/addfoodItem
         
   Get all FoodItems/Get all Orders/ Get all Users
        GetMapping- http://localhost:8080/api/user/getAll
        GetMapping- http://localhost:8080/api/orders/getAll
        GetMapping- http://localhost:8080/api/foodItem/getAll
       
   deleteFoodItems/deleteUser/deleteOrder
       DeleteMapping- http://localhost:8080/api/user/delete/1
       DeleteMapping- http://localhost:8080/api/orders/delete/1
       DeleteMapping- http://localhost:8080/api/foodItem/delete/1
       
      

