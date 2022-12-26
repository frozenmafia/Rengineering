package com.sendbird.android;
/* loaded from: classes5.dex */
public final class SendBirdException extends Exception {
    protected int code;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isSessionExpirationError(int i) {
        return i == 400302 || i == 400309;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public SendBirdException(String str) {
        super(str);
        setCode(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isSessionExpirationError() {
        return isSessionExpirationError(this.code);
    }

    public SendBirdException(String str, int i) {
        super(str);
        setCode(i);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SendBirdException{code=" + this.code + ", message=" + getMessage() + '}';
    }
}
