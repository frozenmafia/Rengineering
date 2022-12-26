package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.NewSectionInfoFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NewSectionInfoFragment$UserTeam$Companion$invoke$1$players$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, NewSectionInfoFragment.Player> {
    public static final NewSectionInfoFragment$UserTeam$Companion$invoke$1$players$1 INSTANCE = new NewSectionInfoFragment$UserTeam$Companion$invoke$1$players$1();

    NewSectionInfoFragment$UserTeam$Companion$invoke$1$players$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.NewSectionInfoFragment$UserTeam$Companion$invoke$1$players$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewSectionInfoFragment.Player> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final NewSectionInfoFragment.Player invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return NewSectionInfoFragment.Player.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final NewSectionInfoFragment.Player invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (NewSectionInfoFragment.Player) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
