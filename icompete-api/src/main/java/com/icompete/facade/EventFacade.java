package com.icompete.facade;

import com.icompete.dto.EventDTO;
import com.icompete.dto.EventResultsDTO;
import com.icompete.dto.SportDTO;
import com.icompete.exception.EntityNotFoundException;

import java.util.Collection;
import java.util.Date;

/**
 * @author Peter Sekan, peter.sekan@mail.muni.cz
 * @version 23/11/2016
 */
public interface EventFacade {
    Long createEvent(EventDTO event);
    EventDTO getEventById(Long id) throws EntityNotFoundException;
    Collection<EventDTO> getAllEvents();
    Collection<EventDTO> getEventsBySport(SportDTO sport);
    Collection<EventDTO> getEventsByName(String name);
    Collection<EventDTO> getEventBetweenDates(Date dateFrom, Date dateTo);
    void updateEvent(EventDTO event) throws EntityNotFoundException;
    void deleteEvent(EventDTO event) throws EntityNotFoundException;
    void updateResults(EventResultsDTO results) throws EntityNotFoundException;
    EventResultsDTO getEventResults(EventDTO event) throws EntityNotFoundException;
}
