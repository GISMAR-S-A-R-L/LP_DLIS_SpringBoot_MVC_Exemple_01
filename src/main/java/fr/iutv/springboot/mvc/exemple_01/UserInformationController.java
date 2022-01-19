package fr.iutv.springboot.mvc.exemple_01;

import fr.iutv.springboot.mvc.exemple_01.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Controller
public class UserInformationController {

  @GetMapping(path = "/userInformation")
  public String showUserInformation(Model model) {
    model.addAttribute("user", new User("monNom","monLogin"));
    return "userInformation";
  }

  @GetMapping(path = "/userList")
  public String showUserList(Model model) {
    //model.addAttribute(..);
    return "userList";
  }
}