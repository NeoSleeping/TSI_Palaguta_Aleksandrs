package lv.tsi.practice2.exercise5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonEvaluator {

    private final List<Person> personList;

    public PersonEvaluator(List<Person> personList) {
        this.personList = personList;
    }

    public void findAndPrint(String str) {
        personList.stream()
                .filter(person -> person.getName().startsWith(str))
                .forEach(person -> System.out.println(person.getName()));
    }

    public void findAndPrint(int age) {
        personList.stream()
                .filter(person -> person.getAge() > age)
                .forEach(person -> System.out.println(person.getName()));
    }

    public void groupAndPrint() {
        Map<Integer, List<Person>> group = personList
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));

        group.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println("Age " + e.getKey() + ":" + e.getValue()));
    }

    public int getAverageAge() {
        return (int) personList.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }
}
