package com.app.dream11.leaguelisting.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11Pro.R;
import java.util.List;
import o.approxLength;
import o.getVelocity;
/* loaded from: classes3.dex */
public class WinningBreakupItemLinearLayout extends LinearLayout {
    public WinningBreakupItemLinearLayout(Context context) {
        super(context);
    }

    public WinningBreakupItemLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WinningBreakupItemLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void ah$a(WinningBreakupItemLinearLayout winningBreakupItemLinearLayout, List<approxLength> list) {
        if (list != null) {
            winningBreakupItemLinearLayout.removeAllViews();
            winningBreakupItemLinearLayout.addView(DataBindingUtil.inflate(LayoutInflater.from(winningBreakupItemLinearLayout.getContext()), R.layout.res_0x7f0d02b8, winningBreakupItemLinearLayout, false).getRoot());
            for (approxLength approxlength : list) {
                ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(winningBreakupItemLinearLayout.getContext()), R.layout.res_0x7f0d01c3, winningBreakupItemLinearLayout, false);
                inflate.setVariable(263, approxlength);
                winningBreakupItemLinearLayout.addView(inflate.getRoot());
            }
            if (winningBreakupItemLinearLayout.getChildCount() <= 1 || winningBreakupItemLinearLayout.getChildAt(winningBreakupItemLinearLayout.getChildCount() - 1).findViewById(R.id.seperator) == null) {
                return;
            }
            winningBreakupItemLinearLayout.getChildAt(winningBreakupItemLinearLayout.getChildCount() - 1).findViewById(R.id.seperator).setVisibility(8);
        }
    }

    public static void ah$a(WinningBreakupItemLinearLayout winningBreakupItemLinearLayout, getVelocity getvelocity) {
        if (getvelocity != null) {
            List<approxLength> values = getvelocity.values();
            boolean HaptikSDK$c = getvelocity.HaptikSDK$c();
            if (values != null) {
                winningBreakupItemLinearLayout.removeAllViews();
                LinearLayout linearLayout = new LinearLayout(winningBreakupItemLinearLayout.getContext());
                linearLayout.setOrientation(1);
                ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(linearLayout.getContext()), R.layout.res_0x7f0d02b8, linearLayout, false);
                inflate.setVariable(416, Boolean.valueOf(HaptikSDK$c));
                linearLayout.addView(inflate.getRoot());
                for (approxLength approxlength : values) {
                    ViewDataBinding inflate2 = DataBindingUtil.inflate(LayoutInflater.from(linearLayout.getContext()), R.layout.res_0x7f0d01c3, linearLayout, false);
                    inflate2.setVariable(263, approxlength);
                    linearLayout.addView(inflate2.getRoot());
                }
                if (linearLayout.getChildCount() > 1 && linearLayout.getChildAt(linearLayout.getChildCount() - 1).findViewById(R.id.seperator) != null) {
                    linearLayout.getChildAt(linearLayout.getChildCount() - 1).findViewById(R.id.seperator).setVisibility(8);
                }
                linearLayout.setBackgroundResource(R.drawable.grey_rounder_corner_edge);
                winningBreakupItemLinearLayout.addView(linearLayout);
                if (getvelocity.ag$a() == null || TextUtils.isEmpty(getvelocity.ag$a().ag$a())) {
                    return;
                }
                ViewDataBinding inflate3 = DataBindingUtil.inflate(LayoutInflater.from(winningBreakupItemLinearLayout.getContext()), R.layout.res_0x7f0d009c, winningBreakupItemLinearLayout, false);
                inflate3.setVariable(263, getvelocity.ag$a());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate3.getRoot().getLayoutParams();
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                winningBreakupItemLinearLayout.addView(inflate3.getRoot());
            }
        }
    }
}
