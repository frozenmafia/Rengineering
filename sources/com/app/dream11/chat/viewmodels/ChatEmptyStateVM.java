package com.app.dream11.chat.viewmodels;

import androidx.databinding.BaseObservable;
import com.app.dream11Pro.R;
import com.google.android.exoplayer2.ExoPlayer;
import o.C0361autoTransition;
import o.createFromXml;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatEmptyStateVM extends BaseObservable {
    private final IChatEmptyStateHandler handler;
    private final createFromXml pagerAnimationVM;

    /* loaded from: classes.dex */
    public interface IChatEmptyStateHandler {
        void onCreateGroupClicked();

        void onStartDMClicked();
    }

    public final IChatEmptyStateHandler getHandler() {
        return this.handler;
    }

    public ChatEmptyStateVM(IChatEmptyStateHandler iChatEmptyStateHandler, createFromXml.toString tostring) {
        runAnimators.ag$a(tostring, "listener");
        this.handler = iChatEmptyStateHandler;
        this.pagerAnimationVM = new createFromXml(R.drawable.white_transparent_box, tostring, "ChatEmptyState.json", true, new C0361autoTransition.values(28.0f, 32.0f, 4, 5000L, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, false));
    }

    public final createFromXml getPagerAnimationVM() {
        return this.pagerAnimationVM;
    }
}
