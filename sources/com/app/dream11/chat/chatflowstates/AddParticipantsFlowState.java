package com.app.dream11.chat.chatflowstates;

import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class AddParticipantsFlowState extends BaseChatFlowState {
    public static final Companion Companion = new Companion(null);
    private static final String IS_ADD_CONTACTS = "is_add_contacts";
    private static final String IS_DEEP_LINK = "is_deep_link";
    private static final String IS_START_DM = "is_start_dm";

    public /* synthetic */ AddParticipantsFlowState(String str, String str2, boolean z, boolean z2, boolean z3, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddParticipantsFlowState(String str, String str2, boolean z, boolean z2, boolean z3) {
        super(str, FlowStates.ADD_PARTICIPANTS_LANDING_SCREEN, null, 4, null);
        runAnimators.ag$a(str, "groupUrl");
        runAnimators.ag$a(str2, "screen");
        putExtra(IS_ADD_CONTACTS, Boolean.valueOf(z));
        putExtra(IS_DEEP_LINK, Boolean.valueOf(z2));
        putExtra("is_start_dm", Boolean.valueOf(z3));
        putExtra("screen", str2);
    }

    public AddParticipantsFlowState() {
        this("", "", false, false, false);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }

    public final boolean isAddContacts() {
        return getBoolean(IS_ADD_CONTACTS, false);
    }

    public final boolean isFromDeepLink() {
        return getBoolean(IS_DEEP_LINK, false);
    }

    public final boolean isStartDM() {
        return getBoolean("is_start_dm", false);
    }
}
