package com.app.dream11.chat.chatflowstates;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.HashMap;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class FriendsListFlowState extends FlowState {
    public static final Companion Companion = new Companion(null);
    public static final String IS_ADMIN = "is_admin";
    public static final String IS_START_DM = "is_start_dm";
    public static final String SCREEN = "screen";
    public static final String SELECTED_CONTACTS = "selected_list";
    private final String groupUrl;
    private final boolean isNewGroup;
    private final String screen;

    public /* synthetic */ FriendsListFlowState(HashMap hashMap, String str, String str2, boolean z, boolean z2, boolean z3, int i, getTargetTypes gettargettypes) {
        this(hashMap, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    public final String getScreen() {
        return this.screen;
    }

    public final String getGroupUrl() {
        return this.groupUrl;
    }

    public final boolean isNewGroup() {
        return this.isNewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendsListFlowState(HashMap<Integer, Integer> hashMap, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(FlowStates.FRIENDS_LIST, null, 2, null);
        runAnimators.ag$a(hashMap, "selectedContacts");
        runAnimators.ag$a(str, "screen");
        runAnimators.ag$a(str2, "groupUrl");
        this.screen = str;
        this.groupUrl = str2;
        this.isNewGroup = z;
        putExtra("selected_list", hashMap);
        putExtra("is_admin", Boolean.valueOf(z2));
        putExtra("is_start_dm", Boolean.valueOf(z3));
        putExtra("screen", str);
    }

    public final HashMap<Integer, Integer> getSelectedContacts() {
        Serializable extra = getExtra("selected_list");
        if (extra instanceof HashMap) {
            return (HashMap) extra;
        }
        return null;
    }

    public final boolean isUserAdmin() {
        return getBoolean("is_admin", false);
    }

    public final boolean isStartDM() {
        return getBoolean("is_start_dm", false);
    }

    public final String getScreenName() {
        return getString("screen", "");
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
