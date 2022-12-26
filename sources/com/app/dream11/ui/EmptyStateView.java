package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.model.EmptyStateVm;
import com.app.dream11Pro.R;
import o.AnyRes;
import o.createPopup;
/* loaded from: classes3.dex */
public class EmptyStateView extends RelativeLayout {
    private ViewDataBinding valueOf;
    private Drawable values;

    public EmptyStateView(Context context) {
        super(context);
        values(context, null);
    }

    public EmptyStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        values(context, attributeSet);
    }

    public EmptyStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        values(context, attributeSet);
    }

    private void values(Context context, AttributeSet attributeSet) {
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.res_0x7f0d01f3, this, false);
        this.valueOf = inflate;
        addView(inflate.getRoot());
        if (attributeSet != null) {
            toString(context, attributeSet);
        }
    }

    private void toString(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.EmptyStateView);
        try {
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                this.values = drawable;
                valueOf(drawable);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void valueOf(Drawable drawable) {
        createPopup.ag$a((ImageView) this.valueOf.getRoot().findViewById(R.id.img), drawable);
    }

    public void setEmptyState(EmptyStateVm emptyStateVm) {
        if (emptyStateVm == null) {
            this.valueOf.setVariable(66, new EmptyStateVm());
        } else {
            this.valueOf.setVariable(66, emptyStateVm);
        }
    }

    public static void setEmptyStateDrawable(EmptyStateView emptyStateView, Drawable drawable) {
        emptyStateView.valueOf(drawable);
    }

    public static void setData(EmptyStateView emptyStateView, EmptyStateVm emptyStateVm) {
        emptyStateView.setEmptyState(emptyStateVm);
    }
}
