package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	//コンストラクタ
	public Oak(String name, String weapon) {
		//Humanクラスで定義したコンストラクタを利用する
		super(name, weapon);
		this.hp = Dice.get(170, 230);
		this.offensive = Dice.get(9, 15);
	}
}
