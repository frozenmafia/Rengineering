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
import o.configureMenuItem;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class FCInfoBannerLayout extends FrameLayout {
    private ViewDataBinding ag$a;
    private configureMenuItem ah$a;
    public Map<Integer, View> values;

    public final void setFcInfoVM(configureMenuItem configuremenuitem) {
        this.ah$a = configuremenuitem;
        ViewDataBinding viewDataBinding = this.ag$a;
        if (viewDataBinding == null) {
            runAnimators.valueOf("rootBinding");
            viewDataBinding = null;
        }
        viewDataBinding.setVariable(110, this.ah$a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCInfoBannerLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.values = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCInfoBannerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        this.values = new LinkedHashMap();
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.res_0x7f0d01c0, this, false);
        runAnimators.ah$a(inflate, "inflate(LayoutInflater.f…info_banner, this, false)");
        this.ag$a = inflate;
        if (inflate == null) {
            runAnimators.valueOf("rootBinding");
            inflate = null;
        }
        addView(inflate.getRoot());
    }
}
