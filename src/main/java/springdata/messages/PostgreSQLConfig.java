package springdata.messages;

import javax.sql.DataSource;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by aktelion on 05/03/2017.
 */
@Configuration
public class PostgreSQLConfig {
  private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
  private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
  private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
  private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";

  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();

    dataSource.setUrl("jdbc:postgresql://localhost/mydb");
    dataSource.setUsername("postgres");
    dataSource.setPassword("9130");

    return dataSource;
  }
}
