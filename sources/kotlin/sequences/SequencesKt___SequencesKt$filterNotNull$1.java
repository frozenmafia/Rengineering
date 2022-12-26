package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes5.dex */
public final class SequencesKt___SequencesKt$filterNotNull$1 extends Lambda implements Styleable.ChangeBounds<T, Boolean> {
    public static final SequencesKt___SequencesKt$filterNotNull$1 INSTANCE = new SequencesKt___SequencesKt$filterNotNull$1();

    SequencesKt___SequencesKt$filterNotNull$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(T t) {
        return Boolean.valueOf(t == 0);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((SequencesKt___SequencesKt$filterNotNull$1) obj);
    }
}
