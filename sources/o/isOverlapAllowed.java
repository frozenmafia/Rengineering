package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessTokenSource;
import com.facebook.LoggingBehavior;
import com.sendbird.android.constant.StringSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import o.throwException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class isOverlapAllowed {
    public static final valueOf valueOf = new valueOf(null);
    private static final String values;
    private final String ag$a;
    private final SharedPreferences ah$a;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((r4.length() == 0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public isOverlapAllowed(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            o.runAnimators.ag$a(r3, r0)
            r2.<init>()
            r0 = 0
            if (r4 == 0) goto L19
            r1 = r4
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1b
        L19:
            java.lang.String r4 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"
        L1b:
            r2.ag$a = r4
            android.content.Context r1 = r3.getApplicationContext()
            if (r1 != 0) goto L24
            goto L25
        L24:
            r3 = r1
        L25:
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)
            java.lang.String r4 = "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)"
            o.runAnimators.ah$a(r3, r4)
            r2.ah$a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isOverlapAllowed.<init>(android.content.Context, java.lang.String):void");
    }

    public /* synthetic */ isOverlapAllowed(Context context, String str, int i, getTargetTypes gettargettypes) {
        this(context, (i & 2) != 0 ? null : str);
    }

    public final Bundle ah$a() {
        Bundle bundle = new Bundle();
        for (String str : this.ah$a.getAll().keySet()) {
            try {
                runAnimators.ah$a(str, StringSet.key);
                toString(str, bundle);
            } catch (JSONException e) {
                throwException.valueOf valueof = throwException.ag$a;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str2 = values;
                valueof.ah$a(loggingBehavior, 5, str2, "Error reading cached value for key: '" + ((Object) str) + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public final void values() {
        this.ah$a.edit().clear().apply();
    }

    private final void toString(String str, Bundle bundle) throws JSONException {
        String str2;
        String string;
        String string2 = this.ah$a.getString(str, "{}");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString("valueType");
        if (string3 != null) {
            int i = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals("stringList")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        if (length > 0) {
                            while (true) {
                                int i2 = i + 1;
                                Object obj = jSONArray.get(i);
                                if (obj == JSONObject.NULL) {
                                    str2 = null;
                                } else {
                                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                                    str2 = (String) obj;
                                }
                                arrayList.add(i, str2);
                                if (i2 < length) {
                                    i = i2;
                                }
                            }
                        }
                        bundle.putStringArrayList(str, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals("bool[]")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        int i3 = length2 - 1;
                        if (i3 >= 0) {
                            while (true) {
                                int i4 = i + 1;
                                zArr[i] = jSONArray2.getBoolean(i);
                                if (i4 <= i3) {
                                    i = i4;
                                }
                            }
                        }
                        bundle.putBooleanArray(str, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals("byte[]")) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        int i5 = length3 - 1;
                        if (i5 >= 0) {
                            while (true) {
                                int i6 = i + 1;
                                bArr[i] = (byte) jSONArray3.getInt(i);
                                if (i6 <= i5) {
                                    i = i6;
                                }
                            }
                        }
                        bundle.putByteArray(str, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals("char[]")) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        int i7 = length4 - 1;
                        if (i7 >= 0) {
                            int i8 = 0;
                            while (true) {
                                int i9 = i8 + 1;
                                String string4 = jSONArray4.getString(i8);
                                if (string4 != null && string4.length() == 1) {
                                    cArr[i8] = string4.charAt(0);
                                }
                                if (i9 <= i7) {
                                    i8 = i9;
                                }
                            }
                        }
                        bundle.putCharArray(str, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals("double")) {
                        bundle.putDouble(str, jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals("long[]")) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        int i10 = length5 - 1;
                        if (i10 >= 0) {
                            while (true) {
                                int i11 = i + 1;
                                jArr[i] = jSONArray5.getLong(i);
                                if (i11 <= i10) {
                                    i = i11;
                                }
                            }
                        }
                        bundle.putLongArray(str, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals("string")) {
                        bundle.putString(str, jSONObject.getString("value"));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals("float[]")) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        int i12 = length6 - 1;
                        if (i12 >= 0) {
                            while (true) {
                                int i13 = i + 1;
                                fArr[i] = (float) jSONArray6.getDouble(i);
                                if (i13 <= i12) {
                                    i = i13;
                                }
                            }
                        }
                        bundle.putFloatArray(str, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals("int")) {
                        bundle.putInt(str, jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals("bool")) {
                        bundle.putBoolean(str, jSONObject.getBoolean("value"));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals("byte")) {
                        bundle.putByte(str, (byte) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals("char") && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                        bundle.putChar(str, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals("enum")) {
                        try {
                            bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
                            return;
                        } catch (ClassNotFoundException | IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals("long")) {
                        bundle.putLong(str, jSONObject.getLong("value"));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals("float")) {
                        bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals("int[]")) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        int i14 = length7 - 1;
                        if (i14 >= 0) {
                            while (true) {
                                int i15 = i + 1;
                                iArr[i] = jSONArray7.getInt(i);
                                if (i15 <= i14) {
                                    i = i15;
                                }
                            }
                        }
                        bundle.putIntArray(str, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals("short")) {
                        bundle.putShort(str, (short) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals("double[]")) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        int i16 = length8 - 1;
                        if (i16 >= 0) {
                            while (true) {
                                int i17 = i + 1;
                                dArr[i] = jSONArray8.getDouble(i);
                                if (i17 <= i16) {
                                    i = i17;
                                }
                            }
                        }
                        bundle.putDoubleArray(str, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals("short[]")) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        int i18 = length9 - 1;
                        if (i18 >= 0) {
                            while (true) {
                                int i19 = i + 1;
                                sArr[i] = (short) jSONArray9.getInt(i);
                                if (i19 <= i18) {
                                    i = i19;
                                }
                            }
                        }
                        bundle.putShortArray(str, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }

        public final boolean HaptikSDK$a(Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null) {
                return false;
            }
            return ((string.length() == 0) || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
        }

        public final String ah$a(Bundle bundle) {
            runAnimators.ag$a(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        public final Date toString(Bundle bundle) {
            runAnimators.ag$a(bundle, "bundle");
            return valueOf(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        public final AccessTokenSource valueOf(Bundle bundle) {
            runAnimators.ag$a(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (AccessTokenSource) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
        }

        public final Date values(Bundle bundle) {
            runAnimators.ag$a(bundle, "bundle");
            return valueOf(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        public final String ag$a(Bundle bundle) {
            runAnimators.ag$a(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        private final Date valueOf(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }
    }

    static {
        runAnimators.ah$a("LegacyTokenHelper", "LegacyTokenHelper::class.java.simpleName");
        values = "LegacyTokenHelper";
    }
}
