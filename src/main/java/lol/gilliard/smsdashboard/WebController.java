package lol.gilliard.smsdashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    @GetMapping("/cat")
    public String helloCat() {
        return "dog";
    }
}
