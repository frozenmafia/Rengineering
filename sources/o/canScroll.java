package o;

import java.util.HashMap;
import java.util.Map;
import o.SearchViewBindingAdapter;
/* loaded from: classes4.dex */
public final class canScroll implements getViewHorizontalDragRange {
    private static int HaptikSDK$a = 1;
    private static char[] ah$a = {'z', 242, 243, 244, 235, 229};
    private static int valueOf;
    private final SearchViewBindingAdapter.AnonymousClass1 ag$a;
    private final emit toString;
    private final setCurrentTabTag values;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        if ((r4 == r5 ? 18 : ':') != ':') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
        if ((r5 instanceof o.canScroll) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
        r5 = (o.canScroll) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
        if (o.runAnimators.values(r4.toString, r5.toString) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
        r0 = 'b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
        r0 = '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
        if (r0 == '@') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
        r5 = o.canScroll.valueOf + 117;
        o.canScroll.HaptikSDK$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
        if (o.runAnimators.values(r4.ag$a, r5.ag$a) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
        r0 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
        r0 = 'Y';
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (r0 == 22) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
        if (o.runAnimators.values(r4.values, r5.values) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0068, code lost:
        r5 = o.canScroll.valueOf + 19;
        o.canScroll.HaptikSDK$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0076, code lost:
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r4 == r5) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = o.canScroll.HaptikSDK$a
            int r0 = r0 + 77
            int r1 = r0 % 128
            o.canScroll.valueOf = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == r1) goto L1a
            r0 = 0
            int r0 = r0.length     // Catch: java.lang.Throwable -> L18
            if (r4 != r5) goto L26
            goto L25
        L18:
            r5 = move-exception
            throw r5
        L1a:
            r0 = 58
            if (r4 != r5) goto L21
            r3 = 18
            goto L23
        L21:
            r3 = 58
        L23:
            if (r3 == r0) goto L26
        L25:
            return r1
        L26:
            boolean r0 = r5 instanceof o.canScroll
            if (r0 != 0) goto L2b
            return r2
        L2b:
            o.canScroll r5 = (o.canScroll) r5     // Catch: java.lang.Exception -> L75
            o.emit r0 = r4.toString     // Catch: java.lang.Exception -> L75
            o.emit r3 = r5.toString     // Catch: java.lang.Exception -> L75
            boolean r0 = o.runAnimators.values(r0, r3)     // Catch: java.lang.Exception -> L75
            r3 = 64
            if (r0 != 0) goto L3c
            r0 = 98
            goto L3e
        L3c:
            r0 = 64
        L3e:
            if (r0 == r3) goto L4b
            int r5 = o.canScroll.valueOf
            int r5 = r5 + 117
            int r0 = r5 % 128
            o.canScroll.HaptikSDK$a = r0
            int r5 = r5 % 2
            return r2
        L4b:
            o.SearchViewBindingAdapter$1 r0 = r4.ag$a     // Catch: java.lang.Exception -> L75
            o.SearchViewBindingAdapter$1 r3 = r5.ag$a
            boolean r0 = o.runAnimators.values(r0, r3)
            r3 = 22
            if (r0 != 0) goto L5a
            r0 = 22
            goto L5c
        L5a:
            r0 = 89
        L5c:
            if (r0 == r3) goto L74
            o.setCurrentTabTag r0 = r4.values
            o.setCurrentTabTag r5 = r5.values
            boolean r5 = o.runAnimators.values(r0, r5)
            if (r5 != 0) goto L73
            int r5 = o.canScroll.valueOf
            int r5 = r5 + 19
            int r0 = r5 % 128
            o.canScroll.HaptikSDK$a = r0
            int r5 = r5 % 2
            return r2
        L73:
            return r1
        L74:
            return r2
        L75:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.canScroll.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        try {
            int i2 = valueOf + 79;
            HaptikSDK$a = i2 % 128;
            int i3 = i2 % 2;
            int hashCode = this.toString.hashCode();
            try {
                SearchViewBindingAdapter.AnonymousClass1 anonymousClass1 = this.ag$a;
                if (!(anonymousClass1 == null)) {
                    i = anonymousClass1.hashCode();
                    int i4 = valueOf + 117;
                    HaptikSDK$a = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    int i6 = valueOf + 57;
                    HaptikSDK$a = i6 % 128;
                    i = (i6 % 2 == 0 ? 'D' : ']') != ']' ? 1 : 0;
                }
                return (((hashCode * 31) + i) * 31) + this.values.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("ChatListLoaded(_noOfChannels=");
            sb.append(this.toString);
            sb.append(", _screen=");
            sb.append(this.ag$a);
            sb.append(", _source=");
            sb.append(this.values);
            sb.append(')');
            String sb2 = sb.toString();
            int i = valueOf + 75;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            return sb2;
        } catch (Exception e) {
            throw e;
        }
    }

    public canScroll(emit emitVar, SearchViewBindingAdapter.AnonymousClass1 anonymousClass1, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(emitVar, "_noOfChannels");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.toString = emitVar;
        this.ag$a = anonymousClass1;
        this.values = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ChatListLoaded");
        hashMap.put("noOfChannels", Integer.valueOf(this.toString.ag$a()));
        SearchViewBindingAdapter.AnonymousClass1 anonymousClass1 = this.ag$a;
        if ((anonymousClass1 != null ? '_' : (char) 15) == '_') {
            int i = HaptikSDK$a + 35;
            valueOf = i % 128;
            char c = i % 2 != 0 ? (char) 7 : ';';
            hashMap.put("screen", anonymousClass1.ah$a());
            if (c == 7) {
                int i2 = 99 / 0;
            }
        }
        hashMap.put(toString(false, new int[]{0, 6, 129, 0}, new byte[]{0, 0, 0, 1, 1, 0}).intern(), this.values.ah$a());
        int i3 = valueOf + 21;
        HaptikSDK$a = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return hashMap;
        }
        return hashMap;
    }

    private static String toString(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(ah$a, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
