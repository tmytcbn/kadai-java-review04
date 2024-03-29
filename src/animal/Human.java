package animal;

public class Human extends Animal implements Thinkable {
    // フィールド
    private String hobby;

    // コンストラクタ
    public Human() {
    }
    
    public Human(String name, int age, String hobby) {
        super(name,age);
        this.hobby = hobby;        
    }

    // メソッド
    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }

}
