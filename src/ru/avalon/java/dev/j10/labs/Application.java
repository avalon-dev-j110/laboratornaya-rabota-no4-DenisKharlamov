package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {
	    "apple", "banana", "cat", "duck", "egg", "frog",
	    "goose", "house", "ice cream", "juice", "kite",
	    "lemon", "mouse", "nut", "onion", "pelican", "queen",
	    "rose", "snake", "tree", "umbrella", "vase", "wolf",
	    "xylophone", "yacht", "zebra"};
	    
	    // распологаем строки в массиве не по порядку
	    for (int i = 0; i < strings.length; i++) {
	    	int r = i + (int) (Math.random() * (strings.length - i));
	    	String temp = strings[i];
	    	strings[i] = strings[r];
	    	strings[r] = temp;
	    }
	    System.out.println(Arrays.toString(strings));
	    
	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Human[20];
	    for (int i = 0; i < persons.length; i++)
	    	persons[i] = new Human();
	    for (int i = 0; i < persons.length; i++) {
	    	System.out.println(((Human)persons[i]).getFullData());
	    }

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new Sorting();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new StringComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);
        System.out.println();
        for (int i = 0; i < persons.length; i++)
	    	System.out.println(((Human)persons[i]).getFullData());

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        System.out.println(Arrays.toString(strings));

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        System.out.println(Arrays.toString(strings));
    }
}
