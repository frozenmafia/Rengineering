package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.cancel;
/* loaded from: classes6.dex */
public final class Zip$zip$1 extends Lambda implements Transition<A, B, cancel<? extends A, ? extends B>> {
    public static final Zip$zip$1 INSTANCE = new Zip$zip$1();

    Zip$zip$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Zip$zip$1) obj, obj2);
    }

    @Override // o.Transition
    public final cancel<A, B> invoke(A a, B b2) {
        return new cancel<>(a, b2);
    }
}
