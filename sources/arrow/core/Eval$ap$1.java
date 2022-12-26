package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.asBinder;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Eval$ap$1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super A, ? extends B>, asBinder<? extends B>> {
    final /* synthetic */ asBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eval$ap$1(asBinder asbinder) {
        super(1);
        this.this$0 = asbinder;
    }

    @Override // o.Styleable.ChangeBounds
    public final asBinder<B> invoke(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
        runAnimators.valueOf(changeBounds, "f");
        return this.this$0.ah$a(changeBounds);
    }
}
