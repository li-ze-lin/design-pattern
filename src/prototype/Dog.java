package prototype;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Dream
 *	
 *	实现Cloneable接口 重写clone()方法
 */
public class Dog implements Cloneable{

	private String name;
	private int age;
	private List<String> hobby;
	
	/**
	 *	没有处理深度克隆类里的对象是址不是值
	 *	所以需要处理
	 */
	@Override
	protected Dog clone() throws CloneNotSupportedException {
		Dog dog = (Dog) super.clone();
		//深度克隆开始
		List<String> hobby = new ArrayList<String>();
		for(String temp : this.getHobby()) {
			hobby.add(temp);
		}
		dog.setHobby(hobby);
		//深度克隆结束
		return dog;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	
	
}
