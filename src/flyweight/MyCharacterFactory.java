package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Dream
 *
 *		享元工厂角色：
 *			负责创建和管理享元角色。
 */
public class MyCharacterFactory {
	private Map<Character,MyCharacter> pool;
	
	public MyCharacterFactory() {
		pool = new HashMap<>();
	}
	
	public MyCharacter getMyCharacter(Character character) {
		MyCharacter myChar = pool.get(character);
		if(myChar == null) {
			myChar = new MyCharacter(character);
			pool.put(character, myChar);
		}
		return myChar;
	}
}
