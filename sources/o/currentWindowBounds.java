package o;
/* loaded from: classes5.dex */
public final class currentWindowBounds implements EmptyDecorator {
    private boolean ag$a;
    private int ah$a;
    private final parseSplitActivityRule ah$b;
    private final getMinSmallestWidth toString;
    private long valueOf;
    private safeInsetLeft values;

    public currentWindowBounds(parseSplitActivityRule parsesplitactivityrule) {
        runAnimators.ag$a(parsesplitactivityrule, "upstream");
        this.ah$b = parsesplitactivityrule;
        getMinSmallestWidth HaptikSDK$e = parsesplitactivityrule.HaptikSDK$e();
        this.toString = HaptikSDK$e;
        this.values = HaptikSDK$e.toString;
        safeInsetLeft safeinsetleft = HaptikSDK$e.toString;
        this.ah$a = safeinsetleft != null ? safeinsetleft.HaptikSDK$a : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r5 == r6.HaptikSDK$a) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    @Override // o.EmptyDecorator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(o.getMinSmallestWidth r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            o.runAnimators.ag$a(r9, r0)
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 < 0) goto Lf
            r5 = 1
            goto L10
        Lf:
            r5 = 0
        L10:
            if (r5 == 0) goto L97
            boolean r5 = r8.ag$a
            r5 = r5 ^ r3
            if (r5 == 0) goto L89
            o.safeInsetLeft r5 = r8.values
            if (r5 == 0) goto L2e
            o.getMinSmallestWidth r6 = r8.toString
            o.safeInsetLeft r6 = r6.toString
            if (r5 != r6) goto L2f
            int r5 = r8.ah$a
            o.getMinSmallestWidth r6 = r8.toString
            o.safeInsetLeft r6 = r6.toString
            o.runAnimators.toString(r6)
            int r6 = r6.HaptikSDK$a
            if (r5 != r6) goto L2f
        L2e:
            r2 = 1
        L2f:
            if (r2 == 0) goto L7b
            if (r4 != 0) goto L34
            return r0
        L34:
            o.parseSplitActivityRule r0 = r8.ah$b
            long r1 = r8.valueOf
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.HaptikSDK$b(r1)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            o.safeInsetLeft r0 = r8.values
            if (r0 != 0) goto L5f
            o.getMinSmallestWidth r0 = r8.toString
            o.safeInsetLeft r0 = r0.toString
            if (r0 == 0) goto L5f
            o.getMinSmallestWidth r0 = r8.toString
            o.safeInsetLeft r0 = r0.toString
            r8.values = r0
            o.getMinSmallestWidth r0 = r8.toString
            o.safeInsetLeft r0 = r0.toString
            o.runAnimators.toString(r0)
            int r0 = r0.HaptikSDK$a
            r8.ah$a = r0
        L5f:
            o.getMinSmallestWidth r0 = r8.toString
            long r0 = r0.onPostMessage()
            long r2 = r8.valueOf
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            o.getMinSmallestWidth r2 = r8.toString
            long r4 = r8.valueOf
            r3 = r9
            r6 = r10
            r2.toString(r3, r4, r6)
            long r0 = r8.valueOf
            long r0 = r0 + r10
            r8.valueOf = r0
            return r10
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L89:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L97:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.currentWindowBounds.read(o.getMinSmallestWidth, long):long");
    }

    @Override // o.EmptyDecorator
    public DisplayFeature timeout() {
        return this.ah$b.timeout();
    }

    @Override // o.EmptyDecorator, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.ag$a = true;
    }
}
