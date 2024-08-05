package academy.devdojo.devdojoacademy.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] localeCountries = Locale.getISOCountries();
        String[] localeLanguages = Locale.getISOLanguages();

//        for (String localCountrie : localeCountries){
//            System.out.println(localCountrie);
//        }
//        System.out.println("----");
//        for (String localLanguage : localeLanguages){
//            System.out.println(localLanguage);
//        }

        int countryIndex = 0;
        int languageIndex =0;

        while (countryIndex < localeCountries.length && languageIndex < localeLanguages.length){
            String countryStr = localeCountries[countryIndex];
            String languageStr = localeLanguages[languageIndex];

            System.out.println("Country; " + countryStr + ": language: " + languageStr);

            countryIndex++;
            languageIndex++;
        }
    }
}
