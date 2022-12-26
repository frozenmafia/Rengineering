package com.app.dream11.chat.models;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface ChatMessageTypes {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String adminCustomTypeMessage = "DREAM11_ADMIN_MESSAGE";
    public static final String contestCardMessage = "CONTEST_CARD_MESSAGE";
    public static final String gifStickerMessage = "GIF_STICKER_MESSAGE";
    public static final String imageFileMessage = "FILE_IMAGE";
    public static final String imageFileReplyMessage = "FILE_IMAGE_REPLY_MESSAGE";
    public static final String teamShareCardMessage = "TEAM_SHARE_CARD_MESSAGE";
    public static final String textMessage = "";
    public static final String textReplyMessage = "REPLY_MESSAGE";

    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String adminCustomTypeMessage = "DREAM11_ADMIN_MESSAGE";
        public static final String contestCardMessage = "CONTEST_CARD_MESSAGE";
        public static final String gifStickerMessage = "GIF_STICKER_MESSAGE";
        public static final String imageFileMessage = "FILE_IMAGE";
        public static final String imageFileReplyMessage = "FILE_IMAGE_REPLY_MESSAGE";
        public static final String teamShareCardMessage = "TEAM_SHARE_CARD_MESSAGE";
        public static final String textMessage = "";
        public static final String textReplyMessage = "REPLY_MESSAGE";

        private Companion() {
        }
    }
}
