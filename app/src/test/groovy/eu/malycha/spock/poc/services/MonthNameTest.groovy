package eu.malycha.spock.poc.services

import spock.lang.Specification

class MonthNameTest extends Specification {

    def "Valid month number should be converted to name"(int number, String name) {
        expect:
            MonthName.toName(number).equals(name)

        where:
            number | name
            1 | "January"
            12 | "December"
            7 | "July"
            4 | "April"
    }

    def "Invalid month number should throw exception (min)"() {
        when:
            MonthName.toName(0)

        then:
            thrown(IndexOutOfBoundsException)
    }

    def "Invalid month number should throw exception (max)"() {
        when:
        MonthName.toName(13)

        then:
        thrown(IndexOutOfBoundsException)
    }

    def "Invalid month number should throw exception"(int number) {
        when:
        MonthName.toName(number)

        then:
        thrown(IndexOutOfBoundsException)

        where:
        number << [-10, -1, 0, 13, 14, 20, 100]
    }
}
