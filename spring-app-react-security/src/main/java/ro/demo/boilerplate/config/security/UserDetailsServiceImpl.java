package ro.demo.boilerplate.config.security;

//@Component
//public class UserDetailsServiceImpl implements UserDetailsService {

//    String ROLE_PREFIX = "ROLE_";
//
//    @Autowired
//    private UtilizatorRepository utilizatorRepository;
//    @Autowired
//    private UtilizatorRolRepository utilizatorRolRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        Utilizator utilizator = utilizatorRepository.findByUsername(username.toLowerCase());
//
//        User.UserBuilder builder = null;
//        if (utilizator != null) {
//            builder = org.springframework.security.core.userdetails.User.withUsername(username);
//            builder.password(utilizator.getParola());
//            builder.authorities(getUserRoles(username));
//        } else {
//            throw new UsernameNotFoundException("Utilizatorul nu exista.");
//        }
//
//        return builder.build();
//    }
//
//    private List<GrantedAuthority> getUserRoles(final String username){
//        List<GrantedAuthority> roles = new ArrayList<>();
//        utilizatorRolRepository.findByUtilizatorUsername(username).forEach(ur ->{
//            roles.add(new SimpleGrantedAuthority(ROLE_PREFIX + ur.getRol().getNume().toUpperCase()));
//        });
//        return roles;
//    }

//}
