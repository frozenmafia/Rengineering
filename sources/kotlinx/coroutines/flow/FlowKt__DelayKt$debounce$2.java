package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes7.dex */
public final class FlowKt__DelayKt$debounce$2 extends Lambda implements Styleable.ChangeBounds<T, Long> {
    final /* synthetic */ long $timeoutMillis;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$debounce$2(long j) {
        super(1);
        this.$timeoutMillis = j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ChangeBounds
    public final Long invoke(T t) {
        return Long.valueOf(this.$timeoutMillis);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Long invoke(Object obj) {
        return invoke((FlowKt__DelayKt$debounce$2) obj);
    }
}
