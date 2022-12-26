package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$filterNotNull$1 extends SuspendLambda implements Transition<E, setPatternPath<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    ChannelsKt__DeprecatedKt$filterNotNull$1(setPatternPath<? super ChannelsKt__DeprecatedKt$filterNotNull$1> setpatternpath) {
        super(2, setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        ChannelsKt__DeprecatedKt$filterNotNull$1 channelsKt__DeprecatedKt$filterNotNull$1 = new ChannelsKt__DeprecatedKt$filterNotNull$1(setpatternpath);
        channelsKt__DeprecatedKt$filterNotNull$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterNotNull$1;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, setPatternPath<? super Boolean> setpatternpath) {
        return invoke2((ChannelsKt__DeprecatedKt$filterNotNull$1) obj, setpatternpath);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(E e, setPatternPath<? super Boolean> setpatternpath) {
        return ((ChannelsKt__DeprecatedKt$filterNotNull$1) create(e, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean valueOf;
        PatternPathMotion.values();
        if (this.label == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            valueOf = Boolean.valueOf(this.L$0 != null);
            return valueOf;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
