package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class IFSCRequest extends CommonRequest {
    private String ifsccode;

    public IFSCRequest(String str, onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.ifsccode = "";
        this.ifsccode = str;
    }
}
