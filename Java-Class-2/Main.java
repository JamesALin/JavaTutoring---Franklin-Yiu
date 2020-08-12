public class Main{
    static void multiply(){
        int numvar = 100;
        int numvar1 = 10;
        int numvarsolution = numvar*numvar1;
        System.out.println(numvarsolution);
    }
    static void divide(){
        double numvar=100;
        double numvar1=10;
        double numvarsolution = numvar/numvar1;
        System.out.println(numvarsolution);
    }
    static void average(){
        double numvar=100;
        double numvar1=10;
        double numvarsolution=(numvar+numvar1)/2;
        System.out.println(numvarsolution);
    }
    public static void main(String args[]){
        multiply();
        divide();
        average();
    }
}