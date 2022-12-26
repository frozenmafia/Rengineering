package com.app.dream11.leaguelisting.brightcovepip;

import android.view.ViewConfiguration;
import com.app.dream11.integration.EventTracker;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getDouble;
import o.setAnimationMatrix;
import o.setType;
/* loaded from: classes3.dex */
public final class BrightCoveEventHelper$sendVideoStreamingStartEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    private static int[] ag$a = {-2129757376, 1359855173, -1368509049, -885025364, 1013269064, -1674248103, -1850551739, -961760493, 2039576420, 2076286896, 1237198292, -1805808910, -984024072, 1605456375, -1223720409, 1708401081, -937586220, -1693476841};
    private static int ah$a = 0;
    private static int values = 1;
    final /* synthetic */ int $fcMatchId;
    final /* synthetic */ int $matchId;
    final /* synthetic */ String $screenMode;
    final /* synthetic */ String $source;
    final /* synthetic */ int $tourId;
    final /* synthetic */ setType this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrightCoveEventHelper$sendVideoStreamingStartEvent$1(int i, int i2, String str, int i3, String str2, setType settype) {
        super(0);
        this.$matchId = i;
        this.$tourId = i2;
        this.$source = str;
        this.$fcMatchId = i3;
        this.$screenMode = str2;
        this.this$0 = settype;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        int i = values + 101;
        ah$a = i % 128;
        int i2 = i % 2;
        invoke2();
        setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        int i3 = values + 35;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return setanimationmatrix;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.ag$a().trackEvent(new NewEvents("VideoStreamingStarted").addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$matchId)).addProperty("tourId", Integer.valueOf(this.$tourId)).addProperty(ah$a(new int[]{-884829004, -624209004, 832237381, 1459817003}, (ViewConfiguration.getScrollBarSize() >> 8) + 6).intern(), this.$source).addProperty("FC_matchid", Integer.valueOf(this.$fcMatchId)).addProperty("mode", this.$screenMode), new EventTracker[0]);
        int i = ah$a + 5;
        values = i % 128;
        int i2 = i % 2;
    }

    private static String ah$a(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) ag$a.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
