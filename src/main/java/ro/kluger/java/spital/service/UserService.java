package ro.kluger.java.spital.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ro.kluger.java.spital.entity.Persoana;
import ro.kluger.java.spital.entity.User;
import ro.kluger.java.spital.repository.PersoanaRepository;
import ro.kluger.java.spital.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PersoanaRepository persoanaRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public void register(String name, long cnp, String username, String password1, String password2) {
        Persoana registeredPersoana = registerPersoana(cnp, name);

        validatePasswords(password1, password2);

        registerUser(registeredPersoana, username, password1);
    }

    private void validatePasswords(String password1, String password2) {
        if (!password1.equals(password2))
            throw new IllegalArgumentException("Parolele nu corespund.");
    }

    private Persoana registerPersoana(long cnp, String nume) {
        return persoanaRepository.save(
                Persoana.builder()
                        .cnp(cnp)
                        .nume(nume)
                        .build()
        );
    }

    private User registerUser(Persoana persoana, String username, String password) {
        return userRepository.save(
                User.builder()
                        .persoana(persoana)
                        .username(username)
                        .pass(passwordEncoder.encode(password))
                        .build()
        );
    }


}
