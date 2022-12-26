package kotlin.sequences;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.Transition;
import o.clearNonTransitionAlpha;
import o.invalidateChildInParent;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements Transition<clearNonTransitionAlpha<? super R>, setPatternPath<? super setAnimationMatrix>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ Transition<R, T, R> $operation;
    final /* synthetic */ invalidateChildInParent<T> $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningFold$1(R r, invalidateChildInParent<? extends T> invalidatechildinparent, Transition<? super R, ? super T, ? extends R> transition, setPatternPath<? super SequencesKt___SequencesKt$runningFold$1> setpatternpath) {
        super(2, setpatternpath);
        this.$initial = r;
        this.$this_runningFold = invalidatechildinparent;
        this.$operation = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, setpatternpath);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Override // o.Transition
    public final Object invoke(clearNonTransitionAlpha<? super R> clearnontransitionalpha, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(clearnontransitionalpha, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = o.PatternPathMotion.values()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r6.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r6.L$1
            java.lang.Object r4 = r6.L$0
            o.clearNonTransitionAlpha r4 = (o.clearNonTransitionAlpha) r4
            o.ChangeTransform.AnonymousClass1.valueOf(r7)
            goto L4d
        L1c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L24:
            java.lang.Object r1 = r6.L$0
            o.clearNonTransitionAlpha r1 = (o.clearNonTransitionAlpha) r1
            o.ChangeTransform.AnonymousClass1.valueOf(r7)
            r4 = r1
            goto L45
        L2d:
            o.ChangeTransform.AnonymousClass1.valueOf(r7)
            java.lang.Object r7 = r6.L$0
            o.clearNonTransitionAlpha r7 = (o.clearNonTransitionAlpha) r7
            R r1 = r6.$initial
            r4 = r6
            o.setPatternPath r4 = (o.setPatternPath) r4
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r1 = r7.ah$a(r1, r4)
            if (r1 != r0) goto L44
            return r0
        L44:
            r4 = r7
        L45:
            R r3 = r6.$initial
            o.invalidateChildInParent<T> r7 = r6.$this_runningFold
            java.util.Iterator r1 = r7.iterator()
        L4d:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r1.next()
            o.Transition<R, T, R> r5 = r6.$operation
            java.lang.Object r3 = r5.invoke(r3, r7)
            r7 = r6
            o.setPatternPath r7 = (o.setPatternPath) r7
            r6.L$0 = r4
            r6.L$1 = r3
            r6.L$2 = r1
            r6.label = r2
            java.lang.Object r7 = r4.ah$a(r3, r7)
            if (r7 != r0) goto L4d
            return r0
        L6f:
            o.setAnimationMatrix r7 = o.setAnimationMatrix.ag$a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
