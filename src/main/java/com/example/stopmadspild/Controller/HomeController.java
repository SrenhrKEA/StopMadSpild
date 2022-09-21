package com.example.stopmadspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping("/")
  public String home () {
    return "Home/index";
  }

  @GetMapping("/individuals")
  public String individuals () {
    return "Home/individuals";
  }

  @GetMapping("/corporations")
  public String corporations () {
    return "Home/corporations";
  }
}
