package com.app.dream11.chat.ui;

import com.app.dream11.chat.presenters.FriendsListPresenter;
import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
/* loaded from: classes.dex */
final class FriendsListFragment$friendsListPresenter$2 extends Lambda implements Styleable.ArcMotion<FriendsListPresenter> {
    public static final FriendsListFragment$friendsListPresenter$2 INSTANCE = new FriendsListFragment$friendsListPresenter$2();

    FriendsListFragment$friendsListPresenter$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final FriendsListPresenter invoke() {
        return ActionMenuItem.valueOf().warmup();
    }
}
