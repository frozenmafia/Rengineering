package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.excludeObject;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.writeCharArray;
/* loaded from: classes7.dex */
public final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements excludeObject<writeCharArray<? super R>, T, setPatternPath<? super setAnimationMatrix>, Object> {
    final /* synthetic */ Transition<T, setPatternPath<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$mapLatest$1(Transition<? super T, ? super setPatternPath<? super R>, ? extends Object> transition, setPatternPath<? super FlowKt__MergeKt$mapLatest$1> setpatternpath) {
        super(3, setpatternpath);
        this.$transform = transition;
    }

    @Override // o.excludeObject
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return invoke((writeCharArray) obj, (writeCharArray) obj2, setpatternpath);
    }

    public final Object invoke(writeCharArray<? super R> writechararray, T t, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.$transform, setpatternpath);
        flowKt__MergeKt$mapLatest$1.L$0 = writechararray;
        flowKt__MergeKt$mapLatest$1.L$1 = t;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        writeCharArray writechararray;
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            writechararray = (writeCharArray) this.L$0;
            Object obj2 = this.L$1;
            Transition<T, setPatternPath<? super R>, Object> transition = this.$transform;
            this.L$0 = writechararray;
            this.label = 1;
            obj = transition.invoke(obj2, this);
            if (obj == values) {
                return values;
            }
        } else if (i != 1) {
            if (i == 2) {
                ChangeTransform.AnonymousClass1.valueOf(obj);
                return setAnimationMatrix.ag$a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            writechararray = (writeCharArray) this.L$0;
            ChangeTransform.AnonymousClass1.valueOf(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (writechararray.emit(obj, this) == values) {
            return values;
        }
        return setAnimationMatrix.ag$a;
    }
}
