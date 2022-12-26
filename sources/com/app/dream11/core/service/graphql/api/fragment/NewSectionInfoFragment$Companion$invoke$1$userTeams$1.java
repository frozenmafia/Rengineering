package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.NewSectionInfoFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NewSectionInfoFragment$Companion$invoke$1$userTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, NewSectionInfoFragment.UserTeam> {
    public static final NewSectionInfoFragment$Companion$invoke$1$userTeams$1 INSTANCE = new NewSectionInfoFragment$Companion$invoke$1$userTeams$1();

    NewSectionInfoFragment$Companion$invoke$1$userTeams$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.NewSectionInfoFragment$Companion$invoke$1$userTeams$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewSectionInfoFragment.UserTeam> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final NewSectionInfoFragment.UserTeam invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return NewSectionInfoFragment.UserTeam.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final NewSectionInfoFragment.UserTeam invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (NewSectionInfoFragment.UserTeam) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
