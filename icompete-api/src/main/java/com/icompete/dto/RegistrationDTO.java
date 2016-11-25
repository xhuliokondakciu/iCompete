package com.icompete.dto;

import java.util.Date;

/**
 * @author Peter Sekan, peter.sekan@mail.muni.cz
 * @version 22/11/2016
 */
public class RegistrationDTO {
    private Long id;
    private EventDTO event;
    private UserDTO user;
    private Date creationDate;

    public Long getId() {
        return id;
    }

    public EventDTO getEvent() {
        return event;
    }

    public void setEvent(EventDTO event) {
        this.event = event;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegistrationDTO that = (RegistrationDTO) o;

        if (getEvent() != null ? !getEvent().equals(that.getEvent()) : that.getEvent() != null) return false;
        if (getUser() != null ? !getUser().equals(that.getUser()) : that.getUser() != null) return false;
        return getCreationDate() != null ? getCreationDate().equals(that.getCreationDate()) : that.getCreationDate() == null;

    }

    @Override
    public int hashCode() {
        int result = getEvent() != null ? getEvent().hashCode() : 0;
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        result = 31 * result + (getCreationDate() != null ? getCreationDate().hashCode() : 0);
        return result;
    }
}