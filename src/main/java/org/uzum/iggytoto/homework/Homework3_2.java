package org.uzum.iggytoto.homework;
import org.uzum.iggytoto.javacore_streams.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс для реализации домашнего задания номер три, часть 2.
 */
public class Homework3_2 {

    /**
     * Реализовать метод при помощи {@link java.util.stream.Stream} который:
     * - группирует заданых персон по возрасту
     * - фильтрует по минимальному возрасту
     * - Убирает дубликаты персон по имени
     * @param persons - заданный список персон
     * @param minimalAgeFilter - указанный минимальный возраст
     * @param removeDupes - флаг отвечающий за исключение дубликатов из результата
     * @return словарь где ключ хобби а значение лист персон с этим хобби
     */
    public Map<Integer, List<Person>> groupByAge(List<Person> persons, int minimalAgeFilter, boolean removeDupes) {
        Stream<Person> filteredStream = persons.stream()
                .filter(person -> person.getAge() >= minimalAgeFilter);

        if (removeDupes) {
            filteredStream = filteredStream.distinct();
        }
        return filteredStream.collect(Collectors.groupingBy(Person::getAge));
    }
}
