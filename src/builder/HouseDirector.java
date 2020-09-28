package builder;

/**
 * 
 * @author Dream
 *
 * 设计者
 */
public class HouseDirector {

	public void makeHouse(HouseBuilder builder) {
		builder.makeFloor();
		builder.makeWall();
		builder.makeHousetop();
	}
}
