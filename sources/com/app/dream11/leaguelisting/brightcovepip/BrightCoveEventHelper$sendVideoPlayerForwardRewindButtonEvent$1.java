package com.app.dream11.leaguelisting.brightcovepip;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setType;
/* loaded from: classes3.dex */
public final class BrightCoveEventHelper$sendVideoPlayerForwardRewindButtonEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ int $fcMatchId;
    final /* synthetic */ boolean $isRewindButton;
    final /* synthetic */ int $matchId;
    final /* synthetic */ String $screenMode;
    final /* synthetic */ int $tourId;
    final /* synthetic */ setType this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrightCoveEventHelper$sendVideoPlayerForwardRewindButtonEvent$1(int i, int i2, String str, int i3, boolean z, setType settype) {
        super(0);
        this.$matchId = i;
        this.$tourId = i2;
        this.$screenMode = str;
        this.$fcMatchId = i3;
        this.$isRewindButton = z;
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
        this.this$0.ag$a().trackEvent(new NewEvents("VideoPlayerRewindForward").addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$matchId)).addProperty("tourId", Integer.valueOf(this.$tourId)).addProperty("mode", this.$screenMode).addProperty("FC_matchid", Integer.valueOf(this.$fcMatchId)).addProperty("rewindButton", Boolean.valueOf(this.$isRewindButton)), new EventTracker[0]);
    }
}
