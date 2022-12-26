package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.getItemPosition;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.writeCharArray;
/* loaded from: classes7.dex */
public final class ChannelFlowOperator$collectWithContextUndispatched$2 extends SuspendLambda implements Transition<writeCharArray<? super T>, setPatternPath<? super setAnimationMatrix>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ getItemPosition<S, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(getItemPosition<S, T> getitemposition, setPatternPath<? super ChannelFlowOperator$collectWithContextUndispatched$2> setpatternpath) {
        super(2, setpatternpath);
        this.this$0 = getitemposition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.this$0, setpatternpath);
        channelFlowOperator$collectWithContextUndispatched$2.L$0 = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    @Override // o.Transition
    public final Object invoke(writeCharArray<? super T> writechararray, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create(writechararray, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            getItemPosition<S, T> getitemposition = this.this$0;
            this.label = 1;
            if (getitemposition.values((writeCharArray) this.L$0, this) == values) {
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
