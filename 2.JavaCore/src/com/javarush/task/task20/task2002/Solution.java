package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", ".txt");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            User user = new User();
            user.setFirstName("Rubi");
            user.setLastName("Rail");
            user.setBirthDate(new Date(1508944516168L));
            user.setMale(true);
            user.setCountry(User.Country.OTHER);

            User user1 = new User();
            user1.setFirstName("Vasa1");
            user1.setLastName("Peta1");
            user1.setBirthDate(new Date(1508944516163L));
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);

            User user3 = new User();
            user3.setFirstName("Solo");
            user3.setLastName("Han");
            user3.setBirthDate(new Date(1508944516169L));
            user3.setMale(true);
            user3.setCountry(User.Country.UKRAINE);

            JavaRush javaRush = new JavaRush();
            javaRush.users.add(new User("ivan","ivanov",new Date("9/10/2001"),true, User.Country.RUSSIA));
            javaRush.users.add(user);
            javaRush.users.add(user1);
            javaRush.users.add(user3);

            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();
            for (User user2 : loadedObject.users) {
                System.out.print(user2.getFirstName());
                System.out.print(user2.getLastName());
                System.out.print(user2.getBirthDate());
                System.out.print(user2.isMale());
                System.out.print(user2.getCountry());
            }
            System.out.println();
            for (User user2 : javaRush.users) {
                System.out.print(user2.getFirstName());
                System.out.print(user2.getLastName());
                System.out.print(user2.getBirthDate());
                System.out.print(user2.isMale());
                System.out.print(user2.getCountry());
            }
            System.out.println(javaRush.equals(loadedObject));

        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {            System.out.println(e);

            //e.printStackTrace();            System.out.println(e);
            System.out.println("Oops, something wrong with save/load method");
        }

    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter=new PrintWriter(outputStream);
            String f=String.valueOf(users.size());
            printWriter.println(f);
            printWriter.flush();
            if(users.size()>0)
            for (User user : users) {
                user.save(printWriter);
            }
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
           int i=Integer.parseInt(reader.readLine());
            for (int j = 0; j <i; j++) {


            User user=new User();
           user.load(reader);
            users.add( user);
            }


        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
