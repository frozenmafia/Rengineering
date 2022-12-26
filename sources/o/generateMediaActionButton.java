package o;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class generateMediaActionButton {
    public static final int[] ah$a = {Color.rgb(207, 248, 246), Color.rgb(148, 212, 212), Color.rgb(136, 180, 187), Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)};
    public static final int[] valueOf = {Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, 134), Color.rgb(53, 194, 209)};
    public static final int[] toString = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, 184, 162), Color.rgb(191, 134, 134), Color.rgb(179, 48, 80)};
    public static final int[] ag$a = {Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, (int) androidx.databinding.library.baseAdapters.BR.lastMessageText, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)};
    public static final int[] invoke = {Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140), Color.rgb(140, 234, 255), Color.rgb(255, 140, 157)};
    public static final int[] values = {toString("#2ecc71"), toString("#f1c40f"), toString("#e74c3c"), toString("#3498db")};

    public static int values(int i, int i2) {
        return (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | ((i2 & 255) << 24);
    }

    public static int toString(String str) {
        int parseLong = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((parseLong >> 16) & 255, (parseLong >> 8) & 255, (parseLong >> 0) & 255);
    }

    public static List<Integer> values(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
