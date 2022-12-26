package o;

import java.util.TreeSet;
/* loaded from: classes4.dex */
public abstract class addCancellationSignal$ag$a {
    private TreeSet<Integer> values;

    public void ag$a() {
    }

    public abstract String ah$a();

    public String g_() {
        return "id_token,token,signed_request,graph_domain";
    }

    public abstract String valueOf();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (o.runAnimators.values((java.lang.Object) (r0 == null ? null : java.lang.Boolean.valueOf(r0.isEmpty())), (java.lang.Object) false) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.TreeSet<java.lang.Integer> HaptikSDK$b() {
        /*
            r3 = this;
            java.util.TreeSet<java.lang.Integer> r0 = r3.values
            r1 = 0
            if (r0 == 0) goto L1b
            if (r0 != 0) goto L9
            r0 = 0
            goto L11
        L9:
            boolean r0 = r0.isEmpty()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L11:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            boolean r0 = o.runAnimators.values(r0, r2)
            if (r0 != 0) goto L1e
        L1b:
            r3.toString(r1)
        L1e:
            java.util.TreeSet<java.lang.Integer> r0 = r3.values
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addCancellationSignal$ag$a.HaptikSDK$b():java.util.TreeSet");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (o.runAnimators.values((java.lang.Object) (r3 == null ? null : java.lang.Boolean.valueOf(r3.isEmpty())), (java.lang.Object) false) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void toString(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            if (r3 != 0) goto L1e
            java.util.TreeSet<java.lang.Integer> r3 = r2.values     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L1e
            if (r3 != 0) goto Lc
            r3 = 0
            goto L14
        Lc:
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L3a
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3a
            boolean r3 = o.runAnimators.values(r3, r1)     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L26
        L1e:
            o.addCancellationSignal r3 = o.addCancellationSignal.ag$a     // Catch: java.lang.Throwable -> L3a
            java.util.TreeSet r3 = o.addCancellationSignal.values(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r2.values = r3     // Catch: java.lang.Throwable -> L3a
        L26:
            java.util.TreeSet<java.lang.Integer> r3 = r2.values     // Catch: java.lang.Throwable -> L3a
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L32
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L33
        L32:
            r0 = 1
        L33:
            if (r0 == 0) goto L38
            r2.ag$a()     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r2)
            return
        L3a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addCancellationSignal$ag$a.toString(boolean):void");
    }
}
