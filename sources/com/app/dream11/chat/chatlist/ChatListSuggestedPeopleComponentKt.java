package com.app.dream11.chat.chatlist;

import androidx.databinding.BindingAdapter;
import o.setGroupAlertBehavior;
import o.setPriority;
/* loaded from: classes.dex */
public final class ChatListSuggestedPeopleComponentKt {
    @BindingAdapter(requireAll = false, value = {"profileRecommendationData", "shouldMakeNetworkCall", "source", "chatListSize"})
    public static final void setRecommenededProfile(ChatListSuggestedPeopleComponent chatListSuggestedPeopleComponent, setPriority setpriority, Boolean bool, String str, Integer num) {
        setGroupAlertBehavior ag$a;
        if (str != null && chatListSuggestedPeopleComponent != null) {
            chatListSuggestedPeopleComponent.setSource(str);
        }
        if (num != null) {
            int intValue = num.intValue();
            if (chatListSuggestedPeopleComponent != null) {
                chatListSuggestedPeopleComponent.setChatListSize(intValue);
            }
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (chatListSuggestedPeopleComponent != null) {
                chatListSuggestedPeopleComponent.setShouldMakeNetworkCall(booleanValue);
            }
        }
        if (setpriority == null || (ag$a = setpriority.ag$a()) == null || chatListSuggestedPeopleComponent == null) {
            return;
        }
        chatListSuggestedPeopleComponent.setCallback(ag$a);
    }

    @BindingAdapter({"findContactVisibility"})
    public static final void setFindContactVisibility(ChatListSuggestedPeopleComponent chatListSuggestedPeopleComponent, Boolean bool) {
        if (bool == null) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        if (chatListSuggestedPeopleComponent == null) {
            return;
        }
        chatListSuggestedPeopleComponent.setFindContactVisibility(booleanValue);
    }
}
