package iterator;

import java.util.Iterator;

/**
 * 
 * @author Dream
 *
 *	一、什么是迭代模式:
 *		Iterator模式也叫迭代模式，是行为模式之一，它把对容器中包含的内部对
 *		象的访问委让给外部类，使用Iterator（遍历）按顺序进行遍历访问的设计模式。
 *
 *	二、不使用迭代模式的应用:
 *		在应用Iterator模式之前，首先应该明白Iterator模式用来解决什么问题。或者说，如果不使用Iterator模式，会存在什么问题。
 *		1.由容器自己实现顺序遍历。直接在容器类里直接添加顺序遍历方法 
 *		2.让调用者自己实现遍历。直接暴露数据细节给外部。
 *
 *	三、不使用迭代模式的缺点:
 *		以上方法1与方法2都可以实现对遍历，这样有问、题呢？
 *		1.容器类承担了太多功能：一方面需要提供添加删除等本身应有的功能；一方面还需要提供遍历访问功能。
 *		2.往往容器在实现遍历的过程中，需要保存遍历状态，当跟元素的添加删除等功能夹杂在一起，很容易引起混乱和程序运行错误等。
 *
 *	四、使用迭代模式的应用:
 *		 Iterator模式就是为了有效地处理按顺序进行遍历访问的一种设计模式，简单地说，Iterator模式提供一种有效的方法，
 *		  可以屏蔽聚集对象集合的容器类的实现细节，而能对容器内包含的对象元素按顺序进行有效的遍历访问。
 *		  所以，Iterator模式的应用场景可以归纳为满足以下几个条件：
 *		 	- 访问容器中包含的内部对象
 *			- 按顺序访问
 *
 *	五、迭代模式的角色和职责:
 *		Iterator（迭代器接口）：
 *			该接口必须定义实现迭代功能的最小定义方法集，比如提供hasNext()和next()方法。
 *		ConcreteIterator（迭代器实现类）：
 *			迭代器接口Iterator的实现类。可以根据具体情况加以实现。
 *		Aggregate（容器接口）：
 *			定义基本功能以及提供类似Iterator iterator()的方法。
 *		concreteAggregate（容器实现类）：
 *			容器接口的实现类。必须实现Iterator iterator()方法。
 *
 *	六、迭代模式的优点:
 *		1.实现功能分离，简化容器接口。让容器只实现本身的基本功能，把迭代功能委让给外部类实现，符合类的设计原则。
 *		2.隐藏容器的实现细节。
 *		3.为容器或其子容器提供了一个统一接口，一方面方便调用；另一方面使得调用者不必关注迭代器的实现细节。
 *		4.可以为容器或其子容器实现不同的迭代方法或多个迭代方法。
 */
public class Main {

	public static void main(String[] args) {
		BookList bookList = new BookList();
		
		Book book1 = new Book("010203","Java编程思想",90);
		Book book2 = new Book("010204","Java从入门到精通",60);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		
		Iterator iter = bookList.Iterator();
		while(iter.hasNext()) {
			Book book = (Book) iter.next();
			book.display();
		}

	}

}
