package com.appsamurai.storyly.exoplayer2.decoder;
/* loaded from: classes6.dex */
public class CryptoException extends Exception {
    public final int errorCode;

    public CryptoException(int i, String str) {
        super(str);
        this.errorCode = i;
    }
}
