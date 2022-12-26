package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.IPostMessageService;
import o.Styleable;
import o.asBinder;
/* loaded from: classes6.dex */
public final class SetK$foldRight$2 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
    final /* synthetic */ SetK$foldRight$1 $loop$1;
    final /* synthetic */ IPostMessageService.Stub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetK$foldRight$2(IPostMessageService.Stub stub, SetK$foldRight$1 setK$foldRight$1) {
        super(0);
        this.this$0 = stub;
        this.$loop$1 = setK$foldRight$1;
    }

    @Override // o.Styleable.ArcMotion
    public final asBinder<B> invoke() {
        return this.$loop$1.invoke(this.this$0);
    }
}
