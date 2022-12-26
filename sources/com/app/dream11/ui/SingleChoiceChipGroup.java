package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.chip.ChipGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class SingleChoiceChipGroup extends ChipGroup {
    public Map<Integer, View> toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleChoiceChipGroup(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleChoiceChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleChoiceChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.toString = new LinkedHashMap();
    }
}
