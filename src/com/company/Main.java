package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> listIter = Arrays.asList(1, 7, 9, 7, 5, 3, 2, 17, 58, 5);
        Iterator<Integer> iterator = listIter.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        listIter = listIter.stream()
                .filter(x -> x > 4)
                .map(x -> x + 2)
                .distinct()
                .sorted((i1,i2) -> i2-i1)
                .collect(Collectors.toList());

        System.out.print(listIter);

        System.out.println();

        System.out.println("First step");
        Cat tom = new Cat(1, "Tom");
        Dog psina = new Dog(2, "Psina");
        psina.printDog();
        tom.printCat();
        Testing aida = (x) -> x + 5;
        System.out.println(aida.detox(5));
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Hi", "Man", "How are u?", "dsds");
        list.sort((s1, s2) -> s2.length() - s1.length());
        System.out.println(list);


        /** map method **/
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        fillArr(arr1);
        fillList(list1);

        arr1 = Arrays.stream(arr1)
                .map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2)
                .collect(Collectors.toList());
        arr1 = Arrays.stream(arr1)
                .map(a -> 3).toArray();

        list1.add(5);
        list1.addAll(Arrays.asList(4, 5, 7, 8, 9, 77, 87, -3));
        Collections.sort(list1, (i1, i2) -> i2 - i1);

        //list1.sort((i1,i2) -> i2-i1);


        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        /** filter method  */
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));

        /** forEach method */
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();
        fillArr(arr3);
        fillList(list3);

        Arrays.stream(arr3).forEach(System.out::print);
        System.out.println();
        list3.stream().forEach(System.out::print);
        System.out.println();

        /** reduce method */
        int[] arr4 = new int[10];
        List<Integer> list4 = new ArrayList<>();
        fillArr(arr4);
        fillList(list4);

        int sum1 = Arrays.stream(arr4).reduce((acc, b) -> acc + b).getAsInt();
        int sum2 = list4.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum1);
        System.out.println(sum2);

        /** rope methods*/
        int[] arr5 = new int[10];
        fillArr(arr5);

        arr5 = Arrays.stream(arr5).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(arr5));

        System.out.println(list4.add(4));

        Map<Integer, String> hash = new HashMap<>();
        hash.put(1, "горелые");
        hash.put(2, "золотые");

        for (Map.Entry<Integer, String> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        hash.forEach((k, v) -> System.out.println(k + " " + v));

        /*hash = hash.entrySet().stream()
                .filter(k -> k.getKey() == 1)
//                .forEach(k -> k.setValue("Молодцы"))
                .map(e ->e.setValue("great"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));*/

        hash.forEach((k, v) -> System.out.println(k + " " + v));

        List<Integer> numbers = Arrays.asList(1, 5, 7, 8, 9);

        numbers.stream()
                .filter(x -> x > 3)
                .map(x -> x * 2)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
                .filter(x -> x < 90)
                .map(x -> x + 10)
                .limit(3).forEach(System.out::print);

        System.out.println();

        List<Human> humans = Arrays.asList(
                new Human("Sam", Arrays.asList("Buddy", "Lucy")),
                new Human("Bob", Arrays.asList("Frankie", "Rosie")),
                new Human("Marta", Arrays.asList("Simba", "Tilly")));

        List<String> petsName = humans.stream()
                .flatMap(human -> human.getPets().stream())
                .collect(Collectors.toList());

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (entry.getKey() == 3) entry.setValue("");
        }


    }

    private static void fillList(List<Integer> listInt) {
        for (int i = 0; i < 10; i++) {
            listInt.add(i + 1);
        }

    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

    private static void accept(int a) {
        System.out.print(a + " ");
    }

    private static void fillTestList(List<Integer> integerList) {
        for (int i = 0; i < 1000000; i++) {
            integerList.add(i);
        }
    }
}
