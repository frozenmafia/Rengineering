package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes4.dex */
public final class rv implements wz {
    private final wz a;

    /* renamed from: b  reason: collision with root package name */
    private final List f1254b;

    public rv(wz wzVar, List list) {
        this.a = wzVar;
        this.f1254b = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wz
    public final /* synthetic */ Object a(Uri uri, InputStream inputStream) throws IOException {
        ru ruVar = (ru) this.a.a(uri, inputStream);
        List list = this.f1254b;
        return (list == null || list.isEmpty()) ? ruVar : (ru) ruVar.e(this.f1254b);
    }
}
