package Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.util.TextUtils;

public class IDCheck {
    public static String IDNumber = "^[a-zA-Z0-9]+$";
    //"/^[a-z]{1}[a-z0-9_]{3}[0-9]{4,9}$/";

    public static boolean isIDNumber(String id) {
        if (!TextUtils.isEmpty(id)) {
            Pattern pattern = Pattern.compile(IDNumber);
            Matcher matcher = pattern.matcher(id);
            return matcher.find();
        } else
            System.out.println("No Valid ID found");
        return false;
    }
}
