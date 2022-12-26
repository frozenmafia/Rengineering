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
public final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements Transition<clearNonTransitionAlpha<? super R>, setPatternPath<? super setAnimationMatrix>, Object> {
    final /* synthetic */ invalidateChildInParent<T> $this_zipWithNext;
    final /* synthetic */ Transition<T, T, R> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$zipWithNext$2(invalidateChildInParent<? extends T> invalidatechildinparent, Transition<? super T, ? super T, ? extends R> transition, setPatternPath<? super SequencesKt___SequencesKt$zipWithNext$2> setpatternpath) {
        super(2, setpatternpath);
        this.$this_zipWithNext = invalidatechildinparent;
        this.$transform = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, setpatternpath);
        sequencesKt___SequencesKt$zipWithNext$2.L$0 = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    @Override // o.Transition
    public final Object invoke(clearNonTransitionAlpha<? super R> clearnontransitionalpha, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(clearnontransitionalpha, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        clearNonTransitionAlpha clearnontransitionalpha;
        Iterator it;
        Object next;
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            clearnontransitionalpha = (clearNonTransitionAlpha) this.L$0;
            it = this.$this_zipWithNext.iterator();
            if (!it.hasNext()) {
                return setAnimationMatrix.ag$a;
            }
            next = it.next();
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            next = this.L$2;
            it = (Iterator) this.L$1;
            clearnontransitionalpha = (clearNonTransitionAlpha) this.L$0;
            ChangeTransform.AnonymousClass1.valueOf(obj);
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            this.L$0 = clearnontransitionalpha;
            this.L$1 = it;
            this.L$2 = next2;
            this.label = 1;
            if (clearnontransitionalpha.ah$a((clearNonTransitionAlpha) this.$transform.invoke(next, next2), (setPatternPath<? super setAnimationMatrix>) this) == values) {
                return values;
            }
            next = next2;
        }
        return setAnimationMatrix.ag$a;
    }
}
