package o;

import java.util.Iterator;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ViewOverlayImpl<T> implements invalidateChildInParent<T> {
    private final Styleable.ArcMotion<T> toString;
    private final Styleable.ChangeBounds<T, T> valueOf;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOverlayImpl(Styleable.ArcMotion<? extends T> arcMotion, Styleable.ChangeBounds<? super T, ? extends T> changeBounds) {
        runAnimators.ag$a(arcMotion, "getInitialValue");
        runAnimators.ag$a(changeBounds, "getNextValue");
        this.toString = arcMotion;
        this.valueOf = changeBounds;
    }

    @Override // o.invalidateChildInParent
    public Iterator<T> iterator() {
        return new ViewOverlayImpl$ah$a(this);
    }
}
