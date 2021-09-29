package code08_12;

public class Main {

	public static void main(String[] args) {
		//勇者を作成
		Hero h = new Hero();
		//フィールドの初期値を宣言
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
	}

}
