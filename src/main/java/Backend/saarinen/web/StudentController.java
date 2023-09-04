package Backend.saarinen.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import students.domain.Student;

public class StudentController {

	
	//@RequestMapping("/studentlist")
	@GetMapping("/studentlista")

	public String showStudents(Model model) {
		System.out.println("students...");
		
		//opiskelijat kovakoodattuna
		List<Student> opiskelijat = new ArrayList<>();
		opiskelijat.add(new Student("Minni", "Hiiri"));
		opiskelijat.add(new Student("Aku", "Ankka"));
		opiskelijat.add(new Student("Pelle", "Peloton"));
		opiskelijat.add(new Student("Hessu", "Hopo"));
		opiskelijat.add(new Student("Tupu", "Ankka"));
		
		model.addAttribute("students", opiskelijat);
		return "studentList";
	}

	

	
}
