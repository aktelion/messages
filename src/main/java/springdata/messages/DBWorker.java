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
  DataSource dbSource;
  private JdbcTemplate template;

  @Autowired
  public DBWorker(DataSource dbSource) {
    this.dbSource = dbSource;
    this.template = new JdbcTemplate(dbSource);
  }
  public int count() {
    int rowCount = template.queryForObject("select count(*) from cities", Integer.class);
    return rowCount;
  }

  public String wetCity(int humidity) {
    template = new JdbcTemplate(dbSource);
    String city = template.queryForObject("SELECT city FROM weather WHERE humidity=?",
                                          new Object[]{humidity},
                                          String.class);
    return city;
  }
}
