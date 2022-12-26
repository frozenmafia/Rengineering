package com.clevertap.android.sdk.inbox;

import androidx.room.FtsOptions;
/* loaded from: classes4.dex */
public enum CTInboxMessageType {
    SimpleMessage(FtsOptions.TOKENIZER_SIMPLE),
    IconMessage("message-icon"),
    CarouselMessage("carousel"),
    CarouselImageMessage("carousel-image");
    
    private final String inboxMessageType;

    CTInboxMessageType(String str) {
        this.inboxMessageType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.inboxMessageType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static CTInboxMessageType fromString(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1799711058:
                if (str.equals("carousel-image")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1332589953:
                if (str.equals("message-icon")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -902286926:
                if (str.equals(FtsOptions.TOKENIZER_SIMPLE)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2908512:
                if (str.equals("carousel")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        return null;
                    }
                    return CarouselMessage;
                }
                return SimpleMessage;
            }
            return IconMessage;
        }
        return CarouselImageMessage;
    }
}
