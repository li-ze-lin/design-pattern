package composite;

/**
 * 
 * @author Dream
 *
 *	一、什么是组合模式:
 *		Composite模式也叫组合模式，是构造型的设计模式之一。
 *		通过递归手段来构造树形的对象结构，并可以通过一个对象来访问整个对象树。
 *
 *	二、组合模式的角色和职责:
 *		Component （树形结构的节点抽象）:
 *			- 为所有的对象定义统一的接口（公共属性，行为等的定义）
 *			- 提供管理子节点对象的接口方法
 *			- [可选]提供管理父节点对象的接口方法
 *		Leaf （树形结构的叶节点）:
 *			Component的实现子类
 *		Composite（树形结构的枝节点）:
 *			Component的实现子类
 */
public class Main {

	public static void main(String[] args) {

		MyFile c = new Folder("C:");
		
		MyFile firstFolder = new Folder("firstFolder:");
		MyFile firstFile = new File("firstFile.file");
		c.add(firstFolder);
		c.add(firstFile);
		
		MyFile secondFolder1 = new Folder("secondFolder1:");
		MyFile secondFolder2 = new Folder("secondFolder2:");
		MyFile secondFile = new Folder("secondFile.file");
		firstFolder.add(secondFolder1);
		firstFolder.add(secondFolder2);
		firstFolder.add(secondFile);
		
		MyFile thirdFile1 = new File("thirdFile1.file");
		MyFile thirdFile2 = new File("thirdFile2.file");
		secondFolder1.add(thirdFile1);
		secondFolder2.add(thirdFile2);
		
		displayTree(c, "");
	}
	
	public static void displayTree(MyFile file, String prefix) {
		prefix = prefix + file.display();
		System.out.println(prefix);
		for (MyFile childFile : file.getChild()) {
			if (childFile instanceof File) {
				System.out.println(prefix + childFile.display());
			} else {
				displayTree(childFile, prefix);
			}
		}
	}

}
