package springdata.messages;

import org.junit.*;
import org.slf4j.*;

/**
 * Created by aktelion on 05/03/2017.
 */
public class MessageFactoryTest {
  private static Logger log = LoggerFactory.getLogger(MessageFactoryTest.class);

  @BeforeClass
  public static void initTests() {
    log.info("Initializing tests");
  }

  @AfterClass
  public static void tearDownTests() {
    log.info("Tearing downs tests");
  }

  @Before
  public void setUp()
      throws Exception {
    log.info("Init current test");
  }

  @After
  public void tearDown()
      throws Exception {
    log.info("tearing test down");
  }

  @Test
  public void create()
      throws Exception {
    log.info("In test");
  }

}