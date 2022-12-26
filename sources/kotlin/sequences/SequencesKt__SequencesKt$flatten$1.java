package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.invalidateChildInParent;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class SequencesKt__SequencesKt$flatten$1 extends Lambda implements Styleable.ChangeBounds<invalidateChildInParent<? extends T>, Iterator<? extends T>> {
    public static final SequencesKt__SequencesKt$flatten$1 INSTANCE = new SequencesKt__SequencesKt$flatten$1();

    SequencesKt__SequencesKt$flatten$1() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Styleable.ChangeBounds
    public final Iterator<T> invoke(invalidateChildInParent<? extends T> invalidatechildinparent) {
        runAnimators.ag$a(invalidatechildinparent, "it");
        return invalidatechildinparent.iterator();
    }
}
