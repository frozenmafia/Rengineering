package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.HallOfFameMatchGFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class HallOfFameMatchCenterQuery$Edge$Fragments$Companion$invoke$1$hallOfFameMatchGFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameMatchGFragment> {
    public static final HallOfFameMatchCenterQuery$Edge$Fragments$Companion$invoke$1$hallOfFameMatchGFragment$1 INSTANCE = new HallOfFameMatchCenterQuery$Edge$Fragments$Companion$invoke$1$hallOfFameMatchGFragment$1();

    HallOfFameMatchCenterQuery$Edge$Fragments$Companion$invoke$1$hallOfFameMatchGFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameMatchGFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HallOfFameMatchGFragment.Companion.invoke(removecancellable);
    }
}
