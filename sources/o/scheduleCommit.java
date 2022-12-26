package o;

import java.util.Collection;
import java.util.Set;
/* loaded from: classes4.dex */
public final class scheduleCommit {
    public static final scheduleCommit$ag$a ah$a = new scheduleCommit$ag$a(null);
    private final Set<String> ag$a;
    private final String valueOf;
    private final String values;

    public final Set<String> valueOf() {
        return this.ag$a;
    }

    public final String values() {
        return this.values;
    }

    public final String ag$a() {
        return this.valueOf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ scheduleCommit(java.util.Collection r1, java.lang.String r2, int r3, o.getTargetTypes r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L11
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "randomUUID().toString()"
            o.runAnimators.ah$a(r2, r3)
        L11:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.scheduleCommit.<init>(java.util.Collection, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public scheduleCommit(Collection<String> collection, String str) {
        this(collection, str, onFragmentActivityCreated.values());
        runAnimators.ag$a(str, "nonce");
        onFragmentActivityCreated onfragmentactivitycreated = onFragmentActivityCreated.valueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public scheduleCommit(java.util.Collection<java.lang.String> r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "nonce"
            o.runAnimators.ag$a(r3, r0)
            java.lang.String r0 = "codeVerifier"
            o.runAnimators.ag$a(r4, r0)
            r1.<init>()
            o.onFragmentAttached r0 = o.onFragmentAttached.values
            boolean r0 = o.onFragmentAttached.toString(r3)
            if (r0 == 0) goto L1f
            o.onFragmentActivityCreated r0 = o.onFragmentActivityCreated.valueOf
            boolean r0 = o.onFragmentActivityCreated.toString(r4)
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L44
            java.util.HashSet r0 = new java.util.HashSet
            if (r2 == 0) goto L2a
            r0.<init>(r2)
            goto L2d
        L2a:
            r0.<init>()
        L2d:
            java.lang.String r2 = "openid"
            r0.add(r2)
            java.util.Set r0 = (java.util.Set) r0
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r0 = "unmodifiableSet(permissions)"
            o.runAnimators.ah$a(r2, r0)
            r1.ag$a = r2
            r1.values = r3
            r1.valueOf = r4
            return
        L44:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Failed requirement."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.scheduleCommit.<init>(java.util.Collection, java.lang.String, java.lang.String):void");
    }
}
