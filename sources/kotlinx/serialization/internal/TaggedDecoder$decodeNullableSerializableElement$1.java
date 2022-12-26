package kotlinx.serialization.internal;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onLmPerformAccessibilityAction;
import o.scheduleGracePeriodEnd;
/* loaded from: classes5.dex */
public final class TaggedDecoder$decodeNullableSerializableElement$1 extends Lambda implements Styleable.ArcMotion<T> {
    final /* synthetic */ scheduleGracePeriodEnd<T> $deserializer;
    final /* synthetic */ T $previousValue;
    final /* synthetic */ onLmPerformAccessibilityAction<Tag> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaggedDecoder$decodeNullableSerializableElement$1(onLmPerformAccessibilityAction<Tag> onlmperformaccessibilityaction, scheduleGracePeriodEnd<T> schedulegraceperiodend, T t) {
        super(0);
        this.this$0 = onlmperformaccessibilityaction;
        this.$deserializer = schedulegraceperiodend;
        this.$previousValue = t;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Void, T] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final T invoke() {
        if (this.this$0.HaptikSDK$c()) {
            return this.this$0.valueOf((scheduleGracePeriodEnd<Object>) this.$deserializer, this.$previousValue);
        }
        return this.this$0.ah$b();
    }
}
