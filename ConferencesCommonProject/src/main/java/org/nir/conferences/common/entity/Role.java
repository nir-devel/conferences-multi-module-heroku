package org.nir.conferences.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  ="roles")
public class Role 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 40, nullable = false, unique = true)
	private Integer id ; 
	
	@Column(length = 40, nullable = false, unique = true)
	private String name;
	
	@Column(length = 150, nullable = false)
	private String description;

	public Role()
	{
		
	}
	
	
	
	public Role(Integer id, String name, String description) {
		
		this.id = id;
		this.name = name;
		this.description = description;
	}



	



	public Role(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	

}
