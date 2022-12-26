package com.dream11.analytics;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.hideOnUiThread;
import o.lambda$new$0$androidxcorewidgetContentLoadingProgressBar;
/* loaded from: classes4.dex */
public final class BatchingHelper$database$2 extends Lambda implements Styleable.ArcMotion<lambda$new$0$androidxcorewidgetContentLoadingProgressBar> {
    final /* synthetic */ hideOnUiThread this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchingHelper$database$2(hideOnUiThread hideonuithread) {
        super(0);
        this.this$0 = hideonuithread;
    }

    @Override // o.Styleable.ArcMotion
    public final lambda$new$0$androidxcorewidgetContentLoadingProgressBar invoke() {
        Context context;
        context = this.this$0.ag$a;
        return new lambda$new$0$androidxcorewidgetContentLoadingProgressBar(context);
    }
}
