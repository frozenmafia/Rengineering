package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class NewMyProfileQuery$Preview$Companion$invoke$1$offerDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewMyProfileQuery.OfferDetails> {
    public static final NewMyProfileQuery$Preview$Companion$invoke$1$offerDetails$1 INSTANCE = new NewMyProfileQuery$Preview$Companion$invoke$1$offerDetails$1();

    NewMyProfileQuery$Preview$Companion$invoke$1$offerDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final NewMyProfileQuery.OfferDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return NewMyProfileQuery.OfferDetails.Companion.invoke(removecancellable);
    }
}
