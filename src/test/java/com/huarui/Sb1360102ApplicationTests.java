package com.huarui;

import com.huarui.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sb1360102ApplicationTests {


	@Autowired
	private Person person;

	@Test
	public void test01() {
		System.out.println(person);
	}

}