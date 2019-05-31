
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ByteArrayOutputStream arrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream out =new ObjectOutputStream(arrayOutputStream);

        Person person1=new Person("ivan",22);


        Person person2=new Person("sveta",44);


        out.writeObject(person1);
        out.writeObject(person2);

        ByteArrayInputStream arrayInputStream=new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream in=new ObjectInputStream(arrayInputStream);

       Person person3=(Person) in.readObject();
        Person person4=(Person) in.readObject();

        System.out.println(person3.name+person3.age);
        System.out.println(person4.name+person4.age);



    }
}