package com.google.android.play.core.ktx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.setNoCommit;
import o.setPatternPath;
import o.syncSwitchView;
/* loaded from: classes7.dex */
public final class AppUpdateManagerKtxKt$requestAppUpdateInfo$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public AppUpdateManagerKtxKt$requestAppUpdateInfo$1(setPatternPath<? super AppUpdateManagerKtxKt$requestAppUpdateInfo$1> setpatternpath) {
        super(setpatternpath);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return syncSwitchView.ag$a((setNoCommit) null, this);
    }
}
