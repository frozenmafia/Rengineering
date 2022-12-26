package com.app.dream11.leaguelisting.brightcovepip;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.app.dream11.integration.EventTracker;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isFirst;
import o.setAnimationMatrix;
import o.setType;
/* loaded from: classes3.dex */
public final class BrightCoveEventHelper$sendVideoStreamingEndEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    private static int ag$a = 1;
    private static char ah$a = 3;
    private static char[] valueOf = {3, 2, 1, 13801, 13817, 13800, 13807, 13813, 13823};
    private static int values;
    final /* synthetic */ int $fcMatchId;
    final /* synthetic */ int $matchId;
    final /* synthetic */ String $screenMode;
    final /* synthetic */ String $source;
    final /* synthetic */ int $tourId;
    final /* synthetic */ setType this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrightCoveEventHelper$sendVideoStreamingEndEvent$1(int i, int i2, String str, int i3, String str2, setType settype) {
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
        int i = values + 47;
        ag$a = i % 128;
        int i2 = i % 2;
        invoke2();
        setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        int i3 = values + 93;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return setanimationmatrix;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.ag$a().trackEvent(new NewEvents("VideoStreamingEnded").addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$matchId)).addProperty("tourId", Integer.valueOf(this.$tourId)).addProperty(ah$a((byte) (MotionEvent.axisFromString("") + 124), new char[]{4, 6, '\b', 3, 5, 7}, 6 - TextUtils.getCapsMode("", 0, 0)).intern(), this.$source).addProperty("FC_matchid", Integer.valueOf(this.$fcMatchId)).addProperty("mode", this.$screenMode), new EventTracker[0]);
        int i = values + 15;
        ag$a = i % 128;
        int i2 = i % 2;
    }

    private static String ah$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = valueOf;
            char c = ah$a;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
