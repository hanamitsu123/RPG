package bases;

public abstract class Living {

	//メンバー変数
	protected String name;
	protected String weapon;
	protected int hp;
	protected int offensive;

	//ゲッターとセッター
	//name
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//weapon
	public String getWeapon() {
		return this.weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	//hp
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	//offensive
	public int getOffensive() {
		return this.offensive;
	}	
	public void setOffensive(int offensive) {
		this.offensive = offensive;
	}
	
	
	//コンストラクタ
	public Living(String name, String weapon) {
		this.name = name;
		this.weapon = weapon;
	}
	//ターゲットに攻撃する attackという名前の抽象メソッドを定義
	public abstract void attack(Living target);

	//toStringメソッドをオーバーライド
	@Override
	public String toString() {
		String alert = "";
		if (this.hp <= 50) {
			alert = "★ HP残りわずか！アブナイ";
		}
		return String.format("[名前]: %s, [ヒットポイント]: %d, [攻撃力]: %d %s", this.name, this.hp, this.offensive, alert);
		
	}
}
