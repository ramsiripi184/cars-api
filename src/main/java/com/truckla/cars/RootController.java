package com.truckla.cars;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class RootController {
    @GetMapping
//        public void doNothing() { }
         public ModelAndView index() {
    return new ModelAndView("index.html");
}     
}
