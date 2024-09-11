package functional;

import java.util.List;

public class Ejercicios {

    public int ejercicio1(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(0, Integer::sum);
    }

    public List<Integer> ejercicio2(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }

    public List<String> ejercicio3(List<String> strings) {
        return strings
                .stream()
                .map(String::toUpperCase)
                .toList();
    }

    public Integer ejercicio4(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(0, Integer::max);
        /*return Optional<Integer> max = numbers
                .stream()
                .max(Integer::compareTo);*/
    }

    public long ejercicio5(List<Integer> numbers, int n) {
        return numbers
                .stream()
                .filter(number -> number > n)
                .count();
    }

    public String ejercicio6(List<String> words) {
        return words
                .stream()
                .reduce("", String::concat);
    }

    public List<Integer> ejercicio7(List<Integer> numbers) {
        return numbers
                .stream()
                .map(number -> number * number)
                .toList();
    }

    public List<Integer> ejercicio8(List<Integer> numbers) {
        return numbers
                .stream()
                .distinct()
                .toList();
    }

    public Integer ejercicio9(List<Integer> numbers, int n) {
        return numbers
                .stream()
                .filter(number -> number > n)
                .findFirst().orElse(0);
    }

    public long ejercicio10(List<String> words, char c) {
        return words
                .stream()
                .filter(word -> word.charAt(0) == c)
                .count();
        /*return words
                .stream()
                .filter(word -> word.startsWith(String.valueOf(c)))
                .count();*/
    }

}
