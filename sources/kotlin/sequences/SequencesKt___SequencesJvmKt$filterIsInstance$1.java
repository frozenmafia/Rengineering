package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesJvmKt$filterIsInstance$1 extends Lambda implements Styleable.ChangeBounds<Object, Boolean> {
    final /* synthetic */ Class<R> $klass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesJvmKt$filterIsInstance$1(Class<R> cls) {
        super(1);
        this.$klass = cls;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(this.$klass.isInstance(obj));
    }
}
