package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setInternalConnectionCallback;
/* loaded from: classes6.dex */
public final class Function1Divisible$conquer$1 extends Lambda implements Styleable.ChangeBounds<A, O> {
    final /* synthetic */ setInternalConnectionCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function1Divisible$conquer$1(setInternalConnectionCallback setinternalconnectioncallback) {
        super(1);
        this.this$0 = setinternalconnectioncallback;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, O] */
    @Override // o.Styleable.ChangeBounds
    public final O invoke(A a) {
        return this.this$0.ah$a().values();
    }
}
