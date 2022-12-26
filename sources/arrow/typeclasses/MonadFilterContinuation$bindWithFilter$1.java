package arrow.typeclasses;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.addQueueItem;
import o.setPatternPath;
/* loaded from: classes6.dex */
public final class MonadFilterContinuation$bindWithFilter$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ addQueueItem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonadFilterContinuation$bindWithFilter$1(addQueueItem addqueueitem, setPatternPath setpatternpath) {
        super(setpatternpath);
        this.this$0 = addqueueitem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return addQueueItem.values(this.this$0, null, null, this);
    }
}
