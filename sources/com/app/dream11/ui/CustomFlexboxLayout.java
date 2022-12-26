package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.databinding.BindingAdapter;
import com.app.dream11.teampreviewnew.vms.PlayersOfTypeVM;
import com.google.android.flexbox.FlexboxLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.runAnimators;
import o.toBundleArray;
/* loaded from: classes3.dex */
public final class CustomFlexboxLayout extends FlexboxLayout {
    public static final CustomFlexboxLayout$ah$a ah$a = new CustomFlexboxLayout$ah$a(null);
    public Map<Integer, View> toString;

    @BindingAdapter({"app:subItemVms"})
    public static final void setList(CustomFlexboxLayout customFlexboxLayout, List<toBundleArray> list) {
        ah$a.toString(customFlexboxLayout, list);
    }

    @BindingAdapter({"app:rowItems"})
    public static final void setRows(CustomFlexboxLayout customFlexboxLayout, List<PlayersOfTypeVM> list) {
        ah$a.ah$a(customFlexboxLayout, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFlexboxLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.toString = new LinkedHashMap();
    }
}
