package androidx.lifecycle;

import java.io.Closeable;
import o.PropertyValuesHolderUtils;
import o.needMirroring;
import o.runAnimators;
import o.toPath;
/* loaded from: classes6.dex */
public final class CloseableCoroutineScope implements Closeable, needMirroring {
    private final PropertyValuesHolderUtils coroutineContext;

    public CloseableCoroutineScope(PropertyValuesHolderUtils propertyValuesHolderUtils) {
        runAnimators.ag$a(propertyValuesHolderUtils, "context");
        this.coroutineContext = propertyValuesHolderUtils;
    }

    @Override // o.needMirroring
    public PropertyValuesHolderUtils getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        toPath.toString(getCoroutineContext(), null, 1, null);
    }
}
