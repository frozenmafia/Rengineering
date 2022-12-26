package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeFloat$HaptikSDK$a;
/* loaded from: classes7.dex */
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ writeFloat$HaptikSDK$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1(writeFloat$HaptikSDK$a writefloat_haptiksdk_a, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = writefloat_haptiksdk_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
