package academy.devdojo.devdojoacademy.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
//        System.out.println(Locale.getDefault());

        Locale localeDefault = Locale.getDefault();
        Locale localeUS = new Locale("en", "US");
        ResourceBundle bundle = ResourceBundle.getBundle("messages", localeDefault);
        System.out.println(bundle.containsKey("sasa"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        ResourceBundle bundlePortugueseToEnglish = ResourceBundle.getBundle("messagesenglish", localeUS);
        System.out.println(bundlePortugueseToEnglish.getString("ola"));
        System.out.println(bundlePortugueseToEnglish.getString("bom.dia"));



    }
}
