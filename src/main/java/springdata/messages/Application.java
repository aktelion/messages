package springdata.messages;

import java.time.OffsetDateTime;

import org.slf4j.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by aktelion on 23/02/2017.
 */
@SpringBootApplication
public class Application {
  private static final Logger log = LoggerFactory.getLogger(Application.class);
  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }
  @Bean
  public CommandLineRunner demo(MessageRepository repository) {
    return (args) -> {
      // save a couple of customers
      MessageFactory factory = new MessageFactory();
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());
      repository.save(factory.createMessage());

      // fetch all customers
      log.info("Customers found with findAll():");
      log.info("-------------------------------");
      for (Message message : repository.findAll()) {
        log.info(message.toString());
      }
      log.info("");

      // fetch an individual message by ID
      Message message = repository.findOne(1L);
      log.info("Customer found with findOne(1L):");
      log.info("--------------------------------");
      log.info(message.toString());
      log.info("");

      // fetch customers by last name
      log.info("Customer found with findByLastName('Bauer'):");
      log.info("--------------------------------------------");
      for (Message msg : repository.findByCode("AccessGranted")) {
        log.info(msg.toString());
      }
      log.info("");
    };
  }
}
