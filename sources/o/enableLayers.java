package o;
/* loaded from: classes5.dex */
public final class enableLayers implements needMirroring {
    private final PropertyValuesHolderUtils valueOf;

    public enableLayers(PropertyValuesHolderUtils propertyValuesHolderUtils) {
        this.valueOf = propertyValuesHolderUtils;
    }

    @Override // o.needMirroring
    public PropertyValuesHolderUtils getCoroutineContext() {
        return this.valueOf;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
