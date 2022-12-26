package o;
/* loaded from: classes4.dex */
public class getDefaultSize2 {
    getDefaultSize2() {
    }

    public static void values(String str, String str2, String str3) {
        String str4 = str + str2 + str3;
        if (str4.length() > 127 && str2 != null) {
            int length = str.length();
            int length2 = str3.length();
            str4 = str + str2.substring(0, (127 - length) - length2) + str3;
        }
        android.os.Trace.beginSection(str4);
    }
}
