package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class NewMyProfileQuery$AwardEdge$Companion$invoke$1$tag$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, NewMyProfileQuery.Tag> {
    public static final NewMyProfileQuery$AwardEdge$Companion$invoke$1$tag$1 INSTANCE = new NewMyProfileQuery$AwardEdge$Companion$invoke$1$tag$1();

    NewMyProfileQuery$AwardEdge$Companion$invoke$1$tag$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery$AwardEdge$Companion$invoke$1$tag$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewMyProfileQuery.Tag> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final NewMyProfileQuery.Tag invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return NewMyProfileQuery.Tag.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final NewMyProfileQuery.Tag invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (NewMyProfileQuery.Tag) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
