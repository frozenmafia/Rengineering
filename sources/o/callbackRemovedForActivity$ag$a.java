package o;

import java.util.concurrent.CompletableFuture;
/* loaded from: classes5.dex */
final class callbackRemovedForActivity$ag$a<T> extends CompletableFuture<T> {
    private final SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<?> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public callbackRemovedForActivity$ag$a(SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1<?> sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1) {
        this.values = sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (z) {
            this.values.ag$a();
        }
        return super.cancel(z);
    }
}
