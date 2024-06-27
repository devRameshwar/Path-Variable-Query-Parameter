package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.college.College;

public class MainClass {

	public static void main(String[] args) {

		BeanFactory context = new FileSystemXmlApplicationContext(
				"C:\\Users\\Ramu_Coder\\Desktop\\Spring-core\\Autowiring\\src\\bean.xml");

		College bean = (College) context.getBean("college");

		System.out.println(bean);
	}

}
