package o;
/* loaded from: classes5.dex */
public final /* synthetic */ class infoForPosition {
    public static final boolean valueOf(String str, boolean z) {
        String values = getPageMargin.values(str);
        return values != null ? Boolean.parseBoolean(values) : z;
    }

    public static /* synthetic */ int values(String str, int i, int i2, int i3, int i4, Object obj) {
        int ah$a;
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        ah$a = ah$a(str, i, i2, i3);
        return ah$a;
    }

    public static final int ah$a(String str, int i, int i2, int i3) {
        long valueOf;
        valueOf = valueOf(str, i, i2, i3);
        return (int) valueOf;
    }

    public static /* synthetic */ long values(String str, long j, long j2, long j3, int i, Object obj) {
        long valueOf;
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        valueOf = valueOf(str, j, j4, j3);
        return valueOf;
    }

    public static final long valueOf(String str, long j, long j2, long j3) {
        String values = getPageMargin.values(str);
        if (values == null) {
            return j;
        }
        Long ag$a = runAnimators.ag$a(values, "<this>");
        if (ag$a == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + values + '\'').toString());
        }
        long longValue = ag$a.longValue();
        boolean z = false;
        if (j2 <= longValue && longValue <= j3) {
            z = true;
        }
        if (z) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }
}
