package com.sendbird.android.handlers;

import com.sendbird.android.SendBirdException;
/* loaded from: classes.dex */
public abstract class SessionHandler {
    public abstract void onSessionClosed();

    public void onSessionError(SendBirdException sendBirdException) {
    }

    public void onSessionExpired() {
    }

    public void onSessionRefreshed() {
    }

    public abstract void onSessionTokenRequired(SessionTokenRequester sessionTokenRequester);
}
