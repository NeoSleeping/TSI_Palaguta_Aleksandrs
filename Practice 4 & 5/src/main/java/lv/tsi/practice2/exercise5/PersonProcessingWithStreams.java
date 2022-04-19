package lv.tsi.practice2.exercise5;

import java.util.LinkedList;
import java.util.List;

public class PersonProcessingWithStreams {

    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();

        personList.add(new Person("Max", 28));
        personList.add(new Person("Peter", 22));
        personList.add(new Person("Anna", 28));
        personList.add(new Person("Lilianna", 16));
        personList.add(new Person("Pamela", 13));
        personList.add(new Person("David", 22));

        PersonEvaluator personEvaluator = new PersonEvaluator(personList);

        personEvaluator.findAndPrint("P");

        System.out.println();
        personEvaluator.findAndPrint(18);

        System.out.println();
        System.out.println(personEvaluator.getAverageAge());

        System.out.println();
        personEvaluator.groupAndPrint();
    }
}
