package Backend.saarinen.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import students.domain.Student;

@Controller

public class CarController {

	@RequestMapping("/main")
	@ResponseBody
	public String showMainPage() {
		return "Tämä on pääsivu";
	}
	
	@RequestMapping("moi")
	@ResponseBody
	
	public String sayHelloToSomebody(@RequestParam (name="nimesi") String nimi) {
		return "Hei " +nimi;

	}

	
	@GetMapping("hello2")
		
	public String sayHello(@RequestParam (name="name") String name, @RequestParam(name="age") int age, Model model) {
		System.out.println("list...");
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello2";
		
	}
	
	
	
	//@RequestMapping("/studentlist")
	@GetMapping("/studentlist")

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
	
	
	@RequestMapping("moikka")
	@ResponseBody
	
	public String sayHelloToSomeone1(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi) {
		return "Hei " +nimi;

	}
	@RequestMapping("moikkelis")
	@ResponseBody
	
	public String sayHelloToSomeone2(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi, @RequestParam(name="ika")int age) {
		return "Hei " +nimi + ", ikä " + age + " vuotta";

	}

	@RequestMapping("abc")
	@ResponseBody
	
	public String sayHelloToSomeone3(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi, @RequestParam(name="ika")int age) {
		return "Hei " +nimi + ", ikä " + age + " vuotta";

	}
	
	
}




