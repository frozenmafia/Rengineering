package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Function0$Companion$just$1 extends Lambda implements Styleable.ArcMotion<A> {
    final /* synthetic */ Object $a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Function0$Companion$just$1(Object obj) {
        super(0);
        this.$a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final A invoke() {
        return this.$a;
    }
}
