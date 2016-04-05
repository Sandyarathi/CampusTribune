package com.ct.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ct.objects.Event;
import com.ct.event.dataAccessObjects.EventDAO;
import com.ct.event.serviceInterfaces.IEventService;


public class EventService implements IEventService {

	@Autowired
	private EventDAO eventDAO;
	
	public EventService() {
		super(); 
	} 
	
	@Override
	public Event createEvent(Event event) {
		// TODO Auto-generated method stub
		return eventDAO.createEvent(event);
	}

	@Override
	public Event getEvent(int id) {
		// TODO Auto-generated method stub
		return eventDAO.getEvent(id);
	}

	@Override
	public Event updateEvent(Event event) {
		// TODO Auto-generated method stub
		return eventDAO.updateEvent(event);
	}

	@Override
	public void deleteEvent(int id) {
		eventDAO.deleteEvent(id);
	}

	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return eventDAO.getAllEvents();
	}

	@Override
	public boolean eventExists(int id) {
		// TODO Auto-generated method stub
		return eventDAO.eventExists(id);
	}

}
