import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SD {
    public static void main(String[] args) {
        String sd = "http://f10.eastmoney.com/CompanySurvey/CompanySurveyAjax?code=";
        System.out.println(sd);
        String sdxx = "http://f10.eastmoney.com/CompanySurvey/CompanySurveyAjax?code=SSxx1235";
        Pattern p = Pattern.compile(sd);
        Matcher matcher = p.matcher(sdxx);
        System.out.println(matcher.find());
        System.out.println("\\\\");
        System.out.println("^(\\(ab\\))*");
    }
}
