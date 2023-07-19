# Hotel Management
### Frameworks and Language used:
 

* Spring
* Spring boot
* Java
* mysql

### Data Flow 
* Controller :
    * In this Application one Controllers class one is RoomController.
* Service
  * In this Application one Serivce class one is RoomSerivce.
* Model
  * In this Application one model class one is HetelRoom.
* Repository
  * In this Application one Repo class one is IRoomRepo.
 
### Project Summery

Hotel Management system is RESTAPI Application int this you can fetch the data of all HotelRoom and find HotelRoom  By RoomId , 
created model HotelRoom. You can go through the Code to do the CRUD Commands to add delete update and get the data of HotelRoom.  
# Links

### links of Mappings and endpoints.

    addHotelRoom
    
      PostMapping-http://localhost:8080/api/addroom
    
    Get HotelRoom by Id
      GetMapping-http://localhost:8080/api/getroombyId/2
    
    Get all HotelRoom
      GetMapping-http://localhost:8080/api/getallrooms
    
    updateHotelRoom
      PutMapping-http://localhost:8080/api/updateroom/1
    
    deleteHotelRoom
      DeleteMapping-http://localhost:8080/api/deleteroom/1
 
 
