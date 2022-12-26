package com.facebook.react.views.text;

import java.text.BreakIterator;
/* loaded from: classes4.dex */
public enum TextTransform {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* renamed from: com.facebook.react.views.text.TextTransform$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[TextTransform.values().length];
            toString = iArr;
            try {
                iArr[TextTransform.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[TextTransform.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                toString[TextTransform.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String apply(String str, TextTransform textTransform) {
        if (str == null) {
            return null;
        }
        int i = AnonymousClass4.toString[textTransform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? str : capitalize(str);
            }
            return str.toLowerCase();
        }
        return str.toUpperCase();
    }

    private static String capitalize(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            int next = wordInstance.next();
            if (next != -1) {
                String substring = str.substring(first, next);
                if (Character.isLetterOrDigit(substring.charAt(0))) {
                    sb.append(Character.toUpperCase(substring.charAt(0)));
                    sb.append(substring.substring(1).toLowerCase());
                } else {
                    sb.append(substring);
                }
                first = next;
            } else {
                return sb.toString();
            }
        }
    }
}
