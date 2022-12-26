package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.VersionedParcel;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$withIndex$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ VersionedParcel.AnonymousClass1.getSignupData<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$withIndex$1$1$emit$1(VersionedParcel.AnonymousClass1.getSignupData<? super T> getsignupdata, setPatternPath<? super FlowKt__TransformKt$withIndex$1$1$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = getsignupdata;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
