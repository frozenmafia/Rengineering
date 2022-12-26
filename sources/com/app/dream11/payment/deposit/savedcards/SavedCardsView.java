package com.app.dream11.payment.deposit.savedcards;

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
import o.getDesignInformation;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class SavedCardsView extends LinearLayout {
    public static final values ah$a = new values(null);
    public Map<Integer, View> toString;

    @BindingAdapter({"savedCardList"})
    public static final void valueOf(SavedCardsView savedCardsView, List<getDesignInformation> list) {
        ah$a.ag$a(savedCardsView, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedCardsView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedCardsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.toString = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedCardsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.toString = new LinkedHashMap();
    }

    /* loaded from: classes3.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        @BindingAdapter({"savedCardList"})
        public final void ag$a(SavedCardsView savedCardsView, List<getDesignInformation> list) {
            runAnimators.ag$a(savedCardsView, TtmlNode.TAG_LAYOUT);
            if (list == null) {
                return;
            }
            savedCardsView.removeAllViews();
            for (getDesignInformation getdesigninformation : list) {
                ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(savedCardsView.getContext()), R.layout.res_0x7f0d0418, savedCardsView, false);
                inflate.setVariable(66, getdesigninformation);
                savedCardsView.addView(inflate.getRoot());
            }
        }
    }
}
