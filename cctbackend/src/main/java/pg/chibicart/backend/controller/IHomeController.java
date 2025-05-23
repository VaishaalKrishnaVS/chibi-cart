package pg.chibicart.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface IHomeController {
    @GetMapping("")
    String home();
}
