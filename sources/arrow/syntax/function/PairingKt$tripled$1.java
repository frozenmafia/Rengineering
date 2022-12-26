package arrow.syntax.function;

import kotlin.Triple;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.excludeObject;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PairingKt$tripled$1 extends Lambda implements Styleable.ChangeBounds<Triple<? extends P1, ? extends P2, ? extends P3>, R> {
    final /* synthetic */ excludeObject $this_tripled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PairingKt$tripled$1(excludeObject excludeobject) {
        super(1);
        this.$this_tripled = excludeobject;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(Triple<? extends P1, ? extends P2, ? extends P3> triple) {
        runAnimators.valueOf(triple, "triple");
        return this.$this_tripled.invoke(triple.component1(), triple.component2(), triple.component3());
    }
}
