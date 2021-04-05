import java.util.Scanner;
class Ivalue{
  int i;
  Ivalue(int i){
    this.i = i;
  }
  public void printNum(){
    System.out.println("Value of i : "+this.i);
    //System.out.println(i);
  }
}
class Jvalue extends Ivalue{
  int j;
  Jvalue(int i, int j){
    super(i);
    this.j = j;
  }
  public void printNum(int i, int j){
    super.printNum();
    System.out.println("Pratiti");
    System.out.println("Value of j : "+this.j);
  }
}
public class count{
  public static void main(String[] args){
    int iv, jv;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of i");
    iv = sc.nextInt();
    System.out.println("Enter value of j");
    jv = sc.nextInt();
    Jvalue v = new Jvalue(iv, jv);
    v.printNum();
  }
}