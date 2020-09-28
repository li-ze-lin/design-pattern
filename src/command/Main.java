package command;

/**
 * 
 * @author Dream
 *
 *	一、什么是命令模式:
 *		Command模式也叫命令模式 ，是行为设计模式的一种。Command模式通过被称为
 *		Command的类封装了对目标对象的调用行为以及调用参数。
 *
 *	二、命令模式的应用场景:
 *		在面向对象的程序设计中，一个对象调用另一个对象，一般情况下的调用过程是：
 *		创建目标对象实例；设置调用参数；调用目标对象的方法。
 *		但在有些情况下有必要使用一个专门的类对这种调用过程加以封装，我们把这种专门的类称作command类。
 *		- 整个调用过程比较繁杂，或者存在多处这种调用。这时，使用Command类对该调用加以封装，便于功能的再利用。
 *		- 调用前后需要对调用参数进行某些处理。
 *		- 调用前后需要进行某些额外处理，比如日志，缓存，记录历史操作等。
 *
 *	三、命令模式的角色和职责:
 *		Command:Command抽象类。
 *		ConcreteCommand:Command的具体实现类。
 *		Receiver:需要被调用的目标对象。
 *		Invorker:通过Invorker执行Command对象。
 */
public class Main {

	public static void main(String[] args) {
		Peddler peddler = new Peddler();
		
		Command appleCommand = new AppleCommand(peddler);
		Command bananaCommand = new BananaCommand(peddler);
		Waiter waiter = new Waiter();
		
		//下订单
		waiter.setOrder(appleCommand);
		waiter.setOrder(bananaCommand);
		
		//移除订单某项
		waiter.removeOrder(appleCommand);
		
		waiter.sail();

	}

}
