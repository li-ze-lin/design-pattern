package builder;

/**
 * 
 * @author Dream
 *
 *	公寓装配
 */
public class ApartmentBuilder implements HouseBuilder {

	private House house = new House();
	
	@Override
	public void makeFloor() {
		house.setFloor("公寓-->地板");

	}

	@Override
	public void makeWall() {
		house.setHousetop("公寓-->房顶");

	}

	@Override
	public void makeHousetop() {
		house.setWall("公寓-->墙");

	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
