package arrow.syntax.collections;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reserveEndViewTransition;
/* loaded from: classes6.dex */
public final class IterableKt$collect$1$1 extends Lambda implements Styleable.ChangeBounds<B, List<? extends B>> {
    public static final IterableKt$collect$1$1 INSTANCE = new IterableKt$collect$1$1();

    IterableKt$collect$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((IterableKt$collect$1$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final List<B> invoke(B b2) {
        return reserveEndViewTransition.ag$a(b2);
    }
}
