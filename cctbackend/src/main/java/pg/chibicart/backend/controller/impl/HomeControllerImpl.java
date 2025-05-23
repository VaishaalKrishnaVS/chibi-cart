package pg.chibicart.backend.controller.impl;

import org.springframework.web.bind.annotation.RestController;
import pg.chibicart.backend.controller.IHomeController;
@RestController
public class HomeControllerImpl implements IHomeController {
    @Override
    public String home() {
        return "Home";
    }
}
