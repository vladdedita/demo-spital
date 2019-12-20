package ro.kluger.java.spital.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.kluger.java.spital.entity.Persoana;
import ro.kluger.java.spital.entity.User;
import ro.kluger.java.spital.repository.PersoanaRepository;
import ro.kluger.java.spital.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserRepository userRepository;
    private final PersoanaRepository persoanaRepository;

    public UserController(UserRepository userRepository, PersoanaRepository persoanaRepository) {
        this.userRepository = userRepository;
        this.persoanaRepository = persoanaRepository;
    }

    @GetMapping("add")
    public void testAdd() {
        Persoana persoana = persoanaRepository.save(Persoana.builder()
                .cnp(1111111111L)
                .nume("test")
                .build());
        userRepository.save(User.builder().persoana(persoana).pass(new BCryptPasswordEncoder().encode("test")).build());
    }
}
