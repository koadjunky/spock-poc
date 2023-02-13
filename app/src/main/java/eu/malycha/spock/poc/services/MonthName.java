package eu.malycha.spock.poc.services;

public class MonthName {

    private static final String[] NAMES = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static String toName(Integer number) {
        return NAMES[number - 1];
    }

}
