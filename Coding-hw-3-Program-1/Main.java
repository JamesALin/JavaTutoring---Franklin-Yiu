
class Main {
  public static void main(String[] args) {
    int i, factorial_function = 1;
      int num = 15;
      for(i = 1;i <= num; i++){
        factorial_function = factorial_function * i;
      }
    System.out.println(factorial_function);
  }
}