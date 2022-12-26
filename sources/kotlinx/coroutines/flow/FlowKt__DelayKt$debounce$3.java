package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.registerAnimationCallback;
import o.unscheduleSelf;
/* loaded from: classes7.dex */
public final class FlowKt__DelayKt$debounce$3 extends Lambda implements Styleable.ChangeBounds<T, Long> {
    final /* synthetic */ Styleable.ChangeBounds<T, registerAnimationCallback> $timeout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounce$3(Styleable.ChangeBounds<? super T, registerAnimationCallback> changeBounds) {
        super(1);
        this.$timeout = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Long invoke(Object obj) {
        return invoke((FlowKt__DelayKt$debounce$3) obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ChangeBounds
    public final Long invoke(T t) {
        return Long.valueOf(unscheduleSelf.toString(this.$timeout.invoke(t).ag$a()));
    }
}
