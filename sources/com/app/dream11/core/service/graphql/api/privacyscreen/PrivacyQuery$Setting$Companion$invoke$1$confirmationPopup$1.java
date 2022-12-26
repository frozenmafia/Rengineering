package com.app.dream11.core.service.graphql.api.privacyscreen;

import com.app.dream11.core.service.graphql.api.privacyscreen.PrivacyQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PrivacyQuery$Setting$Companion$invoke$1$confirmationPopup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PrivacyQuery.ConfirmationPopup> {
    public static final PrivacyQuery$Setting$Companion$invoke$1$confirmationPopup$1 INSTANCE = new PrivacyQuery$Setting$Companion$invoke$1$confirmationPopup$1();

    PrivacyQuery$Setting$Companion$invoke$1$confirmationPopup$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PrivacyQuery.ConfirmationPopup invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PrivacyQuery.ConfirmationPopup.Companion.invoke(removecancellable);
    }
}
