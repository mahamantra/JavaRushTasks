
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class test {
    public static void main(String[] args) throws IOException, ParseException {

           // String stringDate = "15/04/1990";
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse("15/04/1990");
            System.out.println("Date is : " + date);
        System.out.println(new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(date));

    }
}