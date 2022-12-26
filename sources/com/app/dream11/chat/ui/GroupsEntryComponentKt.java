package com.app.dream11.chat.ui;

import androidx.databinding.BindingAdapter;
import com.app.dream11.chat.groups.GroupsEntryComponentData;
import com.app.dream11.core.service.graphql.api.Social.GetMappedChatOfContestQuery;
/* loaded from: classes.dex */
public final class GroupsEntryComponentKt {
    @BindingAdapter({"groupsEntryData"})
    public static final void groupsEntryVM(GroupsEntryComponent groupsEntryComponent, GroupsEntryComponentData groupsEntryComponentData) {
        if (groupsEntryComponent == null) {
            return;
        }
        groupsEntryComponent.setGroupEntryComponentData(groupsEntryComponentData);
    }

    @BindingAdapter({"contestMappedChatInfo"})
    public static final void contestMappedChatInfo(GroupsEntryComponent groupsEntryComponent, GetMappedChatOfContestQuery.Data data) {
        if (data == null || groupsEntryComponent == null) {
            return;
        }
        groupsEntryComponent.onContestMappedChatInfo(data);
    }
}
