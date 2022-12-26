package com.google.gson;

import com.dreampay.commons.constants.Constants;
import java.lang.reflect.Field;
import java.util.Locale;
import o.findLastCompletelyVisibleItemPositions;
/* loaded from: classes5.dex */
public enum FieldNamingPolicy implements findLastCompletelyVisibleItemPositions {
    IDENTITY { // from class: com.google.gson.FieldNamingPolicy.1
        @Override // o.findLastCompletelyVisibleItemPositions
        public String translateName(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.google.gson.FieldNamingPolicy.2
        @Override // o.findLastCompletelyVisibleItemPositions
        public String translateName(Field field) {
            return upperCaseFirstLetter(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.gson.FieldNamingPolicy.3
        @Override // o.findLastCompletelyVisibleItemPositions
        public String translateName(Field field) {
            return upperCaseFirstLetter(separateCamelCase(field.getName(), Constants.WHITE_SPACE));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.4
        @Override // o.findLastCompletelyVisibleItemPositions
        public String translateName(Field field) {
            return separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.google.gson.FieldNamingPolicy.5
        @Override // o.findLastCompletelyVisibleItemPositions
        public String translateName(Field field) {
            return separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.google.gson.FieldNamingPolicy.6
        @Override // o.findLastCompletelyVisibleItemPositions
        public String translateName(Field field) {
            return separateCamelCase(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    static String separateCamelCase(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String upperCaseFirstLetter(String str) {
        int length = str.length();
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length - 1) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
