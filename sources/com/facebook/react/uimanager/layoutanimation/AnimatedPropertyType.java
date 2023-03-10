package com.facebook.react.uimanager.layoutanimation;

import com.facebook.react.uimanager.ViewProps;
/* loaded from: classes4.dex */
enum AnimatedPropertyType {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static AnimatedPropertyType fromString(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals(ViewProps.SCALE_X)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals(ViewProps.SCALE_Y)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1910893003:
                if (str.equals("scaleXY")) {
                    c = 3;
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
                    if (c == 3) {
                        return SCALE_XY;
                    }
                    throw new IllegalArgumentException("Unsupported animated property: " + str);
                }
                return SCALE_Y;
            }
            return SCALE_X;
        }
        return OPACITY;
    }
}
