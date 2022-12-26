package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.postMessage;
/* loaded from: classes6.dex */
public final class IorMonad$flatMap$1 extends Lambda implements Styleable.ChangeBounds<A, postMessage<? extends L, ? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IorMonad$flatMap$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((IorMonad$flatMap$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final postMessage<L, B> invoke(A a) {
        return (postMessage) ((ICustomTabsCallback.Default) this.$f.invoke(a));
    }
}
