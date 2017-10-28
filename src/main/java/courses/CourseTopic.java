package courses;

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

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getInstructor() {
		return instructor;
	}

}
