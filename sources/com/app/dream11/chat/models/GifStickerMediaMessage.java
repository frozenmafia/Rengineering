package com.app.dream11.chat.models;

import com.app.dream11.chat.interfaces.IChatUser;
import com.app.dream11.chat.interfaces.IGifStickerMediaMessage;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GifStickerMediaMessage extends FileMessage implements IGifStickerMediaMessage {
    private final int height;
    private final String mediaId;
    private final String mediaType;
    private final String mediaUrl;
    private final int width;

    @Override // com.app.dream11.chat.interfaces.IGifStickerMediaMessage
    public String getMediaId() {
        return this.mediaId;
    }

    @Override // com.app.dream11.chat.interfaces.IGifStickerMediaMessage
    public int getHeight() {
        return this.height;
    }

    @Override // com.app.dream11.chat.interfaces.IGifStickerMediaMessage
    public String getMediaType() {
        return this.mediaType;
    }

    @Override // com.app.dream11.chat.interfaces.IGifStickerMediaMessage
    public String getMediaUrl() {
        return this.mediaUrl;
    }

    @Override // com.app.dream11.chat.interfaces.IGifStickerMediaMessage
    public int getWidth() {
        return this.width;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifStickerMediaMessage(com.sendbird.android.FileMessage fileMessage, String str, IChatUser iChatUser, ReplyMessage replyMessage, String str2, String str3, String str4, int i, int i2) {
        super(fileMessage, str, iChatUser, replyMessage);
        runAnimators.ag$a(fileMessage, "message");
        runAnimators.ag$a(iChatUser, "sender");
        runAnimators.ag$a(str2, "mediaId");
        runAnimators.ag$a(str3, "mediaType");
        runAnimators.ag$a(str4, "mediaUrl");
        this.mediaId = str2;
        this.mediaType = str3;
        this.mediaUrl = str4;
        this.height = i;
        this.width = i2;
    }

    @Override // com.app.dream11.chat.interfaces.IGifStickerMediaMessage
    public float getAspectRatio() {
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return 0.0f;
        }
        return width / height;
    }
}
