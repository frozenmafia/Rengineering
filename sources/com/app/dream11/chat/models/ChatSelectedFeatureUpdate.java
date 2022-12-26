package com.app.dream11.chat.models;

import com.app.dream11.core.event.EventType;
import com.app.dream11.model.FeatureUpdate;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatSelectedFeatureUpdate extends FeatureUpdate {
    public static final int CHAT_BACK_RETENTION = 1;
    public static final int CHAT_MINIMISE_RETENTION = 2;
    public static final Companion Companion = new Companion(null);
    private final String channelUrl;
    private final int chatRetentionType;
    private final String chatType;
    private final String profilePic;

    public final String getChannelUrl() {
        return this.channelUrl;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSelectedFeatureUpdate(String str, String str2, String str3, int i) {
        super(EventType.CURRENT_SELECTED_CHAT);
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(str3, "chatType");
        this.channelUrl = str;
        this.profilePic = str2;
        this.chatType = str3;
        this.chatRetentionType = i;
    }

    public final int getChatRetentionType() {
        return this.chatRetentionType;
    }

    public final String getChatType() {
        return this.chatType;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }
}
