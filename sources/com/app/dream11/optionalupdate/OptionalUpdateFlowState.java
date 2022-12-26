package com.app.dream11.optionalupdate;

import com.app.dream11.model.AppInit;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Objects;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class OptionalUpdateFlowState extends FlowState {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionalUpdateFlowState(AppInit appInit) {
        super(FlowStates.OPTIONAL_UPDATE, null, 2, null);
        runAnimators.ag$a(appInit, "data");
        putExtra("optionalupdatedata", appInit);
    }

    public final AppInit getAppInitData() {
        Serializable extra = getExtra("optionalupdatedata");
        Objects.requireNonNull(extra, "null cannot be cast to non-null type com.app.dream11.model.AppInit");
        return (AppInit) extra;
    }
}
