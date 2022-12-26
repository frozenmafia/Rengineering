package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class UtilsKt$constant$1 extends Lambda implements Styleable.ChangeBounds<P1, T> {
    final /* synthetic */ Object $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UtilsKt$constant$1(Object obj) {
        super(1);
        this.$t = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final T invoke(P1 p1) {
        return this.$t;
    }
}
