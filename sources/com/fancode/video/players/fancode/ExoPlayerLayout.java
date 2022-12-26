package com.fancode.video.players.fancode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fancode.video.players.fancode.ExoPlayerLayout;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.ui.StyledPlayerView;
/* loaded from: classes4.dex */
public final class ExoPlayerLayout extends FrameLayout {
    private ExoPlayer HaptikSDK$a;
    private boolean HaptikSDK$c;
    private final Runnable ag$a;
    private final ViewGroup.LayoutParams ah$a;
    private StyledPlayerView ah$b;
    private final AspectRatioFrameLayout toString;
    private final Context valueOf;
    private final ExoPlayerLayout$ag$a values;

    public ExoPlayerLayout(Context context) {
        this(context, null);
    }

    public ExoPlayerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExoPlayerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.HaptikSDK$c = true;
        this.ag$a = new Runnable() { // from class: o.withStateAtLeastUnchecked$$forInline
            @Override // java.lang.Runnable
            public final void run() {
                ExoPlayerLayout.this.HaptikSDK$a();
            }
        };
        this.valueOf = context;
        this.ah$a = new ViewGroup.LayoutParams(-1, -1);
        this.values = new ExoPlayerLayout$ag$a(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
        this.toString = aspectRatioFrameLayout;
        aspectRatioFrameLayout.setLayoutParams(layoutParams);
        values();
        addViewInLayout(aspectRatioFrameLayout, 0, layoutParams);
    }

    public void values() {
        StyledPlayerView styledPlayerView = new StyledPlayerView(this.valueOf);
        this.ah$b = styledPlayerView;
        styledPlayerView.setUseController(false);
        this.ah$b.setLayoutParams(this.ah$a);
        if (this.toString.getChildAt(0) != null) {
            this.toString.removeViewAt(0);
        }
        this.toString.addView(this.ah$b, 0, this.ah$a);
    }

    public void invoke() {
        ExoPlayer exoPlayer = this.HaptikSDK$a;
        if (exoPlayer != null) {
            exoPlayer.removeListener(this.values);
            this.HaptikSDK$a.setVideoSurface(null);
            this.HaptikSDK$a.clearVideoSurface();
            this.ah$b.setPlayer(null);
            this.HaptikSDK$c = true;
        }
    }

    public void HaptikSDK$c() {
        if (this.toString.getChildAt(0) != null) {
            this.toString.removeViewAt(0);
        }
        this.ah$b.removeAllViews();
    }

    public void ah$a() {
        ExoPlayer exoPlayer = this.HaptikSDK$a;
        if (exoPlayer == null || !this.HaptikSDK$c) {
            return;
        }
        this.ah$b.setPlayer(exoPlayer);
        this.HaptikSDK$a.addListener(this.values);
        this.HaptikSDK$c = false;
    }

    public void setPlayer(ExoPlayer exoPlayer) {
        invoke();
        this.HaptikSDK$a = exoPlayer;
        ah$a();
    }

    public void setResizeMode(int i) {
        if (this.toString.ah$a() != i) {
            this.toString.setResizeMode(i);
            post(this.ag$a);
        }
    }

    public /* synthetic */ void HaptikSDK$a() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    public void valueOf() {
        this.toString.values();
    }

    public AdViewProvider ag$a() {
        return this.ah$b;
    }
}
