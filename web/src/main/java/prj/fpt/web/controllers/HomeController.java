package prj.fpt.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import prj.fpt.web.models.Account;
import prj.fpt.web.models.Product;

@RestController
public class HomeController {

	@GetMapping(path="/", produces="application/json")
	public Product getProduct() {
		Product p = new Product();
		p.setId(1);
		p.setName("Test");
		p.setPrice(30000);

		return p;
	}

	@GetMapping(path="/accounts", produces="application/json")
	public Account getAccount() {
		Account a = new Account();

		a.setId(4);
		a.setUser("tori4582");
		a.setPass("bruh");

		return a;
	}

}
