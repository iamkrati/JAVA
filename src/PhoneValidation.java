import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidation {
    public static void main(String[] args) {
        int ctr=0;
        String target="09876543218abc gla#919876543218";
        Pattern p= Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m=p.matcher(target);
        while(m.find())
        {
            ctr++;
            System.out.println(m.start()+" "+m.end()+" "+m.group());
            System.out.println(m.group());
        }
        System.out.println(ctr);
    }
}
