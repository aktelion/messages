package springdata.messages;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by aktelion on 05/03/2017.
 */
@Service
public class DBWorker {
  @Autowired
  DataSource dbSource;

  public int count() {
    JdbcTemplate template = new JdbcTemplate(dbSource);
    int rowCount = template.queryForObject("select count(*) from cities", Integer.class);
    return rowCount;
  }
}
