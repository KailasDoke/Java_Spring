package in.kd.resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

@Configuration
public class springConfigrationgFile {
	
	@Bean
	public DriverManagerDataSource myDatasource()
	{
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
		datasource.setUsername("root");
		datasource.setPassword("Kailas@2004");
		
		
		return datasource;
		
	}
	
	@Bean
	public NamedParameterJdbcTemplate npjdbcTemplete() {
		return new NamedParameterJdbcTemplate(myDatasource());
	}

}
