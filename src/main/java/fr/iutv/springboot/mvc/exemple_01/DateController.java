package fr.iutv.springboot.mvc.exemple_01;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController {

  @GetMapping(path = "/date")
  public String afficherDate(Model model) {
    model.addAttribute("now", new Date());
    return "affichageDate";
  }
}