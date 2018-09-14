package pattern.P09_CommandPattern;

/**
 * 抽象命令类
 * 
 * @author Administrator
 *
 */
public abstract class Command {

	//定义一个子类的全局共享变量
	protected final Receiver receiver;

	//实现类必须定义一个接受者
	public Command(Receiver r) {
		this.receiver = r;
	}

	//每个命令类都必须有一个执行命令的方法
	public abstract void execute();
}
