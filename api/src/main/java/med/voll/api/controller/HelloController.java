package med.voll.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
      public String helloWolrd(){
          return "Hello world chupapijas!!";
      }
}
