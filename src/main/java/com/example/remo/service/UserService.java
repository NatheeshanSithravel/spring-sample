import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public void processUser(String username) {
        logger.info("Processing user: {}", username);

        if (username == null) {
            logger.error("Username is null! Cannot proceed.");
            return;
        }

        logger.debug("User {} processed successfully.", username);
    }
}
