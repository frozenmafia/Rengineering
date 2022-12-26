package com.app.dream11.ui.creatteamcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o.ContentResolverCompat;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class CreateTeamComponent extends FrameLayout {
    private ContentResolverCompat ag$a;
    public Map<Integer, View> toString;
    private ViewDataBinding values;

    public final void setCreateTeamVM(ContentResolverCompat contentResolverCompat) {
        if (contentResolverCompat != null) {
            this.ag$a = contentResolverCompat;
            ViewDataBinding viewDataBinding = this.values;
            if (viewDataBinding == null) {
                runAnimators.valueOf("rootBinding");
                viewDataBinding = null;
            }
            viewDataBinding.setVariable(58, this.ag$a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamComponent(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        ViewDataBinding bind = DataBindingUtil.bind(LayoutInflater.from(context).inflate(R.layout.res_0x7f0d0190, (ViewGroup) this, false));
        runAnimators.toString(bind);
        runAnimators.ah$a(bind, "bind(view)!!");
        this.values = bind;
        if (bind == null) {
            runAnimators.valueOf("rootBinding");
            bind = null;
        }
        addView(bind.getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
    }
}
