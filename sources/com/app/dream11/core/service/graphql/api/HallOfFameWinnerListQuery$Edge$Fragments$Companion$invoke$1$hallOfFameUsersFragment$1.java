package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.HallOfFameUsersFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class HallOfFameWinnerListQuery$Edge$Fragments$Companion$invoke$1$hallOfFameUsersFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameUsersFragment> {
    public static final HallOfFameWinnerListQuery$Edge$Fragments$Companion$invoke$1$hallOfFameUsersFragment$1 INSTANCE = new HallOfFameWinnerListQuery$Edge$Fragments$Companion$invoke$1$hallOfFameUsersFragment$1();

    HallOfFameWinnerListQuery$Edge$Fragments$Companion$invoke$1$hallOfFameUsersFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameUsersFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameUsersFragment.Companion.invoke(removecancellable);
    }
}
