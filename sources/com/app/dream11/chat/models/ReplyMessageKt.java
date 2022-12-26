package com.app.dream11.chat.models;

import com.app.dream11.chat.ChatFeatureContants;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ReplyMessageKt {
    public static final String serialize(ReplyMessage replyMessage) {
        runAnimators.ag$a(replyMessage, "<this>");
        return ChatFeatureContants.serializeReplyMessage(replyMessage);
    }
}
