package observer;

import java.util.Observable;
/**
 * 
 * @author Dream
 *
 *	被观察者
 */
public class BlogUser extends Observable {
	
	public void publishBlog(String articleTitle,String articleContent) {
		Article art = new Article();
		art.setArticleTitle(articleTitle);
		art.setArticleContent(articleContent);
		System.out.println("博主:发表新文章，文章标题:" + articleTitle + ",文章内容:" + articleContent);
		this.setChanged();//设置变化了
		this.notifyObservers(art);//通知观察者
	}
}
