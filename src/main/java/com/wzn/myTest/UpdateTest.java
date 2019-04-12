package com.wzn.myTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wzn.myPojo.User;

public class UpdateTest {
	public static void main(String[] args) {
		// 加载Hibernate配置文件 自动查找文件 自动加载配置文件
		Configuration configure = new Configuration().configure();
		// 获取SessionFactory对象
		SessionFactory sessionFactory = configure.buildSessionFactory();
		// 获取Session对象 相当于Connection连接数据库对象
		Session session = sessionFactory.openSession();
		// 需要事务处理，开启事务处理
		Transaction transaction = session.beginTransaction();
		// 进行更新操作
		User user = new User(1, "你好", 11, "男");
		// 对数据库进行更新操作
		session.update(user);
		// 操作完后事务提交
		transaction.commit();
		// 释放资源
		session.close();
		sessionFactory.close();
	}
}
