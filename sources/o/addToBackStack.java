package o;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
/* loaded from: classes4.dex */
public class addToBackStack {
    private static String valueOf = null;
    private static final String values = "AndroidInfoHelpers";

    private static boolean ag$a() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean ah$a() {
        return Build.FINGERPRINT.contains("generic");
    }

    public static String ah$a(Context context) {
        return valueOf(ag$a(context).intValue());
    }

    public static String valueOf(Integer num) {
        return "adb reverse tcp:" + num + " tcp:" + num;
    }

    public static String values(Context context) {
        return valueOf(ag$a(context));
    }

    public static String toString(Context context) {
        return valueOf(valueOf(context).intValue());
    }

    public static String values() {
        if (ag$a()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    private static Integer ag$a(Context context) {
        return Integer.valueOf(context.getResources().getInteger(onFragmentSaveInstanceState$ag$a.react_native_dev_server_port));
    }

    private static Integer valueOf(Context context) {
        return Integer.valueOf(context.getResources().getInteger(onFragmentSaveInstanceState$ag$a.react_native_dev_server_port));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String valueOf(int i) {
        String valueOf2 = valueOf();
        if (valueOf2.equals("")) {
            if (ag$a()) {
                valueOf2 = "10.0.3.2";
            } else {
                valueOf2 = ah$a() ? "10.0.2.2" : "localhost";
            }
        }
        return String.format(Locale.US, "%s:%d", valueOf2, Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r2 == 0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0083 A[Catch: all -> 0x0087, TRY_ENTER, TryCatch #6 {, blocks: (B:4:0x0003, B:16:0x003a, B:41:0x006f, B:40:0x006c, B:48:0x007c, B:52:0x0083, B:53:0x0086, B:35:0x0064), top: B:63:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String valueOf() {
        /*
            java.lang.Class<o.addToBackStack> r0 = o.addToBackStack.class
            monitor-enter(r0)
            java.lang.String r1 = o.addToBackStack.valueOf     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L55
            java.lang.String r3 = "/system/bin/getprop"
            java.lang.String r4 = "metro.host"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L55
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L55
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r1 = ""
        L30:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r4 == 0) goto L38
            r1 = r4
            goto L30
        L38:
            o.addToBackStack.valueOf = r1     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r3.close()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L87
            goto L3f
        L3e:
        L3f:
            if (r2 == 0) goto L6f
            goto L6c
        L42:
            r1 = move-exception
            goto L77
        L44:
            r1 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
            goto L57
        L49:
            r3 = move-exception
            goto L7a
        L4b:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r2
            r2 = r7
            goto L57
        L51:
            r2 = move-exception
            r3 = r2
            r2 = r1
            goto L7a
        L55:
            r2 = move-exception
            r3 = r1
        L57:
            java.lang.String r4 = o.addToBackStack.values     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = "Failed to query for metro.host prop:"
            o.FragmentActivity.values(r4, r5, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = ""
            o.addToBackStack.valueOf = r2     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L87
            goto L69
        L68:
        L69:
            if (r1 == 0) goto L6f
            r2 = r1
        L6c:
            r2.destroy()     // Catch: java.lang.Throwable -> L87
        L6f:
            java.lang.String r1 = o.addToBackStack.valueOf     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)
            return r1
        L73:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
        L77:
            r7 = r3
            r3 = r1
            r1 = r7
        L7a:
            if (r1 == 0) goto L81
            r1.close()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> L87
            goto L81
        L80:
        L81:
            if (r2 == 0) goto L86
            r2.destroy()     // Catch: java.lang.Throwable -> L87
        L86:
            throw r3     // Catch: java.lang.Throwable -> L87
        L87:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addToBackStack.valueOf():java.lang.String");
    }
}
