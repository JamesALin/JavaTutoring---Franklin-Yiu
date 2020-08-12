import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    int a = input1.nextInt();
    int b = input2.nextInt();
    int c = input3.nextInt();
    if(a>b && a>c){
      System.out.println(a);
    }
    else if(b>c && b>a){
      System.out.println(b);
    }
    else if(c>b && c>a){
      System.out.println(c);
    }
    else{
      System.out.println("Error");
    }
  }
}