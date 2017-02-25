package java8.time;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

import static java.lang.System.lineSeparator;
import static java.lang.System.out;
import static java.time.ZoneId.getAvailableZoneIds;
import static java.time.ZoneId.of;
import static java.time.temporal.TemporalAdjusters.*;

/**
 * Created by aktelion on 25/02/2017.
 */
public class DemoApplication {
  public static void main(String[] args) {
    localDateDemo();
//    listZones();
    zonedDateDemo();
  }

  public static void listZones() {
    out.println(getAvailableZoneIds());
  }

  private static void zonedDateDemo() {
    LocalDateTime dateTime = LocalDateTime.now();
    ZoneId zId = of("Asia/Omsk");
    ZonedDateTime zDateTime = ZonedDateTime.of(dateTime, zId);
    out.println(zDateTime);

    ZoneOffset offset = ZoneOffset.of("+02:00");
    out.println(offset);

    out.println(dateTime.atZone(of("Asia/Tomsk")));

    ZonedDateTime time = ZonedDateTime.parse("1989-05-10T22:14:53.564+03:00[Europe/Moscow]");
    out.println(time);
  }

  private static void localDateDemo() {
    LocalDateTime dateTime = LocalDateTime.now();
    out.println(String.format("Now is %s", dateTime));
    LocalDateTime wednesday = dateTime
        .with(previous(DayOfWeek.SATURDAY))
        .plusHours(3)
        .with(LocalTime.now())
        .truncatedTo(ChronoUnit.MINUTES);
    out.println(wednesday);
  }
}
