package o;

import kotlin.coroutines.EmptyCoroutineContext;
/* loaded from: classes5.dex */
public final class updateLocalMatrix implements needMirroring {
    public static final updateLocalMatrix values = new updateLocalMatrix();

    private updateLocalMatrix() {
    }

    @Override // o.needMirroring
    public PropertyValuesHolderUtils getCoroutineContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}
