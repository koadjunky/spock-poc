package eu.malycha.spock.poc.services;

public class Palindrome {

    public boolean isPalindrome(String text) {
        if (text == null || text.length() == 0) {
            return false;
        }
        return equals(text, reverse(text));
    }

    private boolean equals(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        } else if (s1 == null) {
            return false;
        } else {
            return s1.equals(s2);
        }
    }

    private String reverse(String text) {
        StringBuilder reverse = (new StringBuilder(text)).reverse();
        return reverse.toString();
    }
}
