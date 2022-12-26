package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isCaptioningEnabled;
import o.onPostMessage;
/* loaded from: classes6.dex */
public final class AndThenSemigroup$combine$$inlined$run$lambda$1 extends Lambda implements Styleable.ChangeBounds<A, B> {
    final /* synthetic */ onPostMessage $b$inlined;
    final /* synthetic */ onPostMessage $this_combine$inlined;
    final /* synthetic */ isCaptioningEnabled $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndThenSemigroup$combine$$inlined$run$lambda$1(isCaptioningEnabled iscaptioningenabled, onPostMessage onpostmessage, onPostMessage onpostmessage2) {
        super(1);
        this.$this_run = iscaptioningenabled;
        this.$this_combine$inlined = onpostmessage;
        this.$b$inlined = onpostmessage2;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [B, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final B invoke(A a) {
        return this.$this_run.ah$a(this.$this_combine$inlined.invoke(a), this.$b$inlined.invoke(a));
    }
}
