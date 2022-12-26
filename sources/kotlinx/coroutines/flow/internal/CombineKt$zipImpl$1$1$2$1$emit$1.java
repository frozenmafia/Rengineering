package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1;
import o.setPatternPath;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class CombineKt$zipImpl$1$1$2$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1$2$1$emit$1(CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1<? super T> anonymousClass1, setPatternPath<? super CombineKt$zipImpl$1$1$2$1$emit$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
