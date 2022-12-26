package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ChangeTransform;
import o.PatternPathMotion;
import o.Transition;
import o.readCharSequence;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.setViewPagerObserver;
/* loaded from: classes7.dex */
public final class ChannelFlow$collectToFun$1 extends SuspendLambda implements Transition<readCharSequence<? super T>, setPatternPath<? super setAnimationMatrix>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ setViewPagerObserver<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(setViewPagerObserver<T> setviewpagerobserver, setPatternPath<? super ChannelFlow$collectToFun$1> setpatternpath) {
        super(2, setpatternpath);
        this.this$0 = setviewpagerobserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final setPatternPath<setAnimationMatrix> create(Object obj, setPatternPath<?> setpatternpath) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.this$0, setpatternpath);
        channelFlow$collectToFun$1.L$0 = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // o.Transition
    public final Object invoke(readCharSequence<? super T> readcharsequence, setPatternPath<? super setAnimationMatrix> setpatternpath) {
        return ((ChannelFlow$collectToFun$1) create(readcharsequence, setpatternpath)).invokeSuspend(setAnimationMatrix.ag$a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values = PatternPathMotion.values();
        int i = this.label;
        if (i == 0) {
            ChangeTransform.AnonymousClass1.valueOf(obj);
            setViewPagerObserver<T> setviewpagerobserver = this.this$0;
            this.label = 1;
            if (setviewpagerobserver.ag$a((readCharSequence) this.L$0, this) == values) {
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
