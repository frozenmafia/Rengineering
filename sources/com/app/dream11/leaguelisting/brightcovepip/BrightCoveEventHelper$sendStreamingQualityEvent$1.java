package com.app.dream11.leaguelisting.brightcovepip;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
import o.setType;
/* loaded from: classes3.dex */
public final class BrightCoveEventHelper$sendStreamingQualityEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ int $fcMatchId;
    final /* synthetic */ int $matchId;
    final /* synthetic */ String $previousSelection;
    final /* synthetic */ String $screenMode;
    final /* synthetic */ String $selection;
    final /* synthetic */ int $tourId;
    final /* synthetic */ setType this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrightCoveEventHelper$sendStreamingQualityEvent$1(setType settype, int i, String str, int i2, int i3, String str2, String str3) {
        super(0);
        this.this$0 = settype;
        this.$fcMatchId = i;
        this.$screenMode = str;
        this.$matchId = i2;
        this.$tourId = i3;
        this.$previousSelection = str2;
        this.$selection = str3;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("VideoPlayerStreamingQuality");
        int i = this.$fcMatchId;
        String str = this.$screenMode;
        int i2 = this.$matchId;
        int i3 = this.$tourId;
        String str2 = this.$previousSelection;
        String str3 = this.$selection;
        newEvents.addProperty("FC_matchid", Integer.valueOf(i));
        newEvents.addProperty("mode", str);
        newEvents.addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(i2));
        newEvents.addProperty("tourId", Integer.valueOf(i3));
        newEvents.addProperty("previousSelection", str2);
        newEvents.addProperty("selection", str3);
        this.this$0.ag$a().trackEvent(newEvents, new EventTracker[0]);
    }
}
