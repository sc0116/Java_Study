package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Class cl = Class.forName("ch04.Person");
		
		Person person = (Person)cl.newInstance();
		
		person.setName("Lee");
		System.out.println(person);
		
		Class cla = person.getClass();
		Person person2 = (Person)cla.newInstance();
		System.out.println(person2);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = cla.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person kim = (Person)cons.newInstance(initargs);
		System.out.println(kim);
	}

}
