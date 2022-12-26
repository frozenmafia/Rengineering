package kotlinx.serialization.json.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ChangeTransform;
import o.setAnimationMatrix;
import o.setPatternPath;
import o.startSpecification;
import o.updatePageAccessibilityActions;
/* loaded from: classes5.dex */
public final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ startSpecification this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(startSpecification startspecification, setPatternPath<? super JsonTreeReader$readObject$2> setpatternpath) {
        super(setpatternpath);
        this.this$0 = startspecification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object values;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        values = this.this$0.values((ChangeTransform<setAnimationMatrix, updatePageAccessibilityActions>) null, this);
        return values;
    }
}
