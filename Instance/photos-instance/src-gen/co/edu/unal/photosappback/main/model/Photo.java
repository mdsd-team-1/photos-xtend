package co.edu.unal.photosappback.main.model;	

import javax.persistence.*;

@Entity
@Table(name = "photo")
public class Photo {

	private name;	
	private url;	
	private albumId;	
					
	public Photo() {}

	public Photo() {
		this.name = name;		
		this.url = url;		
		this.albumId = albumId;		
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
	@Column(name = "url", nullable = false)
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Column(name = "albumId", nullable = false)
	public String getAlbumId() {
		return albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
						
	@Override
	public String toString() {
		return "Photo{" +
				"id=" + id +
				", name='" + name + '\'' +
				", url='" + url + '\'' +
				", albumId='" + albumId + '\'' +
				'}';
	}			
