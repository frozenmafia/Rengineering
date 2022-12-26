package com.app.dream11.teamselection.newcreateteam;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11Pro.R;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getAttributionTag;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ComponentFilterItem extends FrameLayout {
    private final ViewDataBinding ah$a;
    public Map<Integer, View> valueOf;
    private getAttributionTag values;

    public final void setFilterVm(getAttributionTag getattributiontag) {
        this.values = getattributiontag;
        this.ah$a.setVariable(115, getattributiontag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentFilterItem(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.res_0x7f0d0195, this, false);
        this.ah$a = inflate;
        addView(inflate.getRoot());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentFilterItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.valueOf = new LinkedHashMap();
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.res_0x7f0d0195, this, false);
        this.ah$a = inflate;
        addView(inflate.getRoot());
    }
}
