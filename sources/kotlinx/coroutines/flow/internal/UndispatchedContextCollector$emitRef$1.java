package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.writeCharArray;
/* loaded from: classes7.dex */
public final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements Transition<T, setPatternPath<? super setAnimationMatrix>, Object> {
    final /* synthetic */ writeCharArray<T> $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(writeCharArray<? super T> writechararray, setPatternPath<? super UndispatchedContextCollector$emitRef$1> setpatternpath) {
        super(2, setpatternpath);
        this.$downstream = writechararray;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, setpatternpath);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return invoke2((UndispatchedContextCollector$emitRef$1) obj, setpatternpath);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(T t, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return ((UndispatchedContextCollector$emitRef$1) create(t, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            Object obj2 = this.L$0;
            this.label = 1;
            if (this.$downstream.emit(obj2, this) == values) {
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
