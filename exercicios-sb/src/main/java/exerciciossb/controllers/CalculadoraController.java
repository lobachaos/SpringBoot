package exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/calculadora")
public class CalculadoraController {
	
	// /calculadora/somar/10/20
	// /calculadora/subtrair?a=100&b=39
	
	@GetMapping(path = "/somar/{a}/{b}")
	public int somar(@PathVariable int a,  @PathVariable int b) {
		a = 10;
		b = 20;
		return a+b;
	}
	
	@GetMapping (path = "/subtrair")
	public int subtrair(@RequestParam int a ,@RequestParam int b ) {
		return a-b;
	}
	
}
