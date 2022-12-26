package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Function1$Companion$just$1 extends Lambda implements Styleable.ChangeBounds<I, A> {
    final /* synthetic */ Object $a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function1$Companion$just$1(Object obj) {
        super(1);
        this.$a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [A, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final A invoke(I i) {
        return this.$a;
    }
}
