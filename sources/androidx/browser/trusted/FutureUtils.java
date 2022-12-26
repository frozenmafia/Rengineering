package androidx.browser.trusted;

import androidx.concurrent.futures.ResolvableFuture;
import o.animateAddImpl;
/* loaded from: classes5.dex */
class FutureUtils {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> animateAddImpl<T> immediateFailedFuture(Throwable th) {
        ResolvableFuture create = ResolvableFuture.create();
        create.setException(th);
        return create;
    }

    private FutureUtils() {
    }
}
