package o;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
/* loaded from: classes4.dex */
public final class setDropDownViewResource implements getViewHorizontalDragRange {
    private static int HaptikSDK$a = 0;
    private static int HaptikSDK$b = 1;
    private static char HaptikSDK$c = 63491;
    private static char ag$a = 25988;
    private static char ah$b = 41188;
    private static char values = 51605;
    private final getLayoutId ah$a;
    private final SeekBarBindingAdapter.OnProgressChanged toString;
    private final setCurrentTabTag valueOf;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if ((r4 == r5 ? 'V' : '\t') != '\t') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r4 == r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
        if ((r5 instanceof o.setDropDownViewResource) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        r0 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
        r0 = 'P';
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
        if (r0 == 24) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
        r5 = (o.setDropDownViewResource) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (o.runAnimators.values(r4.ah$a, r5.ah$a) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (o.runAnimators.values(r4.toString, r5.toString) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        r5 = o.setDropDownViewResource.HaptikSDK$a + 73;
        o.setDropDownViewResource.HaptikSDK$b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
        if (o.runAnimators.values(r4.valueOf, r5.valueOf) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
        r5 = o.setDropDownViewResource.HaptikSDK$a + 83;
        o.setDropDownViewResource.HaptikSDK$b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
        if ((r5 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r5 == true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = o.setDropDownViewResource.HaptikSDK$a
            int r0 = r0 + 105
            int r1 = r0 % 128
            o.setDropDownViewResource.HaptikSDK$b = r1
            int r0 = r0 % 2
            r1 = 22
            r2 = 0
            if (r0 != 0) goto L12
            r0 = 22
            goto L13
        L12:
            r0 = 0
        L13:
            r3 = 1
            if (r0 == r1) goto L22
            r0 = 9
            if (r4 != r5) goto L1d
            r1 = 86
            goto L1f
        L1d:
            r1 = 9
        L1f:
            if (r1 == r0) goto L27
            goto L26
        L22:
            r0 = 0
            int r0 = r0.length     // Catch: java.lang.Throwable -> L79
            if (r4 != r5) goto L27
        L26:
            return r3
        L27:
            boolean r0 = r5 instanceof o.setDropDownViewResource
            r1 = 24
            if (r0 != 0) goto L30
            r0 = 24
            goto L32
        L30:
            r0 = 80
        L32:
            if (r0 == r1) goto L64
            o.setDropDownViewResource r5 = (o.setDropDownViewResource) r5     // Catch: java.lang.Exception -> L62
            o.getLayoutId r0 = r4.ah$a     // Catch: java.lang.Exception -> L62
            o.getLayoutId r1 = r5.ah$a     // Catch: java.lang.Exception -> L62
            boolean r0 = o.runAnimators.values(r0, r1)     // Catch: java.lang.Exception -> L62
            if (r0 != 0) goto L41
            return r2
        L41:
            o.SeekBarBindingAdapter$OnProgressChanged r0 = r4.toString
            o.SeekBarBindingAdapter$OnProgressChanged r1 = r5.toString
            boolean r0 = o.runAnimators.values(r0, r1)
            if (r0 != 0) goto L56
            int r5 = o.setDropDownViewResource.HaptikSDK$a
            int r5 = r5 + 73
            int r0 = r5 % 128
            o.setDropDownViewResource.HaptikSDK$b = r0
            int r5 = r5 % 2
            return r2
        L56:
            o.setCurrentTabTag r0 = r4.valueOf
            o.setCurrentTabTag r5 = r5.valueOf
            boolean r5 = o.runAnimators.values(r0, r5)
            if (r5 != 0) goto L61
            return r2
        L61:
            return r3
        L62:
            r5 = move-exception
            throw r5
        L64:
            int r5 = o.setDropDownViewResource.HaptikSDK$a     // Catch: java.lang.Exception -> L77
            int r5 = r5 + 83
            int r0 = r5 % 128
            o.setDropDownViewResource.HaptikSDK$b = r0     // Catch: java.lang.Exception -> L77
            int r5 = r5 % 2
            if (r5 != 0) goto L72
            r5 = 1
            goto L73
        L72:
            r5 = 0
        L73:
            if (r5 == r3) goto L76
            return r2
        L76:
            return r3
        L77:
            r5 = move-exception
            throw r5
        L79:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDropDownViewResource.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
        if ((r0 == null) != true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
        r2 = r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
        r0 = o.setDropDownViewResource.HaptikSDK$b + 121;
        o.setDropDownViewResource.HaptikSDK$a = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r4 = this;
            int r0 = o.setDropDownViewResource.HaptikSDK$b     // Catch: java.lang.Exception -> L4d
            int r0 = r0 + 101
            int r1 = r0 % 128
            o.setDropDownViewResource.HaptikSDK$a = r1     // Catch: java.lang.Exception -> L4d
            int r0 = r0 % 2
            r1 = 44
            if (r0 == 0) goto L11
            r0 = 55
            goto L13
        L11:
            r0 = 44
        L13:
            r2 = 0
            if (r0 == r1) goto L21
            o.getLayoutId r0 = r4.ah$a
            r1 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L2b
            goto L30
        L1f:
            r0 = move-exception
            throw r0
        L21:
            o.getLayoutId r0 = r4.ah$a
            r1 = 1
            if (r0 != 0) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            if (r3 == r1) goto L30
        L2b:
            int r2 = r0.hashCode()
            goto L3a
        L30:
            int r0 = o.setDropDownViewResource.HaptikSDK$b
            int r0 = r0 + 121
            int r1 = r0 % 128
            o.setDropDownViewResource.HaptikSDK$a = r1
            int r0 = r0 % 2
        L3a:
            int r2 = r2 * 31
            o.SeekBarBindingAdapter$OnProgressChanged r0 = r4.toString
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 31
            o.setCurrentTabTag r0 = r4.valueOf
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            return r2
        L4d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDropDownViewResource.hashCode():int");
    }

    public String toString() {
        String str = "LanguageSelectionInteraction(_category=" + this.ah$a + ", _selection=" + this.toString + ", _source=" + this.valueOf + ')';
        int i = HaptikSDK$b + 91;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        return str;
    }

    public setDropDownViewResource(getLayoutId getlayoutid, SeekBarBindingAdapter.OnProgressChanged onProgressChanged, setCurrentTabTag setcurrenttabtag) {
        try {
            runAnimators.ag$a(onProgressChanged, "_selection");
            runAnimators.ag$a(setcurrenttabtag, "_source");
            this.ah$a = getlayoutid;
            this.toString = onProgressChanged;
            this.valueOf = setcurrenttabtag;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "LanguageSelectionInteraction");
        getLayoutId getlayoutid = this.ah$a;
        Object[] objArr = null;
        if (getlayoutid != null) {
            int i = HaptikSDK$b + 49;
            HaptikSDK$a = i % 128;
            boolean z = i % 2 != 0;
            hashMap.put(com.apxor.androidsdk.core.Constants.CATEGORY, getlayoutid.values());
            if (z) {
                int length = objArr.length;
            }
        }
        hashMap.put("selection", this.toString.ag$a());
        hashMap.put(toString(new char[]{17013, 54106, 564, 43328, 30592, 15584}, 6 - TextUtils.getOffsetAfter("", 0)).intern(), this.valueOf.ah$a());
        int i2 = HaptikSDK$b + 89;
        HaptikSDK$a = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return hashMap;
        }
        int length2 = objArr.length;
        return hashMap;
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
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ah$b)) ^ ((cArr3[0] >>> 5) + HaptikSDK$c)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ag$a)) ^ ((cArr3[1] >>> 5) + values)));
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
