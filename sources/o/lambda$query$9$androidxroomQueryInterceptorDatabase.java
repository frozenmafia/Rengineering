package o;
/* renamed from: o.lambda$query$9$androidx-room-QueryInterceptorDatabase  reason: invalid class name */
/* loaded from: classes7.dex */
public class lambda$query$9$androidxroomQueryInterceptorDatabase {
    public static String valueOf(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static String ag$a(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[2] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 2] = str.charAt(i);
        }
        return new String(cArr);
    }
}
