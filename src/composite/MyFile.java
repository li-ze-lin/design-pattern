package composite;

import java.util.List;

/**
 * 
 * @author Dream
 *
 *		Component （树形结构的节点抽象）:
 *			- 为所有的对象定义统一的接口（公共属性，行为等的定义）
 *			- 提供管理子节点对象的接口方法
 *			- [可选]提供管理父节点对象的接口方法
 *
 *	文件节点抽象(是文件和目录的父类)
 */
public interface MyFile {

	//显示文件或者文件夹的名称
	String display();
	
	//添加
	boolean add(MyFile file);
	
	//移除
	boolean remove(MyFile file);
	
	//获得子节点
	List<MyFile> getChild();
}
