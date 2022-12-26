package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__ErrorsKt$retry$1 extends SuspendLambda implements Transition<Throwable, setPatternPath<? super Boolean>, Object> {
    int label;

    FlowKt__ErrorsKt$retry$1(setPatternPath<? super FlowKt__ErrorsKt$retry$1> setpatternpath) {
        super(2, setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        return new FlowKt__ErrorsKt$retry$1(setpatternpath);
    }

    @Override // o.Transition
    public final Object invoke(Throwable th, setPatternPath<? super Boolean> setpatternpath) {
        return ((FlowKt__ErrorsKt$retry$1) create(th, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatternPathMotion.values();
        if (this.label == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            return true;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
