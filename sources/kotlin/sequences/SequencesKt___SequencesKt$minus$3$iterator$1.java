package kotlin.sequences;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$minus$3$iterator$1 extends Lambda implements Styleable.ChangeBounds<T, Boolean> {
    final /* synthetic */ Collection<T> $other;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$minus$3$iterator$1(Collection<? extends T> collection) {
        super(1);
        this.$other = collection;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(T t) {
        return Boolean.valueOf(this.$other.contains(t));
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((SequencesKt___SequencesKt$minus$3$iterator$1) obj);
    }
}
