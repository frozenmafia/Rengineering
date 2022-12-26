package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.VerifyMediaQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class VerifyMediaQuery$Data$Companion$invoke$1$validateUploadedMedia$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, VerifyMediaQuery.ValidateUploadedMedium> {
    public static final VerifyMediaQuery$Data$Companion$invoke$1$validateUploadedMedia$1 INSTANCE = new VerifyMediaQuery$Data$Companion$invoke$1$validateUploadedMedia$1();

    VerifyMediaQuery$Data$Companion$invoke$1$validateUploadedMedia$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.VerifyMediaQuery$Data$Companion$invoke$1$validateUploadedMedia$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, VerifyMediaQuery.ValidateUploadedMedium> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final VerifyMediaQuery.ValidateUploadedMedium invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return VerifyMediaQuery.ValidateUploadedMedium.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final VerifyMediaQuery.ValidateUploadedMedium invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (VerifyMediaQuery.ValidateUploadedMedium) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
