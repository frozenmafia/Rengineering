package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.excludeObject;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.writeCharArray;
/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements excludeObject<writeCharArray<? super R>, Object[], setPatternPath<? super setAnimationMatrix>, Object> {
    final /* synthetic */ excludeObject<T1, T2, setPatternPath<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ZipKt$combine$1$1(excludeObject<? super T1, ? super T2, ? super setPatternPath<? super R>, ? extends Object> excludeobject, setPatternPath<? super FlowKt__ZipKt$combine$1$1> setpatternpath) {
        super(3, setpatternpath);
        this.$transform = excludeobject;
    }

    @Override // o.excludeObject
    public final Object invoke(writeCharArray<? super R> writechararray, Object[] objArr, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, setpatternpath);
        flowKt__ZipKt$combine$1$1.L$0 = writechararray;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        writeCharArray writechararray;
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            writechararray = (writeCharArray) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            excludeObject<T1, T2, setPatternPath<? super R>, Object> excludeobject = this.$transform;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.L$0 = writechararray;
            this.label = 1;
            obj = excludeobject.invoke(obj2, obj3, this);
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
