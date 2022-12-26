package com.app.dream11.teamselection.newcreateteam;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class FCShimmerLayout extends FrameLayout {
    public Map<Integer, View> toString;
    private boolean valueOf;
    private ViewDataBinding values;

    public final void setShimmerViewVisibility(boolean z) {
        this.valueOf = z;
        ViewDataBinding viewDataBinding = this.values;
        if (viewDataBinding == null) {
            runAnimators.valueOf("rootBinding");
            viewDataBinding = null;
        }
        viewDataBinding.setVariable(384, Boolean.valueOf(this.valueOf));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCShimmerLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCShimmerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.res_0x7f0d01c1, this, false);
        runAnimators.ah$a(inflate, "inflate(LayoutInflater.f…ner_shimmer, this, false)");
        this.values = inflate;
        if (inflate == null) {
            runAnimators.valueOf("rootBinding");
            inflate = null;
        }
        addView(inflate.getRoot());
    }
}
