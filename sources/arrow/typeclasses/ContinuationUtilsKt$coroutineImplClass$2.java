package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class ContinuationUtilsKt$coroutineImplClass$2 extends Lambda implements Styleable.ArcMotion<Class<?>> {
    public static final ContinuationUtilsKt$coroutineImplClass$2 INSTANCE = new ContinuationUtilsKt$coroutineImplClass$2();

    ContinuationUtilsKt$coroutineImplClass$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Class<?> invoke() {
        return Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl");
    }
}
