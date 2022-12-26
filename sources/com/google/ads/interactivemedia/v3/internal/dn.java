package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* loaded from: classes4.dex */
public class dn extends cy {

    /* renamed from: b  reason: collision with root package name */
    public final int f1016b;

    public dn() {
        super(b(2008, 1));
        this.f1016b = 1;
    }

    public static dn a(IOException iOException, db dbVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !atc.p(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        if (i2 == 2007) {
            return new dm(iOException, dbVar);
        }
        return new dn(iOException, i2, i);
    }

    private static int b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public dn(IOException iOException, int i, int i2) {
        super(iOException, b(i, i2));
        this.f1016b = i2;
    }

    public dn(String str, IOException iOException, int i) {
        super(str, iOException, b(i, 1));
        this.f1016b = 1;
    }
}
