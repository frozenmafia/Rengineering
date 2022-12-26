package o;
/* loaded from: classes3.dex */
public final class NestedScrollingParentHelper {
    public String values;

    public NestedScrollingParentHelper() {
        this(null, 1);
    }

    public NestedScrollingParentHelper(String str) {
        runAnimators.ag$a(str, "shareUrl");
        this.values = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NestedScrollingParentHelper) && runAnimators.values((Object) this.values, (Object) ((NestedScrollingParentHelper) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "StorylyConfiguration(shareUrl=" + this.values + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NestedScrollingParentHelper(java.lang.String r1, int r2) {
        /*
            r0 = this;
            r1 = r2 & 1
            if (r1 == 0) goto Ld
            o.createFromResourcesFontFile r1 = o.findFromCache.ah$a()
            java.lang.String r1 = r1.valueOf()
            goto Le
        Ld:
            r1 = 0
        Le:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NestedScrollingParentHelper.<init>(java.lang.String, int):void");
    }
}
