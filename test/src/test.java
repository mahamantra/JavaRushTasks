
import java.text.ChoiceFormat;
import java.text.MessageFormat;


public class test {
    public static void main(String[] args) {
        MessageFormat form = new MessageFormat("Я могу {1} {0}.");
        int count = 2;
        String exercise = "подтянуться";
        Object[] testArgs = {count, exercise};

        double[] filelimits = {0,1,2};
        String[] filepart = {"{0} раз","{0} раза","{0} раз"};
        ChoiceFormat fileform = new ChoiceFormat(filelimits, filepart);
        form.setFormatByArgumentIndex(0, fileform);

        System.out.println(form.format(testArgs));
    }



}