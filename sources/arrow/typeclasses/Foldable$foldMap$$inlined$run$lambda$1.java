package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.Transition;
import o.getRatingType;
import o.onSessionDestroyed;
/* loaded from: classes6.dex */
public final class Foldable$foldMap$$inlined$run$lambda$1 extends Lambda implements Transition<B, A, B> {
    final /* synthetic */ getRatingType $MN$inlined;
    final /* synthetic */ Styleable.ChangeBounds $f$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $this_foldMap$inlined;
    final /* synthetic */ getRatingType $this_run;
    final /* synthetic */ onSessionDestroyed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Foldable$foldMap$$inlined$run$lambda$1(getRatingType getratingtype, onSessionDestroyed onsessiondestroyed, ICustomTabsCallback.Default r3, getRatingType getratingtype2, Styleable.ChangeBounds changeBounds) {
        super(2);
        this.$this_run = getratingtype;
        this.this$0 = onsessiondestroyed;
        this.$this_foldMap$inlined = r3;
        this.$MN$inlined = getratingtype2;
        this.$f$inlined = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [B, java.lang.Object] */
    @Override // o.Transition
    public final B invoke(B b2, A a) {
        return this.$this_run.ah$a(b2, this.$f$inlined.invoke(a));
    }
}
