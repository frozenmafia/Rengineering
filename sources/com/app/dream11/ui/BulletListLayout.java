package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.BR;
import com.app.dream11Pro.R;
import java.util.List;
/* loaded from: classes3.dex */
public class BulletListLayout extends LinearLayout {
    public BulletListLayout(Context context) {
        super(context);
    }

    public BulletListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BulletListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void setList(BulletListLayout bulletListLayout, List<String> list) {
        bulletListLayout.removeAllViews();
        LayoutInflater from = LayoutInflater.from(bulletListLayout.getContext());
        for (String str : list) {
            ViewDataBinding inflate = DataBindingUtil.inflate(from, R.layout.res_0x7f0d017c, bulletListLayout, false);
            inflate.setVariable(BR.text, str);
            bulletListLayout.addView(inflate.getRoot());
        }
    }
}
