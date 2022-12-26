package o;
/* loaded from: classes7.dex */
public class codepoints<T> {
    Object[] ag$a;
    final Object[] ah$a;
    final int valueOf;
    int values;

    /* loaded from: classes7.dex */
    public interface values<T> extends dataBuffer<T> {
        @Override // o.dataBuffer
        boolean test(T t);
    }

    public codepoints(int i) {
        this.valueOf = i;
        Object[] objArr = new Object[i + 1];
        this.ah$a = objArr;
        this.ag$a = objArr;
    }

    public void ag$a(T t) {
        int i = this.valueOf;
        int i2 = this.values;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.ag$a[i] = objArr;
            this.ag$a = objArr;
            i2 = 0;
        }
        this.ag$a[i2] = t;
        this.values = i2 + 1;
    }

    public void values(T t) {
        this.ah$a[0] = t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void values(o.codepoints.values<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.ah$a
            int r1 = r4.valueOf
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.codepoints.values(o.codepoints$values):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean ah$a(o.registerConfigurationChangeListener<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.ah$a
            int r1 = r4.valueOf
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.rxjava3.internal.util.NotificationLite.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.codepoints.ah$a(o.registerConfigurationChangeListener):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean values(o.IdlingResource<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.ah$a
            int r1 = r4.valueOf
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.rxjava3.internal.util.NotificationLite.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.codepoints.values(o.IdlingResource):boolean");
    }
}
