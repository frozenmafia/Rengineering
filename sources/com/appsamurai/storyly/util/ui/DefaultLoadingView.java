package com.appsamurai.storyly.util.ui;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.appsamurai.storyly.external.StorylyLoadingView;
import com.appsamurai.storyly.util.ui.DefaultLoadingView;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class DefaultLoadingView extends StorylyLoadingView {
    private final Handler ah$a;
    private final View valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultLoadingView(View view, Context context) {
        super(context, null, 0, 6, null);
        runAnimators.ag$a(view, "loadingView");
        runAnimators.ag$a(context, "context");
        this.valueOf = view;
        this.ah$a = new Handler(context.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ag$a(DefaultLoadingView defaultLoadingView) {
        runAnimators.ag$a(defaultLoadingView, "this$0");
        defaultLoadingView.valueOf.setVisibility(0);
    }

    @Override // com.appsamurai.storyly.external.StorylyLoadingView
    public void ah$a() {
        this.ah$a.removeCallbacksAndMessages(null);
        this.valueOf.setVisibility(4);
    }

    @Override // com.appsamurai.storyly.external.StorylyLoadingView
    public void values() {
        this.ah$a.postDelayed(new Runnable() { // from class: o.combineMeasuredStates
            @Override // java.lang.Runnable
            public final void run() {
                DefaultLoadingView.ag$a(DefaultLoadingView.this);
            }
        }, 500L);
    }
}
