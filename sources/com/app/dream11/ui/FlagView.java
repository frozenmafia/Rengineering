package com.app.dream11.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.core.service.graphql.api.fragment.MatchData;
import com.app.dream11Pro.R;
import o.AnyRes;
/* loaded from: classes6.dex */
public class FlagView extends RelativeLayout {
    private static ViewDataBinding toString;
    private static int valueOf;

    public static void setCardVmBinder(FlagView flagView, MatchData matchData) {
    }

    public FlagView(Context context) {
        super(context);
    }

    public FlagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnyRes.valueOf.FlagView);
        if (obtainStyledAttributes != null) {
            valueOf = obtainStyledAttributes.getInteger(1, 1);
        }
        ag$a();
    }

    public FlagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ag$a();
    }

    public void ag$a() {
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.res_0x7f0d020e, this, false);
        toString = inflate;
        addView(inflate.getRoot());
    }
}
