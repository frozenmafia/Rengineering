package com.dream11.network;

import java.io.File;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setDrawerShadow;
import o.setDrawerTitle;
import okhttp3.Cache;
/* loaded from: classes4.dex */
public final class DreamCache$okHttpCache$2 extends Lambda implements Styleable.ArcMotion<Cache> {
    final /* synthetic */ setDrawerTitle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamCache$okHttpCache$2(setDrawerTitle setdrawertitle) {
        super(0);
        this.this$0 = setdrawertitle;
    }

    @Override // o.Styleable.ArcMotion
    public final Cache invoke() {
        String str;
        long j;
        File cacheDir = setDrawerShadow.toString.values().getCacheDir();
        str = this.this$0.values;
        File file = new File(cacheDir, str);
        j = this.this$0.ah$b;
        return new Cache(file, j);
    }
}
