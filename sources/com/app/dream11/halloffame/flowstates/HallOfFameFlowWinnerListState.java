package com.app.dream11.halloffame.flowstates;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Map;
import o.FontResourcesParserCompat;
import o.isAfterLast;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class HallOfFameFlowWinnerListState extends FlowState {
    private static int ag$a = 146;
    private static int ah$a = 1;
    private static int valueOf;

    public HallOfFameFlowWinnerListState() {
        try {
            super(FlowStates.HALL_OF_FAME_WINNER_LIST, null, 2, null);
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HallOfFameFlowWinnerListState(String str, String str2, String str3) {
        this();
        runAnimators.ag$a(str, "tourId");
        runAnimators.ag$a(str2, HeadToHeadMatchPickerFlowState.ROUND_ID);
        runAnimators.ag$a(str3, values(-TextUtils.lastIndexOf("", '0', 0, 0), (-16776961) - Color.rgb(0, 0, 0), true, 7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{6, 65528, 65526, 5, '\b', 2}).intern());
        putExtra("tourID", str);
        putExtra("roundID", str2);
        putExtra(values((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 255, true, 7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{6, 65528, 65526, 5, '\b', 2}).intern(), str3);
    }

    @Override // com.app.dream11.model.FlowState
    public void putAllExtras(Map<String, Serializable> map) {
        int i = ah$a + 55;
        valueOf = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(map, "args");
        HallOfFameFlowWinnerListState hallOfFameFlowWinnerListState = this;
        hallOfFameFlowWinnerListState.putExtra("tourID", String.valueOf(map.get("tourId")));
        hallOfFameFlowWinnerListState.putExtra("roundID", String.valueOf(map.get(CompareTeamFlowState.MATCH_ID)));
        hallOfFameFlowWinnerListState.putExtra(values(-MotionEvent.axisFromString(""), 303 - AndroidCharacter.getMirror('0'), true, 7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{6, 65528, 65526, 5, '\b', 2}).intern(), map.get(values(1 - (ViewConfiguration.getTouchSlop() >> 8), 255 - (ViewConfiguration.getTouchSlop() >> 8), true, 6 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{6, 65528, 65526, 5, '\b', 2}).intern()));
        hallOfFameFlowWinnerListState.putExtra(FlowState.WLS_SLUG, FontResourcesParserCompat.ProviderResourceEntry.valueOf(map.get(FlowState.SITE), null));
        int i3 = ah$a + 39;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
    }

    private static String values(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - ag$a);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
