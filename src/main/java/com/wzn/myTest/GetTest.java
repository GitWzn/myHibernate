package com.wzn.myTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wzn.myPojo.User;

public class GetTest {
	public static void main(String[] args) {
		//加载Hibernate配置文件
		Configuration configure = new Configuration().configure();
		//获取SessionFactory对象
		SessionFactory sessionFactory = configure.buildSessionFactory();
		//获取Session对象    相当于Connection连接数据库对象
		Session session = sessionFactory.openSession();
		//查询操作    这里只能查询一条数据
		User user = session.get(User.class, 4);
		System.out.println(user);
		//操作完成后释放资源
		session.close();
		sessionFactory.close();
	}
}
