package com.google.android.gms.analytics.ecommerce;

import android.view.ViewConfiguration;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.analytics.zzd;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.getShort;
/* loaded from: classes7.dex */
public class Product {
    private static int ag$a = 1;
    private static long ah$a = 2564617029386655516L;
    private static char toString;
    private static int valueOf;
    private static int values;
    private Map<String, String> zzvn = new HashMap();

    private final void put(String str, String str2) {
        int i = values + 43;
        ag$a = i % 128;
        int i2 = i % 2;
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zzvn.put(str, str2);
        int i3 = ag$a + 113;
        values = i3 % 128;
        int i4 = i3 % 2;
    }

    public Product setId(String str) {
        int i = ag$a + 105;
        values = i % 128;
        int i2 = i % 2;
        put(ag$a(ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{44904, 39039, 64476, 56455}, new char[]{22300, 44418, 22937, 9111}, (char) (34811 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), new char[]{22096, 9749}).intern(), str);
        int i3 = ag$a + 93;
        values = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    public Product setName(String str) {
        int i = values + 79;
        ag$a = i % 128;
        int i2 = i % 2;
        put("nm", str);
        int i3 = ag$a + 69;
        values = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    public Product setBrand(String str) {
        int i = ag$a + 5;
        values = i % 128;
        int i2 = i % 2;
        put(TtmlNode.TAG_BR, str);
        try {
            int i3 = ag$a + 87;
            values = i3 % 128;
            int i4 = i3 % 2;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    public Product setCategory(String str) {
        int i = ag$a + 101;
        values = i % 128;
        int i2 = i % 2;
        put("ca", str);
        int i3 = ag$a + 55;
        values = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    public Product setVariant(String str) {
        int i = ag$a + 95;
        values = i % 128;
        if (!(i % 2 != 0)) {
            try {
                put("va", str);
            } catch (Exception e) {
                throw e;
            }
        } else {
            put("va", str);
            Object[] objArr = null;
            int length = objArr.length;
        }
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:9:0x0020
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public com.google.android.gms.analytics.ecommerce.Product setPosition(int r3) {
        /*
            r2 = this;
            int r0 = com.google.android.gms.analytics.ecommerce.Product.values
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.google.android.gms.analytics.ecommerce.Product.ag$a = r1
            int r0 = r0 % 2
            java.lang.String r0 = "ps"
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch: java.lang.Exception -> L1e
            r2.put(r0, r3)     // Catch: java.lang.Exception -> L1e
            int r3 = com.google.android.gms.analytics.ecommerce.Product.ag$a
            int r3 = r3 + 93
            int r0 = r3 % 128
            com.google.android.gms.analytics.ecommerce.Product.values = r0
            int r3 = r3 % 2
            return r2
        L1e:
            r3 = move-exception
            throw r3
        L20:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.ecommerce.Product.setPosition(int):com.google.android.gms.analytics.ecommerce.Product");
    }

    public Product setPrice(double d) {
        int i = values + 25;
        ag$a = i % 128;
        int i2 = i % 2;
        put("pr", Double.toString(d));
        int i3 = ag$a + 95;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return this;
        }
        return this;
    }

    public Product setQuantity(int i) {
        int i2 = ag$a + 79;
        values = i2 % 128;
        boolean z = i2 % 2 != 0;
        put("qt", Integer.toString(i));
        if (z) {
            Object[] objArr = null;
            int length = objArr.length;
        }
        return this;
    }

    public Product setCouponCode(String str) {
        try {
            int i = values + 1;
            ag$a = i % 128;
            if (i % 2 == 0) {
                put("cc", str);
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                try {
                    put("cc", str);
                } catch (Exception e) {
                    throw e;
                }
            }
            return this;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Product setCustomDimension(int i, String str) {
        try {
            int i2 = ag$a + 41;
            try {
                values = i2 % 128;
                boolean z = i2 % 2 == 0;
                put(zzd.zzo(i), str);
                if (!z) {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
                return this;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Product setCustomMetric(int i, int i2) {
        int i3 = ag$a + 63;
        values = i3 % 128;
        boolean z = i3 % 2 != 0;
        put(zzd.zzp(i), Integer.toString(i2));
        if (z) {
            int i4 = 36 / 0;
        }
        int i5 = values + 85;
        ag$a = i5 % 128;
        if ((i5 % 2 == 0 ? '\t' : '\f') != '\f') {
            Object[] objArr = null;
            int length = objArr.length;
            return this;
        }
        return this;
    }

    public final Map<String, String> zzn(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, String>> it = this.zzvn.entrySet().iterator();
        int i = values + 37;
        ag$a = i % 128;
        int i2 = i % 2;
        while (true) {
            if (!it.hasNext()) {
                return hashMap;
            }
            try {
                Map.Entry<String, String> next = it.next();
                try {
                    String valueOf2 = String.valueOf(str);
                    String valueOf3 = String.valueOf(next.getKey());
                    if (valueOf3.length() != 0) {
                        str2 = valueOf2.concat(valueOf3);
                    } else {
                        String str3 = new String(valueOf2);
                        int i3 = ag$a + 119;
                        values = i3 % 128;
                        int i4 = i3 % 2;
                        str2 = str3;
                    }
                    hashMap.put(str2, next.getValue());
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public String toString() {
        int i = values + 87;
        ag$a = i % 128;
        if (!(i % 2 != 0)) {
            String zza = zzi.zza((Map) this.zzvn);
            Object[] objArr = null;
            int length = objArr.length;
            return zza;
        }
        try {
            try {
                return zzi.zza((Map) this.zzvn);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ag$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ah$a) ^ valueOf) ^ toString);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
