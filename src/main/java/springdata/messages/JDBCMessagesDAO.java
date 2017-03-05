package springdata.messages;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by aktelion on 05/03/2017.
 */
@Repository
public class JDBCMessagesDAO {
  private JdbcTemplate template;

  @Autowired
  public JDBCMessagesDAO(DataSource dbSource) {
    this.template = new JdbcTemplate(dbSource);
  }
}
