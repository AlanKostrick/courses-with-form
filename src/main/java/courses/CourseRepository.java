package courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CourseRepository {
	
	protected Map<String, CourseTopic> courses = new HashMap<String, CourseTopic>();
	
	public CourseRepository() {
		
		CourseTopic course1 = new CourseTopic("1","Spring Framework", "Spring Framework Description", "Brian");
		CourseTopic course2 = new CourseTopic("2","Core Java", "Core Java Description", "Alan");
		CourseTopic course3 = new CourseTopic("3","Javascript", "Javascript Description", "Donny");
		
		courses.put(course1.getId(), course1);
		courses.put(course2.getId(), course2);
		courses.put(course3.getId(), course3);
		
	}
	
	public Collection<CourseTopic> findAll(){
		return courses.values();
	}
	
	public CourseTopic findOne(String id) {
		return courses.get(id);
	}
	
	public void add(CourseTopic course) {
		courses.put(course.getId(), course);
	}
	
	

}
