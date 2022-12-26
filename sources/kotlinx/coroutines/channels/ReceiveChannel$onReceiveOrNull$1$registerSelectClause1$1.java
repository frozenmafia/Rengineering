package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.writeSerializable;
/* loaded from: classes7.dex */
public final class ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 extends SuspendLambda implements Transition<writeSerializable<? extends E>, setPatternPath<? super R>, Object> {
    final /* synthetic */ Transition<E, setPatternPath<? super R>, Object> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(Transition<? super E, ? super setPatternPath<? super R>, ? extends Object> transition, setPatternPath<? super ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1> setpatternpath) {
        super(2, setpatternpath);
        this.$block = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 receiveChannel$onReceiveOrNull$1$registerSelectClause1$1 = new ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(this.$block, setpatternpath);
        receiveChannel$onReceiveOrNull$1$registerSelectClause1$1.L$0 = obj;
        return receiveChannel$onReceiveOrNull$1$registerSelectClause1$1;
    }

    @Override // o.Transition
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1243invokeWpGqRn0(((writeSerializable) obj).values(), (setPatternPath) obj2);
    }

    /* renamed from: invoke-WpGqRn0  reason: not valid java name */
    public final Object m1243invokeWpGqRn0(Object obj, setPatternPath<? super R> setpatternpath) {
        return ((ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1) create(writeSerializable.valueOf(obj), setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            Object values2 = ((writeSerializable) this.L$0).values();
            Throwable ah$a = writeSerializable.ah$a(values2);
            if (ah$a != null) {
                throw ah$a;
            }
            Transition<E, setPatternPath<? super R>, Object> transition = this.$block;
            Object values3 = writeSerializable.values(values2);
            this.label = 1;
            obj = transition.invoke(values3, this);
            if (obj == values) {
                return values;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ChangeTransform.AnonymousClass1.valueOf(obj);
        }
        return obj;
    }
}
