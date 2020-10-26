package JieKou;

/**
 * Created with Intellij IFEA
 * Description:
 * User : 花朝
 * Date : 2020-10-26
 * Time : 14:56
 */
interface  IA{
    void  func();

}

abstract class A implements  IA{
    public  void fun(){
        System.out.println("4444");
    }
}
interface  IB extends  IA{
    void fun2();
}

class  C implements  IB{
    public C() {
        super();
    }

    @Override
    public void func() {

    }

    @Override
    public void fun2() {

    }
}
interface  ID{
    public  void fun3();
}
interface  IC extends  IB ,ID{
    @Override
    void func();

    @Override
    void fun2();

    @Override
    void fun3();
}

class  Animal {
    protected String name ;

    public  Animal (String name){
        this.name = name;
    }
}
interface  IFlying{
    void fly();

}
interface  IRunnig {
    void run();
}
interface  ISwimming{
    void  swim();
}

class  Cat  extends  Animal implements  IRunnig {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + " 正在跑");
    }
}
class Fish extends  Animal implements  ISwimming{
    public  Fish(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + " 正在用尾巴游泳");
    }
}
class  Forg extends  Animal implements  IRunnig, ISwimming{
    public Forg(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + " 正在游泳" );
    }

    @Override
    public void run() {
        System.out.println(this.name + " 正在跑步");
    }
}
class  RoBot implements  IRunnig{
    @Override
    public void run() {
        System.out.println("机器人再跑");
    }
}
public class TestDemo {
    public static void function1(IRunnig iRunnig){
        iRunnig.run();
    }
    public static void function2(ISwimming iSwimming) {
        iSwimming.swim();
    }
    public static void function3(IFlying iFlying){
        iFlying.fly();
    }
    public static void main (String[] args){
        function2(new Fish("HAHHAHA"));

    }
    public static void main1 (String[] args){
    Animal animal = new Fish("HAHHAHA");
    ISwimming iSwimming = new Fish("HHHHHHHH");
    }
}
