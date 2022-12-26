package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.giphy.sdk.ui.views.GPHActions;
import com.giphy.sdk.ui.views.GPHMediaActionsView;
import com.giphy.sdk.ui.views.GifView;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class Dream11GPHMediaView extends GifView {
    private GPHMediaActionsView ah$a;
    public Map<Integer, View> valueOf;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dream11GPHMediaView(Context context) {
        this(context, null, 0, 6, null);
        runAnimators.ag$a(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dream11GPHMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        runAnimators.ag$a(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dream11GPHMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        this.ah$a = new GPHMediaActionsView(context, new GPHActions[0]);
    }

    public /* synthetic */ Dream11GPHMediaView(Context context, AttributeSet attributeSet, int i, int i2, getTargetTypes gettargettypes) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setMediaActionsView(GPHMediaActionsView gPHMediaActionsView) {
        runAnimators.ag$a(gPHMediaActionsView, "<set-?>");
        this.ah$a = gPHMediaActionsView;
    }

    @Override // com.giphy.sdk.ui.views.GifView
    public void onMediaChanged() {
        this.ah$a.setMedia(getMedia());
    }
}
