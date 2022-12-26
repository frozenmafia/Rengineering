package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ComonadContinuation$fix$2 extends Lambda implements Styleable.ArcMotion<ICustomTabsCallback.Default<? extends F, ? extends B>> {
    final /* synthetic */ ICustomTabsCallback.Default $this_fix;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComonadContinuation$fix$2(ICustomTabsCallback.Default r1) {
        super(0);
        this.$this_fix = r1;
    }

    @Override // o.Styleable.ArcMotion
    public final ICustomTabsCallback.Default<F, B> invoke() {
        return this.$this_fix;
    }
}
