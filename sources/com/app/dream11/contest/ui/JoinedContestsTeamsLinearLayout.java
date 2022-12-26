package com.app.dream11.contest.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11Pro.R;
import java.util.List;
import o.setRecycleOnMeasureEnabled;
/* loaded from: classes2.dex */
public class JoinedContestsTeamsLinearLayout extends LinearLayout {
    public JoinedContestsTeamsLinearLayout(Context context) {
        super(context);
    }

    public JoinedContestsTeamsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JoinedContestsTeamsLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void values(JoinedContestsTeamsLinearLayout joinedContestsTeamsLinearLayout, List<setRecycleOnMeasureEnabled> list) {
        if (list != null) {
            joinedContestsTeamsLinearLayout.removeAllViews();
            for (setRecycleOnMeasureEnabled setrecycleonmeasureenabled : list) {
                ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(joinedContestsTeamsLinearLayout.getContext()), R.layout.res_0x7f0d01b6, joinedContestsTeamsLinearLayout, false);
                inflate.setVariable(263, setrecycleonmeasureenabled);
                joinedContestsTeamsLinearLayout.addView(inflate.getRoot());
            }
        }
    }
}
