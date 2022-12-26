package com.app.dream11.chat.reaction;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
/* loaded from: classes.dex */
final class ChatReactionListingFragment$userListingPresenter$2 extends Lambda implements Styleable.ArcMotion<ChatReactionListingPresenter> {
    public static final ChatReactionListingFragment$userListingPresenter$2 INSTANCE = new ChatReactionListingFragment$userListingPresenter$2();

    ChatReactionListingFragment$userListingPresenter$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final ChatReactionListingPresenter invoke() {
        return ActionMenuItem.valueOf().isLogoutPending();
    }
}
