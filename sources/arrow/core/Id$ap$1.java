package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onTransact;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Id$ap$1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super A, ? extends B>, onTransact<? extends B>> {
    final /* synthetic */ onTransact this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Id$ap$1(onTransact ontransact) {
        super(1);
        this.this$0 = ontransact;
    }

    @Override // o.Styleable.ChangeBounds
    public final onTransact<B> invoke(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
        runAnimators.valueOf(changeBounds, "f");
        return this.this$0.values(changeBounds);
    }
}
