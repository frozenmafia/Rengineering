package kotlin.coroutines.intrinsics;

import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import o.ChangeTransform;
import o.Styleable;
import o.runAnimators;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 extends RestrictedContinuationImpl {
    final /* synthetic */ Styleable.ChangeBounds<setPatternPath<? super T>, Object> $block;
    private int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1(setPatternPath<? super T> setpatternpath, Styleable.ChangeBounds<? super setPatternPath<? super T>, ? extends Object> changeBounds) {
        super(setpatternpath);
        this.$block = changeBounds;
        runAnimators.values((Object) setpatternpath, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            ChangeTransform.AnonymousClass1.valueOf(obj);
            return this.$block.invoke(this);
        } else if (i == 1) {
            this.label = 2;
            ChangeTransform.AnonymousClass1.valueOf(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
