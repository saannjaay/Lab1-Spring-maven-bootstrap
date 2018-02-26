/**
 * 
 */
package org.com.testing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author sannj
 *
 */
@Controller
public class TestingController {

	@RequestMapping(path = { "/" }, method = RequestMethod.GET)
	public String sayHello(Model model) {
		model.addAttribute("message", "Hello Spring MVC!");

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate date = LocalDate.now();
		model.addAttribute("date", date.format(formatter));

		return "login";
	}

}
