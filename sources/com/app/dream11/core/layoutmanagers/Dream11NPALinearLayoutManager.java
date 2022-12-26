package com.app.dream11.core.layoutmanagers;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
/* loaded from: classes2.dex */
public class Dream11NPALinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public Dream11NPALinearLayoutManager(Context context) {
        super(context);
    }

    public Dream11NPALinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public Dream11NPALinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
