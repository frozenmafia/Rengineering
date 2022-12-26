package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.unscheduleSelf;
/* loaded from: classes7.dex */
public final class FlowKt__MigrationKt$delayEach$1 extends SuspendLambda implements Transition<T, setPatternPath<? super setAnimationMatrix>, Object> {
    final /* synthetic */ long $timeMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__MigrationKt$delayEach$1(long j, setPatternPath<? super FlowKt__MigrationKt$delayEach$1> setpatternpath) {
        super(2, setpatternpath);
        this.$timeMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        return new FlowKt__MigrationKt$delayEach$1(this.$timeMillis, setpatternpath);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return invoke2((FlowKt__MigrationKt$delayEach$1) obj, setpatternpath);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(T t, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return ((FlowKt__MigrationKt$delayEach$1) create(t, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            this.label = 1;
            if (unscheduleSelf.valueOf(this.$timeMillis, this) == values) {
                return values;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ChangeTransform.AnonymousClass1.valueOf(obj);
        }
        return setAnimationMatrix.ag$a;
    }
}
