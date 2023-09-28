package org.example.programmers.day13;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("홍길동");
        person.addPhoneNumbers(new PhoneNumber("010-1234-1234"));
        person.addPhoneNumbers(new PhoneNumber("010 1234 1234"));
        person.addPhoneNumbers(new PhoneNumber("01012341234"));

        System.out.println(person.hasPhoneNumber(new PhoneNumber("01012341234")));
        System.out.println("person = " + person);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson(person);

        System.out.println("phoneBook = " + phoneBook);

        System.out.println(phoneBook.search(new PhoneNumber("010-1234-1234")));
        System.out.println(phoneBook.search(new PhoneNumber("010-1234-5555")));
    }

    private static class PhoneNumber {
        public final String phoneNumber;
        public PhoneNumber(String rawPhoneNumber) {
            this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]+", "");
        }
        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PhoneNumber that = (PhoneNumber) o;
            return Objects.equals(phoneNumber, that.phoneNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(phoneNumber);
        }
    }

    private static class Person {
        public final String name;
        private final List<PhoneNumber> numbers;

        public Person(String name) {
            this.name = name;
            numbers = new ArrayList<>();
        }
        public void addPhoneNumbers(PhoneNumber number) {
            numbers.add(number);
        }

        public boolean hasPhoneNumber(PhoneNumber number) {
            return numbers.contains(number);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", numbers=" + numbers +
                    '}';
        }
    }

    private static class PhoneBook {
        private final Set<Person> people;
        private PhoneBook() {
            people = new HashSet<>();
        }
        public void addPerson(Person person) {
            people.add(person);
        }

        public Person search(PhoneNumber number) {
            return people.stream()
                    .filter(p -> p.hasPhoneNumber(number))
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public String toString() {
            return "PhoneBook{" +
                    "people=" + people +
                    '}';
        }
    }
}
