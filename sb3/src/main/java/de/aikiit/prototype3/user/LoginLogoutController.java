package de.aikiit.prototype3.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class LoginLogoutController {
    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/")
    public ModelAndView showAppWelcomePage() {
        return new ModelAndView("/app/index.html");
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login.html");
    }
}
