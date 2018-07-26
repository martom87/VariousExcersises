package strings.palindrome;

public class PalindromeChecker {
    String inputWord;


    public PalindromeChecker(String inputWord) {
        this.inputWord = inputWord;
    }

    String findPalindrome() {
        String palindrome = "";
        char[] palindromeFinder = inputWord.toCharArray();
        for (int i = palindromeFinder.length - 1; i >= 0; i--) {
            palindrome = palindrome + inputWord.charAt(i);
        }

        return palindrome;

    }

    void printPalindrome() {
        System.out.println(" The palindrom of the word " + inputWord + " is " + findPalindrome());
    }

}
