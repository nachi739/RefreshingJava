package code08_15;

public class Matango {
	//フィールド（属性）を追加
	int hp;							//HPの宣言
	final int LEVEL = 10;		//levelを定数で固定し宣言
	char suffix;
	//メソッド（操作）を追加
	//逃げるを追加
	public void run () {
		System.out.println("お化けキノコ" + this.suffix + "は、逃げ出した！");
	}
}
