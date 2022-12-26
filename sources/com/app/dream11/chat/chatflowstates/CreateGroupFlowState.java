package com.app.dream11.chat.chatflowstates;

import com.app.dream11.chat.models.AddParticipantModel;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.ArrayList;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class CreateGroupFlowState extends BaseChatFlowState {
    private final String contactsListKey;
    private final String editingKey;
    private final String focusDescriptionKey;
    private final String isAdminKey;
    private final String isDeepLinkKey;
    private final String wlsSlugKey;

    public CreateGroupFlowState() {
        this(false, null, false, false, null, null, false, null, 0, 0, null, 2047, null);
    }

    public /* synthetic */ CreateGroupFlowState(boolean z, String str, boolean z2, boolean z3, ArrayList arrayList, String str2, boolean z4, String str3, int i, int i2, String str4, int i3, getTargetTypes gettargettypes) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? null : arrayList, (i3 & 32) == 0 ? str2 : "", (i3 & 64) == 0 ? z4 : false, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? -1 : i, (i3 & 512) == 0 ? i2 : -1, (i3 & 1024) == 0 ? str4 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupFlowState(boolean z, String str, boolean z2, boolean z3, ArrayList<AddParticipantModel> arrayList, String str2, boolean z4, String str3, int i, int i2, String str4) {
        super(str, FlowStates.CREATE_CHAT_GROUP, str2);
        runAnimators.ag$a(str, "existingGroupUrl");
        runAnimators.ag$a(str2, "screenOpenedFrom");
        this.editingKey = "editing";
        this.focusDescriptionKey = "focus_desc";
        this.isAdminKey = "is_admin";
        this.isDeepLinkKey = "is_deep_link";
        this.contactsListKey = "contacts_list";
        this.wlsSlugKey = FlowState.WLS_SLUG;
        putExtra("editing", Boolean.valueOf(z));
        putExtra("focus_desc", Boolean.valueOf(z2));
        putExtra("is_admin", Boolean.valueOf(z3));
        putExtra("is_deep_link", Boolean.valueOf(z4));
        putExtra("contacts_list", arrayList);
        putExtra("leagueId", str3);
        putExtra("tourID", Integer.valueOf(i));
        putExtra("roundID", Integer.valueOf(i2));
        putExtra(FlowState.WLS_SLUG, str4);
    }

    public final boolean isEditingGroup() {
        Serializable extra = getExtra(this.editingKey);
        if (extra == null) {
            extra = (Serializable) false;
        }
        return ((Boolean) extra).booleanValue();
    }

    public final boolean shouldFocusDescription() {
        Serializable extra = getExtra(this.focusDescriptionKey);
        if (extra == null) {
            extra = (Serializable) false;
        }
        return ((Boolean) extra).booleanValue();
    }

    public final boolean isAdmin() {
        Serializable extra = getExtra(this.isAdminKey);
        if (extra == null) {
            extra = (Serializable) false;
        }
        return ((Boolean) extra).booleanValue();
    }

    public final boolean isDeepLik() {
        Serializable extra = getExtra(this.isDeepLinkKey);
        if (extra == null) {
            extra = (Serializable) false;
        }
        return ((Boolean) extra).booleanValue();
    }

    public final ArrayList<AddParticipantModel> contactList() {
        ArrayList extra = getExtra(this.contactsListKey);
        if (extra == null) {
            extra = new ArrayList();
        }
        return (ArrayList) extra;
    }

    public final String getContestId() {
        return getString("leagueId", "-1");
    }

    public final int getTourId() {
        return getInt("tourID", -1);
    }

    public final int getMatchId() {
        return getInt("roundID", -1);
    }
}
