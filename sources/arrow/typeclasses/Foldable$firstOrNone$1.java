package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Foldable$firstOrNone$1 extends Lambda implements Styleable.ChangeBounds<A, Boolean> {
    public static final Foldable$firstOrNone$1 INSTANCE = new Foldable$firstOrNone$1();

    Foldable$firstOrNone$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(A a) {
        return 1;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(invoke2((Foldable$firstOrNone$1) obj));
    }
}
