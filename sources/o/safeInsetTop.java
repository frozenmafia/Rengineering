package o;
/* loaded from: classes5.dex */
public final class safeInsetTop {
    private static final byte[] toString = SplitRule.values("0123456789abcdef");

    public static final byte[] valueOf() {
        return toString;
    }

    public static final boolean ah$a(safeInsetLeft safeinsetleft, int i, byte[] bArr, int i2, int i3) {
        runAnimators.ag$a(safeinsetleft, "segment");
        runAnimators.ag$a(bArr, "bytes");
        int i4 = safeinsetleft.toString;
        byte[] bArr2 = safeinsetleft.valueOf;
        while (i2 < i3) {
            if (i == i4) {
                safeinsetleft = safeinsetleft.ah$a;
                runAnimators.toString(safeinsetleft);
                byte[] bArr3 = safeinsetleft.valueOf;
                bArr2 = bArr3;
                i = safeinsetleft.HaptikSDK$a;
                i4 = safeinsetleft.toString;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String toString(getMinSmallestWidth getminsmallestwidth, long j) {
        runAnimators.ag$a(getminsmallestwidth, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (getminsmallestwidth.ah$a(j2) == ((byte) 13)) {
                String values = getminsmallestwidth.values(j2);
                getminsmallestwidth.HaptikSDK$a(2L);
                return values;
            }
        }
        String values2 = getminsmallestwidth.values(j);
        getminsmallestwidth.HaptikSDK$a(1L);
        return values2;
    }

    public static /* synthetic */ int toString(getMinSmallestWidth getminsmallestwidth, ActivityCompatHelperApi24 activityCompatHelperApi24, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return valueOf(getminsmallestwidth, activityCompatHelperApi24, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x005d, code lost:
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x005f, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0060, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int valueOf(o.getMinSmallestWidth r17, o.ActivityCompatHelperApi24 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.safeInsetTop.valueOf(o.getMinSmallestWidth, o.ActivityCompatHelperApi24, boolean):int");
    }
}
