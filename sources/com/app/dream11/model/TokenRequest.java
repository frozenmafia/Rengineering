package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class TokenRequest extends CommonRequest {
    String refreshToken;

    public TokenRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }
}
