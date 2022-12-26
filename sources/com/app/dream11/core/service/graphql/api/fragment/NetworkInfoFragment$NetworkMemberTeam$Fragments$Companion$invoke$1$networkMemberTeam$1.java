package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NetworkInfoFragment$NetworkMemberTeam$Fragments$Companion$invoke$1$networkMemberTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NetworkMemberTeam> {
    public static final NetworkInfoFragment$NetworkMemberTeam$Fragments$Companion$invoke$1$networkMemberTeam$1 INSTANCE = new NetworkInfoFragment$NetworkMemberTeam$Fragments$Companion$invoke$1$networkMemberTeam$1();

    NetworkInfoFragment$NetworkMemberTeam$Fragments$Companion$invoke$1$networkMemberTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final NetworkMemberTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return NetworkMemberTeam.Companion.invoke(removecancellable);
    }
}
