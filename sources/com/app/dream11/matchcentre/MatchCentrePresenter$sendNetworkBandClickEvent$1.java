package com.app.dream11.matchcentre;

import android.view.View;
import com.app.dream11.core.service.graphql.api.fragment.MatchData;
import com.app.dream11.core.service.graphql.api.fragment.NetworkInfoFragment;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.moveToFirst;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class MatchCentrePresenter$sendNetworkBandClickEvent$1 extends Lambda implements Styleable.ChangeBounds<Map<String, Serializable>, setAnimationMatrix> {
    private static int HaptikSDK$a = 1;
    private static char ag$a = 39442;
    private static char ah$a = 31347;
    private static char toString = 48306;
    private static char valueOf = 63431;
    private static int values;
    final /* synthetic */ MatchData $edge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchCentrePresenter$sendNetworkBandClickEvent$1(MatchData matchData) {
        super(1);
        this.$edge = matchData;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Map<String, Serializable> map) {
        int i = values + 79;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            try {
                invoke2(map);
                setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
                int i3 = values + 99;
                HaptikSDK$a = i3 % 128;
                if ((i3 % 2 == 0 ? 'T' : 'G') != 'G') {
                    int i4 = 6 / 0;
                    return setanimationmatrix;
                }
                return setanimationmatrix;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Serializable> map) {
        MatchData.MyNetworkInfo myNetworkInfo;
        int i;
        runAnimators.ag$a(map, "$this$trackEvent");
        int i2 = 0;
        map.put(ah$a(new char[]{50662, 7700, 51278, 30714, 43598, 54966}, 6 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), "match_centre");
        MatchData matchData = this.$edge;
        if (matchData != null && (myNetworkInfo = matchData.getMyNetworkInfo()) != null) {
            MatchData.MyNetworkInfo.Fragments fragments = myNetworkInfo.getFragments();
            if (fragments == null) {
                i = HaptikSDK$a + 33;
            } else {
                NetworkInfoFragment networkInfoFragment = fragments.getNetworkInfoFragment();
                if (networkInfoFragment != null) {
                    Integer totalCount = networkInfoFragment.getTotalCount();
                    if (totalCount == null) {
                        i = HaptikSDK$a + 95;
                    } else {
                        i2 = totalCount.intValue();
                        i = HaptikSDK$a + 99;
                    }
                }
            }
            values = i % 128;
            int i3 = i % 2;
        }
        map.put("following_count", Integer.valueOf(i2));
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + valueOf)) ^ ((cArr3[0] >>> 5) + ah$a)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + toString)) ^ ((cArr3[1] >>> 5) + ag$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
