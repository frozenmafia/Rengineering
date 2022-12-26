package com.app.dream11.payment.paymentoffers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.BindingAdapter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.applyToWithoutCustom;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ExpandableTextViewLinearLayout extends LinearLayout {
    public static final ExpandableTextViewLinearLayout$ah$a values = new ExpandableTextViewLinearLayout$ah$a(null);
    public Map<Integer, View> toString;

    @BindingAdapter({"expandListViewMore"})
    public static final void setExpandViewMore(ExpandableTextViewLinearLayout expandableTextViewLinearLayout, List<applyToWithoutCustom> list) {
        values.ah$a(expandableTextViewLinearLayout, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextViewLinearLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextViewLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextViewLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.toString = new LinkedHashMap();
    }
}
