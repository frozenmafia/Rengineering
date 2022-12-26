package com.app.dream11.chat.chatlist;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import java.util.ArrayList;
import o.reserveEndViewTransition;
import o.setGroupAlertBehavior;
import o.setPriority;
/* loaded from: classes.dex */
public final class ChatListSuggestedPeopleVM extends BaseObservable {
    private final setPriority recommendedProfileData;
    private final ObservableBoolean shouldShowFindContacts = new ObservableBoolean(false);
    private final ObservableField<Integer> chatListSize = new ObservableField<>(0);
    private final String source = "chat_list_reco";

    public ChatListSuggestedPeopleVM(setGroupAlertBehavior setgroupalertbehavior) {
        this.recommendedProfileData = new setPriority(new ArrayList(), reserveEndViewTransition.valueOf(), 0, setgroupalertbehavior);
    }

    public final ObservableBoolean getShouldShowFindContacts() {
        return this.shouldShowFindContacts;
    }

    public final ObservableField<Integer> getChatListSize() {
        return this.chatListSize;
    }

    public final String getSource() {
        return this.source;
    }

    public final setPriority getRecommendedProfileData() {
        return this.recommendedProfileData;
    }
}
