package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	//コンストラクタ
	public Dragon(String name, String weapon) {
		//Humanクラスで定義したコンストラクタを利用する
		super(name, weapon);
		this.hp = Dice.get(270, 330);
		this.offensive = Dice.get(12, 18);
	}
}
