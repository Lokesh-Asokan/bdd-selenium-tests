package mission;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String args[]){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now).toString());


       // System.out.println(ref.replaceAll("[^A-Z]{3,}", ""));
        ;
       /* Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(ref);
        if(matcher.matches()) {
            System.out.println(matcher.group(1));
        }else{
            System.out.println("nomatch");
        }*/

    }
}
