package com.app.dream11.teamselection.playerinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import androidx.databinding.DataBindingUtil;
import com.app.dream11Pro.R;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import o.getCompoundPaddingRight;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PlayerStatisticsTableView extends TableLayout {
    private List<Pair<String, String>> ag$a;
    public Map<Integer, View> toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStatisticsTableView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        this.ag$a = new ArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStatisticsTableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.toString = new LinkedHashMap();
        this.ag$a = new ArrayList();
    }

    public final List<Pair<String, String>> valueOf() {
        return this.ag$a;
    }

    public final void setItems(List<Pair<String, String>> list) {
        Pair<String, String> pair;
        int i;
        runAnimators.ag$a(list, "value");
        this.ag$a = list;
        removeAllViews();
        LayoutInflater from = LayoutInflater.from(getContext());
        int i2 = 0;
        while (i2 < this.ag$a.size()) {
            getCompoundPaddingRight getcompoundpaddingright = (getCompoundPaddingRight) DataBindingUtil.inflate(from, R.layout.res_0x7f0d02be, this, false);
            int i3 = i2 + 1;
            getcompoundpaddingright.toString(valueOf().get(i2));
            if (i3 < valueOf().size()) {
                i = i3 + 1;
                pair = valueOf().get(i3);
            } else {
                pair = null;
                i = i3;
            }
            getcompoundpaddingright.ag$a(pair);
            if (getcompoundpaddingright.valueOf() == null) {
                LinearLayout linearLayout = getcompoundpaddingright.ah$a;
                ViewGroup.LayoutParams layoutParams = getcompoundpaddingright.ah$a.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = (int) getContext().getResources().getDimension(R.dimen.margin_0dp);
                layoutParams2.bottomMargin = (int) getContext().getResources().getDimension(R.dimen.margin_0dp);
                linearLayout.setLayoutParams(layoutParams2);
                getcompoundpaddingright.ah$a.removeAllViews();
            }
            if (i > 2) {
                LinearLayout linearLayout2 = getcompoundpaddingright.ag$a;
                ViewGroup.LayoutParams layoutParams3 = getcompoundpaddingright.ag$a.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin = (int) getContext().getResources().getDimension(R.dimen.margin_0dp);
                linearLayout2.setLayoutParams(layoutParams4);
                LinearLayout linearLayout3 = getcompoundpaddingright.ah$a;
                ViewGroup.LayoutParams layoutParams5 = getcompoundpaddingright.ah$a.getLayoutParams();
                Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.topMargin = (int) getContext().getResources().getDimension(R.dimen.margin_0dp);
                linearLayout3.setLayoutParams(layoutParams6);
            }
            if (i >= valueOf().size()) {
                LinearLayout linearLayout4 = getcompoundpaddingright.ag$a;
                ViewGroup.LayoutParams layoutParams7 = getcompoundpaddingright.ag$a.getLayoutParams();
                Objects.requireNonNull(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                layoutParams8.bottomMargin = (int) getContext().getResources().getDimension(R.dimen.margin_0dp);
                linearLayout4.setLayoutParams(layoutParams8);
                LinearLayout linearLayout5 = getcompoundpaddingright.ah$a;
                ViewGroup.LayoutParams layoutParams9 = getcompoundpaddingright.ah$a.getLayoutParams();
                Objects.requireNonNull(layoutParams9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
                layoutParams10.bottomMargin = (int) getContext().getResources().getDimension(R.dimen.margin_0dp);
                linearLayout5.setLayoutParams(layoutParams10);
            }
            addView(getcompoundpaddingright.getRoot());
            getcompoundpaddingright.executePendingBindings();
            i2 = i;
        }
    }
}
