package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.setAnimationMatrix;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class ChannelsKt__DeprecatedKt$filterNot$1 extends SuspendLambda implements Transition<E, setPatternPath<? super Boolean>, Object> {
    final /* synthetic */ Transition<E, setPatternPath<? super Boolean>, Object> $predicate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$filterNot$1(Transition<? super E, ? super setPatternPath<? super Boolean>, ? extends Object> transition, setPatternPath<? super ChannelsKt__DeprecatedKt$filterNot$1> setpatternpath) {
        super(2, setpatternpath);
        this.$predicate = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        ChannelsKt__DeprecatedKt$filterNot$1 channelsKt__DeprecatedKt$filterNot$1 = new ChannelsKt__DeprecatedKt$filterNot$1(this.$predicate, setpatternpath);
        channelsKt__DeprecatedKt$filterNot$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterNot$1;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, setPatternPath<? super Boolean> setpatternpath) {
        return invoke2((ChannelsKt__DeprecatedKt$filterNot$1) obj, setpatternpath);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(E e, setPatternPath<? super Boolean> setpatternpath) {
        return ((ChannelsKt__DeprecatedKt$filterNot$1) create(e, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean valueOf;
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            Object obj2 = this.L$0;
            Transition<E, setPatternPath<? super Boolean>, Object> transition = this.$predicate;
            this.label = 1;
            obj = transition.invoke(obj2, this);
            if (obj == values) {
                return values;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ChangeTransform.AnonymousClass1.valueOf(obj);
        }
        valueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
        return valueOf;
    }
}
