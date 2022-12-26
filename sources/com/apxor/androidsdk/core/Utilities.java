package com.apxor.androidsdk.core;

import android.content.ContentValues;
import com.sendbird.android.constant.StringSet;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import o.moveToLast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class Utilities {
    private static int HaptikSDK$a = 1;
    private static int HaptikSDK$b = 0;
    private static final String a = "Utilities";
    private static int ag$a;
    private static short[] ah$a;
    private static int toString;
    private static int valueOf;
    private static byte[] values;

    static {
        valueOf();
        int i = HaptikSDK$b + 23;
        HaptikSDK$a = i % 128;
        if (!(i % 2 != 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public static ContentValues convertJSONToContentValues(String str, JSONObject jSONObject) {
        ContentValues contentValues = new ContentValues();
        if (jSONObject.length() >= 1) {
            if ((str != null ? 'R' : '8') != '8') {
                try {
                    int i = HaptikSDK$a + 15;
                    HaptikSDK$b = i % 128;
                    int i2 = i % 2;
                    contentValues.put("data", jSONObject.toString());
                    contentValues.put("type", str);
                    int i3 = HaptikSDK$a + 123;
                    HaptikSDK$b = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        return contentValues;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r3 > r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
        if ((r3 <= r5) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        return java.lang.Math.round(((r5 - r3) / 1000.0d) * 100.0d) / 100.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        r5 = com.apxor.androidsdk.core.Utilities.HaptikSDK$b + 29;
        com.apxor.androidsdk.core.Utilities.HaptikSDK$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        return 0.1d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double getElapsedTime(long r3, long r5) {
        /*
            int r0 = com.apxor.androidsdk.core.Utilities.HaptikSDK$a
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.apxor.androidsdk.core.Utilities.HaptikSDK$b = r1
            int r0 = r0 % 2
            r1 = 94
            if (r0 == 0) goto L11
            r0 = 87
            goto L13
        L11:
            r0 = 94
        L13:
            r2 = 0
            if (r0 == r1) goto L20
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r1 = 96
            int r1 = r1 / r2
            if (r0 <= 0) goto L28
            goto L3b
        L1e:
            r3 = move-exception
            throw r3
        L20:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L25
            goto L26
        L25:
            r2 = 1
        L26:
            if (r2 == 0) goto L3b
        L28:
            long r5 = r5 - r3
            double r3 = (double) r5
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r5
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r5
            long r3 = java.lang.Math.round(r3)
            double r3 = (double) r3
            double r3 = r3 / r5
            return r3
        L3b:
            r3 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r5 = com.apxor.androidsdk.core.Utilities.HaptikSDK$b
            int r5 = r5 + 29
            int r6 = r5 % 128
            com.apxor.androidsdk.core.Utilities.HaptikSDK$a = r6
            int r5 = r5 % 2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.Utilities.getElapsedTime(long, long):double");
    }

    public static byte[] getJSONBlob(Object obj) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if ((obj instanceof JSONArray ? (char) 2 : 'K') != 'K') {
                int i = HaptikSDK$b + 99;
                HaptikSDK$a = i % 128;
                if (!(i % 2 != 0)) {
                    int i2 = 78 / 0;
                }
                int i3 = HaptikSDK$b + 37;
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                str = "a";
            } else if (obj instanceof Boolean) {
                try {
                    int i5 = HaptikSDK$b + 27;
                    HaptikSDK$a = i5 % 128;
                    int i6 = i5 % 2;
                    str = "b";
                    int i7 = HaptikSDK$b + 59;
                    HaptikSDK$a = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                str = StringSet.s;
            }
            jSONObject.put("t", str);
            jSONObject.put("v", obj);
        } catch (JSONException unused) {
        }
        return jSONObject.toString().getBytes();
    }

    static void valueOf() {
        valueOf = 71;
        toString = -2112267072;
        ag$a = -287562841;
        values = new byte[]{-64, -10, -27, 2, -23, -17, -17};
    }

    public static void writeJsonToFile(String str, JSONObject jSONObject) {
        int i = HaptikSDK$a + 97;
        HaptikSDK$b = i % 128;
        if (i % 2 != 0) {
            int i2 = 86 / 0;
            if (!(str != null)) {
                return;
            }
        } else {
            if ((str != null ? 'W' : '1') == '1') {
                return;
            }
        }
        int i3 = HaptikSDK$a + 13;
        HaptikSDK$b = i3 % 128;
        int i4 = i3 % 2;
        if (jSONObject != null) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(str)));
                bufferedWriter.write(jSONObject.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
                int i5 = HaptikSDK$b + 77;
                HaptikSDK$a = i5 % 128;
                int i6 = i5 % 2;
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if ((r7 != null) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        r7 = (android.app.ActivityManager) r7.getSystemService(com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r7 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r1 == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        r7 = com.apxor.androidsdk.core.Utilities.HaptikSDK$a + 27;
        com.apxor.androidsdk.core.Utilities.HaptikSDK$b = r7 % 128;
        r7 = r7 % 2;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        r7 = r7.getRunningAppProcesses();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r7 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r7.hasNext() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        r1 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r1.pid != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (r5 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        r3 = com.apxor.androidsdk.core.Utilities.HaptikSDK$a + 63;
        com.apxor.androidsdk.core.Utilities.HaptikSDK$b = r3 % 128;
        r3 = r3 % 2;
        r3 = r1.processName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r7 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r7) {
        /*
            int r0 = com.apxor.androidsdk.core.Utilities.HaptikSDK$a
            int r0 = r0 + 89
            int r1 = r0 % 128
            com.apxor.androidsdk.core.Utilities.HaptikSDK$b = r1
            int r0 = r0 % 2
            r1 = 20
            if (r0 == 0) goto L11
            r0 = 20
            goto L13
        L11:
            r0 = 36
        L13:
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == r1) goto L1f
            int r0 = android.os.Process.myPid()
            if (r7 == 0) goto L75
            goto L2d
        L1f:
            int r0 = android.os.Process.myPid()
            super.hashCode()     // Catch: java.lang.Throwable -> Lab
            if (r7 == 0) goto L2a
            r1 = 1
            goto L2b
        L2a:
            r1 = 0
        L2b:
            if (r1 == 0) goto L75
        L2d:
            java.lang.String r1 = "activity"
            java.lang.Object r7 = r7.getSystemService(r1)
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7
            if (r7 == 0) goto L39
            r1 = 1
            goto L3a
        L39:
            r1 = 0
        L3a:
            if (r1 == r2) goto L48
            int r7 = com.apxor.androidsdk.core.Utilities.HaptikSDK$a
            int r7 = r7 + 27
            int r1 = r7 % 128
            com.apxor.androidsdk.core.Utilities.HaptikSDK$b = r1
            int r7 = r7 % 2
            r7 = r3
            goto L4c
        L48:
            java.util.List r7 = r7.getRunningAppProcesses()
        L4c:
            if (r7 == 0) goto L75
            java.util.Iterator r7 = r7.iterator()
        L52:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r7.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r5 = r1.pid
            if (r5 != r0) goto L64
            r5 = 0
            goto L65
        L64:
            r5 = 1
        L65:
            if (r5 == 0) goto L68
            goto L52
        L68:
            int r3 = com.apxor.androidsdk.core.Utilities.HaptikSDK$a
            int r3 = r3 + 63
            int r5 = r3 % 128
            com.apxor.androidsdk.core.Utilities.HaptikSDK$b = r5
            int r3 = r3 % 2
            java.lang.String r3 = r1.processName
            goto L52
        L75:
            if (r3 == 0) goto L78
            goto Laa
        L78:
            int r7 = android.view.View.MeasureSpec.getMode(r4)
            byte r7 = (byte) r7
            long r0 = android.widget.ExpandableListView.getPackedPositionForGroup(r4)
            r2 = 0
            java.lang.String r5 = ""
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            int r0 = (-72) - r6
            r1 = 2112267172(0x7de6a3a4, float:3.8321514E37)
            int r2 = android.view.View.MeasureSpec.getSize(r4)
            int r1 = r1 - r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r4)
            int r2 = r2 + 18
            short r2 = (short) r2
            r3 = 287562840(0x1123dc58, float:1.2926331E-28)
            r4 = 48
            int r4 = android.text.TextUtils.indexOf(r5, r4)
            int r3 = r3 - r4
            java.lang.String r7 = valueOf(r7, r0, r1, r2, r3)
            java.lang.String r3 = r7.intern()
        Laa:
            return r3
        Lab:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.Utilities.a(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        if ((r5 == null) != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
        if (r5 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
        r5 = com.apxor.androidsdk.core.Utilities.HaptikSDK$b + 73;
        com.apxor.androidsdk.core.Utilities.HaptikSDK$a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if ((r5 % 2) != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        if (r2 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
        r0 = new java.io.File(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (r0.exists() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        r5 = '#';
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
        r5 = ',';
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
        if (r5 == '#') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
        r5 = new java.io.BufferedReader(new java.io.FileReader(r0));
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        r1 = r5.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
        r1 = new org.json.JSONObject(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
        com.apxor.androidsdk.core.utils.Logger.e(com.apxor.androidsdk.core.Utilities.a, "Failed to read from file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject getJsonDataFromFile(java.lang.String r5) {
        /*
            int r0 = com.apxor.androidsdk.core.Utilities.HaptikSDK$a
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.apxor.androidsdk.core.Utilities.HaptikSDK$b = r1
            int r0 = r0 % 2
            r1 = 96
            if (r0 == 0) goto L11
            r0 = 24
            goto L13
        L11:
            r0 = 96
        L13:
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L25
            super.hashCode()     // Catch: java.lang.Throwable -> L23
            if (r5 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == r3) goto L27
            goto L3d
        L23:
            r5 = move-exception
            throw r5
        L25:
            if (r5 != 0) goto L3d
        L27:
            int r5 = com.apxor.androidsdk.core.Utilities.HaptikSDK$b
            int r5 = r5 + 73
            int r0 = r5 % 128
            com.apxor.androidsdk.core.Utilities.HaptikSDK$a = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L34
            r2 = 1
        L34:
            if (r2 == 0) goto L3c
            super.hashCode()     // Catch: java.lang.Throwable -> L3a
            return r4
        L3a:
            r5 = move-exception
            throw r5
        L3c:
            return r4
        L3d:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L7a
            boolean r5 = r0.exists()     // Catch: java.lang.Throwable -> L7a
            r1 = 35
            if (r5 != 0) goto L4d
            r5 = 35
            goto L4f
        L4d:
            r5 = 44
        L4f:
            if (r5 == r1) goto L79
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7a
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
        L60:
            java.lang.String r1 = r5.readLine()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L6a
            r0.append(r1)     // Catch: java.lang.Throwable -> L7a
            goto L60
        L6a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            r5.close()     // Catch: java.lang.Throwable -> L77
            goto L82
        L77:
            r4 = r1
            goto L7a
        L79:
            return r4
        L7a:
            java.lang.String r5 = com.apxor.androidsdk.core.Utilities.a
            java.lang.String r0 = "Failed to read from file"
            com.apxor.androidsdk.core.utils.Logger.e(r5, r0)
            r1 = r4
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.Utilities.getJsonDataFromFile(java.lang.String):org.json.JSONObject");
    }

    private static String valueOf(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + valueOf;
            boolean z = i4 == -1;
            if (z) {
                if (values != null) {
                    i4 = (byte) (values[ag$a + i3] + valueOf);
                } else {
                    i4 = (short) (ah$a[ag$a + i3] + valueOf);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + ag$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + toString);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (values != null) {
                        byte[] bArr = values;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = ah$a;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
