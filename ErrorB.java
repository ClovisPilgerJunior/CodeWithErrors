public class ErrorB {

    public static void main(String[] args) {
        int var1 = 15;
        int var2 = 5;
        int var3 = 0; // <- ponto e virgula estava faltando.

        /*
         Divisão por 0 não é possível. Vai ser lançada em uma thread ArithmeticExecption / by zero.
         O jeito de resolver seria um try catch ou if-else.
         nesse caso optei por if else, e também coloquei o ans1 e ans2 dentro dele
        */
        if (var3 != 0) {
            int ans1 = var1 / var2;
            int ans2 = var1 / var3;
            System.out.println("Division of va1 by var2 is: " + ans1);
            System.out.println("Division of va1 by var3 is: " + ans2);
        } else {
            System.out.println("Error: div / by zero!");
        }


    }
}
