package code08_07;

public class Hero {
	//フィールド（属性）を追加
	String name;		//名前の宣言
	int hp;				//HPの宣言
	
	//メソッド（操作）を追加
	public void sleep() {		//眠るを追加
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
}
