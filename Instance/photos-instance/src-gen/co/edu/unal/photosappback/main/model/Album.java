package co.edu.unal.photosappback.main.model;	

import javax.persistence.*;

@Entity
@Table(name = "album")
public class Album {

	private int id;
	private name;	
	private userId;	
					
	public Album() {}

	public Album(	String name, 
	String userId
		) {
		this.name = name;		
		this.userId = userId;		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "userId", nullable = false)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
						
	@Override
	public String toString() {
		return "Album{" +
				"id=" + id +
				", name='" + name + '\'' +
				", userId='" + userId + '\'' +
				'}';
	}			
