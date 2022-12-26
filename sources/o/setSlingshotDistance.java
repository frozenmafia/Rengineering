package o;

import java.util.Objects;
import o.SwipeRefreshLayout;
/* loaded from: classes7.dex */
public abstract class setSlingshotDistance implements SwipeRefreshLayout.AnonymousClass1 {
    protected abstract void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3);

    private static NullPointerException ag$a(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass1
    public final void values(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        Objects.requireNonNull(anonymousClass3, "observer is null");
        try {
            SwipeRefreshLayout.AnonymousClass3 valueOf = endMetadataList.valueOf(this, anonymousClass3);
            Objects.requireNonNull(valueOf, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            ag$a(valueOf);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            FlatBufferBuilder.ah$a(th);
            endMetadataList.valueOf(th);
            throw ag$a(th);
        }
    }
}
