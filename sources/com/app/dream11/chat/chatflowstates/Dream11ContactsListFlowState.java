package com.app.dream11.chat.chatflowstates;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.util.HashMap;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class Dream11ContactsListFlowState extends FlowState {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRAS_CHANNEL_URL = "extras_channel_url";
    public static final String IS_ADMIN = "is_admin";
    public static final String IS_START_DM = "is_start_dm";
    public static final String SELECTED_CONTACTS = "selected_list";
    private final String groupUrl;
    private final boolean isNewGroup;
    private final String screen;

    public /* synthetic */ Dream11ContactsListFlowState(HashMap hashMap, String str, String str2, boolean z, boolean z2, boolean z3, int i, getTargetTypes gettargettypes) {
        this(hashMap, (i & 2) != 0 ? "" : str, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    public final String getGroupUrl() {
        return this.groupUrl;
    }

    public final String getScreen() {
        return this.screen;
    }

    public final boolean isNewGroup() {
        return this.isNewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dream11ContactsListFlowState(HashMap<Integer, Integer> hashMap, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(FlowStates.DREAM11_CONTACTS_LIST, null, 2, null);
        runAnimators.ag$a(hashMap, "selectedContacts");
        runAnimators.ag$a(str, "groupUrl");
        runAnimators.ag$a(str2, "screen");
        this.groupUrl = str;
        this.screen = str2;
        this.isNewGroup = z;
        putExtra("selected_list", hashMap);
        putExtra("is_admin", Boolean.valueOf(z2));
        putExtra("is_start_dm", Boolean.valueOf(z3));
        putExtra(EXTRAS_CHANNEL_URL, str);
    }

    public final HashMap<Integer, Integer> getSelectedContacts() {
        return (HashMap) getExtra("selected_list");
    }

    public final boolean isUserAdmin() {
        return getBoolean("is_admin", false);
    }

    public final boolean isStartDM() {
        return getBoolean("is_start_dm", false);
    }

    public final String getChannelUrl() {
        return getString(EXTRAS_CHANNEL_URL, "");
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
