package com.app.dream11.matchcentre;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.app.dream11.matchcentre.MatchCentreFragment;
import com.app.dream11.matchcentre.MatchCentreFragment$ag$a;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class MatchCentreFragment$ag$a extends RecyclerView.OnScrollListener {
    final /* synthetic */ Handler ag$a;
    final /* synthetic */ MatchCentreFragment ah$a;

    public static /* synthetic */ void valueOf(MatchCentreFragment matchCentreFragment) {
        ah$a(matchCentreFragment);
    }

    public static /* synthetic */ void values(MatchCentreFragment matchCentreFragment) {
        toString(matchCentreFragment);
    }

    public MatchCentreFragment$ag$a(Handler handler, MatchCentreFragment matchCentreFragment) {
        this.ag$a = handler;
        this.ah$a = matchCentreFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        runAnimators.ag$a(recyclerView, "recyclerView");
        if (i == 0) {
            this.ag$a.removeCallbacksAndMessages(null);
            Handler handler = this.ag$a;
            final MatchCentreFragment matchCentreFragment = this.ah$a;
            handler.post(new Runnable() { // from class: o.SplineSet.Sort
                @Override // java.lang.Runnable
                public final void run() {
                    MatchCentreFragment$ag$a.valueOf(MatchCentreFragment.this);
                }
            });
        }
        super.onScrollStateChanged(recyclerView, i);
    }

    public static final void ah$a(MatchCentreFragment matchCentreFragment) {
        runAnimators.ag$a(matchCentreFragment, "this$0");
        View values = MatchCentreFragment.values(matchCentreFragment);
        if (values == null) {
            runAnimators.valueOf("streaksTextView");
            values = null;
        }
        values.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        runAnimators.ag$a(recyclerView, "recyclerView");
        if (i2 != 0) {
            MatchCentreFragment.toString(this.ah$a).valueOf(true);
            this.ag$a.removeCallbacksAndMessages(null);
            Handler handler = this.ag$a;
            final MatchCentreFragment matchCentreFragment = this.ah$a;
            handler.post(new Runnable() { // from class: o.SplineSet.TranslationXset
                @Override // java.lang.Runnable
                public final void run() {
                    MatchCentreFragment$ag$a.values(MatchCentreFragment.this);
                }
            });
        }
        super.onScrolled(recyclerView, i, i2);
    }

    public static final void toString(MatchCentreFragment matchCentreFragment) {
        runAnimators.ag$a(matchCentreFragment, "this$0");
        View values = MatchCentreFragment.values(matchCentreFragment);
        if (values == null) {
            runAnimators.valueOf("streaksTextView");
            values = null;
        }
        values.setVisibility(8);
    }
}
