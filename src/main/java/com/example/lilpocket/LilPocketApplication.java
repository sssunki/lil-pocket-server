package com.example.lilpocket;

import com.example.lilpocket.DAO.UserDAO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.example.lilpocket.DAO")
public class LilPocketApplication {

	@Autowired
	private SqlSessionFactory sqlSessionFactory = null;

	@Bean
	public MapperFactoryBean<UserDAO> initUserDAO() {
		MapperFactoryBean<UserDAO> bean = new MapperFactoryBean<>();
		bean.setMapperInterface(UserDAO.class);
		bean.setSqlSessionFactory(sqlSessionFactory);
		return bean;
	}

	public static void main(String[] args) {
		SpringApplication.run(LilPocketApplication.class, args);
	}

}
