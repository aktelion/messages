package springdata.messages;

import java.time.*;
import java.util.*;

/**
 * Created by aktelion on 25/02/2017.
 */
public class MessageFactory {
  private List<String> messCodes;
  private List<String> messCauses;
  private List<String> messSources;
  private Random rnd;

  public MessageFactory() {
    rnd = new Random(System.currentTimeMillis());
    messSources = new ArrayList<>(100);
    messCauses = new ArrayList<>(100);
    messCodes = Arrays.asList("AccessGranted",
                              "FireAlarm",
                              "ObjectChanged",
                              "ObjectAddedWithLink",
                              "LinkChanged",
                              "AccessDenied",
                              "NothingHappened");
    for (int i = 0; i < rnd.nextInt(100); i++) {
      messCauses.add(UUID.randomUUID().toString());
      messSources.add(UUID.randomUUID().toString());
    }

  }

  public Message createMessage() {
    return createTestSimpleMessage();
  }

  private Message createTestSimpleMessage() {
    Message msg = new Message(messCodes.get(rnd.nextInt(messCodes.size())),
                              messSources.get(rnd.nextInt(messSources.size())),
                              messCauses.get(rnd.nextInt(messCauses.size())),
                              getTimestamp(),
                              getTimestamp(),
                              rnd.nextInt(50_000),
                              rnd.nextInt(50_000),
                              rnd.nextBoolean(),
                              rnd.nextBoolean());
    return msg;
  }

  private OffsetDateTime getTimestamp() {
    int hours = rnd.nextInt(24);
    int minutes = rnd.nextInt(60);
    int seconds = rnd.nextInt(60);
    int day = rnd.nextInt(7) + 1;
    int month = rnd.nextInt(12) + 1;
    int year = rnd.nextInt(30) + 1995;
    OffsetDateTime time = OffsetDateTime.of(year,
                                            month,
                                            day,
                                            hours,
                                            minutes,
                                            seconds,
                                            0,
                                            ZoneOffset.ofHours(rnd.nextInt(24) - 12));
    return time;
  }
}
