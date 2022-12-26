package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.Result$ah$a;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.createInterpolatorFromXml;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class ProduceKt$awaitClose$4$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ createInterpolatorFromXml<setAnimationMatrix> $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProduceKt$awaitClose$4$1(createInterpolatorFromXml<? super setAnimationMatrix> createinterpolatorfromxml) {
        super(1);
        this.$cont = createinterpolatorfromxml;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Result$ah$a result$ah$a = Result.Companion;
        this.$cont.resumeWith(Result.m1233constructorimpl(setAnimationMatrix.ag$a));
    }
}
