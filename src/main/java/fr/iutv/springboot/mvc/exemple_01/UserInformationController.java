package fr.iutv.springboot.mvc.exemple_01;

import fr.iutv.springboot.mvc.exemple_01.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class UserInformationController {

  @GetMapping(path = "/userInformation")
  public String afficherDate(Model model) {
    model.addAttribute("user", new User("monLogin"));
    return "userInformation";
  }
}