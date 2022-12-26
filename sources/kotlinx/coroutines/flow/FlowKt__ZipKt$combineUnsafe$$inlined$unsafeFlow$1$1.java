package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.writeStrongBinder$HaptikSDK$b;
/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ writeStrongBinder$HaptikSDK$b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1$1(writeStrongBinder$HaptikSDK$b writestrongbinder_haptiksdk_b, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = writestrongbinder_haptiksdk_b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
