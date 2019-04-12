package com.wzn.myTest;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wzn.myPojo.User;

public class InsertUserTest {
	public static void main(String[] args) {
		// 加载Hibernate配置文件 自动寻找配置文件 自动加载配置文件
		Configuration configure = new Configuration().configure();
		// 获取SessionFactory类的对象
		SessionFactory sessionFactory = configure.buildSessionFactory();
		// 获取Session对象 相当于Connection连接数据库对象
		Session session = sessionFactory.openSession();
		// 添加数据时不需要事务处理 此事需不需要开启事务都可以
		Transaction transaction = session.beginTransaction();
		// 创建User对象
		User user = new User(1, "你好", 18, "男");
		// 向数据库添加数据 数据返回的是主键的值
		Serializable result = session.save(user);
		System.out.println(result);
		// 操作完后提交事务
		transaction.commit();
		// 释放资源
		session.close();
		sessionFactory.close();
	}
}
