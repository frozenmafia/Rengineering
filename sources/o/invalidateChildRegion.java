package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Base64;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes5.dex */
public class invalidateChildRegion implements SharedPreferences {
    private static int HaptikSDK$b = 1;
    private static int HaptikSDK$c = 0;
    private static char ah$a = 6003;
    private static char invoke = 50299;
    private static char valueOf = 46467;
    private static char values = 18007;
    private SharedPreferences ag$a;
    private Context toString;

    static /* synthetic */ SharedPreferences ag$a(invalidateChildRegion invalidatechildregion) {
        int i = HaptikSDK$c + 13;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        try {
            SharedPreferences sharedPreferences = invalidatechildregion.ag$a;
            int i3 = HaptikSDK$b + 45;
            HaptikSDK$c = i3 % 128;
            if (i3 % 2 == 0) {
                return sharedPreferences;
            }
            int i4 = 50 / 0;
            return sharedPreferences;
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ String ag$a(invalidateChildRegion invalidatechildregion, String str) {
        int i = HaptikSDK$c + 11;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        String values2 = invalidatechildregion.values(str);
        int i3 = HaptikSDK$b + 9;
        HaptikSDK$c = i3 % 128;
        if ((i3 % 2 != 0 ? 'F' : 'c') != 'F') {
            return values2;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return values2;
    }

    @Override // android.content.SharedPreferences
    public /* synthetic */ SharedPreferences.Editor edit() {
        int i = HaptikSDK$b + 65;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        values ag$a = ag$a();
        int i3 = HaptikSDK$c + 123;
        HaptikSDK$b = i3 % 128;
        if (i3 % 2 != 0) {
            return ag$a;
        }
        Object obj = null;
        super.hashCode();
        return ag$a;
    }

    public invalidateChildRegion(Context context, String str) {
        if (context != null) {
            try {
                this.toString = context;
                try {
                    this.ag$a = context.getSharedPreferences(str, 0);
                    int i = HaptikSDK$b + 23;
                    HaptikSDK$c = i % 128;
                    int i2 = i % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i3 = HaptikSDK$c + 55;
        HaptikSDK$b = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }

    public values ag$a() {
        values valuesVar = new values();
        int i = HaptikSDK$b + 17;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        return valuesVar;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r3 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (r6.equalsIgnoreCase("null") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        r6 = toString(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        r7 = java.lang.Boolean.parseBoolean(r6);
     */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean getBoolean(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            android.content.SharedPreferences r0 = r5.ag$a     // Catch: java.lang.Exception -> L4e
            r1 = 0
            java.lang.String r6 = r0.getString(r6, r1)     // Catch: java.lang.Exception -> L4e
            r0 = 0
            r2 = 1
            if (r6 == 0) goto Ld
            r3 = 0
            goto Le
        Ld:
            r3 = 1
        Le:
            if (r3 == 0) goto L11
            goto L39
        L11:
            int r3 = o.invalidateChildRegion.HaptikSDK$b
            int r3 = r3 + 43
            int r4 = r3 % 128
            o.invalidateChildRegion.HaptikSDK$c = r4
            int r3 = r3 % 2
            java.lang.String r4 = "null"
            if (r3 == 0) goto L29
            boolean r3 = r6.equalsIgnoreCase(r4)
            int r4 = r1.length     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L39
            goto L2f
        L27:
            r6 = move-exception
            throw r6
        L29:
            boolean r3 = r6.equalsIgnoreCase(r4)
            if (r3 != 0) goto L39
        L2f:
            java.lang.String r6 = r5.toString(r6)
            if (r6 == 0) goto L39
            boolean r7 = java.lang.Boolean.parseBoolean(r6)
        L39:
            int r6 = o.invalidateChildRegion.HaptikSDK$c
            int r6 = r6 + 17
            int r3 = r6 % 128
            o.invalidateChildRegion.HaptikSDK$b = r3
            int r6 = r6 % 2
            if (r6 != 0) goto L46
            goto L47
        L46:
            r0 = 1
        L47:
            if (r0 == r2) goto L4d
            int r6 = r1.length     // Catch: java.lang.Throwable -> L4b
            return r7
        L4b:
            r6 = move-exception
            throw r6
        L4d:
            return r7
        L4e:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.invalidateChildRegion.getBoolean(java.lang.String, boolean):boolean");
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        String string;
        try {
            int i = HaptikSDK$b + 23;
            HaptikSDK$c = i % 128;
            Object[] objArr = null;
            if (i % 2 != 0) {
                try {
                    string = this.ag$a.getString(str, null);
                    super.hashCode();
                    if (!(string != null)) {
                        return f;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                string = this.ag$a.getString(str, null);
                if (string == null) {
                    return f;
                }
            }
            int i2 = HaptikSDK$b + 1;
            HaptikSDK$c = i2 % 128;
            if (i2 % 2 != 0) {
                boolean equalsIgnoreCase = string.equalsIgnoreCase("null");
                int length = objArr.length;
                if (equalsIgnoreCase) {
                    return f;
                }
            } else if (string.equalsIgnoreCase("null")) {
                return f;
            }
            String invalidatechildregion = toString(string);
            if (invalidatechildregion != null) {
                float parseFloat = Float.parseFloat(invalidatechildregion);
                int i3 = HaptikSDK$b + 69;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
                return parseFloat;
            }
            return f;
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        String string;
        int i2 = HaptikSDK$b + 97;
        HaptikSDK$c = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            string = this.ag$a.getString(str, null);
            int i3 = 83 / 0;
            if (string == null) {
                return i;
            }
        } else {
            try {
                string = this.ag$a.getString(str, null);
                if (string == null) {
                    return i;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        int i4 = HaptikSDK$b + 9;
        HaptikSDK$c = i4 % 128;
        if (i4 % 2 != 0) {
            boolean equalsIgnoreCase = string.equalsIgnoreCase("null");
            super.hashCode();
            if (equalsIgnoreCase) {
                return i;
            }
        } else {
            if (!(!string.equalsIgnoreCase("null"))) {
                return i;
            }
        }
        int i5 = HaptikSDK$b + 55;
        HaptikSDK$c = i5 % 128;
        int i6 = i5 % 2;
        String invalidatechildregion = toString(string);
        if (i6 != 0) {
            int i7 = 59 / 0;
            if (invalidatechildregion == null) {
                return i;
            }
        } else {
            if ((invalidatechildregion != null ? '3' : '\f') != '3') {
                return i;
            }
        }
        return Integer.parseInt(invalidatechildregion);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        String invalidatechildregion;
        Object obj = null;
        String string = this.ag$a.getString(str, null);
        if (string != null) {
            int i = HaptikSDK$c + 51;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            if (string.equalsIgnoreCase("null")) {
                return j;
            }
            try {
                int i3 = HaptikSDK$c + 55;
                HaptikSDK$b = i3 % 128;
                if ((i3 % 2 == 0 ? (char) 6 : (char) 30) != 30) {
                    invalidatechildregion = toString(string);
                    super.hashCode();
                    if (invalidatechildregion == null) {
                        return j;
                    }
                } else {
                    invalidatechildregion = toString(string);
                    if ((invalidatechildregion != null ? (char) 26 : 'N') == 'N') {
                        return j;
                    }
                }
                long parseLong = Long.parseLong(invalidatechildregion);
                int i4 = HaptikSDK$b + 27;
                HaptikSDK$c = i4 % 128;
                int i5 = i4 % 2;
                return parseLong;
            } catch (Exception e) {
                throw e;
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.ag$a;
        if ((sharedPreferences == null ? '&' : '>') != '&') {
            String string = sharedPreferences.getString(str, null);
            if ((string != null ? '\t' : '(') != '\t') {
                return str2;
            }
            int i = HaptikSDK$b + 83;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            if (string.equalsIgnoreCase("null")) {
                return str2;
            }
            int i3 = HaptikSDK$c + 79;
            HaptikSDK$b = i3 % 128;
            int i4 = i3 % 2;
            String invalidatechildregion = toString(string);
            int i5 = HaptikSDK$c + 115;
            HaptikSDK$b = i5 % 128;
            int i6 = i5 % 2;
            return invalidatechildregion;
        }
        return null;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        int i = HaptikSDK$c + 43;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        boolean contains = this.ag$a.contains(str);
        try {
            int i3 = HaptikSDK$b + 121;
            try {
                HaptikSDK$c = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    return contains;
                }
                int i4 = 34 / 0;
                return contains;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = HaptikSDK$b + 55;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        this.ag$a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        try {
            int i3 = HaptikSDK$c + 33;
            HaptikSDK$b = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return;
            }
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = HaptikSDK$b + 89;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        this.ag$a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        int i3 = HaptikSDK$c + 119;
        HaptikSDK$b = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        int i4 = 69 / 0;
    }

    private String values(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(valueOf(), toString(new char[]{30524, 26765, 4426, 11136}, (Process.myPid() >> 22) + 3).intern());
            Cipher cipher = Cipher.getInstance(toString(new char[]{30524, 26765, 4426, 11136}, 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
            cipher.init(1, secretKeySpec);
            String encodeToString = Base64.encodeToString(cipher.doFinal(str.getBytes()), 8);
            int i = HaptikSDK$b + 41;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            return encodeToString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String toString(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(valueOf(), toString(new char[]{30524, 26765, 4426, 11136}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3).intern());
            Cipher cipher = Cipher.getInstance(toString(new char[]{30524, 26765, 4426, 11136}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2).intern());
            cipher.init(2, secretKeySpec);
            String str2 = new String(cipher.doFinal(Base64.decode(str, 8)));
            int i = HaptikSDK$b + 85;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
        if ((r0 != null) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
        r4 = r0.getStringSet(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
        r5 = o.invalidateChildRegion.HaptikSDK$b + 39;
        o.invalidateChildRegion.HaptikSDK$c = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
        return null;
     */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set<java.lang.String> getStringSet(java.lang.String r4, java.util.Set<java.lang.String> r5) {
        /*
            r3 = this;
            int r0 = o.invalidateChildRegion.HaptikSDK$b     // Catch: java.lang.Exception -> L3b
            int r0 = r0 + 123
            int r1 = r0 % 128
            o.invalidateChildRegion.HaptikSDK$c = r1     // Catch: java.lang.Exception -> L3b
            int r0 = r0 % 2
            r1 = 48
            if (r0 == 0) goto L11
            r0 = 55
            goto L13
        L11:
            r0 = 48
        L13:
            r2 = 0
            if (r0 == r1) goto L20
            android.content.SharedPreferences r0 = r3.ag$a
            super.hashCode()     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L29
            goto L3a
        L1e:
            r4 = move-exception
            throw r4
        L20:
            android.content.SharedPreferences r0 = r3.ag$a
            if (r0 != 0) goto L26
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            if (r1 == 0) goto L3a
        L29:
            java.util.Set r4 = r0.getStringSet(r4, r5)     // Catch: java.lang.Exception -> L38
            int r5 = o.invalidateChildRegion.HaptikSDK$b
            int r5 = r5 + 39
            int r0 = r5 % 128
            o.invalidateChildRegion.HaptikSDK$c = r0
            int r5 = r5 % 2
            return r4
        L38:
            r4 = move-exception
            throw r4
        L3a:
            return r2
        L3b:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.invalidateChildRegion.getStringSet(java.lang.String, java.util.Set):java.util.Set");
    }

    private byte[] valueOf() {
        String string = Settings.Secure.getString(this.toString.getContentResolver(), "android_id");
        int length = string.length();
        if (!(length <= 16)) {
            string = string.substring(0, 16);
        } else if (length < 16) {
            int i = 16 - length;
            while (i > 0) {
                string = SessionDescription.SUPPORTED_SDP_VERSION + string;
                i--;
                int i2 = HaptikSDK$b + 43;
                HaptikSDK$c = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        char[] cArr = {'p', '@', 'y', '!', 'm', 'k', 'e', 'Y', '4', 'o', 'n', 'E', '9', '7', 'p', 'r'};
        char[] charArray = string.toCharArray();
        char[] cArr2 = new char[16];
        int i4 = 0;
        while (true) {
            if (!(i4 >= 16)) {
                int i5 = HaptikSDK$b + 75;
                HaptikSDK$c = i5 % 128;
                int i6 = i5 % 2;
                cArr2[i4] = (char) (cArr[i4] ^ charArray[i4]);
                i4++;
            } else {
                return new String(cArr2).getBytes();
            }
        }
    }

    /* loaded from: classes5.dex */
    public class values implements SharedPreferences.Editor {
        protected SharedPreferences.Editor ah$a;

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        public values() {
            this.ah$a = invalidateChildRegion.ag$a(invalidateChildRegion.this).edit();
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: values */
        public values putBoolean(String str, boolean z) {
            this.ah$a.putString(str, invalidateChildRegion.ag$a(invalidateChildRegion.this, Boolean.toString(z)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: values */
        public values putFloat(String str, float f) {
            this.ah$a.putString(str, invalidateChildRegion.ag$a(invalidateChildRegion.this, Float.toString(f)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: toString */
        public values putInt(String str, int i) {
            this.ah$a.putString(str, invalidateChildRegion.ag$a(invalidateChildRegion.this, Integer.toString(i)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: valueOf */
        public values putLong(String str, long j) {
            this.ah$a.putString(str, invalidateChildRegion.ag$a(invalidateChildRegion.this, Long.toString(j)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: toString */
        public values putString(String str, String str2) {
            if (str2 != null) {
                this.ah$a.putString(str, invalidateChildRegion.ag$a(invalidateChildRegion.this, str2));
            } else {
                this.ah$a.putString(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            this.ah$a.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: values */
        public values clear() {
            this.ah$a.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return this.ah$a.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: values */
        public values remove(String str) {
            this.ah$a.remove(str);
            this.ah$a.apply();
            return this;
        }
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + valueOf)) ^ ((cArr3[0] >>> 5) + invoke)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + values)) ^ ((cArr3[1] >>> 5) + ah$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
