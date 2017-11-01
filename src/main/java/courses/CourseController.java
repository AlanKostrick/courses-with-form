package courses;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

	@Resource
	CourseRepository repository = new CourseRepository();

	@RequestMapping("/courses")
	public String getAllCourses(Model model) {
		model.addAttribute("courses", repository.findAll());
		return "courses";
	}

	@RequestMapping("/course")
	public String getOneCourse(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("course", repository.findOne(id));
		return "course";

	}

	@RequestMapping("/add-course")
	public String createCourse(String name, String description, String instructor) {
		CourseTopic course = new CourseTopic(name, description, instructor);
		repository.add(course);

		return "redirect:/courses";

	}

	@RequestMapping("/remove-course")
	public String removeCourse(Long id) {
		CourseTopic removeCourse = repository.findOne(id);
		repository.remove(removeCourse);

		return "redirect:/courses";

	}

}
