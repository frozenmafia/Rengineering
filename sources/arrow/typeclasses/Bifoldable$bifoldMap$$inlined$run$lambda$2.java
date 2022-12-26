package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.Transition;
import o.getRatingType;
import o.isThumbUp;
/* loaded from: classes6.dex */
public final class Bifoldable$bifoldMap$$inlined$run$lambda$2 extends Lambda implements Transition<C, B, C> {
    final /* synthetic */ getRatingType $MN$inlined;
    final /* synthetic */ Styleable.ChangeBounds $f$inlined;
    final /* synthetic */ Styleable.ChangeBounds $g$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $this_bifoldMap$inlined;
    final /* synthetic */ getRatingType $this_run;
    final /* synthetic */ isThumbUp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Bifoldable$bifoldMap$$inlined$run$lambda$2(getRatingType getratingtype, isThumbUp isthumbup, ICustomTabsCallback.Default r3, getRatingType getratingtype2, Styleable.ChangeBounds changeBounds, Styleable.ChangeBounds changeBounds2) {
        super(2);
        this.$this_run = getratingtype;
        this.this$0 = isthumbup;
        this.$this_bifoldMap$inlined = r3;
        this.$MN$inlined = getratingtype2;
        this.$f$inlined = changeBounds;
        this.$g$inlined = changeBounds2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [C, java.lang.Object] */
    @Override // o.Transition
    public final C invoke(C c, B b2) {
        return this.$this_run.ah$a(c, this.$g$inlined.invoke(b2));
    }
}
