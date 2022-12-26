package com.google.android.exoplayer2.metadata.mp4;

import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import java.util.Comparator;
import o.AsyncListUtil;
/* loaded from: classes4.dex */
public final /* synthetic */ class SlowMotionData$Segment$$ExternalSyntheticLambda0 implements Comparator {
    public static final /* synthetic */ SlowMotionData$Segment$$ExternalSyntheticLambda0 INSTANCE = new SlowMotionData$Segment$$ExternalSyntheticLambda0();

    private /* synthetic */ SlowMotionData$Segment$$ExternalSyntheticLambda0() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int invoke;
        invoke = AsyncListUtil.valueOf().valueOf(r1.startTimeMs, r2.startTimeMs).valueOf(r1.endTimeMs, r2.endTimeMs).valueOf(((SlowMotionData.Segment) obj).speedDivisor, ((SlowMotionData.Segment) obj2).speedDivisor).invoke();
        return invoke;
    }
}
