package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Dream
 *
 *	可以看看ArrayList的源码 本类就是仿照ArrayList所写的迭代
 */
public class BookList {
	private List<Book> bookList;
	private int index;
	private Iterator iterator;
	
	public BookList() {
		bookList = new ArrayList<Book>();
	}
	
	//添加书籍
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	//删除书籍
	public void deleteBook(Book book) {
		int bookIndex = bookList.indexOf(book);
		bookList.remove(bookIndex);
	}
	
	
	public Iterator Iterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator{

		public boolean hasNext() {
			if(index >= bookList.size()) {
				return false;
			}
			return true;
		}

		public Object next() {
			return bookList.get(index++);
		}
		
	}
	
}
