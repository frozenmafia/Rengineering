package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.clearNonTransitionAlpha;
import o.invalidateChildInParent;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements Transition<clearNonTransitionAlpha<? super S>, setPatternPath<? super setAnimationMatrix>, Object> {
    final /* synthetic */ Transition<S, T, S> $operation;
    final /* synthetic */ invalidateChildInParent<T> $this_runningReduce;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningReduce$1(invalidateChildInParent<? extends T> invalidatechildinparent, Transition<? super S, ? super T, ? extends S> transition, setPatternPath<? super SequencesKt___SequencesKt$runningReduce$1> setpatternpath) {
        super(2, setpatternpath);
        this.$this_runningReduce = invalidatechildinparent;
        this.$operation = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, setpatternpath);
        sequencesKt___SequencesKt$runningReduce$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    @Override // o.Transition
    public final Object invoke(clearNonTransitionAlpha<? super S> clearnontransitionalpha, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(clearnontransitionalpha, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        clearNonTransitionAlpha clearnontransitionalpha;
        Object next;
        Iterator it;
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            clearnontransitionalpha = (clearNonTransitionAlpha) this.L$0;
            Iterator it2 = this.$this_runningReduce.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                this.L$0 = clearnontransitionalpha;
                this.L$1 = it2;
                this.L$2 = next;
                this.label = 1;
                if (clearnontransitionalpha.ah$a((clearNonTransitionAlpha) next, (setPatternPath<? super setAnimationMatrix>) this) == values) {
                    return values;
                }
                it = it2;
            }
            return setAnimationMatrix.ag$a;
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            next = this.L$2;
            it = (Iterator) this.L$1;
            clearnontransitionalpha = (clearNonTransitionAlpha) this.L$0;
            ChangeTransform.AnonymousClass1.valueOf(obj);
        }
        while (it.hasNext()) {
            next = this.$operation.invoke(next, it.next());
            this.L$0 = clearnontransitionalpha;
            this.L$1 = it;
            this.L$2 = next;
            this.label = 2;
            if (clearnontransitionalpha.ah$a((clearNonTransitionAlpha) next, (setPatternPath<? super setAnimationMatrix>) this) == values) {
                return values;
            }
        }
        return setAnimationMatrix.ag$a;
    }
}
