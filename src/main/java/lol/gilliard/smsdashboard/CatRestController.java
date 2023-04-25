package lol.gilliard.smsdashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class CatRestController {
    private int counter = 0;
    @PostMapping("/catclicker")
    public String clicker() {
        counter += 1;
        return "Cat has eaten " + counter + " treats already.";
    }

    @GetMapping("/catclicker")
    public String returnClick() {
        return "Cat has " + counter + " treats in the tummy.";
    }
}
