package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.HallOfFameUsersFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameUsersFragment$Companion$invoke$1$officialTick$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, HallOfFameUsersFragment.OfficialTick> {
    public static final HallOfFameUsersFragment$Companion$invoke$1$officialTick$1 INSTANCE = new HallOfFameUsersFragment$Companion$invoke$1$officialTick$1();

    HallOfFameUsersFragment$Companion$invoke$1$officialTick$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.HallOfFameUsersFragment$Companion$invoke$1$officialTick$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameUsersFragment.OfficialTick> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final HallOfFameUsersFragment.OfficialTick invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return HallOfFameUsersFragment.OfficialTick.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameUsersFragment.OfficialTick invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (HallOfFameUsersFragment.OfficialTick) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
