package me.timos.thuanle.utils.vietnamese;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 * String utilities for Vietnamese
 */
public class StringUtils {

    /**
     * <p>Remove accent of specific string.</p>
     * <p>For example: The string "Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam - Độc Lập - Tự Do - Hạnh Phúc" will be converted into "Cong Hoa Xa Hoi Chu Nghia Viet Nam - Doc Lap - Tu Do - Hanh Phuc"</p>
     *
     * @param s string need to remove accent
     * @return the accent removed string
     */
    public static String removeAccent(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replaceAll("đ", "d");
    }
}
