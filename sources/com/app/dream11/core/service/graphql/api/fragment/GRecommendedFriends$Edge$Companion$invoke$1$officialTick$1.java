package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecommendedFriends;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GRecommendedFriends$Edge$Companion$invoke$1$officialTick$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GRecommendedFriends.OfficialTick> {
    public static final GRecommendedFriends$Edge$Companion$invoke$1$officialTick$1 INSTANCE = new GRecommendedFriends$Edge$Companion$invoke$1$officialTick$1();

    GRecommendedFriends$Edge$Companion$invoke$1$officialTick$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GRecommendedFriends$Edge$Companion$invoke$1$officialTick$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecommendedFriends.OfficialTick> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GRecommendedFriends.OfficialTick invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GRecommendedFriends.OfficialTick.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecommendedFriends.OfficialTick invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GRecommendedFriends.OfficialTick) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
