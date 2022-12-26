package com.app.dream11.presenter.share;

import com.app.dream11.presenter.share.PrivateContestSharePresenter;
/* loaded from: classes3.dex */
public final /* synthetic */ class PrivateContestSharePresenter$ah$a {
    public static final /* synthetic */ int[] toString;
    public static final /* synthetic */ int[] valueOf;

    static {
        int[] iArr = new int[PrivateContestSharePresenter.SideEffects.values().length];
        iArr[PrivateContestSharePresenter.SideEffects.SHARE_CONTEST_TO_MORE.ordinal()] = 1;
        iArr[PrivateContestSharePresenter.SideEffects.SHARE_CONTEST_TO_GROUPS.ordinal()] = 2;
        iArr[PrivateContestSharePresenter.SideEffects.LOAD_CHAT_NEXT_PAGE.ordinal()] = 3;
        iArr[PrivateContestSharePresenter.SideEffects.LOAD_FRIENDS_NEXT_PAGE.ordinal()] = 4;
        iArr[PrivateContestSharePresenter.SideEffects.LOADDATA.ordinal()] = 5;
        iArr[PrivateContestSharePresenter.SideEffects.COPYCONTESTCODE.ordinal()] = 6;
        iArr[PrivateContestSharePresenter.SideEffects.SHARE_CONTEST_TO_FEED.ordinal()] = 7;
        iArr[PrivateContestSharePresenter.SideEffects.CLOSE.ordinal()] = 8;
        iArr[PrivateContestSharePresenter.SideEffects.LOAD_CHAT_FIRST_PAGE.ordinal()] = 9;
        iArr[PrivateContestSharePresenter.SideEffects.LOAD_FRIENDS_FIRST_PAGE.ordinal()] = 10;
        iArr[PrivateContestSharePresenter.SideEffects.SYNC_CONTACTS.ordinal()] = 11;
        valueOf = iArr;
        int[] iArr2 = new int[PrivateContestSharePresenter.Action.values().length];
        iArr2[PrivateContestSharePresenter.Action.INIT.ordinal()] = 1;
        iArr2[PrivateContestSharePresenter.Action.OPEN_CONTEST_SHARE_TO_MORE.ordinal()] = 2;
        iArr2[PrivateContestSharePresenter.Action.OPEN_CONTEST_SHARE_TO_GROUPS.ordinal()] = 3;
        iArr2[PrivateContestSharePresenter.Action.ONDATALOADED.ordinal()] = 4;
        iArr2[PrivateContestSharePresenter.Action.CODECOPIED.ordinal()] = 5;
        iArr2[PrivateContestSharePresenter.Action.CHAT_FIRST_PAGE_LOADED.ordinal()] = 6;
        iArr2[PrivateContestSharePresenter.Action.CHAT_NEXT_PAGE_LOADED.ordinal()] = 7;
        iArr2[PrivateContestSharePresenter.Action.FRIENDS_FIRST_PAGE_LOADED.ordinal()] = 8;
        iArr2[PrivateContestSharePresenter.Action.FRIENDS_NEXT_PAGE_LOADED.ordinal()] = 9;
        toString = iArr2;
    }
}
