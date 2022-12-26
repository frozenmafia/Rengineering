package com.app.dream11.leaguelisting.brightcovepip;

import com.app.dream11Pro.R;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class IconsUtilsForPlayer {
    public static final IconsUtilsForPlayer ah$a = new IconsUtilsForPlayer();

    /* loaded from: classes3.dex */
    public enum ScreenType {
        FAN_CODE_COMPONENT,
        SCORE_CARD_HELPER,
        PIP_FRAGMENT,
        DEFAULT
    }

    /* loaded from: classes3.dex */
    public final /* synthetic */ class valueOf {
        public static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[ScreenType.values().length];
            iArr[ScreenType.FAN_CODE_COMPONENT.ordinal()] = 1;
            iArr[ScreenType.SCORE_CARD_HELPER.ordinal()] = 2;
            iArr[ScreenType.PIP_FRAGMENT.ordinal()] = 3;
            ag$a = iArr;
        }
    }

    private IconsUtilsForPlayer() {
    }

    public final int values(ScreenType screenType) {
        runAnimators.ag$a(screenType, "screenType");
        int i = valueOf.ag$a[screenType.ordinal()];
        return R.drawable.ic_mute;
    }

    public final int toString(ScreenType screenType) {
        runAnimators.ag$a(screenType, "screenType");
        int i = valueOf.ag$a[screenType.ordinal()];
        return R.drawable.ic_unmute;
    }

    public final int ah$a(ScreenType screenType) {
        runAnimators.ag$a(screenType, "screenType");
        int i = valueOf.ag$a[screenType.ordinal()];
        return R.drawable.ic_play_60;
    }

    public final int ag$a(ScreenType screenType) {
        runAnimators.ag$a(screenType, "screenType");
        int i = valueOf.ag$a[screenType.ordinal()];
        return R.drawable.ic_pause_icon_60dp;
    }
}
