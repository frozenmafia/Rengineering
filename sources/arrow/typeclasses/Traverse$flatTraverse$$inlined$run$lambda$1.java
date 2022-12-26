package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.IMediaControllerCallback;
import o.Styleable;
import o.playFromSearch;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Traverse$flatTraverse$$inlined$run$lambda$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends F, ? extends ICustomTabsCallback.Default<? extends F, ? extends B>>, ICustomTabsCallback.Default<? extends F, ? extends B>> {
    final /* synthetic */ IMediaControllerCallback.Stub.Proxy $MF$inlined;
    final /* synthetic */ Styleable.ChangeBounds $f$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $this_flatTraverse$inlined;
    final /* synthetic */ playFromSearch this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Traverse$flatTraverse$$inlined$run$lambda$1(playFromSearch playfromsearch, ICustomTabsCallback.Default r2, Styleable.ChangeBounds changeBounds, IMediaControllerCallback.Stub.Proxy proxy) {
        super(1);
        this.this$0 = playfromsearch;
        this.$this_flatTraverse$inlined = r2;
        this.$f$inlined = changeBounds;
        this.$MF$inlined = proxy;
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, B> invoke(ICustomTabsCallback.Default<? extends F, ? extends ICustomTabsCallback.Default<? extends F, ? extends B>> r2) {
        runAnimators.valueOf(r2, "it");
        return this.$MF$inlined.valueOf(r2);
    }
}
