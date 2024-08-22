package task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        try(FileInputStream fis = new FileInputStream(fileName1);
            FileOutputStream fos = new FileOutputStream(fileName2)
            ) {
            byte[] bytes = new byte[fis.available()];
            int length = fis.read(bytes);


            for (int i =length-1 ; i >= 0 ; i--) {
                fos.write(bytes[i]);
            }
      System.out.println(length);
      System.out.println(Arrays.toString(bytes));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
