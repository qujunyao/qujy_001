package pattern.P12_StrategyPattern.common;

/**
 * 具体策略角色
 * 
 * @author Administrator
 *
 */
public class ConcreteStrategy1 implements Strategy {

	@Override
	public void doSomething() {
		System.out.println("具体策略1的运算法则");
	}

}
