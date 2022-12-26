package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.asBinder;
/* loaded from: classes6.dex */
public final class SequenceK$foldRight$2 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
    final /* synthetic */ SequenceK$foldRight$1 $loop$1;
    final /* synthetic */ ICustomTabsService.Stub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequenceK$foldRight$2(ICustomTabsService.Stub stub, SequenceK$foldRight$1 sequenceK$foldRight$1) {
        super(0);
        this.this$0 = stub;
        this.$loop$1 = sequenceK$foldRight$1;
    }

    @Override // o.Styleable.ArcMotion
    public final asBinder<B> invoke() {
        return this.$loop$1.invoke(this.this$0.iterator());
    }
}
