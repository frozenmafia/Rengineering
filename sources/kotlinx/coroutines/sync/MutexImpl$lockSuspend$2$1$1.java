package kotlinx.coroutines.sync;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isFragmentViewBound;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class MutexImpl$lockSuspend$2$1$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ Object $owner;
    final /* synthetic */ isFragmentViewBound this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutexImpl$lockSuspend$2$1$1(isFragmentViewBound isfragmentviewbound, Object obj) {
        super(1);
        this.this$0 = isfragmentviewbound;
        this.$owner = obj;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.this$0.ag$a(this.$owner);
    }
}
