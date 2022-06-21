package site.metacoding.reflect.test;

import java.lang.reflect.Constructor;

import site.metacoding.reflect.domain.Member;

public class MemberTest {

	public void newInstance_테스트() {
		
		String typeName = Member.class.getTypeName();
		System.out.println(typeName);
		
		Class<?> cls = Member.class;
		try {
			Constructor<?> constructor = cls.getConstructor();
			Member member = (Member)constructor.newInstance();
			member.setId(1);
			member.setUsername("ssar");
			member.setPassword("1234");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		new MemberTest().newInstance_테스트();
	}
}
