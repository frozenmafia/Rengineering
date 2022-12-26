package o;
/* loaded from: classes.dex */
public class startProgressAlphaMaxAnimation<T> {
    final int ag$a;
    int ah$a;
    final Object[] toString;
    Object[] values;

    /* loaded from: classes.dex */
    public interface valueOf<T> extends initializeComponent<T> {
        @Override // o.initializeComponent
        boolean test(T t);
    }

    public startProgressAlphaMaxAnimation(int i) {
        this.ag$a = i;
        Object[] objArr = new Object[i + 1];
        this.toString = objArr;
        this.values = objArr;
    }

    public void ag$a(T t) {
        int i = this.ag$a;
        int i2 = this.ah$a;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.values[i] = objArr;
            this.values = objArr;
            i2 = 0;
        }
        this.values[i2] = t;
        this.ah$a = i2 + 1;
    }

    public void ah$a(T t) {
        this.toString[0] = t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void valueOf(o.startProgressAlphaMaxAnimation.valueOf<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.toString
            int r1 = r4.ag$a
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
        throw new UnsupportedOperationException("Method not decompiled: o.startProgressAlphaMaxAnimation.valueOf(o.startProgressAlphaMaxAnimation$valueOf):void");
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
            java.lang.Object[] r0 = r4.toString
            int r1 = r4.ag$a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: o.startProgressAlphaMaxAnimation.ah$a(o.registerConfigurationChangeListener):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean values(o.SupportSQLiteOpenHelper.Factory<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.toString
            int r1 = r4.ag$a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: o.startProgressAlphaMaxAnimation.values(o.SupportSQLiteOpenHelper$Factory):boolean");
    }
}
