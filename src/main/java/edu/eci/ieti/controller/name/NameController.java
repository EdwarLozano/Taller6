package edu.eci.ieti.controller.name;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    public String get() {
        return "Edwar Lozano";
    }
}
