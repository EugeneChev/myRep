package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Delegate {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int delegateId; 
	private String delegateName; 
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "join_delegate_event", joinColumns = 
	@JoinColumn(name = "delegateId"), inverseJoinColumns = 
	@JoinColumn(name = "eventId"))
	private List<MyEvent> events = new ArrayList<MyEvent>();
	public int getDelegateId() {
		return delegateId;
	}
	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}
	public String getDelegateName() {
		return delegateName;
	}
	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}
	public List<MyEvent> getEvents() {
		return events;
	}
	public void setEvents(List<MyEvent> events) {
		this.events = events;
	}
	
	
}
