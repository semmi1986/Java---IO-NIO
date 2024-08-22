package task1805;

import java.io.FileInputStream;
import java.util.*;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try (FileInputStream fis = new FileInputStream(fileName)) {
            Set<Integer> intSet = new TreeSet<>();
            List<Integer> list = new ArrayList<>();

            int res;

            while ((res = fis.read()) != -1){
                intSet.add(res);
                list.add(res);
            }
            System.out.println("It`s a TreeSet");
            for (Integer i: intSet){

                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("It`s a ArrayList");
            for (Integer i: list){
                System.out.print(i + " ");
            }
        }

    }
}
