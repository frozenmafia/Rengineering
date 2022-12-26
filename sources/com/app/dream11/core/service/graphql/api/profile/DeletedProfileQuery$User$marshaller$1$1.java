package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.DeletedProfileQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class DeletedProfileQuery$User$marshaller$1$1 extends Lambda implements Transition<List<? extends DeletedProfileQuery.CoverPic>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final DeletedProfileQuery$User$marshaller$1$1 INSTANCE = new DeletedProfileQuery$User$marshaller$1$1();

    DeletedProfileQuery$User$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends DeletedProfileQuery.CoverPic> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<DeletedProfileQuery.CoverPic>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<DeletedProfileQuery.CoverPic> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (DeletedProfileQuery.CoverPic coverPic : list) {
            valueof.values(coverPic == null ? null : coverPic.marshaller());
        }
    }
}
