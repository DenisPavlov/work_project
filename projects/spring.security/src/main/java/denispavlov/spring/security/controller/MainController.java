package denispavlov.spring.security.controller;

import denispavlov.spring.security.entity.User;
import denispavlov.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    private final UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/auth")
    public String auth(Principal principal) {

        User user = userService.findByUsername(principal.getName());

        return "auth page for " + user.getUsername();
    }

    @GetMapping("/read_profile")
    public String readProfile() {
        return "Read profile page !!!";
    }

    @GetMapping("/only_for_admin")
    public String onlyForAdmin() {
        return "Only for admin page !!!";
    }
}
