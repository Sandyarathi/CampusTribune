package com.ct.event.dataAccessInterfaces;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ct.objects.Event;

/**
* DAO interface for Event to perform CRUD operation.
* */
@Repository
public interface IEventDAO {
/**
* Used to Create the Event Information
* @param employee
* @return {@link Event}
*/
public Event createEvent(Event employee);

/**
* Getting the Event Information using Id
* @param id
* @return {@link Event}
*/
public Event getEvent(int id);

/**
* Used to Update the Event Information
* @param employee
* @return {@link Event}
*/

public Event updateEvent(Event employee);

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
 * Check if employee record exists
 * */
 public boolean eventExists(int id);
 
}