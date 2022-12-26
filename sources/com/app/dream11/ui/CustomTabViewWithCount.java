package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.BR;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getQ;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class CustomTabViewWithCount extends FrameLayout {
    private getQ ag$a;
    private int ah$a;
    private ViewDataBinding valueOf;
    public Map<Integer, View> values;

    public final getQ ag$a() {
        return this.ag$a;
    }

    public final void setTabVM(getQ getq) {
        if (getq != null) {
            this.ag$a = getq;
            ViewDataBinding viewDataBinding = this.valueOf;
            if (viewDataBinding != null) {
                viewDataBinding.setVariable(BR.tabVM, getq);
            }
            ViewDataBinding viewDataBinding2 = this.valueOf;
            if (viewDataBinding2 == null) {
                return;
            }
            viewDataBinding2.executePendingBindings();
        }
    }

    public final int values() {
        return this.ah$a;
    }

    public final void setTabSelector(int i) {
        this.ah$a = i;
        ViewDataBinding viewDataBinding = this.valueOf;
        if (viewDataBinding == null) {
            return;
        }
        viewDataBinding.setVariable(377, Integer.valueOf(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabViewWithCount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        this.values = new LinkedHashMap();
        this.ah$a = R.color.res_0x7f060597;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabViewWithCount(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        this.values = new LinkedHashMap();
        this.ah$a = R.color.res_0x7f060597;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabViewWithCount(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.values = new LinkedHashMap();
        this.ah$a = R.color.res_0x7f060597;
        ViewDataBinding bind = DataBindingUtil.bind(LayoutInflater.from(context).inflate(R.layout.res_0x7f0d01a9, (ViewGroup) this, false));
        runAnimators.toString(bind);
        this.valueOf = bind;
        runAnimators.toString(bind);
        addView(bind.getRoot());
    }

    public final void setSelector(int i) {
        ((TextView) findViewById(R.id.tvTabText)).setTextColor(ContextCompat.getColorStateList(getContext(), i));
        ((TextView) findViewById(R.id.tvTabCountValue)).setTextColor(ContextCompat.getColorStateList(getContext(), i));
    }
}
