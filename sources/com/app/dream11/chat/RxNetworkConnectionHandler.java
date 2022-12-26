package com.app.dream11.chat;

import com.sendbird.android.SendBird;
import o.compareStrings;
import o.runAnimators;
/* loaded from: classes.dex */
public final class RxNetworkConnectionHandler implements SendBird.ConnectionHandler {
    private compareStrings<ConnectionEvent> subject;

    public RxNetworkConnectionHandler() {
        compareStrings<ConnectionEvent> HaptikSDK$c = compareStrings.HaptikSDK$c();
        runAnimators.ah$a(HaptikSDK$c, "create<ConnectionEvent>()");
        this.subject = HaptikSDK$c;
    }

    public final compareStrings<ConnectionEvent> getSubject() {
        return this.subject;
    }

    public final void emitEvent(ConnectionEvent connectionEvent) {
        runAnimators.ag$a(connectionEvent, "connectionEvent");
        this.subject.onNext(connectionEvent);
    }

    public final void notifyConnectionStart() {
        emitEvent(ConnectionEvent.CONNECTION_STARTED);
    }

    @Override // com.sendbird.android.SendBird.ConnectionHandler
    public void onReconnectStarted() {
        emitEvent(ConnectionEvent.RECONNECTION_STARTED);
    }

    @Override // com.sendbird.android.SendBird.ConnectionHandler
    public void onReconnectSucceeded() {
        emitEvent(ConnectionEvent.RECONNECTION_SUCCESS);
    }

    @Override // com.sendbird.android.SendBird.ConnectionHandler
    public void onReconnectFailed() {
        emitEvent(ConnectionEvent.CONNECTION_ERROR);
    }
}
