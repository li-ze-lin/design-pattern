package composite;

import java.util.List;
/**
 * 
 * @author Dream
 *
 *		Leaf （树形结构的叶节点）:
 *			Component的实现子类
 */
public class File implements MyFile{

	private String name;

	public File(String name) {
		this.name = name;
	}

	@Override
	public String display() {
		return name;
	}

	@Override
	public boolean add(MyFile file) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(MyFile file) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MyFile> getChild() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
