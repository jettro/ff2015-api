package nl.gridshore.ff2015;

import com.fasterxml.jackson.databind.ObjectMapper;
import nl.gridshore.ff2015.data.PageData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.URL;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Provides functionality to index data.
 *
 * @author Roberto van der Linden
 */
@Controller
public class DataController {

    private static final Logger logger = LoggerFactory.getLogger(DataController.class);

    @RequestMapping(value = "/data/index", method = GET)
    @ResponseBody
    public String indexData() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            URL playerUrl = new URL("https://www.easports.com/fifa/ultimate-team/api/fut/item?jsonParamObject=%7B%22page%22:1%7D");
            PageData data = mapper.readValue(playerUrl, PageData.class);
            //TODO store data
            return "Finished indexing. Nr of indexed players: " + data.getItems().size();
        } catch (IOException e) {
            logger.error("Something went wrong during indexing of players");
            return "Something went wrong during indexing of players";
        }
    }
}
