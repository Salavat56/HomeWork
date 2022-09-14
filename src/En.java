import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum En {
    I(1), II(2), III(3), IV(4),
    V(5), VI(6), VII(7), VIII(8), IX(9), X(10),
    XL(40), L(50), XC(90), C(100);

    int translation;

    En(int translation) {
        this.translation = translation;
    }

    static int parseToInt(String str) {
        return En.valueOf(str).translation;
    }

    static String parseToEn(int number) throws Exception {
        if ((number <= 0) || (number > 4000)) {
            throw new Exception();
        }

        int i = En.values().length - 1;
        StringBuilder sb = new StringBuilder();
        while ((number > 0) && (i >= 0)) {
            En currentSymbol = En.values()[i];
            if (currentSymbol.translation <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.translation;
            } else {
                i--;
            }
        }
        return sb.toString();
    }

}
