package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	//コンストラクタ
	public Slime(String name, String weapon) {
		//Humanクラスで定義したコンストラクタを利用する
		super(name, weapon);
		this.hp = Dice.get(70, 130);
		this.offensive = Dice.get(5, 11);
	}
}
