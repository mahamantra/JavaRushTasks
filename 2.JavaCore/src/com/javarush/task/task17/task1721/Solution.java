package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        File file1=new File(scanner.nextLine());
        File file2=new File(scanner.nextLine());

        FileReader fr=new FileReader(file1);
        BufferedReader br=new BufferedReader(fr);

        FileReader fr2=new FileReader(file2);
        BufferedReader br2=new BufferedReader(fr2);

        while (br.ready()){
            allLines.add(br.readLine());
        }

        while (br2.ready()){
            forRemoveLines.add(br2.readLine());
        }

        new Solution().joinData();

        for (String line : allLines) {
            System.out.println(line);
        }



    }

    public void joinData () throws CorruptedDataException {

        boolean flag=false;

        for (String forRemoveLine : forRemoveLines) {
            flag=false;

            for (String allLine : allLines) {
                if (forRemoveLine.equals(allLine)){
                    allLines.remove(allLine);
                    flag=true;
                    break;}
            }

            if (!flag){allLines.clear();throw new CorruptedDataException();}
        }

    }
}
