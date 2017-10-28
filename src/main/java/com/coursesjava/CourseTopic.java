package com.coursesjava;

public class CourseTopic {

	private String id;
	private String name;
	private String description;
	private String instructor;


	public CourseTopic(String id, String name, String description, String instructor) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.instructor = instructor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getInstructor() {
		return instructor;
	}

}
