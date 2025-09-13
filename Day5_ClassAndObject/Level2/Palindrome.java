class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        PalindromeChecker p2 = new PalindromeChecker("hello");

        p1.displayResult();
        System.out.println("-------------------");
        p2.displayResult();
    }
}

