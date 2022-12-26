package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Styleable;
import o.excludeObject;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.writeCharArray;
/* loaded from: classes7.dex */
public final class FlowKt__MigrationKt$onErrorReturn$2 extends SuspendLambda implements excludeObject<writeCharArray<? super T>, Throwable, setPatternPath<? super setAnimationMatrix>, Object> {
    final /* synthetic */ T $fallback;
    final /* synthetic */ Styleable.ChangeBounds<Throwable, Boolean> $predicate;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__MigrationKt$onErrorReturn$2(Styleable.ChangeBounds<? super Throwable, Boolean> changeBounds, T t, setPatternPath<? super FlowKt__MigrationKt$onErrorReturn$2> setpatternpath) {
        super(3, setpatternpath);
        this.$predicate = changeBounds;
        this.$fallback = t;
    }

    @Override // o.excludeObject
    public final Object invoke(writeCharArray<? super T> writechararray, Throwable th, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.$predicate, this.$fallback, setpatternpath);
        flowKt__MigrationKt$onErrorReturn$2.L$0 = writechararray;
        flowKt__MigrationKt$onErrorReturn$2.L$1 = th;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            writeCharArray writechararray = (writeCharArray) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (!this.$predicate.invoke(th).booleanValue()) {
                throw th;
            }
            this.L$0 = null;
            this.label = 1;
            if (writechararray.emit(this.$fallback, this) == values) {
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
