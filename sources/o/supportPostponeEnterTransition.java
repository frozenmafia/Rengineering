package o;

import o.FragmentActivity;
/* loaded from: classes4.dex */
public class supportPostponeEnterTransition<T> extends FragmentActivity.AnonymousClass1<T> {
    @Override // o.FragmentActivity.AnonymousClass1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o.FragmentActivity.AnonymousClass1
    /* renamed from: values */
    public FragmentActivity.AnonymousClass1<T> clone() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public supportPostponeEnterTransition(T t, onGetHost<T> ongethost, FragmentActivity.AnonymousClass1.toString tostring, Throwable th) {
        super(t, ongethost, tostring, th);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.values) {
                    return;
                }
                T values = this.toString.values();
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(System.identityHashCode(this));
                objArr[1] = Integer.valueOf(System.identityHashCode(this.toString));
                objArr[2] = values == null ? null : values.getClass().getName();
                FragmentActivity.ah$a("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                this.toString.ag$a();
            }
        } finally {
            super.finalize();
        }
    }
}
