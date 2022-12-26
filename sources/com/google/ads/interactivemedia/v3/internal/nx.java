package com.google.ads.interactivemedia.v3.internal;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public interface nx {
    int a();

    dz b(byte[] bArr) throws MediaCryptoException;

    Map c(byte[] bArr);

    void d(byte[] bArr);

    void e(byte[] bArr) throws DeniedByServerException;

    void f();

    void g(byte[] bArr, byte[] bArr2);

    void h(nw nwVar);

    void i(byte[] bArr, iv ivVar);

    boolean j(byte[] bArr, String str);

    byte[] k() throws MediaDrmException;

    byte[] l(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    zj m();

    ael n(byte[] bArr, List list, int i, HashMap hashMap) throws NotProvisionedException;
}
