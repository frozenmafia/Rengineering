package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ProfileQuery$Badges$Companion$invoke$1$awardEdge$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ProfileQuery.AwardEdge> {
    public static final ProfileQuery$Badges$Companion$invoke$1$awardEdge$1 INSTANCE = new ProfileQuery$Badges$Companion$invoke$1$awardEdge$1();

    ProfileQuery$Badges$Companion$invoke$1$awardEdge$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.profile.ProfileQuery$Badges$Companion$invoke$1$awardEdge$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfileQuery.AwardEdge> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ProfileQuery.AwardEdge invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ProfileQuery.AwardEdge.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfileQuery.AwardEdge invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ProfileQuery.AwardEdge) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
