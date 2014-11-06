package nl.gridshore.ff2015;

import nl.gridshore.ff2015.data.Player;
import nl.gridshore.ff2015.data.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Home controller to return a basic object that shows that everything is working.
 */
@Controller
public class HomeController {

    @Autowired
    private PlayerRepository repository;

    @RequestMapping("/")
    @ResponseBody
    public Welcome home() {
        return new Welcome("0.1-SNAPSHOT", "Welcome to this beautiful app");
    }

    @RequestMapping(value = "/person/{identifier}", method = GET)
    @ResponseBody
    public Player player(@PathVariable("identifier") String identifier) {
        return repository.findOne(Long.parseLong(identifier));
    }

    @RequestMapping(value = "/person", method = POST)
    @ResponseBody
    public String newPerson(@RequestBody Player player) {
        Player save = repository.save(player);

        return "OK - " + save.getId();
    }

    @RequestMapping(value = "/person", method = GET)
    @ResponseBody
    public List<Player> persons() {
        List<Player> players = new ArrayList<>();
        repository.findAll().forEach(players::add);
        return players;
    }


}
