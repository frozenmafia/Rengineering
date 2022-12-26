package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import kotlin.Result;
import kotlin.Result$ah$a;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$1 extends Lambda implements Styleable.ChangeBounds<Throwable, Throwable> {
    final /* synthetic */ Constructor $constructor$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$1(Constructor constructor) {
        super(1);
        this.$constructor$inlined = constructor;
    }

    @Override // o.Styleable.ChangeBounds
    public final Throwable invoke(Throwable th) {
        Object m1233constructorimpl;
        Object newInstance;
        try {
            Result$ah$a result$ah$a = Result.Companion;
            newInstance = this.$constructor$inlined.newInstance(th.getMessage(), th);
        } catch (Throwable th2) {
            Result$ah$a result$ah$a2 = Result.Companion;
            m1233constructorimpl = Result.m1233constructorimpl(runAnimators.ag$a(th2, "exception"));
        }
        if (newInstance != null) {
            m1233constructorimpl = Result.m1233constructorimpl((Throwable) newInstance);
            if (Result.m1239isFailureimpl(m1233constructorimpl)) {
                m1233constructorimpl = null;
            }
            return (Throwable) m1233constructorimpl;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
    }
}
