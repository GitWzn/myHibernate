package com.wzn.myPojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	//自动创建set/get方法
@AllArgsConstructor		//自动创建有参构造
@NoArgsConstructor		//自动创建无参构造
public class User {
	private int id;
	private String username;
	private int u_age;
	private String sex;
}
