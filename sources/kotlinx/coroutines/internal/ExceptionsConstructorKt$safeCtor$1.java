package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.Result$ah$a;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class ExceptionsConstructorKt$safeCtor$1 extends Lambda implements Styleable.ChangeBounds<Throwable, Throwable> {
    final /* synthetic */ Styleable.ChangeBounds<Throwable, Throwable> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExceptionsConstructorKt$safeCtor$1(Styleable.ChangeBounds<? super Throwable, ? extends Throwable> changeBounds) {
        super(1);
        this.$block = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public final Throwable invoke(Throwable th) {
        Object m1233constructorimpl;
        Styleable.ChangeBounds<Throwable, Throwable> changeBounds = this.$block;
        try {
            Result$ah$a result$ah$a = Result.Companion;
            m1233constructorimpl = Result.m1233constructorimpl(changeBounds.invoke(th));
        } catch (Throwable th2) {
            Result$ah$a result$ah$a2 = Result.Companion;
            m1233constructorimpl = Result.m1233constructorimpl(runAnimators.ag$a(th2, "exception"));
        }
        if (Result.m1239isFailureimpl(m1233constructorimpl)) {
            m1233constructorimpl = null;
        }
        return (Throwable) m1233constructorimpl;
    }
}
