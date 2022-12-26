package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class SequencesKt__SequencesKt$flatten$2 extends Lambda implements Styleable.ChangeBounds<Iterable<? extends T>, Iterator<? extends T>> {
    public static final SequencesKt__SequencesKt$flatten$2 INSTANCE = new SequencesKt__SequencesKt$flatten$2();

    SequencesKt__SequencesKt$flatten$2() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Styleable.ChangeBounds
    public final Iterator<T> invoke(Iterable<? extends T> iterable) {
        runAnimators.ag$a(iterable, "it");
        return iterable.iterator();
    }
}
