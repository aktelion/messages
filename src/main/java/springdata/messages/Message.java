package springdata.messages;

import java.time.OffsetDateTime;
import javax.persistence.*;

/**
 * Created by aktelion on 23/02/2017.
 *
 */
@Table (name = "messages")
@Entity
public class Message {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String code;
  private String source;
  private String cause;
  private OffsetDateTime actTime;
  private OffsetDateTime regTime;
  private int priority;
  private int alarmLevel;
  private boolean isOnline;
  private boolean isService;

  public Message(String code,
                 String source,
                 String cause,
                 OffsetDateTime actTime,
                 OffsetDateTime regTime,
                 int priority, int alarmLevel, boolean isOnline, boolean isService) {
    this.code = code;
    this.source = source;
    this.cause = cause;
    this.actTime = actTime;
    this.regTime = regTime;
    this.priority = priority;
    this.alarmLevel = alarmLevel;
    this.isOnline = isOnline;
    this.isService = isService;
  }

  public Message() {
  }

  @Override
  public String toString() {
    return "Message{" +
        "code='" + code + '\'' +
        ", source='" + source + '\'' +
        ", cause='" + cause + '\'' +
        ", regTime=" + regTime +
        '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public OffsetDateTime getActTime() {
    return actTime;
  }

  public void setActTime(OffsetDateTime actTime) {
    this.actTime = actTime;
  }

  public OffsetDateTime getRegTime() {
    return regTime;
  }

  public void setRegTime(OffsetDateTime regTime) {
    this.regTime = regTime;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public int getAlarmLevel() {
    return alarmLevel;
  }

  public void setAlarmLevel(int alarmLevel) {
    this.alarmLevel = alarmLevel;
  }

  public boolean isOnline() {
    return isOnline;
  }

  public void setOnline(boolean online) {
    isOnline = online;
  }

  public boolean isService() {
    return isService;
  }

  public void setService(boolean service) {
    isService = service;
  }
}
