package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.readIntArray;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$requireNoNulls$1 extends SuspendLambda implements Transition<E, setPatternPath<? super E>, Object> {
    final /* synthetic */ readIntArray<E> $this_requireNoNulls;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$requireNoNulls$1(readIntArray<? extends E> readintarray, setPatternPath<? super ChannelsKt__DeprecatedKt$requireNoNulls$1> setpatternpath) {
        super(2, setpatternpath);
        this.$this_requireNoNulls = readintarray;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        ChannelsKt__DeprecatedKt$requireNoNulls$1 channelsKt__DeprecatedKt$requireNoNulls$1 = new ChannelsKt__DeprecatedKt$requireNoNulls$1(this.$this_requireNoNulls, setpatternpath);
        channelsKt__DeprecatedKt$requireNoNulls$1.L$0 = obj;
        return channelsKt__DeprecatedKt$requireNoNulls$1;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ChannelsKt__DeprecatedKt$requireNoNulls$1) obj, (setPatternPath<? super ChannelsKt__DeprecatedKt$requireNoNulls$1>) obj2);
    }

    public final Object invoke(E e, setPatternPath<? super E> setpatternpath) {
        return ((ChannelsKt__DeprecatedKt$requireNoNulls$1) create(e, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatternPathMotion.values();
        if (this.label == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            Object obj2 = this.L$0;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
