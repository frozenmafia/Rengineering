package com.app.dream11.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public class DreamPoolRecyclerView extends DreamRecyclerView {
    private static final RecyclerView.RecycledViewPool ah$a = new RecyclerView.RecycledViewPool();

    public DreamPoolRecyclerView(Context context) {
        super(context);
        setRecycledViewPool(ah$a);
        setOverScrollMode(2);
    }

    public DreamPoolRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setRecycledViewPool(ah$a);
        setOverScrollMode(2);
    }

    public DreamPoolRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setRecycledViewPool(ah$a);
        setOverScrollMode(2);
    }
}
