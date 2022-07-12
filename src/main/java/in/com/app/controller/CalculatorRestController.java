package in.com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.com.app.exception.NoUserFoundException;

@RestController
public class CalculatorRestController {

	@GetMapping("/sum")
	public String sum() {
		Integer a = 10;
		Integer b = 20;
		Integer result = a + b;
		return "Result :: " + result;
	}

	@GetMapping("/div")
	public String div() {
		Integer a = 100;
		Integer b = 0;
		Integer result = 0;
		result = a / b;
		return "Result :: " + result;
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<String> getUserEmail(@PathVariable Integer id) throws NoUserFoundException {
		String email = "";
		if (id == 100) {
			email = "kalidasd1991@gmail.com";
		} else {
			throw new NoUserFoundException("Invalid User Id");
		}
		return new ResponseEntity<String>(email, HttpStatus.OK);

	}

}
