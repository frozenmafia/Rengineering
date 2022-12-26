package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SortedMapK$ap$1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super B, ? extends C>, ITrustedWebActivityCallback.Default<A, C>> {
    final /* synthetic */ ITrustedWebActivityCallback.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SortedMapK$ap$1(ITrustedWebActivityCallback.Default r1) {
        super(1);
        this.this$0 = r1;
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityCallback.Default<A, C> invoke(Styleable.ChangeBounds<? super B, ? extends C> changeBounds) {
        runAnimators.valueOf(changeBounds, "it");
        return this.this$0.valueOf(changeBounds);
    }
}
