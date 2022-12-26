package com.app.dream11.model;

import o.FragmentManager;
/* loaded from: classes3.dex */
public class FbLoginResult {
    private boolean isCancelled;
    private FragmentManager.AnonymousClass9 loginResult;

    public FbLoginResult(boolean z, FragmentManager.AnonymousClass9 anonymousClass9) {
        this.isCancelled = z;
        this.loginResult = anonymousClass9;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public FragmentManager.AnonymousClass9 getLoginResult() {
        return this.loginResult;
    }
}
