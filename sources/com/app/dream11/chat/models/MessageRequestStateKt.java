package com.app.dream11.chat.models;

import com.sendbird.android.BaseMessage;
import com.sendbird.android.FileMessage;
import com.sendbird.android.UserMessage;
import kotlin.NoWhenBranchMatchedException;
import o.runAnimators;
/* loaded from: classes.dex */
public final class MessageRequestStateKt {

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UserMessage.RequestState.values().length];
            iArr[UserMessage.RequestState.SUCCEEDED.ordinal()] = 1;
            iArr[UserMessage.RequestState.PENDING.ordinal()] = 2;
            iArr[UserMessage.RequestState.FAILED.ordinal()] = 3;
            iArr[UserMessage.RequestState.NONE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FileMessage.RequestState.values().length];
            iArr2[FileMessage.RequestState.SUCCEEDED.ordinal()] = 1;
            iArr2[FileMessage.RequestState.PENDING.ordinal()] = 2;
            iArr2[FileMessage.RequestState.FAILED.ordinal()] = 3;
            iArr2[FileMessage.RequestState.NONE.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final ChatMessageState getMessageState(BaseMessage baseMessage, UserMessage.RequestState requestState) {
        runAnimators.ag$a(baseMessage, "<this>");
        runAnimators.ag$a(requestState, "requestState");
        int i = WhenMappings.$EnumSwitchMapping$0[requestState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return ChatMessageState.PENDING;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return ChatMessageState.FAILED;
            }
            return ChatMessageState.PENDING;
        }
        return ChatMessageState.SENT;
    }

    public static final ChatMessageState getMessageState(BaseMessage baseMessage, FileMessage.RequestState requestState) {
        runAnimators.ag$a(baseMessage, "<this>");
        runAnimators.ag$a(requestState, "requestState");
        int i = WhenMappings.$EnumSwitchMapping$1[requestState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return ChatMessageState.PENDING;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return ChatMessageState.FAILED;
            }
            return ChatMessageState.PENDING;
        }
        return ChatMessageState.SENT;
    }
}
