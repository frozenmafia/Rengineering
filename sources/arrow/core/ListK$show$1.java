package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.pause;
/* loaded from: classes.dex */
public final class ListK$show$1 extends Lambda implements Styleable.ChangeBounds<A, String> {
    final /* synthetic */ pause $SA;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListK$show$1(pause pauseVar) {
        super(1);
        this.$SA = pauseVar;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ String invoke(Object obj) {
        return invoke2((ListK$show$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String invoke2(A a) {
        return this.$SA.toString(a);
    }
}
