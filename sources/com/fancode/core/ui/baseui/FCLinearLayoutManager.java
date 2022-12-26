package com.fancode.core.ui.baseui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
/* loaded from: classes6.dex */
public class FCLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public FCLinearLayoutManager(Context context) {
        super(context);
    }

    public FCLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
