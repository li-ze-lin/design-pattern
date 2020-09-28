package bridge;

public class Jeep extends Car {

	public Jeep(Engine engine) {
		super(engine);
	}

	public void installEngine() {
		System.out.print("Jeep:");
		this.getEngine().installEngine();
	}

}
