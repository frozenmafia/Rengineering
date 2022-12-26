package com.fancode.livestream.cover;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class LiveStreamCoverComponent extends FrameLayout {
    public Map<Integer, View> ag$a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStreamCoverComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        this.ag$a = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStreamCoverComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        this.ag$a = new LinkedHashMap();
    }
}
