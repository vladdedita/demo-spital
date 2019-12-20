package ro.kluger.java.spital.config.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ro.kluger.java.spital.entity.User;
import ro.kluger.java.spital.repository.UserRepository;
import ro.kluger.java.spital.repository.UserRoleRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    String ROLE_PREFIX = "ROLE_";

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    public UserDetailsServiceImpl(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username.toLowerCase());

        if (user == null)
            throw new UsernameNotFoundException("Utilizatorul nu exista.");

        UserBuilder builder;
        builder = org.springframework.security.core.userdetails.User.withUsername(username);
        builder.password(user.getPass());
        builder.authorities(getUserRoles(user));
        return builder.build();
    }

    private List<GrantedAuthority> getUserRoles(final User user) {
        List<GrantedAuthority> roles = new ArrayList<>();
        userRoleRepository.findByUser(user).forEach(ur -> roles.add(new SimpleGrantedAuthority(ROLE_PREFIX + ur.getRole().getName().toUpperCase())));
        return roles;
    }

}
