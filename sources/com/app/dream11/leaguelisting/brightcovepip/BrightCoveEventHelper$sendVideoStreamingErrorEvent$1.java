package com.app.dream11.leaguelisting.brightcovepip;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setType;
/* loaded from: classes3.dex */
public final class BrightCoveEventHelper$sendVideoStreamingErrorEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ int $fcMatchId;
    final /* synthetic */ int $matchId;
    final /* synthetic */ String $reason;
    final /* synthetic */ String $screenMode;
    final /* synthetic */ int $tourId;
    final /* synthetic */ setType this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrightCoveEventHelper$sendVideoStreamingErrorEvent$1(int i, int i2, int i3, String str, String str2, setType settype) {
        super(0);
        this.$matchId = i;
        this.$tourId = i2;
        this.$fcMatchId = i3;
        this.$screenMode = str;
        this.$reason = str2;
        this.this$0 = settype;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.ag$a().trackEvent(new NewEvents("VideoStreamingError").addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$matchId)).addProperty("tourId", Integer.valueOf(this.$tourId)).addProperty("FC_matchid", Integer.valueOf(this.$fcMatchId)).addProperty("mode", this.$screenMode).addProperty("errorReason", this.$reason), new EventTracker[0]);
    }
}
