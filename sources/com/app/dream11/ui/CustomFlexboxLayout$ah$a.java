package com.app.dream11.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.teampreviewnew.vms.PlayersOfTypeVM;
import com.app.dream11Pro.R;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import java.util.Objects;
import o.getTargetTypes;
import o.runAnimators;
import o.toBundleArray;
/* loaded from: classes3.dex */
public final class CustomFlexboxLayout$ah$a {
    public /* synthetic */ CustomFlexboxLayout$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private CustomFlexboxLayout$ah$a() {
    }

    @BindingAdapter({"app:subItemVms"})
    public final void toString(CustomFlexboxLayout customFlexboxLayout, List<toBundleArray> list) {
        if (customFlexboxLayout == null) {
            return;
        }
        customFlexboxLayout.removeAllViews();
        LayoutInflater from = LayoutInflater.from(customFlexboxLayout.getContext());
        if (list == null) {
            return;
        }
        int i = list.size() % 5 == 0 ? 3 : 4;
        for (toBundleArray tobundlearray : list) {
            ViewDataBinding inflate = DataBindingUtil.inflate(from, R.layout.res_0x7f0d0322, customFlexboxLayout, false);
            inflate.setVariable(263, tobundlearray);
            View root = inflate.getRoot();
            runAnimators.ah$a(root, "viewDataBinding.root");
            if (list.indexOf(tobundlearray) % i == 0) {
                ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                ((FlexboxLayout.LayoutParams) layoutParams).values(true);
            }
            customFlexboxLayout.addView(root);
        }
    }

    @BindingAdapter({"app:rowItems"})
    public final void ah$a(CustomFlexboxLayout customFlexboxLayout, List<PlayersOfTypeVM> list) {
        if (customFlexboxLayout == null) {
            return;
        }
        customFlexboxLayout.removeAllViews();
        LayoutInflater from = LayoutInflater.from(customFlexboxLayout.getContext());
        if (list == null) {
            return;
        }
        for (PlayersOfTypeVM playersOfTypeVM : list) {
            ViewDataBinding inflate = DataBindingUtil.inflate(from, R.layout.res_0x7f0d0326, customFlexboxLayout, false);
            inflate.getRoot().setId(list.indexOf(playersOfTypeVM));
            inflate.setVariable(263, playersOfTypeVM);
            customFlexboxLayout.addView(inflate.getRoot());
        }
    }
}
