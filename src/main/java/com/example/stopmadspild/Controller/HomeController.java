package com.example.stopmadspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
  @GetMapping("/")
  public String home () {
    return "Home/index";
  }

  @PostMapping("/individuals")
  public String individuals () {
    return "Home/individuals";
  }

  @PostMapping("/corporations")
  public String corporations () {
    return "Home/corporations";
  }
}
