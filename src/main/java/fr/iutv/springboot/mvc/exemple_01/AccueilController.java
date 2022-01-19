package fr.iutv.springboot.mvc.exemple_01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilController {

  @GetMapping(path = "/")
  public String accueillir() {
    return "accueil";
  }

}