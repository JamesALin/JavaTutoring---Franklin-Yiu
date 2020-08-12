import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Welcome too the Math Quiz \n Pick a level");

    int level = reader.nextInt();

    space(3);

    int numCorrect = 5;
    int correct = 0;
    int symbol;
    int cAnswer = -1;
    int num1;
    int num2;
    int answer = 0;
    int total = 0;
    while(correct < numCorrect){
      symbol = rand(1, 4);
      cAnswer = -1;
      num1 = rand(1, level*10);
      num2 = rand(1, level*10);

      if(symbol == 1){
        System.out.println(num1 + "+" + num2 + "=");
        answer = reader.nextInt();
        cAnswer = num1+num2;
      }
      else if(symbol == 2){
        while (num1<num2){
          num1 = rand(1, level*10);
          num2 = rand(1, level*10);
        }
      System.out.println(num1 + "+" + num2 + "=");
        answer = reader.nextInt();
        cAnswer = num1+num2;
      }
      else if(symbol == 3){
      System.out.println(num1 + "*" + num2 + "=");
        answer = reader.nextInt();
        cAnswer = num1*num2;
      }
      else if(symbol == 4){
        while(num1%num2 != 0){
          num1 = rand(1, level*10);
          num2 = rand(1, level*10);
        }
      System.out.println(num1 + "/" + num2 + "=");
        answer = reader.nextInt();
        cAnswer = num1/num2;

      }
      if (answer == cAnswer){
        System.out.println("POGPOGPGOPGOPGOPOGPOG");
        correct++;
      }
      else if(answer != cAnswer){
        System.out.println("PepehandsPepehandsPepehands");
      }
      System.out.println("You have " + correct + '/' + numCorrect + "correct.");
      space(3);
      total++;
    }
    System.out.println("ur done");
    System.out.println("You got " + percent(numCorrect,total) + "% correct");
  }

  public static void space(int num){
    for (int i = 0; i <= num; i++){
      System.out.println("");
    }
  }
  
  public static int rand(int max, int min){
    return (int) (Math.random()* (max-min + 1) + min);
  }
  public static int percent(int correct, int total){
    return ((int)(double)correct/total * 100);
  }
}