package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ContestItem;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestItem$Companion$invoke$1$myTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestItem.MyTeam> {
    public static final ContestItem$Companion$invoke$1$myTeams$1 INSTANCE = new ContestItem$Companion$invoke$1$myTeams$1();

    ContestItem$Companion$invoke$1$myTeams$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.ContestItem$Companion$invoke$1$myTeams$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestItem.MyTeam> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestItem.MyTeam invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestItem.MyTeam.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestItem.MyTeam invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestItem.MyTeam) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
