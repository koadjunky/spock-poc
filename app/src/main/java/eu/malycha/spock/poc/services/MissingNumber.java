package eu.malycha.spock.poc.services;

import java.util.List;

public class MissingNumber {

    public static int findMissing(List<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        int l = arr.size();
        return l * (l + 1) / 2 - sum;
    }

}
