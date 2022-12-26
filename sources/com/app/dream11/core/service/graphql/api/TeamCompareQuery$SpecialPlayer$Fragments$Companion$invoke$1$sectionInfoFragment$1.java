package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.SectionInfoFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TeamCompareQuery$SpecialPlayer$Fragments$Companion$invoke$1$sectionInfoFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, SectionInfoFragment> {
    public static final TeamCompareQuery$SpecialPlayer$Fragments$Companion$invoke$1$sectionInfoFragment$1 INSTANCE = new TeamCompareQuery$SpecialPlayer$Fragments$Companion$invoke$1$sectionInfoFragment$1();

    TeamCompareQuery$SpecialPlayer$Fragments$Companion$invoke$1$sectionInfoFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final SectionInfoFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return SectionInfoFragment.Companion.invoke(removecancellable);
    }
}
