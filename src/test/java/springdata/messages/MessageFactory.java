package springdata.messages;

import java.time.*;
import java.util.*;

/**
 * Created by aktelion on 05/03/2017.
 */
public class MessageFactory {

  private int startID;
  private Random rnd = new Random(System.currentTimeMillis());
  private ArrayList<String> messSources;
  private ArrayList<String> messCauses;
  private List<String> messCodes;

  public MessageFactory(int startID) {
    this.startID = startID;
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

  Message create() {

    OffsetDateTime time = getTimestamp();
    OffsetDateTime regTime;
    if (rnd.nextBoolean()) {
      regTime = time;
    } else {
      regTime = getTimestamp();
    }
    Message msg = new Message(startID,
                              time,
                              regTime,
                              rnd.nextBoolean(),
                              rnd.nextBoolean(),
                              ((short) rnd.nextInt(32000)),
                              ((short) rnd.nextInt(32000)),
                              UUID.randomUUID().toString(),
                              messCodes.get(rnd.nextInt(messCodes.size())),
                              messSources.get(rnd.nextInt(messSources.size())),
                              messCauses.get(rnd.nextInt(messCauses.size())));
    return msg;
  }

  private OffsetDateTime getTimestamp() {
    int hours = rnd.nextInt(24);
    int minutes = rnd.nextInt(60);
    int seconds = rnd.nextInt(60);
    int day = rnd.nextInt(7) + 1;
    int month = rnd.nextInt(12) + 1;
    int year = rnd.nextInt(10) + 2010;
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
