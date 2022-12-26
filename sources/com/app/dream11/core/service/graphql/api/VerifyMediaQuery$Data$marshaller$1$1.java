package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.VerifyMediaQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class VerifyMediaQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends VerifyMediaQuery.ValidateUploadedMedium>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final VerifyMediaQuery$Data$marshaller$1$1 INSTANCE = new VerifyMediaQuery$Data$marshaller$1$1();

    VerifyMediaQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends VerifyMediaQuery.ValidateUploadedMedium> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<VerifyMediaQuery.ValidateUploadedMedium>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<VerifyMediaQuery.ValidateUploadedMedium> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (VerifyMediaQuery.ValidateUploadedMedium validateUploadedMedium : list) {
            valueof.values(validateUploadedMedium == null ? null : validateUploadedMedium.marshaller());
        }
    }
}
