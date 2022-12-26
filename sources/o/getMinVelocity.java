package o;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getMinVelocity implements getViewHorizontalDragRange {
    private static int HaptikSDK$a = 0;
    private static int HaptikSDK$b = 1;
    private static char ah$b = 28684;
    private static int valueOf;
    private static long values;
    private final setContentPaddingBottom ag$a;
    private final ObservableInt ah$a;
    private final setCurrentTabTag toString;

    public boolean equals(Object obj) {
        int i = HaptikSDK$b + 67;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        if (!(this != obj)) {
            int i3 = HaptikSDK$b + 35;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } else if (!(obj instanceof getMinVelocity)) {
            int i5 = HaptikSDK$b + 5;
            HaptikSDK$a = i5 % 128;
            return !(i5 % 2 == 0);
        } else {
            getMinVelocity getminvelocity = (getMinVelocity) obj;
            if (!(!runAnimators.values(this.ah$a, getminvelocity.ah$a))) {
                if (!runAnimators.values(this.ag$a, getminvelocity.ag$a)) {
                    int i6 = HaptikSDK$b + 5;
                    HaptikSDK$a = i6 % 128;
                    return !(i6 % 2 == 0);
                }
                try {
                    try {
                        if ((!runAnimators.values(this.toString, getminvelocity.toString) ? '<' : (char) 17) != '<') {
                            return true;
                        }
                        int i7 = HaptikSDK$a + 109;
                        HaptikSDK$b = i7 % 128;
                        if (i7 % 2 == 0) {
                            Object[] objArr = null;
                            int length = objArr.length;
                            return false;
                        }
                        return false;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return false;
        }
    }

    public int hashCode() {
        int i = HaptikSDK$b + 3;
        HaptikSDK$a = i % 128;
        return i % 2 == 0 ? (((this.ah$a.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.toString.hashCode() : (((this.ah$a.hashCode() + 72) << this.ag$a.hashCode()) << 20) / this.toString.hashCode();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:9:0x0039
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SearchSingleChar(_discoverability_status="
            r0.append(r1)     // Catch: java.lang.Exception -> L37
            o.ObservableInt r1 = r3.ah$a     // Catch: java.lang.Exception -> L37
            r0.append(r1)     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = ", _phonebook_sync_status="
            r0.append(r1)     // Catch: java.lang.Exception -> L37
            o.setContentPaddingBottom r1 = r3.ag$a     // Catch: java.lang.Exception -> L37
            r0.append(r1)     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = ", _source="
            r0.append(r1)     // Catch: java.lang.Exception -> L37
            o.setCurrentTabTag r1 = r3.toString     // Catch: java.lang.Exception -> L37
            r0.append(r1)     // Catch: java.lang.Exception -> L37
            r1 = 41
            r0.append(r1)     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L37
            int r1 = o.getMinVelocity.HaptikSDK$b
            int r1 = r1 + 23
            int r2 = r1 % 128
            o.getMinVelocity.HaptikSDK$a = r2
            int r1 = r1 % 2
            return r0
        L37:
            r0 = move-exception
            throw r0
        L39:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getMinVelocity.toString():java.lang.String");
    }

    public getMinVelocity(ObservableInt observableInt, setContentPaddingBottom setcontentpaddingbottom, setCurrentTabTag setcurrenttabtag) {
        try {
            runAnimators.ag$a(observableInt, "_discoverability_status");
            runAnimators.ag$a(setcontentpaddingbottom, "_phonebook_sync_status");
            runAnimators.ag$a(setcurrenttabtag, "_source");
            this.ah$a = observableInt;
            this.ag$a = setcontentpaddingbottom;
            this.toString = setcurrenttabtag;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "SearchSingleChar");
        hashMap.put("discoverability_status", Integer.valueOf(this.ah$a.ag$a()));
        hashMap.put("phonebook_sync_status", Integer.valueOf(this.ag$a.values()));
        hashMap.put(toString(ImageFormat.getBitsPerPixel(0) + 1, new char[]{1450, 64204, 9959, 19047}, new char[]{0, 0, 0, 0}, (char) (26406 - TextUtils.getOffsetBefore("", 0)), new char[]{33189, 55009, 23544, 51489, 37191, 65325}).intern(), this.toString.ah$a());
        int i = HaptikSDK$a + 79;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String toString(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ values) ^ valueOf) ^ ah$b);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
