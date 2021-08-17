package org.nir.conferences.common.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name  ="sessions")
public class Session 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long session_id;
    private String session_name;
    private String session_description;
    private Integer session_length;

    @ManyToMany
    @JoinTable(
            name = "session_speakers",
            joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id"))
    private List<Speaker> speakers;

    public Session() {
    }

    
    
    public Session(String session_name, String session_description, Integer session_length, List<Speaker> speakers) {
		
		this.session_name = session_name;
		this.session_description = session_description;
		this.session_length = session_length;
		this.speakers = speakers;
	}



	public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public Long getSession_id() {
        return session_id;
    }

    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public String getSession_description() {
        return session_description;
    }

    public void setSession_description(String session_description) {
        this.session_description = session_description;
    }

    public Integer getSession_length() {
        return session_length;
    }

    public void setSession_length(Integer session_length) {
        this.session_length = session_length;
    }

	@Override
	public String toString() {
		return "Session [session_id=" + session_id + ", session_name=" + session_name + ", session_description="
				+ session_description + ", session_length=" + session_length + ", speakers=" + speakers + "]";
	}
    
    
}
