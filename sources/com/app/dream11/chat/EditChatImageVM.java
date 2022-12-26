package com.app.dream11.chat;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import o.runAnimators;
/* loaded from: classes.dex */
public final class EditChatImageVM extends BaseObservable {
    private final ImageEditHandler handler;
    private boolean isFileSendingStarted;
    private String title;
    private String imagePath = "";
    private ConnectionEvent connectionStatus = ConnectionEvent.CONNECTION_STARTED;
    private String typedMessage = "";

    public EditChatImageVM(ImageEditHandler imageEditHandler) {
        this.handler = imageEditHandler;
    }

    public final ImageEditHandler getHandler() {
        return this.handler;
    }

    @Bindable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
        notifyPropertyChanged(500);
        notifyPropertyChanged(BR.showTitle);
    }

    @Bindable
    public final String getImagePath() {
        return this.imagePath;
    }

    public final void setImagePath(String str) {
        runAnimators.ag$a(str, "value");
        this.imagePath = str;
        notifyPropertyChanged(153);
    }

    public final ConnectionEvent getConnectionStatus() {
        return this.connectionStatus;
    }

    public final void setConnectionStatus(ConnectionEvent connectionEvent) {
        runAnimators.ag$a(connectionEvent, "value");
        this.connectionStatus = connectionEvent;
        notifyPropertyChanged(114);
    }

    public final boolean isConnectionEstablished() {
        return this.connectionStatus == ConnectionEvent.CONNECTION_SUCCESS || this.connectionStatus == ConnectionEvent.RECONNECTION_SUCCESS;
    }

    @Bindable
    public final boolean isFileSendingEnabled() {
        return isConnectionEstablished() && !this.isFileSendingStarted;
    }

    @Bindable
    public final boolean getShowTitle() {
        return this.title != null;
    }

    @Bindable
    public final String getTypedMessage() {
        return this.typedMessage;
    }

    public final void setTypedMessage(String str) {
        runAnimators.ag$a(str, "value");
        if (this.typedMessage.equals(str)) {
            return;
        }
        this.typedMessage = str;
        notifyPropertyChanged(511);
    }

    public final boolean isFileSendingStarted() {
        return this.isFileSendingStarted;
    }

    public final void setFileSendingStarted(boolean z) {
        this.isFileSendingStarted = z;
        notifyPropertyChanged(114);
    }
}
