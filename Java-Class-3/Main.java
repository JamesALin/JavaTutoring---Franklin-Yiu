class Main {
  public static void main(String[] args) {
    int lastchar = 0;
    String hello = " hello";
    for (int currentchar = 0;currentchar <= hello.length();currentchar++){
      {
      int lasttchar = currentchar + 1;
      System.out.println(hello.charAt(lasttchar));
      }
    }
  }
}