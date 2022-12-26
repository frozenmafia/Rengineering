package com.fancode.video.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setPatternPath;
import o.withResumed$$forInline$ah$a;
/* loaded from: classes4.dex */
public final class ResponseHeadersUtil$ResponseMetaDataList$modifyMyList$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ withResumed$$forInline$ah$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseHeadersUtil$ResponseMetaDataList$modifyMyList$1(withResumed$$forInline$ah$a withresumed__forinline_ah_a, setPatternPath<? super ResponseHeadersUtil$ResponseMetaDataList$modifyMyList$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = withresumed__forinline_ah_a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.toString(null, this);
    }
}
