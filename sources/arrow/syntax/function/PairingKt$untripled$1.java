package arrow.syntax.function;

import kotlin.Triple;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.excludeObject;
/* loaded from: classes6.dex */
public final class PairingKt$untripled$1 extends Lambda implements excludeObject<P1, P2, P3, R> {
    final /* synthetic */ Styleable.ChangeBounds $this_untripled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PairingKt$untripled$1(Styleable.ChangeBounds changeBounds) {
        super(3);
        this.$this_untripled = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
    @Override // o.excludeObject
    public final R invoke(P1 p1, P2 p2, P3 p3) {
        return this.$this_untripled.invoke(new Triple(p1, p2, p3));
    }
}
