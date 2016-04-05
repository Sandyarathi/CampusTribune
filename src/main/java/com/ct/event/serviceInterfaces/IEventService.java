package com.ct.event.serviceInterfaces;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ct.objects.Event;
@Service
public interface IEventService {
	/**
	* Used to Create the Event Information
	* @param event
	* @return {@link Event}
	*/
	public Event createEvent(Event event);

	/**
	* Getting the Event Information using Id
	* @param id
	* @return {@link Event}
	*/
	public Event getEvent(int id);

	/**
	* Used to Update the Event Information
	* @param event
	* @return {@link Event}
	*/

	public Event updateEvent(Event event);

	/**
	* Deleting the Event Information using Id
	* @param id
	*/
	public void deleteEvent(int id);

	/**
	* Getting the All Events information
	* @return
	*/
	public List<Event> getAllEvents();
	/**
	 * Check if record exists
	 */
	public boolean eventExists(int id);
}





	

	

