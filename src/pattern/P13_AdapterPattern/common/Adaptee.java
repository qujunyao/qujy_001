package pattern.P13_AdapterPattern.common;

/**
 * 源角色
 * 
 * @author Administrator
 *
 */
public class Adaptee {
	
	//原有的业务逻辑
	public void doSomething() {
		System.out.println("I'm kind of busy,leave me alone,please ");
	}

}
