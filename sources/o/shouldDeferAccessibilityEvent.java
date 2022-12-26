package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class shouldDeferAccessibilityEvent {
    public static List<String> values(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                arrayList.add(split[i]);
            }
        }
        return arrayList;
    }

    public static String values(List<String> list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : list) {
            if (!z) {
                sb.append("/");
            }
            z = false;
            sb.append(str);
        }
        return sb.toString();
    }

    public static Long valueOf(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static void toString(boolean z) {
        valueOf(z, "", new Object[0]);
    }

    public static void valueOf(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new AssertionError("hardAssert failed: " + String.format(str, objArr));
    }
}
