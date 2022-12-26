package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchCenterFabQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchCenterFabQuery$FabIconDetails$Companion$invoke$1$icon$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MatchCenterFabQuery.Icon> {
    public static final MatchCenterFabQuery$FabIconDetails$Companion$invoke$1$icon$1 INSTANCE = new MatchCenterFabQuery$FabIconDetails$Companion$invoke$1$icon$1();

    MatchCenterFabQuery$FabIconDetails$Companion$invoke$1$icon$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.MatchCenterFabQuery$FabIconDetails$Companion$invoke$1$icon$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchCenterFabQuery.Icon> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MatchCenterFabQuery.Icon invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MatchCenterFabQuery.Icon.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchCenterFabQuery.Icon invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MatchCenterFabQuery.Icon) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
