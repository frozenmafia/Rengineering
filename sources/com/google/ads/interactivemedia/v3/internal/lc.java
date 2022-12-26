package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/* loaded from: classes4.dex */
final class lc implements wz {
    private lc() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ lc(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wz
    public final /* synthetic */ Object a(Uri uri, InputStream inputStream) throws IOException {
        return Long.valueOf(cp.u(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }
}
