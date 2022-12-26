package com.app.dream11.chat.models;

import o.getTargetTypes;
import o.loadFont;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatMessageTypeSupportHelper {
    public static final Companion Companion = new Companion(null);

    public static final boolean isMessageCustomTypeSupportedForAdminMessage(String str) {
        return Companion.isMessageCustomTypeSupportedForAdminMessage(str);
    }

    public static final boolean isMessageCustomTypeSupportedForNotification(String str) {
        return Companion.isMessageCustomTypeSupportedForNotification(str);
    }

    public static final boolean isSupportedFileMessageCustomTypes(String str) {
        return Companion.isSupportedFileMessageCustomTypes(str);
    }

    public static final boolean isSupportedUserMessageCustomTypes(String str) {
        return Companion.isSupportedUserMessageCustomTypes(str);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final boolean isMessageCustomTypeSupportedForNotification(String str) {
            runAnimators.ag$a(str, "type");
            return isSupportedFileMessageCustomTypes(str) || isSupportedUserMessageCustomTypes(str) || isMessageCustomTypeSupportedForAdminMessage(str);
        }

        public final boolean isMessageCustomTypeSupportedForAdminMessage(String str) {
            runAnimators.ag$a(str, "type");
            return runAnimators.values((Object) "DREAM11_ADMIN_MESSAGE", (Object) str);
        }

        public final boolean isSupportedUserMessageCustomTypes(String str) {
            runAnimators.ag$a(str, "customType");
            return loadFont.ah$a((CharSequence) str) || runAnimators.values((Object) "REPLY_MESSAGE", (Object) str) || runAnimators.values((Object) "CONTEST_CARD_MESSAGE", (Object) str) || runAnimators.values((Object) "TEAM_SHARE_CARD_MESSAGE", (Object) str);
        }

        public final boolean isSupportedFileMessageCustomTypes(String str) {
            runAnimators.ag$a(str, "customType");
            return runAnimators.values((Object) "FILE_IMAGE", (Object) str) || runAnimators.values((Object) "FILE_IMAGE_REPLY_MESSAGE", (Object) str) || runAnimators.values((Object) "GIF_STICKER_MESSAGE", (Object) str);
        }
    }
}
