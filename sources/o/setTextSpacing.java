package o;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class setTextSpacing<T> extends endFakeDrag<T> {
    public setTextSpacing(PropertyValuesHolderUtils propertyValuesHolderUtils, setPatternPath<? super T> setpatternpath) {
        super(propertyValuesHolderUtils, setpatternpath);
    }

    @Override // o.VectorDrawableCompat.VPathRenderer
    public boolean a_(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return values(th);
    }
}
