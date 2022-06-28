package application;

public class Program {
    public static void main(String[] args) {
        for (int i = 3; i <= 999; i++) {
            if( Primo(i) )
                System.out.println(i + " é primo.");
        }
    }

    private static boolean Primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
