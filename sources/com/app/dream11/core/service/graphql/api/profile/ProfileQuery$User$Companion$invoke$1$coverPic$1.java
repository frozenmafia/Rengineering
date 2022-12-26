package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.ProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ProfileQuery$User$Companion$invoke$1$coverPic$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ProfileQuery.CoverPic> {
    public static final ProfileQuery$User$Companion$invoke$1$coverPic$1 INSTANCE = new ProfileQuery$User$Companion$invoke$1$coverPic$1();

    ProfileQuery$User$Companion$invoke$1$coverPic$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.profile.ProfileQuery$User$Companion$invoke$1$coverPic$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ProfileQuery.CoverPic> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ProfileQuery.CoverPic invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ProfileQuery.CoverPic.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ProfileQuery.CoverPic invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ProfileQuery.CoverPic) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
