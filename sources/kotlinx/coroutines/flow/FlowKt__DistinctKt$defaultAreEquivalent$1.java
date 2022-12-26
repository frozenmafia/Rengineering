package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class FlowKt__DistinctKt$defaultAreEquivalent$1 extends Lambda implements Transition<Object, Object, Boolean> {
    public static final FlowKt__DistinctKt$defaultAreEquivalent$1 INSTANCE = new FlowKt__DistinctKt$defaultAreEquivalent$1();

    FlowKt__DistinctKt$defaultAreEquivalent$1() {
        super(2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Transition
    public final Boolean invoke(Object obj, Object obj2) {
        return Boolean.valueOf(runAnimators.values(obj, obj2));
    }
}
