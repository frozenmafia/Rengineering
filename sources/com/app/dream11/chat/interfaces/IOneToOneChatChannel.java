package com.app.dream11.chat.interfaces;
/* loaded from: classes.dex */
public interface IOneToOneChatChannel extends IChatChannel {
    boolean amInInvitedState();

    boolean amInJoinedState();

    IGroupUser getOpponent();

    boolean isDM();

    boolean isGhostChannel();

    boolean isOpponentInInvitedState();

    boolean isOpponentInJoinedState();
}
