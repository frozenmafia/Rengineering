package com.app.dream11.streamingquality;

import com.app.dream11.leaguelisting.fancodecomponent.StreamingQualityData;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import o.runAnimators;
/* loaded from: classes.dex */
public final class StreamingQualityFlowState extends FlowState {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamingQualityFlowState(ArrayList<StreamingQualityData> arrayList) {
        super(FlowStates.STREAMING_QUALITY, null, 2, null);
        runAnimators.ag$a(arrayList, "data");
        putExtra("quality", arrayList);
    }

    public final ArrayList<StreamingQualityData> getAppInitData() {
        Serializable extra = getExtra("quality");
        Objects.requireNonNull(extra, "null cannot be cast to non-null type java.util.ArrayList<com.app.dream11.leaguelisting.fancodecomponent.StreamingQualityData>{ kotlin.collections.TypeAliasesKt.ArrayList<com.app.dream11.leaguelisting.fancodecomponent.StreamingQualityData> }");
        return (ArrayList) extra;
    }
}
