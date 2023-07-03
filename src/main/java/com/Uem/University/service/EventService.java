package com.Uem.University.service;

import com.Uem.University.model.Event;
import com.Uem.University.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    EventRepo eventRepo;

    public Iterable<Event> getAllevent(){
        return eventRepo.findAll();
    }
   public  Event getEventById(Integer Id){
       Optional<Event> optionalEvent= eventRepo.findById(Id);
       Event event =null;
       if(optionalEvent.isPresent())
        event=optionalEvent.get();
       return  event;
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
        if(ev!=null){
            ev.setEndTime(event.getEndTime());
            ev.setEventName(event.getEventName());
            ev.setLocationOfEvent(event.getLocationOfEvent());
            ev.setStartTime(event.getStartTime());
            ev.setEventDate(event.getEventDate());
            eventRepo.save(ev);
            return "updated "+id;
        }
         return  "unable to update ";
   }

   public List<Event> getAllEventByDate( LocalDate date){
//        Iterable<Event> events = getAllevent();
//        List<Event> newevents = new ArrayList<>();
//        for(Event ev : events){
//            if(ev.getEventdate().equals(date))
//                newevents.add(ev);
//        }
//        return  newevents;
       return eventRepo.findByEventDate(date);

   }
}
