package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.UserReaction;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UserReaction$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, UserReaction.Artwork> {
    public static final UserReaction$Companion$invoke$1$artwork$1 INSTANCE = new UserReaction$Companion$invoke$1$artwork$1();

    UserReaction$Companion$invoke$1$artwork$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.UserReaction$Companion$invoke$1$artwork$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserReaction.Artwork> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final UserReaction.Artwork invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return UserReaction.Artwork.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final UserReaction.Artwork invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (UserReaction.Artwork) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
