package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу  , new Asset("home", 999_999.99), new Asset("car", 2999.99)
        try {
            File your_file_name = File.createTempFile("f11", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov");
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            System.out.println(ivanov.equals(somePerson));
            for (Asset asset : somePerson.assets) {
                System.out.println(somePerson.name+" "+asset.getName()+" "+asset.getPrice());
            }

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter pw = new PrintWriter(outputStream);
            pw.println(this.name);

            String f=(assets != null&&assets.size()!=0)?"Y":"N";
            pw.println(f);

            if (f.equals("Y")) {


                int count=assets.size();
                pw.println(count);

                for (Asset asset : assets) {
                    asset.save(pw);
                }
            }
            pw.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
            this.name=br.readLine();

            String f=br.readLine();

            if(f.equals("Y")){

            int count=Integer.parseInt(br.readLine());

            for (int i = 0; i <count ; i++) {
                Asset asset=new Asset();
                asset.load(br);
                this.assets.add(asset);
            }
            }


        }
    }
}
