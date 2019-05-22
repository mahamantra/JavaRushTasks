package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Требования:
4. В методе main(String[] args) программа должна считывать имена файлов с консоли (используй BufferedReader).
5. В методе main(String[] args) BufferedReader для считывания данных с консоли должен быть закрыт.
6. Программа должна считывать содержимое первого и второго файла (используй FileReader).
7. Потоки чтения из файлов (FileReader) должны быть закрыты.
8. Список lines должен содержать объединенную версию строк из файлов, где для каждой строки указана одна из операций ADDED, REMOVED, SAME.
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
   static ArrayList <String> f1=new ArrayList<>();
   static ArrayList <String> f2=new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr1 = new BufferedReader(new FileReader("f2"));
        BufferedReader fr2 = new BufferedReader(new FileReader("f1"));



        while (fr1.ready())f1.add(fr1.readLine());
        while (fr2.ready())f2.add(fr2.readLine());

        while (!f1.isEmpty()&&!f2.isEmpty())
      {

          if(f1.get(0).equals(f2.get(0))) Solution.index(1);
          else if (!(f2.size()==1)&&f1.get(0).equals(f2.get(1))) Solution.index(2);
                    else if (f1.get(1).equals(f2.get(0))) Solution.index(3);


       }

       if (!f1.isEmpty()&&f2.isEmpty())lines.add(new LineItem(Type.REMOVED,f1.get(0)));
       if( !f2.isEmpty()&&f1.isEmpty()) lines.add(new LineItem(Type.ADDED,f2.get(0)));




        for (LineItem line : lines) {
            System.out.println(line.type+" "+line.line);
        }
        br.close();
        fr1.close();
        fr2.close();
    }

   static void index(int i){
        switch (i){

            case 1:lines.add(new LineItem(Type.SAME,f1.get(0)));f1.remove(0);f2.remove(0);break;
            case 2:lines.add(new LineItem(Type.ADDED,f2.get(0)));f2.remove(0);lines.add(new LineItem(Type.SAME,f1.get(0)));f1.remove(0);f2.remove(0);break;
            case 3:lines.add(new LineItem(Type.REMOVED,f1.get(0)));f1.remove(0);lines.add(new LineItem(Type.SAME,f1.get(0)));f1.remove(0);f2.remove(0);break;

        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
            //System.out.println(type+" "+line);
        }
    }
}
