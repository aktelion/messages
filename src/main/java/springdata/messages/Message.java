package springdata.messages;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Created by aktelion on 05/03/2017.
 */
public class Message {
  private int id;
  private OffsetDateTime time;
  private OffsetDateTime regTime;
  private boolean isOnline;
  private boolean isService;
  private short alarmLevel;
  private short priority;
  private String messId;
  private String code;
  private String source;
  private String cause;

  public Message() {
  }

  public Message(int id,
                 OffsetDateTime time,
                 OffsetDateTime regTime,
                 boolean isOnline,
                 boolean isService,
                 short alarmLevel,
                 short priority,
                 String messId,
                 String code,
                 String source,
                 String cause) {
    this.id = id;
    this.time = time;
    this.regTime = regTime;
    this.isOnline = isOnline;
    this.isService = isService;
    this.alarmLevel = alarmLevel;
    this.priority = priority;
    this.messId = messId;
    this.code = code;
    this.source = source;
    this.cause = cause;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, time, regTime, isOnline, isService, alarmLevel, priority, messId, code, source, cause);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Message message = (Message) o;
    return id == message.id &&
        isOnline == message.isOnline &&
        isService == message.isService &&
        alarmLevel == message.alarmLevel &&
        priority == message.priority &&
        Objects.equals(time, message.time) &&
        Objects.equals(regTime, message.regTime) &&
        Objects.equals(messId, message.messId) &&
        Objects.equals(code, message.code) &&
        Objects.equals(source, message.source) &&
        Objects.equals(cause, message.cause);
  }

  @Override
  public String toString() {
    return "Message{" +
        "id=" + id +
        ", time=" + time +
        ", regTime=" + regTime +
        ", isOnline=" + isOnline +
        ", isService=" + isService +
        ", alarmLevel=" + alarmLevel +
        ", priority=" + priority +
        ", messId='" + messId + '\'' +
        ", code='" + code + '\'' +
        ", source='" + source + '\'' +
        ", cause='" + cause + '\'' +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public OffsetDateTime getRegTime() {
    return regTime;
  }

  public void setRegTime(OffsetDateTime regTime) {
    this.regTime = regTime;
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

  public short getAlarmLevel() {
    return alarmLevel;
  }

  public void setAlarmLevel(short alarmLevel) {
    this.alarmLevel = alarmLevel;
  }

  public short getPriority() {
    return priority;
  }

  public void setPriority(short priority) {
    this.priority = priority;
  }

  public String getMessId() {
    return messId;
  }

  public void setMessId(String messId) {
    this.messId = messId;
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
}
