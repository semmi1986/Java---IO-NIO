package task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        int max = 0;
        try (FileInputStream inputStream = new FileInputStream(fileName);){
            int countByte;
            while ((countByte = inputStream.read()) != -1){
                if (countByte> max){
                    max = countByte;
                }
            }
            System.out.println(max);
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
