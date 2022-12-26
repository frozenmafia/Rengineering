package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ValidatedSelective$select$2$1$1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super A, ? extends B>, B> {
    final /* synthetic */ Object $l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidatedSelective$select$2$1$1(Object obj) {
        super(1);
        this.$l = obj;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Styleable.ChangeBounds<? super A, ? extends Object>) obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
    public final B invoke(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
        runAnimators.valueOf(changeBounds, "ff");
        return changeBounds.invoke(this.$l);
    }
}
