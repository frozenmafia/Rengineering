package com.apxor.androidsdk.core.models;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.EventListener;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.Utilities;
import java.util.Date;
import o.moveToLast;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class f implements EventListener {
    private static int HaptikSDK$a = 0;
    private static int HaptikSDK$c = 1;
    private static int ag$a;
    private static byte[] ah$a;
    private static int toString;
    private static short[] valueOf;
    private static int values;
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f271b;
    private String c;
    private long d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private long i;
    private double l;
    private double m;
    private double j = -1.0d;
    private long k = 1800;
    private double n = 0.0d;

    static {
        valueOf();
        int i = HaptikSDK$a + 21;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
    }

    private void f() {
        int i = HaptikSDK$a + 21;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        h();
        this.j = SDKController.getInstance().getCurrentTime();
        try {
            int i3 = HaptikSDK$c + 75;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private void g() {
        if ((this.j != -1.0d ? ']' : '3') == ']') {
            int i = HaptikSDK$a + 39;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            SDKController sDKController = SDKController.getInstance();
            double round = Math.round((sDKController.getCurrentTime() - this.j) * 100.0d) / 100.0d;
            this.n += round;
            if (!(Math.round(round) <= this.k)) {
                int i3 = HaptikSDK$c + 59;
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                sDKController.endSession(sDKController.getContext());
                sDKController.startSession(sDKController.getContext(), null, true);
                return;
            }
        }
        try {
            this.e = false;
            StringBuilder sb = new StringBuilder();
            try {
                sb.append(SDKController.getInstance().getFilesDirPath());
                sb.append(this.a);
                sb.append("_session");
                Utilities.writeJsonToFile(sb.toString(), a());
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static void valueOf() {
        toString = 106;
        ag$a = -1148355454;
        values = 1066418026;
        ah$a = new byte[]{-116, 0};
    }

    public long b() {
        long j;
        try {
            int i = HaptikSDK$c + 21;
            HaptikSDK$a = i % 128;
            if ((i % 2 != 0 ? 'X' : '[') != 'X') {
                j = this.i;
            } else {
                j = this.i;
                Object obj = null;
                super.hashCode();
            }
            int i2 = HaptikSDK$c + 1;
            HaptikSDK$a = i2 % 128;
            if ((i2 % 2 != 0 ? (char) 24 : 'b') != 'b') {
                int i3 = 34 / 0;
                return j;
            }
            return j;
        } catch (Exception e) {
            throw e;
        }
    }

    public String c() {
        int i = HaptikSDK$a + 53;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        try {
            String str = this.a;
            int i3 = HaptikSDK$a + 75;
            HaptikSDK$c = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 7 : (char) 2) != 7) {
                int i4 = 38 / 0;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean d() {
        try {
            int i = HaptikSDK$a + 51;
            try {
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                boolean z = this.g;
                int i3 = HaptikSDK$a + 43;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void e() {
        int i = HaptikSDK$a + 17;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        this.e = false;
        int i3 = HaptikSDK$c + 71;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
    }

    public void h() {
        try {
            SDKController sDKController = SDKController.getInstance();
            this.m = Utilities.getElapsedTime(SDKController.getInstance().getSdkUpTimeMillis(), SystemClock.elapsedRealtime());
            this.l = Math.round((sDKController.getCurrentTime() - this.n) * 100.0d) / 100.0d;
            Utilities.writeJsonToFile(sDKController.getFilesDirPath() + this.a + "_session", a());
            int i = HaptikSDK$c + 53;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.apxor.androidsdk.core.EventListener
    public void onEvent(BaseApxorEvent baseApxorEvent) {
        if ((baseApxorEvent.getEventType().equals(Constants.SYSTEM_EVENTS) ? (char) 27 : '7') != '7') {
            int i = HaptikSDK$c + 49;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            String eventName = baseApxorEvent.getEventName();
            eventName.hashCode();
            if (!eventName.equals(Constants.FOREGROUND)) {
                if (eventName.equals(Constants.BACKGROUND)) {
                    f();
                    return;
                }
                int i3 = HaptikSDK$c + 95;
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            g();
        }
    }

    public void b(JSONObject jSONObject) {
        int i = HaptikSDK$c + 91;
        HaptikSDK$a = i % 128;
        if ((i % 2 != 0 ? 'Z' : (char) 0) != 0) {
            this.k = jSONObject.optLong(Constants.MAX_INACTIVE_SESSION_TIME, 1800L);
            Object obj = null;
            super.hashCode();
        } else {
            this.k = jSONObject.optLong(Constants.MAX_INACTIVE_SESSION_TIME, 1800L);
        }
        try {
            int i2 = HaptikSDK$c + 37;
            try {
                HaptikSDK$a = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r12 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        r8.d = r0.getIncrementalNumberFor(com.apxor.androidsdk.core.Constants.SESSION_ID);
        r9 = r8.d + r9 + java.lang.System.currentTimeMillis();
        r8.a = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        r9 = "|||-def@ult-met@-$e$$!on-!d-|||";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
        r12 = com.apxor.androidsdk.core.models.f.HaptikSDK$a + 57;
        com.apxor.androidsdk.core.models.f.HaptikSDK$c = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r12 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r8 = this;
            int r0 = com.apxor.androidsdk.core.models.f.HaptikSDK$a
            int r0 = r0 + 47
            int r1 = r0 % 128
            com.apxor.androidsdk.core.models.f.HaptikSDK$c = r1
            int r0 = r0 % 2
            r1 = 54
            if (r0 != 0) goto L11
            r0 = 54
            goto L13
        L11:
            r0 = 33
        L13:
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r4 = 0
            if (r0 == r1) goto L28
            com.apxor.androidsdk.core.SDKController r0 = com.apxor.androidsdk.core.SDKController.getInstance()
            r8.l = r4
            r8.m = r4
            r8.n = r4
            r8.j = r2
            if (r12 == 0) goto L5b
            goto L38
        L28:
            com.apxor.androidsdk.core.SDKController r0 = com.apxor.androidsdk.core.SDKController.getInstance()
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r8.l = r6
            r8.m = r4
            r8.n = r4
            r8.j = r2
            if (r12 == 0) goto L5b
        L38:
            java.lang.String r12 = "session_id"
            long r1 = r0.getIncrementalNumberFor(r12)
            r8.d = r1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            long r1 = r8.d
            r12.append(r1)
            r12.append(r9)
            long r1 = java.lang.System.currentTimeMillis()
            r12.append(r1)
            java.lang.String r9 = r12.toString()
            r8.a = r9
            goto L67
        L5b:
            java.lang.String r9 = "|||-def@ult-met@-$e$$!on-!d-|||"
            int r12 = com.apxor.androidsdk.core.models.f.HaptikSDK$a
            int r12 = r12 + 57
            int r1 = r12 % 128
            com.apxor.androidsdk.core.models.f.HaptikSDK$c = r1
            int r12 = r12 % 2
        L67:
            r8.a = r9
            r8.c = r11
            long r11 = java.lang.System.currentTimeMillis()
            r8.i = r11
            r8.h = r11
            r8.f271b = r10
            r9 = 1
            r8.e = r9
            r10 = 0
            r8.f = r10
            com.apxor.androidsdk.core.d.c r10 = r0.getSharedPreferencesWrapper()
            java.lang.String r11 = "is_first_session"
            boolean r9 = r10.a(r11, r9)
            r8.g = r9
            return
        L88:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.models.f.a(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public void a(JSONObject jSONObject) {
        int i = HaptikSDK$c + 87;
        HaptikSDK$a = i % 128;
        if (i % 2 != 0) {
            b(jSONObject);
            SDKController.getInstance().registerToEvent(Constants.SYSTEM_EVENTS, this);
            int i2 = 17 / 0;
            return;
        }
        b(jSONObject);
        SDKController.getInstance().registerToEvent(Constants.SYSTEM_EVENTS, this);
    }

    public void a(boolean z) {
        int i = HaptikSDK$a + 53;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        this.f = z;
        int i3 = HaptikSDK$c + 55;
        HaptikSDK$a = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return;
        }
        Object obj = null;
        super.hashCode();
    }

    public void a(long j, long j2) {
        int i = HaptikSDK$a + 33;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? 'T' : '9') == 'T' ? j <= 0 : j <= 0) {
            j = new Date().getTime();
        }
        try {
            long abs = Math.abs(j - j2);
            this.h = abs;
            com.apxor.androidsdk.core.d.c sharedPreferencesWrapper = SDKController.getInstance().getSharedPreferencesWrapper();
            if ((this.g ? '/' : '2') != '2') {
                int i2 = HaptikSDK$c + 71;
                HaptikSDK$a = i2 % 128;
                if (i2 % 2 != 0) {
                    sharedPreferencesWrapper.b(Constants.SDK_FIRST_RUN_TIME_DEVICE);
                    sharedPreferencesWrapper.b(Constants.SDK_FIRST_RUN_TIME_WEB);
                    sharedPreferencesWrapper.b(Constants.SDK_FIRST_RUN_TIME_DEVICE, this.i);
                    sharedPreferencesWrapper.b(Constants.SDK_FIRST_RUN_TIME_WEB, abs);
                    Object[] objArr = null;
                    int length = objArr.length;
                    return;
                }
                sharedPreferencesWrapper.b(Constants.SDK_FIRST_RUN_TIME_DEVICE);
                sharedPreferencesWrapper.b(Constants.SDK_FIRST_RUN_TIME_WEB);
                sharedPreferencesWrapper.b(Constants.SDK_FIRST_RUN_TIME_DEVICE, this.i);
                sharedPreferencesWrapper.b(Constants.SDK_FIRST_RUN_TIME_WEB, abs);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ah$a((byte) (TextUtils.indexOf("", "", 0) + 17), (-104) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1148355559 - Drawable.resolveOpacity(0, 0), (short) (94 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.getTrimmedLength("") - 1066418026).intern(), this.a);
            jSONObject.put(Constants.LAUNCH_START_TIME_STRING, SDKController.getInstance().getDateTimeUtils().getTimeStampFromMilliSeconds(this.i));
            jSONObject.put(Constants.LAUNCH_TIME, this.i);
            jSONObject.put(Constants.STARTUP_TIME, 0);
            jSONObject.put(Constants.IS_FIRST_SESSION, this.g);
            jSONObject.put(Constants.IS_BACKGROUND, this.e);
            jSONObject.put("duration", this.l);
            jSONObject.put("total_duration", this.m);
            jSONObject.put(Constants.LAUNCH_TYPE, this.f271b);
            jSONObject.put(Constants.PROCESS_NAME, this.c);
            jSONObject.put(Constants.IS_FATAL, this.f);
            jSONObject.put(Constants.CHUNK_NUMBER, this.d);
            long j = this.h;
            if (!(j == 0)) {
                int i = HaptikSDK$a + 41;
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                jSONObject.put(Constants.LAUNCH_TIME_WEB, j);
            }
        } catch (JSONException e) {
            SDKController.getInstance().logException("si_g_jd", e);
        }
        int i3 = HaptikSDK$c + 3;
        HaptikSDK$a = i3 % 128;
        if ((i3 % 2 != 0 ? 'W' : (char) 21) != 21) {
            int i4 = 14 / 0;
            return jSONObject;
        }
        return jSONObject;
    }

    private static String ah$a(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + toString;
            boolean z = i4 == -1;
            if (z) {
                if (ah$a != null) {
                    i4 = (byte) (ah$a[values + i3] + toString);
                } else {
                    i4 = (short) (valueOf[values + i3] + toString);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + values + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + ag$a);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (ah$a != null) {
                        byte[] bArr = ah$a;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = valueOf;
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
