package com.google.android.gms.analytics.ecommerce;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;
import o.isLast;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes7.dex */
public class Promotion {
    public static final String ACTION_CLICK = "click";
    public static final String ACTION_VIEW = "view";
    private static int HaptikSDK$c = 1;
    private static boolean ag$a = true;
    private static boolean ah$a = true;
    private static int toString = 200;
    private static int valueOf;
    private static char[] values = {305, 300};
    private Map<String, String> zzvn = new HashMap();

    private final void put(String str, String str2) {
        int i = HaptikSDK$c + 119;
        valueOf = i % 128;
        int i2 = i % 2;
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zzvn.put(str, str2);
        int i3 = HaptikSDK$c + 125;
        valueOf = i3 % 128;
        if ((i3 % 2 != 0 ? 'Q' : '\"') != 'Q') {
            return;
        }
        Object obj = null;
        super.hashCode();
    }

    public Promotion setId(String str) {
        int i = HaptikSDK$c + 71;
        valueOf = i % 128;
        put((!(i % 2 == 0) ? ag$a(null, null, 41 >>> TextUtils.getTrimmedLength(""), new byte[]{-126, -127}) : ag$a(null, null, 127 - TextUtils.getTrimmedLength(""), new byte[]{-126, -127})).intern(), str);
        int i2 = HaptikSDK$c + 23;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        return this;
    }

    public Promotion setName(String str) {
        int i = valueOf + 101;
        HaptikSDK$c = i % 128;
        Object[] objArr = null;
        if (i % 2 == 0) {
            put("nm", str);
            int length = objArr.length;
        } else {
            put("nm", str);
        }
        int i2 = HaptikSDK$c + 39;
        valueOf = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 26 : (char) 16) != 26) {
            return this;
        }
        int length2 = objArr.length;
        return this;
    }

    public Promotion setCreative(String str) {
        int i = valueOf + 31;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        put("cr", str);
        int i3 = valueOf + 91;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    public Promotion setPosition(String str) {
        int i = HaptikSDK$c + 71;
        valueOf = i % 128;
        if ((i % 2 != 0 ? '4' : 'N') != '4') {
            try {
                put("ps", str);
            } catch (Exception e) {
                throw e;
            }
        } else {
            put("ps", str);
            int i2 = 54 / 0;
        }
        int i3 = valueOf + 49;
        try {
            HaptikSDK$c = i3 % 128;
            if ((i3 % 2 == 0 ? '_' : 'b') != '_') {
                return this;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return this;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final Map<String, String> zzn(String str) {
        String concat;
        int i;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.zzvn.entrySet()) {
            try {
                int i2 = HaptikSDK$c + 43;
                valueOf = i2 % 128;
                int i3 = i2 % 2;
                try {
                    String valueOf2 = String.valueOf(str);
                    String valueOf3 = String.valueOf(entry.getKey());
                    if ((valueOf3.length() != 0 ? 'W' : (char) 0) != 'W') {
                        concat = new String(valueOf2);
                        i = HaptikSDK$c + 101;
                    } else {
                        concat = valueOf2.concat(valueOf3);
                        i = HaptikSDK$c + 19;
                    }
                    valueOf = i % 128;
                    int i4 = i % 2;
                    hashMap.put(concat, entry.getValue());
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return hashMap;
    }

    public String toString() {
        int i = valueOf + 65;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? (char) 20 : Soundex.SILENT_MARKER) != 20) {
            return zzi.zza((Map) this.zzvn);
        }
        String zza = zzi.zza((Map) this.zzvn);
        Object obj = null;
        super.hashCode();
        return zza;
    }

    private static String ag$a(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = values;
            int i2 = toString;
            if (ah$a) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (ag$a) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}
