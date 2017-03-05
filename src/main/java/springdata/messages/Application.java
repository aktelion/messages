package springdata.messages;

import org.slf4j.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


/**
 * Created by aktelion on 23/02/2017.
 */
@Configuration
@ComponentScan
public class Application {
  private static final Logger log = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
    DBWorker bean = context.getBean(DBWorker.class);
    int count = bean.count();
    log.info("Count is " + count);
    log.info("Hello from slf4j");
  }
}
