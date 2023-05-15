public class ErrorC {

    public static void main(String[] args) {
        System.out.println("Multiplication Table of 7");
        int a = 7, ans;
        int i;

        for (i = 1; i <= 10; i++) { // ponto e virgula faltando depois do valor de i = 1 -> ";" <-
            ans = a * i;
            System.out.printf("7 x %s = %s \n", i, ans); // incrementado o formato de saída.
        }
    }
}
