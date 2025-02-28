import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping
    public String testLogging() {
        logger.info("Received request at /log endpoint.");
        logger.warn("This is a test warning log.");
        logger.error("This is a test error log.");

        return "Logging is working!";
    }
}
