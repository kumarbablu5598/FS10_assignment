package com.Uem.University.controller;

import com.Uem.University.model.Event;
import com.Uem.University.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/events")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("getallevent")
    Iterable<Event> getAllevent(){
        return eventService.getAllevent();
    }
   @GetMapping("getevent/{Id}")
    public  Event getEventById(@PathVariable Integer Id){
        return eventService.getEventById(Id);
   }
   @PostMapping("addevent")
    public  String addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
   }
   @PostMapping("addevents")
    public String addEvents(@RequestBody List<Event> events){
        return eventService.addEvents(events);
   }
   @DeleteMapping("delete/{Id}")
    public  String deleteById(@PathVariable Integer Id){
        return eventService.deleteById(Id);
   }
   @PutMapping("update/{Id}")
    public String updateById(@PathVariable Integer Id, @RequestBody Event event){
        return eventService.updeteById(Id,event);
   }
    @GetMapping("geteventbydate/{date}")
    public List<Event> getAllEventByDate(@PathVariable LocalDate date){
        return eventService.getAllEventByDate(date);
    }
}
