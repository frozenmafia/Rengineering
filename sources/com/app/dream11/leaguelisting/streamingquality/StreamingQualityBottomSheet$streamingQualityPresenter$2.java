package com.app.dream11.leaguelisting.streamingquality;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.hasCustomData;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class StreamingQualityBottomSheet$streamingQualityPresenter$2 extends Lambda implements Styleable.ArcMotion<hasCustomData> {
    final /* synthetic */ StreamingQualityBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamingQualityBottomSheet$streamingQualityPresenter$2(StreamingQualityBottomSheet streamingQualityBottomSheet) {
        super(0);
        this.this$0 = streamingQualityBottomSheet;
    }

    @Override // o.Styleable.ArcMotion
    public final hasCustomData invoke() {
        hasCustomData MediaBrowserCompat$ItemCallback = ActionMenuItem.valueOf().MediaBrowserCompat$ItemCallback();
        MediaBrowserCompat$ItemCallback.ah$a(this.this$0.ah$a());
        return MediaBrowserCompat$ItemCallback;
    }
}
