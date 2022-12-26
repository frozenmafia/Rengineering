package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class NewMyProfileQuery$Rule$Companion$invoke$1$miniArtwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, NewMyProfileQuery.MiniArtwork> {
    public static final NewMyProfileQuery$Rule$Companion$invoke$1$miniArtwork$1 INSTANCE = new NewMyProfileQuery$Rule$Companion$invoke$1$miniArtwork$1();

    NewMyProfileQuery$Rule$Companion$invoke$1$miniArtwork$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery$Rule$Companion$invoke$1$miniArtwork$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewMyProfileQuery.MiniArtwork> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final NewMyProfileQuery.MiniArtwork invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return NewMyProfileQuery.MiniArtwork.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final NewMyProfileQuery.MiniArtwork invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (NewMyProfileQuery.MiniArtwork) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
