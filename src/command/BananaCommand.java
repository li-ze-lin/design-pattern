package command;

/**
 * 
 * @author Dream
 *
 *	ConcreteCommand:Command的具体实现类。
 */
public class BananaCommand extends Command{

	public BananaCommand(Peddler peddler) {
		super(peddler);
	}

	public void sail() {
		this.getPeddler().sailBanana();
	}

}
