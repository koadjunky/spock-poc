package eu.malycha.spock.poc.services

import spock.lang.Specification

class MissingNumberTest extends Specification {

    def "if all numbers present return zero"() {
        given:
            def arr = [1, 2, 3, 4]

        when:
            def i = MissingNumber.findMissing(arr)

        then:
            i == 0
    }

    def "if number is missing return missing number"(List<Integer> arr, Integer missing) {
        when:
            int i = MissingNumber.findMissing(arr)

        then:
            i == missing

        where:
            arr          | missing
            [1, 2, 0, 4] | 3
            [1, 0, 3]    | 2
            [0, 2, 3]    | 1
    }

}
