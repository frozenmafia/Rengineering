package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.invalidateChildInParent;
import o.runAnimators;
/* loaded from: classes7.dex */
public final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2 extends FunctionReferenceImpl implements Styleable.ChangeBounds<invalidateChildInParent<? extends R>, Iterator<? extends R>> {
    public static final SequencesKt___SequencesKt$flatMapIndexed$2 INSTANCE = new SequencesKt___SequencesKt$flatMapIndexed$2();

    SequencesKt___SequencesKt$flatMapIndexed$2() {
        super(1, invalidateChildInParent.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Styleable.ChangeBounds
    public final Iterator<R> invoke(invalidateChildInParent<? extends R> invalidatechildinparent) {
        runAnimators.ag$a(invalidatechildinparent, "p0");
        return invalidatechildinparent.iterator();
    }
}
