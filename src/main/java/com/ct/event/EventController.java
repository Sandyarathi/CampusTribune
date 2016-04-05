package com.ct.event;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.objects.Event;
import com.ct.event.service.EventService;

@RestController
@RequestMapping("/cmpe295SandyarathiDas036/rest")
@Configuration
@ComponentScan("com.ct.service")
public class EventController {
		
	@Autowired
	private EventService eventService;
	
	public EventController() {
		System.out.println("EventController()");
	}
	
	@RequestMapping(value="/event", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Event> createEvent( @RequestBody @Valid Event event){
		if(!eventService.eventExists(event.getEvent_id())){
			Event emp = eventService.createEvent(event);
			if(emp !=null){
				return new ResponseEntity<Event>(emp,HttpStatus.CREATED);
			}
			else
				return new ResponseEntity<Event>(HttpStatus.CONFLICT);
		}
		else
			return new ResponseEntity<Event>(HttpStatus.CONFLICT);
	}
	
	
			

	
	
	@RequestMapping(value="/event/{event_id}", method = RequestMethod.GET, produces ="application/json")
    public ResponseEntity<Event> viewEvent(@PathVariable("event_id") int eventId ) {
	  if(eventService.eventExists(eventId))
		  return new ResponseEntity<Event>(eventService.getEvent(eventId), HttpStatus.OK);
	  else{
		  
		  return new ResponseEntity<Event>(HttpStatus.NOT_FOUND);
	  }
    }
	
	
	@RequestMapping(value="/event/{event_id}", method = RequestMethod.PUT, produces ="application/json")
	public ResponseEntity<Event> updateEvent(@PathVariable int event_id, @RequestBody @Valid Event event) {
		if(eventService.eventExists(event_id)){
			if(event.getEvent_id() == event_id){
				return new ResponseEntity<Event>(eventService.updateEvent(event), HttpStatus.OK);
			}
			else{
				if(eventService.eventExists(event_id)){
					//return conflict error code, if the put request uses an already existing id while updating record
					return new ResponseEntity<Event>(HttpStatus.CONFLICT);
				}
				else
					return new ResponseEntity<Event>(eventService.updateEvent(event), HttpStatus.OK);
			}
		}
		else
			 return new ResponseEntity<Event>(HttpStatus.NOT_FOUND);

	}
	
	
	@RequestMapping(value="/event/{event_id}", method = RequestMethod.DELETE, produces ="application/json")
    public ResponseEntity<String> deleteEvent(@PathVariable("event_id") int eventId ) {
		if(eventService.eventExists(eventId)){
		  eventService.deleteEvent(eventId);
		  return new ResponseEntity<String>( HttpStatus.OK);
	  }
	  else{
		  return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	  }
    }
	
	
	@RequestMapping(value="/event", method = RequestMethod.GET, produces ="application/json")
	public ResponseEntity<List<Event>> listAllEvents() {
		List<Event> empList= eventService.getAllEvents();
		if(!empList.isEmpty())
			return new ResponseEntity<List<Event>>(empList, HttpStatus.OK);		  
		else
			return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);  
			
	}
	

}
