package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.Transition;
import o.getVolumeAttributes;
import o.isCaptioningEnabled;
/* loaded from: classes6.dex */
public final class Reducible$reduceMap$$inlined$run$lambda$1 extends Lambda implements Transition<B, A, B> {
    final /* synthetic */ Styleable.ChangeBounds $f$inlined;
    final /* synthetic */ ICustomTabsCallback.Default $this_reduceMap$inlined;
    final /* synthetic */ isCaptioningEnabled $this_run;
    final /* synthetic */ getVolumeAttributes this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Reducible$reduceMap$$inlined$run$lambda$1(isCaptioningEnabled iscaptioningenabled, getVolumeAttributes getvolumeattributes, ICustomTabsCallback.Default r3, Styleable.ChangeBounds changeBounds) {
        super(2);
        this.$this_run = iscaptioningenabled;
        this.this$0 = getvolumeattributes;
        this.$this_reduceMap$inlined = r3;
        this.$f$inlined = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [B, java.lang.Object] */
    @Override // o.Transition
    public final B invoke(B b2, A a) {
        return this.$this_run.ah$a(b2, this.$f$inlined.invoke(a));
    }
}
