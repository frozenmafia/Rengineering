package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.extraCommand;
import o.onConnectionSuspended;
/* loaded from: classes6.dex */
public final class Function1Semigroup$combine$1 extends Lambda implements Styleable.ChangeBounds<A, B> {
    final /* synthetic */ extraCommand $b;
    final /* synthetic */ extraCommand $this_combine;
    final /* synthetic */ onConnectionSuspended this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function1Semigroup$combine$1(onConnectionSuspended onconnectionsuspended, extraCommand extracommand, extraCommand extracommand2) {
        super(1);
        this.this$0 = onconnectionsuspended;
        this.$this_combine = extracommand;
        this.$b = extracommand2;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [B, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final B invoke(A a) {
        return this.this$0.ag$a().ah$a(ICustomTabsService.valueOf(this.$this_combine, a), ICustomTabsService.valueOf(this.$b, a));
    }
}
