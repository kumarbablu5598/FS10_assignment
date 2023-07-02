package com.Uem.University.service;

import com.Uem.University.model.Event;
import com.Uem.University.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepo eventRepo;

    public Iterable<Event> getAllevent(){
        return eventRepo.findAll();
    }
   public  Event getEventById(Integer Id){
        return eventRepo.findById(Id).get();
   }

   public String addEvent(Event event){
        eventRepo.save(event);
        return "Event Added";
   }
   public String addEvents(List<Event> events){
        eventRepo.saveAll(events);
        return "Added list of Events ";
   }
   public String deleteById(Integer id){
        eventRepo.deleteById(id);
        return  "deleted "+id;
   }
   public  String updeteById(Integer id,Event event){
        Event ev = getEventById(id);
        ev.setEndTime(event.getEndTime());
        ev.setEventName(event.getEventName());
        ev.setLocationOfEvent(event.getLocationOfEvent());
        ev.setStartTime(event.getStartTime());
        ev.setEventdate(event.getEventdate());
        if(ev!=null) return "updated "+id;
        else return  "unable to update ";
   }
}
