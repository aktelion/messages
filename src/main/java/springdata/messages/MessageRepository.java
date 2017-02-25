package springdata.messages;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by aktelion on 25/02/2017.
 */
public interface MessageRepository
    extends CrudRepository<Message, Long> {
  List<Message> findByCode(String code);
}
