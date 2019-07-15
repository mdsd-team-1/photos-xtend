package co.edu.unal.photosappback.main.model;	

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

	private userName;	
	private firstName;	
	private lastName;	
	private profileDescription;	
	private password;	
	private email;	
					
	public User() {}

	public User() {
		this.userName = userName;		
		this.firstName = firstName;		
		this.lastName = lastName;		
		this.profileDescription = profileDescription;		
		this.password = password;		
		this.email = email;		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "userName", nullable = false)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}							
	@Column(name = "firstName", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}							
	@Column(name = "lastName", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}							
	@Column(name = "profileDescription", nullable = false)
	public String getProfileDescription() {
		return profileDescription;
	}
	public void setProfileDescription(String profileDescription) {
		this.profileDescription = profileDescription;
	}							
	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}							
	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}							
						
	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", profileDescription='" + profileDescription + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				'}';
	}			
