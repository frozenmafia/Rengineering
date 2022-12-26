package com.fancode.core.respository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C$default$onPause;
import o.setPatternPath;
/* loaded from: classes4.dex */
public final class BaseRepository$refreshAccessToken$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C$default$onPause this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRepository$refreshAccessToken$1(C$default$onPause c$default$onPause, setPatternPath<? super BaseRepository$refreshAccessToken$1> setpatternpath) {
        super(setpatternpath);
        this.this$0 = c$default$onPause;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.ag$a((String) null, this);
    }
}
