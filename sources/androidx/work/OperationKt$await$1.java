package androidx.work;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class OperationKt$await$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OperationKt$await$1(setPatternPath<? super OperationKt$await$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OperationKt.await(null, this);
    }
}
