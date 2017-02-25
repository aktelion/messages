package springdata.messages;

import java.util.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.slf4j.*;

/**
 * Created by aktelion on 25/02/2017.
 */
class MessageFactoryTest {
  private static final Logger log = LoggerFactory.getLogger(MessageFactoryTest.class);
  private MessageFactory factory = new MessageFactory();

  @Before
  void init() {
    log.info("Why am I here?");
  }

  @Test
  void createMessage() {
    List<Message> messages = new ArrayList<>(1000);
    for (int i = 0; i < new Random().nextInt(1000); i++) {
      messages.add(factory.createMessage());
    }
    for (Message message : messages) {
      log.info(message.toString());
    }

  }

}