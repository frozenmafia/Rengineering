package com.sendbird.android;

import com.sendbird.android.BaseChannel;
import com.sendbird.android.BaseMessage;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
/* loaded from: classes5.dex */
public final class AdminMessage extends BaseMessage {
    @Override // com.sendbird.android.BaseMessage
    public int getMessageSurvivalSeconds() {
        return -1;
    }

    @Override // com.sendbird.android.BaseMessage
    public String getRequestId() {
        return "";
    }

    @Override // com.sendbird.android.BaseMessage
    public Sender getSender() {
        return null;
    }

    @Override // com.sendbird.android.BaseMessage
    public boolean isResendable() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdminMessage(JsonElement jsonElement) {
        super(jsonElement);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.sendbird.android.BaseMessage
    public JsonElement toJson() {
        JsonObject asJsonObject = super.toJson().getAsJsonObject();
        asJsonObject.addProperty("type", BaseChannel.MessageTypeFilter.ADMIN.value());
        return asJsonObject;
    }

    @Override // com.sendbird.android.BaseMessage
    public BaseMessage.SendingStatus getSendingStatus() {
        return BaseMessage.SendingStatus.NONE;
    }

    @Override // com.sendbird.android.BaseMessage
    public String toString() {
        return super.toString() + "\nAdminMessage{}";
    }
}
