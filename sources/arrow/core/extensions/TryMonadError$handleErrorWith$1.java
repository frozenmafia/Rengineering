package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.ITrustedWebActivityService;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TryMonadError$handleErrorWith$1 extends Lambda implements Styleable.ChangeBounds<Throwable, ITrustedWebActivityService<? extends A>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TryMonadError$handleErrorWith$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityService<A> invoke(Throwable th) {
        runAnimators.valueOf(th, "it");
        return (ITrustedWebActivityService) ((ICustomTabsCallback.Default) this.$f.invoke(th));
    }
}
