package o;
/* loaded from: classes5.dex */
public class access$getFoldingFeature {
    public static boolean values(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str.toLowerCase().endsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}
