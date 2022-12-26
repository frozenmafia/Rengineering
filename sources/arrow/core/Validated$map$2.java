package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Validated$map$2 extends Lambda implements Styleable.ChangeBounds<A, B> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Validated$map$2(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final B invoke(A a) {
        return this.$f.invoke(a);
    }
}
