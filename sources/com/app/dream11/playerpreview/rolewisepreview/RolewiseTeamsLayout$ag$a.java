package com.app.dream11.playerpreview.rolewisepreview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.BR;
import com.app.dream11.dream11.DreamApplication;
import com.app.dream11Pro.R;
import java.util.List;
import java.util.Objects;
import o.edit;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class RolewiseTeamsLayout$ag$a {
    public /* synthetic */ RolewiseTeamsLayout$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private RolewiseTeamsLayout$ag$a() {
    }

    @BindingAdapter({"app:rolewiseTeams"})
    public final void ag$a(RolewiseTeamsLayout rolewiseTeamsLayout, List<edit.Cdefault> list) {
        Context valueOf;
        if (rolewiseTeamsLayout == null) {
            return;
        }
        rolewiseTeamsLayout.removeAllViews();
        LayoutInflater from = LayoutInflater.from(rolewiseTeamsLayout.getContext());
        valueOf = DreamApplication.valueOf();
        int dimensionPixelSize = valueOf.getResources().getDimensionPixelSize(R.dimen.margin_16dp);
        if (list == null) {
            return;
        }
        for (edit.Cdefault cdefault : list) {
            RolewiseTeamsLayout rolewiseTeamsLayout2 = rolewiseTeamsLayout;
            ViewDataBinding inflate = DataBindingUtil.inflate(from, R.layout.res_0x7f0d0342, rolewiseTeamsLayout2, false);
            inflate.setVariable(BR.vm, cdefault);
            rolewiseTeamsLayout.addView(inflate.getRoot());
            if (list.indexOf(cdefault) < list.size() - 1) {
                View inflate2 = from.inflate(R.layout.res_0x7f0d01ee, (ViewGroup) rolewiseTeamsLayout2, false);
                ViewGroup.LayoutParams layoutParams = inflate2.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = dimensionPixelSize;
                ViewGroup.LayoutParams layoutParams2 = inflate2.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams2).rightMargin = dimensionPixelSize;
                rolewiseTeamsLayout.addView(inflate2);
            }
        }
    }
}
