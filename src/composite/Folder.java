package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Dream
 *
 *		Composite（树形结构的枝节点）:
 *			Component的实现子类
 */
public class Folder implements MyFile{

	private String fileName;
	
	private List<MyFile> fileList;
	
	public Folder(String fileName) {
		this.fileName = fileName;
		this.fileList = new ArrayList<MyFile>();
	}

	@Override
	public String display() {
		return fileName;
	}

	@Override
	public boolean add(MyFile file) {
		return fileList.add(file);
	}

	@Override
	public boolean remove(MyFile file) {
		return fileList.remove(file);
	}

	@Override
	public List<MyFile> getChild() {
		return fileList;
	}

	
}
