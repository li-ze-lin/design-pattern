package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 
 * @author Dream
 *
 *		Proxy（代理主题角色）：
 *			含有对真实主题角色的引用，代理角色通常在将客户端调用
 *			传递给真是主题对象之前或者之后执行某些操作，而不是单纯返回真实的对象。
 *
 *	1. InvocationHandler 接口
 */
public class MyHandler implements InvocationHandler {
	private RealSubject realSubject;
	
	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	/**
	 * 2. invoke方法
	 */
	public Object invoke(Object proxy, Method method, Object[] args){
		Object result = null;
		dazhe();
		try {
			result = method.invoke(realSubject, args);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		give();
		return result;
	}
	
	public void dazhe() {
		System.out.println("打折");
	}
	
	public void give() {
		System.out.println("赠送代金券");
	}

}
