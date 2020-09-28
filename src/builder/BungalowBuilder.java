package builder;

/**
 * 
 * @author Dream
 *
 *	平房装配
 */
public class BungalowBuilder implements HouseBuilder {

	private House house = new House();
	
	@Override
	public void makeFloor() {
		house.setFloor("平房-->地板");

	}

	@Override
	public void makeWall() {
		house.setHousetop("平房-->房顶");

	}

	@Override
	public void makeHousetop() {
		house.setWall("平房-->墙");

	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
