package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Functor$mapConst$1 extends Lambda implements Styleable.ChangeBounds<A, B> {
    final /* synthetic */ Object $b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Functor$mapConst$1(Object obj) {
        super(1);
        this.$b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [B, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final B invoke(A a) {
        return this.$b;
    }
}
