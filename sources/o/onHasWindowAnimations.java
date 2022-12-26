package o;

import com.facebook.common.references.SharedReference;
import o.Fragment;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class onHasWindowAnimations<T> extends FragmentActivity.AnonymousClass1<T> {
    private onHasWindowAnimations(SharedReference<T> sharedReference, FragmentActivity.AnonymousClass1.toString tostring, Throwable th) {
        super(sharedReference, tostring, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public onHasWindowAnimations(T t, onGetHost<T> ongethost, FragmentActivity.AnonymousClass1.toString tostring, Throwable th) {
        super(t, ongethost, tostring, th);
    }

    @Override // o.FragmentActivity.AnonymousClass1
    /* renamed from: values */
    public FragmentActivity.AnonymousClass1<T> clone() {
        Fragment.AnonymousClass8.toString(HaptikSDK$a());
        return new onHasWindowAnimations(this.toString, this.ag$a, this.valueOf);
    }
}
