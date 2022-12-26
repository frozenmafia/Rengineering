package com.app.dream11.leaguelisting.scorecardcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11Pro.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.calcPathPosition;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ScoresLayout extends LinearLayout {
    public static final valueOf valueOf = new valueOf(null);
    public Map<Integer, View> values;

    @BindingAdapter({"app:scoreItems"})
    public static final void setRows(ScoresLayout scoresLayout, List<calcPathPosition> list) {
        valueOf.ag$a(scoresLayout, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoresLayout(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.values = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoresLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.values = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoresLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.values = new LinkedHashMap();
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }

        @BindingAdapter({"app:scoreItems"})
        public final void ag$a(ScoresLayout scoresLayout, List<calcPathPosition> list) {
            runAnimators.ag$a(scoresLayout, TtmlNode.TAG_LAYOUT);
            scoresLayout.removeAllViews();
            LayoutInflater from = LayoutInflater.from(scoresLayout.getContext());
            if (list == null) {
                return;
            }
            for (calcPathPosition calcpathposition : list) {
                ViewDataBinding inflate = DataBindingUtil.inflate(from, R.layout.res_0x7f0d02bf, scoresLayout, false);
                inflate.getRoot().setId(list.indexOf(calcpathposition));
                inflate.setVariable(263, calcpathposition);
                scoresLayout.addView(inflate.getRoot());
            }
        }
    }
}
