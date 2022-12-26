package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.asBinder;
import o.newSession;
/* loaded from: classes.dex */
public final class ListK$foldRight$2 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
    final /* synthetic */ ListK$foldRight$1 $loop$1;
    final /* synthetic */ newSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListK$foldRight$2(newSession newsession, ListK$foldRight$1 listK$foldRight$1) {
        super(0);
        this.this$0 = newsession;
        this.$loop$1 = listK$foldRight$1;
    }

    @Override // o.Styleable.ArcMotion
    public final asBinder<B> invoke() {
        return this.$loop$1.invoke(this.this$0);
    }
}
