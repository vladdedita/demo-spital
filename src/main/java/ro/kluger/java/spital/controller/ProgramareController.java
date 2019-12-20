package ro.kluger.java.spital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pacient")
public class ProgramareController {
    @GetMapping("/programare-register")
    String ProgramareRegister() {
        return null;
    }

    @GetMapping("/programare")
    String Programare() {
        return null;
    }
}
