package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.onPlaybackStateChanged;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Contravariant$lift$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends F, ? extends B>, ICustomTabsCallback.Default<? extends F, ? extends A>> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ onPlaybackStateChanged this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Contravariant$lift$1(onPlaybackStateChanged onplaybackstatechanged, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.this$0 = onplaybackstatechanged;
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, A> invoke(ICustomTabsCallback.Default<? extends F, ? extends B> r3) {
        runAnimators.valueOf(r3, "fb");
        return this.this$0.toString(r3, this.$f);
    }
}
