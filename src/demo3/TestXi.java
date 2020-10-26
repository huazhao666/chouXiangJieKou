package demo3;

/**
 * Created with Intellij IFEA
 * Description:
 * User : 花朝
 * Date : 2020-10-26
 * Time : 16:54
 */
class Money implements  Cloneable{
    public  double money = 34.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class  Person implements  Cloneable{
    public String name = " lalal";
    public Money  m = new Money();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super .clone();
         person.m = (Money) person.m.clone();
         return  person;
        //return super.clone();
    }

}
public class TestXi {
    public static void main (String[] args)throws CloneNotSupportedException {
        Person person = new Person();
        Person person1 = (Person) person.clone();
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
        System.out.println("============");
        person1.m.money = 99.99;
        System.out.println(person.m.money);
        System.out.println(person1.m.money);

    }
}
