package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.needMirroring;
import o.readDoubleArray;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__ChannelsKt$sendBlocking$1 extends SuspendLambda implements Transition<needMirroring, setPatternPath<? super setAnimationMatrix>, Object> {
    final /* synthetic */ E $element;
    final /* synthetic */ readDoubleArray<E> $this_sendBlocking;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__ChannelsKt$sendBlocking$1(readDoubleArray<? super E> readdoublearray, E e, setPatternPath<? super ChannelsKt__ChannelsKt$sendBlocking$1> setpatternpath) {
        super(2, setpatternpath);
        this.$this_sendBlocking = readdoublearray;
        this.$element = e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        return new ChannelsKt__ChannelsKt$sendBlocking$1(this.$this_sendBlocking, this.$element, setpatternpath);
    }

    @Override // o.Transition
    public final Object invoke(needMirroring needmirroring, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return ((ChannelsKt__ChannelsKt$sendBlocking$1) create(needmirroring, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            this.label = 1;
            if (this.$this_sendBlocking.ah$a(this.$element, this) == values) {
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
