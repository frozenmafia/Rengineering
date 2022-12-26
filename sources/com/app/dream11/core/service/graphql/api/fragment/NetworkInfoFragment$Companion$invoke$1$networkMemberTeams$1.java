package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.NetworkInfoFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NetworkInfoFragment$Companion$invoke$1$networkMemberTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, NetworkInfoFragment.NetworkMemberTeam> {
    public static final NetworkInfoFragment$Companion$invoke$1$networkMemberTeams$1 INSTANCE = new NetworkInfoFragment$Companion$invoke$1$networkMemberTeams$1();

    NetworkInfoFragment$Companion$invoke$1$networkMemberTeams$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.NetworkInfoFragment$Companion$invoke$1$networkMemberTeams$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NetworkInfoFragment.NetworkMemberTeam> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final NetworkInfoFragment.NetworkMemberTeam invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return NetworkInfoFragment.NetworkMemberTeam.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final NetworkInfoFragment.NetworkMemberTeam invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (NetworkInfoFragment.NetworkMemberTeam) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
