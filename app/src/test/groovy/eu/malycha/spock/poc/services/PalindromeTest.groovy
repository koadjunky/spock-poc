package eu.malycha.spock.poc.services

import spock.lang.Specification

class PalindromeTest extends Specification {

    def "null is not palindrome"() {
        given:
        def service = new Palindrome()

        expect:
        !service.isPalindrome(null)
    }

    def "empty string is not palindrome"() {
        given:
        def service = new Palindrome()

        expect:
        !service.isPalindrome("")
    }

    def "palindromes"(String text, boolean result) {
        given:
        def service = new Palindrome()

        expect:
        service.isPalindrome(text) == result

        where:
            text         | result
            "ala"        | true
            "abba"       | true
            "madam"      | true
            "palindrome" | false
            "a"          | true
    }
}
