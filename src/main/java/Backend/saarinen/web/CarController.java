package Backend.saarinen.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
}




