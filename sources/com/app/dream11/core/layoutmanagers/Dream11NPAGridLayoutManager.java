package com.app.dream11.core.layoutmanagers;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
/* loaded from: classes2.dex */
public class Dream11NPAGridLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public Dream11NPAGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public Dream11NPAGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public Dream11NPAGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }
}
