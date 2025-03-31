public class Main {
    public static void main(String[] args) {
        String testString = "tacocat";
        Palindrome myPalindrome = new Palindrome();
        System.out.println("Is " + testString + " a palindrome? " + myPalindrome.isPalindrome(testString));
        String testString2 = "wackamole";
        Palindrome myPalindrome2 = new Palindrome();
        System.out.println("Is " + testString2 + " a palindrome? " + myPalindrome2.isPalindrome(testString2));

    }
}