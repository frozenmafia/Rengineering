package com.app.dream11.myprofile.profilerevamp.careerstatsdrilldownview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11Pro.R;
import com.apxor.androidsdk.core.ce.Constants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.Suggested;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ContestStatsView extends LinearLayout {
    public static final toString ag$a = new toString(null);
    public Map<Integer, View> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestStatsView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestStatsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.valueOf = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestStatsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.valueOf = new LinkedHashMap();
    }

    /* loaded from: classes3.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        @BindingAdapter({"contestStatsItemList"})
        public final void values(ContestStatsView contestStatsView, List<Suggested> list) {
            runAnimators.ag$a(contestStatsView, TtmlNode.TAG_LAYOUT);
            if (list == null) {
                return;
            }
            contestStatsView.removeAllViews();
            for (Suggested suggested : list) {
                ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(contestStatsView.getContext()), R.layout.res_0x7f0d01bd, contestStatsView, false);
                inflate.setVariable(21, suggested);
                contestStatsView.addView(inflate.getRoot());
            }
        }
    }
}
