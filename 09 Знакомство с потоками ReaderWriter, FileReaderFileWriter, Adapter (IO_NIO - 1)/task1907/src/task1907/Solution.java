package task1907;

import java.io.*;
import java.util.Arrays;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Requirements:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();
        br.close();

        try (BufferedReader fileRead = new BufferedReader(new FileReader(file))){
            int count = 0;
            while (fileRead.ready()){
                String [] words = fileRead.readLine().split("\\W+");
                System.out.println(Arrays.toString(words));
                for(String s: words){
                    if (s.equals("world")){
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
