import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
      Person p1 = new Person("Mr. Vu");
      System.out.println("The name is " + p1.getName());
      System.out.println("His age is " + p1.getAge());
      System.out.println("His number is " + p1.getNumber());
      p1.print();
      p1.updateName("Tanya");
      System.out.println(p1.getName());
  }
}
