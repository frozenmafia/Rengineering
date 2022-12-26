package com.apxor.androidsdk.core.models;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.apxor.androidsdk.core.SDKController;
import com.dreampay.commons.constants.Constants;
import o.move;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public class c {
    private static char[] ag$a = null;
    private static int ah$a = 1;
    private static long toString;
    private static int valueOf;
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f270b;
    private String c;
    private String d = null;
    private int e;
    private int f;
    private String g;
    private String h;
    private int i;
    private int j;

    static {
        valueOf();
        int i = valueOf + 13;
        ah$a = i % 128;
        if (i % 2 == 0) {
            Object obj = null;
            super.hashCode();
        }
    }

    static void valueOf() {
        toString = 4713682991569227444L;
        ag$a = new char[]{19474, 33451};
    }

    public void a(Context context) {
        try {
            this.a = b(context);
            StringBuilder sb = new StringBuilder();
            sb.append(Build.BRAND);
            sb.append(Constants.WHITE_SPACE);
            sb.append(Build.MODEL);
            this.f270b = sb.toString();
            this.c = Build.VERSION.RELEASE;
            this.g = "android";
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            a(displayMetrics);
            this.h = b(displayMetrics);
            this.d = SDKController.getInstance().getSharedPreferencesWrapper().a(com.apxor.androidsdk.core.Constants.DEVICE_TOKEN, "");
            int i = valueOf + 83;
            ah$a = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        if ((r3 ? 2 : 6) != 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
        if (r3.isEmpty() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        r12.d = com.apxor.androidsdk.core.SDKController.getInstance().getSharedPreferencesWrapper().a(com.apxor.androidsdk.core.Constants.DEVICE_TOKEN, "");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject b() {
        /*
            r12 = this;
            java.lang.String r0 = "height"
            java.lang.String r1 = "width"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            int r3 = android.view.KeyEvent.getMaxKeyCode()     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            int r3 = r3 >> 16
            r4 = 2
            int r3 = r3 + r4
            long r5 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r7 = 0
            r9 = 1
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r5 = 1 - r10
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            int r6 = 19580 - r6
            char r6 = (char) r6     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r3 = ah$a(r3, r5, r6)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r3 = r3.intern()     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r5 = r12.a     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r2.put(r3, r5)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r3 = "hardware_model"
            java.lang.String r5 = r12.f270b     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r2.put(r3, r5)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r3 = "os_version"
            java.lang.String r5 = r12.c     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r2.put(r3, r5)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r3.<init>()     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            int r5 = r12.e     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r3.put(r1, r5)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            int r5 = r12.f     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r3.put(r0, r5)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r5 = "dimensions"
            r2.put(r5, r3)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r3 = r12.d     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r5 = "device_registration_token"
            java.lang.String r6 = ""
            if (r3 == 0) goto L91
            int r7 = com.apxor.androidsdk.core.models.c.valueOf
            int r7 = r7 + 43
            int r8 = r7 % 128
            com.apxor.androidsdk.core.models.c.ah$a = r8
            int r7 = r7 % r4
            if (r7 != 0) goto L68
            goto L69
        L68:
            r9 = 0
        L69:
            if (r9 == 0) goto L7d
            boolean r3 = r3.isEmpty()     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r7 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L7b java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            if (r3 == 0) goto L77
            r3 = 2
            goto L78
        L77:
            r3 = 6
        L78:
            if (r3 == r4) goto L83
            goto L91
        L7b:
            r0 = move-exception
            throw r0
        L7d:
            boolean r3 = r3.isEmpty()     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            if (r3 == 0) goto L91
        L83:
            com.apxor.androidsdk.core.SDKController r3 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            com.apxor.androidsdk.core.d.c r3 = r3.getSharedPreferencesWrapper()     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r3 = r3.a(r5, r6)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r12.d = r3     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
        L91:
            java.lang.String r3 = r12.d     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            if (r3 == 0) goto La2
            int r6 = com.apxor.androidsdk.core.models.c.ah$a     // Catch: java.lang.Exception -> La0
            int r6 = r6 + 83
            int r7 = r6 % 128
            com.apxor.androidsdk.core.models.c.valueOf = r7     // Catch: java.lang.Exception -> La0
            int r6 = r6 % r4
            r6 = r3
            goto La2
        La0:
            r0 = move-exception
            throw r0
        La2:
            r2.put(r5, r6)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r3 = "platform"
            java.lang.String r4 = r12.g     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r2.put(r3, r4)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r3.<init>()     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            int r4 = r12.i     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r3.put(r1, r4)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            int r1 = r12.j     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r3.put(r0, r1)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r0 = "dimensions_in_pixels"
            r2.put(r0, r3)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            java.lang.String r0 = "dpi"
            java.lang.String r1 = r12.h     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            r2.put(r0, r1)     // Catch: java.lang.NumberFormatException -> Lcc org.json.JSONException -> Lce
            goto Ld8
        Lcc:
            r0 = move-exception
            goto Lcf
        Lce:
            r0 = move-exception
        Lcf:
            com.apxor.androidsdk.core.SDKController r1 = com.apxor.androidsdk.core.SDKController.getInstance()
            java.lang.String r3 = "di_g_jd"
            r1.logException(r3, r0)
        Ld8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.models.c.b():org.json.JSONObject");
    }

    public String a() {
        String str;
        int i = valueOf + 95;
        ah$a = i % 128;
        Object[] objArr = null;
        if (!(i % 2 != 0)) {
            try {
                str = this.a;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.a;
        }
        try {
            int i2 = ah$a + 45;
            valueOf = i2 % 128;
            if ((i2 % 2 != 0 ? '4' : 'B') != 'B') {
                super.hashCode();
                return str;
            }
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void a(String str) {
        int i = valueOf + 95;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            this.d = str;
            SDKController.getInstance().getSharedPreferencesWrapper().b(com.apxor.androidsdk.core.Constants.DEVICE_TOKEN, str);
            int i3 = valueOf + 107;
            ah$a = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private void a(DisplayMetrics displayMetrics) {
        int i = ah$a + 65;
        valueOf = i % 128;
        int i2 = i % 2;
        int i3 = displayMetrics.widthPixels;
        this.i = i3;
        int i4 = displayMetrics.heightPixels;
        this.j = i4;
        float f = displayMetrics.scaledDensity;
        this.e = (int) (i3 / f);
        this.f = (int) (i4 / f);
        int i5 = valueOf + 31;
        ah$a = i5 % 128;
        if ((i5 % 2 == 0 ? (char) 15 : TokenParser.SP) != ' ') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if ((r4 == null ? 24 : 19) != 24) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if ((r4 == null) != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r3.a = "UNKNOWN";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r4 = com.apxor.androidsdk.core.models.c.ah$a + 29;
        com.apxor.androidsdk.core.models.c.valueOf = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        return r3.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(android.content.Context r4) {
        /*
            r3 = this;
            int r0 = com.apxor.androidsdk.core.models.c.valueOf
            int r0 = r0 + 31
            int r1 = r0 % 128
            com.apxor.androidsdk.core.models.c.ah$a = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "android_id"
            if (r0 != 0) goto L2c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Exception -> L2a
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r2)     // Catch: java.lang.Exception -> L2a
            r3.a = r4     // Catch: java.lang.Exception -> L2a
            r0 = 49
            int r0 = r0 / r1
            r0 = 24
            if (r4 != 0) goto L23
            r4 = 24
            goto L25
        L23:
            r4 = 19
        L25:
            if (r4 == r0) goto L3d
            goto L4b
        L28:
            r4 = move-exception
            throw r4
        L2a:
            r4 = move-exception
            goto L4e
        L2c:
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r2)
            r3.a = r4
            r0 = 1
            if (r4 != 0) goto L3a
            r1 = 1
        L3a:
            if (r1 == r0) goto L3d
            goto L4b
        L3d:
            java.lang.String r4 = "UNKNOWN"
            r3.a = r4
            int r4 = com.apxor.androidsdk.core.models.c.ah$a     // Catch: java.lang.Exception -> L2a
            int r4 = r4 + 29
            int r0 = r4 % 128
            com.apxor.androidsdk.core.models.c.valueOf = r0
            int r4 = r4 % 2
        L4b:
            java.lang.String r4 = r3.a
            return r4
        L4e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.models.c.b(android.content.Context):java.lang.String");
    }

    private String b(DisplayMetrics displayMetrics) {
        String num;
        int i = ah$a + 97;
        valueOf = i % 128;
        if ((i % 2 != 0 ? '\"' : (char) 20) != 20) {
            num = Integer.toString(displayMetrics.densityDpi);
            int i2 = 17 / 0;
        } else {
            num = Integer.toString(displayMetrics.densityDpi);
        }
        int i3 = valueOf + 45;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return num;
    }

    private static String ah$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((ag$a[move.values + i2] ^ (move.values * toString)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
