package nl.gridshore.ff2015;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Home controller to return a basic object that shows that everything is working.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public Welcome home() {
        return new Welcome("0.1-SNAPSHOT", "Welcome to this beautiful app");
    }
}
