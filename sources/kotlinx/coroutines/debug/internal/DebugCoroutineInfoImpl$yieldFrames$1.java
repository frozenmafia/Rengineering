package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.readSize;
import o.setPatternPath;
/* loaded from: classes7.dex */
public final class DebugCoroutineInfoImpl$yieldFrames$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ readSize this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$yieldFrames$1(readSize readsize, setPatternPath<? super DebugCoroutineInfoImpl$yieldFrames$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = readsize;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readsize;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readsize = this.this$0.toString(null, null, this);
        return readsize;
    }
}
