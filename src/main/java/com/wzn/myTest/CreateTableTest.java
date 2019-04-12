package com.wzn.myTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateTableTest {
	public static void main(String[] args) {
		//1. 加载Hibernate配置文件  .configure()自动查找文件和自动加载文件
		Configuration configuration = new Configuration().configure();
		//2. 获取SessionFactory工厂类对象
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//3. 获取Session对象   相当于Connection连接对象
		Session session = sessionFactory.openSession();
		//关闭资源
		session.close();
		sessionFactory.close();
	}
}	
