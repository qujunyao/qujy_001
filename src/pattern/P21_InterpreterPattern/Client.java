package pattern.P21_InterpreterPattern;

import java.util.Stack;

/**
 * 解析模式：场景类（使用较少）
 * 
 * 定义： 是一种按照规定语法进行解析的方案，在现在的项目中使用较少。给定一门语言，定义他的文法的一种表示，并定义一个解析器，
 * 该解析器使用该表达式来解析语言中的句子。
 * 
 * 角色：
 * 1、Expression：抽象表达式
 * 具体的解释任务由各个实现类完成
 * 2、TerminalExpression：终结符表达式
 * 实现与文法中的元素相关联的解释操作，通常一个解释器模式中只有一个终结符表达式，但有多个实例，对应不同的终结符。
 * 3、NonterminalExpression：非终结符表达式
 * 文法中的每条规则对应于一个非终结表示。非终结表达式根据逻辑的复杂程度而增加，原则上每个文法规则都对应一个非终结表达式。
 * 4、Context：环境角色
 * 具体到例子中就是采用HashMap代替。
 * 
 * 优点：
 * 解析器是一个简单语法分析工具，它最显著的有点就是扩展性，修改语法规则只要修改相应的非终结表达式就可以了，若扩展语法，则只要增加
 * 非终结表达式类就可以了。
 * 
 * 缺点：
 * 1、解析器模式会引起类膨胀
 * 每个语法都要产生一个非终结表达式，语法规则比较复杂的时候，就可能产生大量的类文件，为维护带来了很大麻烦。
 * 2、解析器模式采用递归调用方法
 * 每个非终结表达式只关心自己有关的表达式，每个表达式都需要知道最终的结果，必须一层一层的剥离，无论是面向过程语言还是面向对象的语言，
 * 递归都是在必要条件下使用的，它导致调试非常复杂。
 * 3、效率问题
 * 解析器模式由于使用了大量的循环递归，效率是一个不容忽视的问题，特别是一用于解析复杂、冗长的语法时，效率是难以忍受的。
 * 
 * 使用场景
 * 1、重复发生的问题。
 * 2、一个简单语法需要解析的场景。
 * 
 * 注意事项
 * 尽量不要在重要的模块中使用解析器模式，否则维护是一个很大的问题，在项目中，可以使用shell、JRuby、Groovy等脚本语言来代替解析器模式。
 * 
 * 
 * @author Administrator
 *
 */

public class Client {

	public static void main(String[] args) {

		Context context = new Context();
		// 通常定义一个语法容器，容纳一个具体的表达式，通常为ListArrays，Linkedlist，Stack等类型
		Stack<Expression> stack = new Stack<>();

		// for(;;) {
		// 进行语法判断，并产生递归调用
		// }

		// 产生一个完整的语法树，由各个具体的语法分析进行解析。
		Expression exp = stack.pop();
		// 具体元素进入场景
		exp.Interpreter(context);
	}
}
