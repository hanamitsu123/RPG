package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	//コンストラクタ
	public Brave(String name, String weapon) {
		//Humanクラスで定義したコンストラクタを利用する
		super(name, weapon);
		this.hp = Dice.get(170, 230);
		this.offensive = Dice.get(7, 13);
	}
}
