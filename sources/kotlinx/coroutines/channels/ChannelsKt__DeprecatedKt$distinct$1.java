package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$distinct$1 extends SuspendLambda implements Transition<E, setPatternPath<? super E>, Object> {
    /* synthetic */ Object L$0;
    int label;

    ChannelsKt__DeprecatedKt$distinct$1(setPatternPath<? super ChannelsKt__DeprecatedKt$distinct$1> setpatternpath) {
        super(2, setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        ChannelsKt__DeprecatedKt$distinct$1 channelsKt__DeprecatedKt$distinct$1 = new ChannelsKt__DeprecatedKt$distinct$1(setpatternpath);
        channelsKt__DeprecatedKt$distinct$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinct$1;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ChannelsKt__DeprecatedKt$distinct$1) obj, (setPatternPath<? super ChannelsKt__DeprecatedKt$distinct$1>) obj2);
    }

    public final Object invoke(E e, setPatternPath<? super E> setpatternpath) {
        return ((ChannelsKt__DeprecatedKt$distinct$1) create(e, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatternPathMotion.values();
        if (this.label == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            return this.L$0;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
