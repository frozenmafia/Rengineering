package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes4.dex */
public final /* synthetic */ class sg implements Handler.Callback {
    public final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f1265b;

    public /* synthetic */ sg(bz bzVar, int i) {
        this.f1265b = i;
        this.a = bzVar;
    }

    public /* synthetic */ sg(sl slVar, int i) {
        this.f1265b = i;
        this.a = slVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f1265b == 0) {
            sl.s((sl) this.a, message);
            return true;
        }
        bz.h((bz) this.a);
        return true;
    }
}
