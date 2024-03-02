package easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int numero = 10001;
        boolean isPalindrome = verifyPalindrome(numero);
        System.out.println("Number: " + numero);
        System.out.println("Is Palindrome ?  " + isPalindrome);
    }

    public static boolean verifyPalindrome(int x) {
        int invertido = 0;
        int n = x;
        boolean isPalindrome = false;
        if (x > 0) {
            while (x != 0) {
                // Pegando numero mais a direita
                invertido = invertido * 10 + x % 10;
                // retirando ultimo numero a direita
                x = x / 10;
            }
        }
        if (n == invertido) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
