package com.app.dream11.payment.paymentoffers;

import android.view.LayoutInflater;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11Pro.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import o.applyToWithoutCustom;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ExpandableTextViewLinearLayout$ah$a {
    public /* synthetic */ ExpandableTextViewLinearLayout$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private ExpandableTextViewLinearLayout$ah$a() {
    }

    @BindingAdapter({"expandListViewMore"})
    public final void ah$a(ExpandableTextViewLinearLayout expandableTextViewLinearLayout, List<applyToWithoutCustom> list) {
        runAnimators.ag$a(expandableTextViewLinearLayout, TtmlNode.TAG_LAYOUT);
        expandableTextViewLinearLayout.removeAllViews();
        LayoutInflater from = LayoutInflater.from(expandableTextViewLinearLayout.getContext());
        if (list == null) {
            return;
        }
        for (applyToWithoutCustom applytowithoutcustom : list) {
            ViewDataBinding inflate = DataBindingUtil.inflate(from, R.layout.res_0x7f0d02bc, expandableTextViewLinearLayout, false);
            inflate.getRoot().setId(list.indexOf(applytowithoutcustom));
            inflate.setVariable(263, applytowithoutcustom);
            expandableTextViewLinearLayout.addView(inflate.getRoot());
        }
    }
}
