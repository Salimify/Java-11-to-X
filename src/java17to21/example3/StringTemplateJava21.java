package java17to21.example3;

import static java.lang.StringTemplate.STR;

// *** Text Blocks (Java 17) vs String Templates (Java 21 Preview (upcoming feature) ) ***
public class StringTemplateJava21 {
    public static void main(String[] args) {
        String feelLike = "cold";
        int tempeture = 30;
        String unit = "celsus";

        String message = STR."Today's weather is \{ feelLike }, with a temperature of \{ tempeture } degrees \{ unit }";

        System.out.println(message);
    }
}
