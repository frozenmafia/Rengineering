package com.app.dream11.teamselection.newcreateteam;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.BR;
import com.app.dream11Pro.R;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getSystemServiceName;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class NewComponentSortItem extends FrameLayout {
    private getSystemServiceName ah$a;
    public Map<Integer, View> toString;
    private final ViewDataBinding valueOf;
    private getSystemServiceName values;

    private final void ah$a(getSystemServiceName getsystemservicename) {
        this.ah$a = getsystemservicename;
        this.valueOf.setVariable(64, getsystemservicename);
    }

    private final void ag$a(getSystemServiceName getsystemservicename) {
        this.values = getsystemservicename;
        this.valueOf.setVariable(BR.sortItem, getsystemservicename);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewComponentSortItem(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.res_0x7f0d019d, this, false);
        runAnimators.ah$a(inflate, "inflate<ViewDataBinding>…w_sort_item, this, false)");
        this.valueOf = inflate;
        addView(inflate.getRoot());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewComponentSortItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.toString = new LinkedHashMap();
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.res_0x7f0d019d, this, false);
        runAnimators.ah$a(inflate, "inflate<ViewDataBinding>…w_sort_item, this, false)");
        this.valueOf = inflate;
        addView(inflate.getRoot());
    }

    public final void setVm(getSystemServiceName getsystemservicename) {
        ag$a(getsystemservicename);
    }

    public final void setCurrentSelectedSortVm(getSystemServiceName getsystemservicename) {
        ah$a(getsystemservicename);
    }
}
