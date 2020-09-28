package builder;

/**
 * 
 * @author Dream
 *
 *	工程队
 */
public interface HouseBuilder {

	/**
	 * 修地板
	 */
	void makeFloor();
	
	/**
	 * 修墙
	 */
	void makeWall();
	
	/**
	 * 修屋顶
	 */
	void makeHousetop();
	
	/**
	 * 获取装配好的房子
	 */
	House getHouse();
}
