package com.app.dream11.leaguelisting.contestinvite.fragments;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.SetDimensions;
import o.Styleable;
/* loaded from: classes3.dex */
final class ContestInvitationListFragment$contestInvitationListPresenter$2 extends Lambda implements Styleable.ArcMotion<SetDimensions> {
    public static final ContestInvitationListFragment$contestInvitationListPresenter$2 INSTANCE = new ContestInvitationListFragment$contestInvitationListPresenter$2();

    ContestInvitationListFragment$contestInvitationListPresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final SetDimensions invoke() {
        return ActionMenuItem.valueOf().onMessageChannelReady();
    }
}
