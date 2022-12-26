package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ProfileQuery$CommonMatchesStats$Companion$invoke$1$commonStats$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ProfileQuery.CommonStat> {
    public static final ProfileQuery$CommonMatchesStats$Companion$invoke$1$commonStats$1 INSTANCE = new ProfileQuery$CommonMatchesStats$Companion$invoke$1$commonStats$1();

    ProfileQuery$CommonMatchesStats$Companion$invoke$1$commonStats$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.profile.ProfileQuery$CommonMatchesStats$Companion$invoke$1$commonStats$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfileQuery.CommonStat> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ProfileQuery.CommonStat invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ProfileQuery.CommonStat.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfileQuery.CommonStat invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ProfileQuery.CommonStat) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
