package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeSize$HaptikSDK$c;
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$take$2$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeSize$HaptikSDK$c<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1$emit$1(writeSize$HaptikSDK$c<? super T> writesize_haptiksdk_c, setPatternPath<? super FlowKt__LimitKt$take$2$1$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = writesize_haptiksdk_c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
