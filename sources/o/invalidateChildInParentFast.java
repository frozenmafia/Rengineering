package o;

import java.util.Iterator;
import o.Styleable;
/* loaded from: classes7.dex */
public final class invalidateChildInParentFast<T, R, E> implements invalidateChildInParent<E> {
    private final Styleable.ChangeBounds<T, R> ag$a;
    private final Styleable.ChangeBounds<R, Iterator<E>> valueOf;
    private final invalidateChildInParent<T> values;

    /* JADX WARN: Multi-variable type inference failed */
    public invalidateChildInParentFast(invalidateChildInParent<? extends T> invalidatechildinparent, Styleable.ChangeBounds<? super T, ? extends R> changeBounds, Styleable.ChangeBounds<? super R, ? extends Iterator<? extends E>> changeBounds2) {
        runAnimators.ag$a(invalidatechildinparent, com.apxor.androidsdk.core.ce.Constants.SEQUENCE_NO);
        runAnimators.ag$a(changeBounds, "transformer");
        runAnimators.ag$a(changeBounds2, "iterator");
        this.values = invalidatechildinparent;
        this.ag$a = changeBounds;
        this.valueOf = changeBounds2;
    }

    @Override // o.invalidateChildInParent
    public Iterator<E> iterator() {
        return new invalidateChildInParentFast$ah$a(this);
    }
}
