package com.facebook.react.uimanager.events;
/* loaded from: classes4.dex */
public class PointerEventHelper {
    public static final String POINTER_CANCEL = "topPointerCancel";
    public static final String POINTER_DOWN = "topPointerDown";
    public static final String POINTER_ENTER = "topPointerEnter2";
    public static final String POINTER_LEAVE = "topPointerLeave2";
    public static final String POINTER_MOVE = "topPointerMove2";
    public static final String POINTER_TYPE_MOUSE = "mouse";
    public static final String POINTER_TYPE_PEN = "pen";
    public static final String POINTER_TYPE_TOUCH = "touch";
    public static final String POINTER_TYPE_UNKNOWN = "";
    public static final String POINTER_UP = "topPointerUp";

    public static String getW3CPointerType(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : POINTER_TYPE_MOUSE : POINTER_TYPE_PEN : POINTER_TYPE_TOUCH;
    }

    public static int getEventCategory(String str) {
        if (str == null) {
            return 2;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1779094471:
                if (str.equals(POINTER_MOVE)) {
                    c = 0;
                    break;
                }
                break;
            case -1304584214:
                if (str.equals(POINTER_DOWN)) {
                    c = 1;
                    break;
                }
                break;
            case -1065042973:
                if (str.equals(POINTER_UP)) {
                    c = 2;
                    break;
                }
                break;
            case 383186882:
                if (str.equals(POINTER_CANCEL)) {
                    c = 3;
                    break;
                }
                break;
            case 452631970:
                if (str.equals(POINTER_ENTER)) {
                    c = 4;
                    break;
                }
                break;
            case 644174243:
                if (str.equals(POINTER_LEAVE)) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c != 0) {
            if (c == 1 || c == 2 || c == 3) {
                return 3;
            }
            if (c != 4 && c != 5) {
                return 2;
            }
        }
        return 4;
    }

    public static boolean supportsHover(int i) {
        String w3CPointerType = getW3CPointerType(i);
        if (w3CPointerType.equals(POINTER_TYPE_MOUSE) || w3CPointerType.equals(POINTER_TYPE_PEN)) {
            return true;
        }
        w3CPointerType.equals(POINTER_TYPE_TOUCH);
        return false;
    }
}
