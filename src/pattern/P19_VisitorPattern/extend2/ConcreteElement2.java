package pattern.P19_VisitorPattern.extend2;

/**
 * 具体元素
 * 
 * @author Administrator
 *
 */
public class ConcreteElement2 extends Element {

	// private int num = new Random().nextInt(100);
	private int num = 20;

	public int getNum() {
		return num;
	}

	// 完善业务逻辑
	@Override
	public void doSomething() {
		System.out.println("元素2处理业务逻辑中...");
	}

	// 允许哪个访问者访问
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
