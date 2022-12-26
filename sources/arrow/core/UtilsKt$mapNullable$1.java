package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class UtilsKt$mapNullable$1 extends Lambda implements Styleable.ChangeBounds<T, Boolean> {
    final /* synthetic */ Styleable.ChangeBounds $this_mapNullable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UtilsKt$mapNullable$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$this_mapNullable = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(invoke2((UtilsKt$mapNullable$1) obj));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, boolean] */
    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(T t) {
        if (t != 0) {
            return ((Boolean) this.$this_mapNullable.invoke(t)).booleanValue();
        }
        return null;
    }
}
