package com.facebook.react.uimanager.layoutanimation;

import java.util.Locale;
/* loaded from: classes4.dex */
enum InterpolatorType {
    LINEAR,
    EASE_IN,
    EASE_OUT,
    EASE_IN_EASE_OUT,
    SPRING;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static InterpolatorType fromString(String str) {
        char c;
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case -1965056864:
                if (lowerCase.equals("easeout")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1310315117:
                if (lowerCase.equals("easein")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1102672091:
                if (lowerCase.equals("linear")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -895679987:
                if (lowerCase.equals("spring")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1164546989:
                if (lowerCase.equals("easeineaseout")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4) {
                            return EASE_IN_EASE_OUT;
                        }
                        throw new IllegalArgumentException("Unsupported interpolation type : " + str);
                    }
                    return SPRING;
                }
                return LINEAR;
            }
            return EASE_IN;
        }
        return EASE_OUT;
    }
}
