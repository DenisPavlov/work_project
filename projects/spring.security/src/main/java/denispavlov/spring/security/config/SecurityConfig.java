package denispavlov.spring.security.config;

import denispavlov.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserService userService;

    @Autowired
    public SecurityConfig(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/auth/**").authenticated()
                .antMatchers("/only_for_admin/**").hasRole("ADMIN")
                .antMatchers("/read_profile/**").hasAuthority("READ_PROFILE")
                .and()
                .formLogin()
                .and()
                .logout().logoutSuccessUrl("/");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        authenticationProvider.setUserDetailsService(userService);
        return authenticationProvider;
    }



//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.builder()
//                .username("user")
//                .password("{bcrypt}$2y$12$RTHepikXBOizC8iH0FZVUOMr3oKcfhnPY7XS.UMVdkyh8KDCVF6uS")
//                .roles("USER")
//                .build();
//
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password("{bcrypt}$2y$12$RTHepikXBOizC8iH0FZVUOMr3oKcfhnPY7XS.UMVdkyh8KDCVF6uS")
//                .roles("ADMIN", "USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user, admin);
//    }

//    @Bean
//    public JdbcUserDetailsManager detailsManager(DataSource dataSource) {
//                UserDetails user = User.builder()
//                .username("user")
//                .password("{bcrypt}$2y$12$RTHepikXBOizC8iH0FZVUOMr3oKcfhnPY7XS.UMVdkyh8KDCVF6uS")
//                .roles("USER")
//                .build();
//
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password("{bcrypt}$2y$12$RTHepikXBOizC8iH0FZVUOMr3oKcfhnPY7XS.UMVdkyh8KDCVF6uS")
//                .roles("ADMIN", "USER")
//                .build();

//        JdbcUserDetailsManager detailsManager = new JdbcUserDetailsManager(dataSource);

//        if (detailsManager.userExists(user.getUsername())) {
//            detailsManager.deleteUser(user.getUsername());
//        }
//
//        if (detailsManager.userExists(admin.getUsername())) {
//            detailsManager.deleteUser(admin.getUsername());
//        }

//        detailsManager.createUser(user);
//        detailsManager.createUser(admin);

//        return detailsManager;
//    }
}
