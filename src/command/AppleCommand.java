package command;

/**
 * 
 * @author Dream
 *
 *	ConcreteCommand:Command的具体实现类。
 */
public class AppleCommand extends Command {

	public AppleCommand(Peddler peddler) {
		super(peddler);
	}

	public void sail() {
		this.getPeddler().sailApple();
	}
	
}
