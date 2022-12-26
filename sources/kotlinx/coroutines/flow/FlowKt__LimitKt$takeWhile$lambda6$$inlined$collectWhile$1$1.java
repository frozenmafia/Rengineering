package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeSize$HaptikSDK$a;
/* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeSize$HaptikSDK$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1$1(writeSize$HaptikSDK$a writesize_haptiksdk_a, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = writesize_haptiksdk_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
