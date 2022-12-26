package com.dream11.network;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setDrawerListener;
import o.windowBackend$window_release;
/* loaded from: classes4.dex */
public final class NetworkClient$gsonFactory$2 extends Lambda implements Styleable.ArcMotion<windowBackend$window_release> {
    final /* synthetic */ setDrawerListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkClient$gsonFactory$2(setDrawerListener setdrawerlistener) {
        super(0);
        this.this$0 = setdrawerlistener;
    }

    @Override // o.Styleable.ArcMotion
    public final windowBackend$window_release invoke() {
        return windowBackend$window_release.valueOf(this.this$0.ah$a());
    }
}
