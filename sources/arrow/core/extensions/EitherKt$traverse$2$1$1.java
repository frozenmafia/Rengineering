package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setDefaultImpl;
/* loaded from: classes6.dex */
public final class EitherKt$traverse$2$1$1 extends Lambda implements Styleable.ChangeBounds<C, setDefaultImpl> {
    public static final EitherKt$traverse$2$1$1 INSTANCE = new EitherKt$traverse$2$1$1();

    EitherKt$traverse$2$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setDefaultImpl invoke(Object obj) {
        return invoke2((EitherKt$traverse$2$1$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final setDefaultImpl invoke2(C c) {
        return setDefaultImpl.values.ah$a.ag$a(c);
    }
}
