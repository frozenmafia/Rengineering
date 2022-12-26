package o;

import android.util.Log;
/* loaded from: classes3.dex */
public final class removeListener {
    public static final toString ag$a = new toString();

    /* loaded from: classes3.dex */
    public static final class toString {
        public static void ah$a(toString tostring, String str, String str2, int i) {
            String str3 = (i & 2) != 0 ? "" : null;
            runAnimators.ag$a(str, "message");
            runAnimators.ag$a(str3, "tag");
            Log.e(runAnimators.values("[Storyly] ", (Object) str3), str);
        }

        public static void toString(toString tostring, String str, String str2, int i) {
            String str3 = (i & 2) != 0 ? "" : null;
            runAnimators.ag$a(str, "message");
            runAnimators.ag$a(str3, "tag");
            Log.w(runAnimators.values("[Storyly] ", (Object) str3), str);
        }
    }
}
