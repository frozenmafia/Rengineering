package com.app.dream11.model;
/* loaded from: classes6.dex */
public class VerifyWalletOtpResponse {
    private String accessToken;
    private long expiry;
    private String message;
    private boolean status;

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean z) {
        this.status = z;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public long getExpiry() {
        return this.expiry;
    }

    public void setExpiry(long j) {
        this.expiry = j;
    }
}
