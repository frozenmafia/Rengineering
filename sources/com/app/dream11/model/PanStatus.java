package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class PanStatus implements Serializable {
    private static final long serialVersionUID = 121;
    String comments;
    String isPendingVerification;
    String isRejected;
    String isVerified;

    public String getIsRejected() {
        return this.isRejected;
    }

    public String getIsVerified() {
        return this.isVerified;
    }

    public String getIsPendingVerification() {
        return this.isPendingVerification;
    }

    public String getComments() {
        return this.comments;
    }
}
