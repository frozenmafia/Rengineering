package o;

import o.FragmentActivity;
/* loaded from: classes4.dex */
public class supportFinishAfterTransition<T> extends FragmentActivity.AnonymousClass1<T> {
    @Override // o.FragmentActivity.AnonymousClass1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o.FragmentActivity.AnonymousClass1
    /* renamed from: values */
    public FragmentActivity.AnonymousClass1<T> clone() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public supportFinishAfterTransition(T t, onGetHost<T> ongethost, FragmentActivity.AnonymousClass1.toString tostring, Throwable th) {
        super(t, ongethost, tostring, th);
    }
}
