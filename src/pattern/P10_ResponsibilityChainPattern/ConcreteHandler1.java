package pattern.P10_ResponsibilityChainPattern;

/**
 * 具体的处理者
 * 
 * @author Administrator
 *
 */
public class ConcreteHandler1 extends Handler {

	private Level level;

	public ConcreteHandler1(int l) {
		if(level==null) {
			this.level = new Level();
		}
		this.level.setLevel(l);
	}

	// 自己的处理级别
	@Override
	protected Level getHandlerLevel() {
		return this.level;
	}

	// 定义自己的处理逻辑
	@Override
	protected Response echo(Request request) {
		System.out.println("ConcreteHandler1正在处理中...");
		return null;
	}

}
