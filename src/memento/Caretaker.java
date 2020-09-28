package memento;

/**
 * 
 * @author Dream
 *
 *	Caretaker（管理者）:负责在适当的时间保存/恢复Originator对象的状态。
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
