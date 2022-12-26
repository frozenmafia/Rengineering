package o;

import com.facebook.common.references.SharedReference;
import o.Fragment;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class supportStartPostponedEnterTransition<T> extends FragmentActivity.AnonymousClass1<T> {
    private supportStartPostponedEnterTransition(SharedReference<T> sharedReference, FragmentActivity.AnonymousClass1.toString tostring, Throwable th) {
        super(sharedReference, tostring, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public supportStartPostponedEnterTransition(T t, onGetHost<T> ongethost, FragmentActivity.AnonymousClass1.toString tostring, Throwable th) {
        super(t, ongethost, tostring, th);
    }

    @Override // o.FragmentActivity.AnonymousClass1
    /* renamed from: values */
    public FragmentActivity.AnonymousClass1<T> clone() {
        Fragment.AnonymousClass8.toString(HaptikSDK$a());
        return new supportStartPostponedEnterTransition(this.toString, this.ag$a, this.valueOf != null ? new Throwable(this.valueOf) : null);
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
                FragmentActivity.ah$a("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                this.ag$a.reportLeak(this.toString, this.valueOf);
                close();
            }
        } finally {
            super.finalize();
        }
    }
}
