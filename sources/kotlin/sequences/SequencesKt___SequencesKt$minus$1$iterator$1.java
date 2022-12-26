package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$minus$1$iterator$1 extends Lambda implements Styleable.ChangeBounds<T, Boolean> {
    final /* synthetic */ T $element;
    final /* synthetic */ Ref.BooleanRef $removed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$minus$1$iterator$1(Ref.BooleanRef booleanRef, T t) {
        super(1);
        this.$removed = booleanRef;
        this.$element = t;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(T t) {
        boolean z = true;
        if (!this.$removed.element && runAnimators.values(t, this.$element)) {
            this.$removed.element = true;
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((SequencesKt___SequencesKt$minus$1$iterator$1) obj);
    }
}
