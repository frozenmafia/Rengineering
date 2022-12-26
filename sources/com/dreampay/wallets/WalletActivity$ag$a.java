package com.dreampay.wallets;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.wallets.Wallet;
import com.dreampay.wallets.models.WalletFlow;
import java.util.ArrayList;
import java.util.List;
import o.getTargetTypes;
import o.move;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class WalletActivity$ag$a {
    private static long ag$a = -1005125140699313534L;
    private static char[] toString = {33954, 3626, 37295, 6965, 30218, 64670, 25365, 59799, 23568, 49795, 26709, 58049, 32074, 63432, 16975, 56540, 22385, 41422, 15443, 46812, 343, 39898, 5721, 24797};
    private static int valueOf = 0;
    private static int values = 1;

    public /* synthetic */ WalletActivity$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private WalletActivity$ag$a() {
    }

    public final Intent values(Context context, String str, String str2, WalletFlow walletFlow, Wallet wallet, List<String> list, String str3, Double d) {
        ArrayList<String> arrayList;
        char c;
        char c2;
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(walletFlow, values(3 - TextUtils.lastIndexOf("", '0', 0, 0), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (33988 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern());
        runAnimators.ag$a(wallet, values(6 - TextUtils.getTrimmedLength(""), TextUtils.getOffsetAfter("", 0) + 4, (char) (30334 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern());
        Intent intent = new Intent(context, WalletActivity.class);
        intent.putExtra(values(4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength(""), (char) (Process.getGidForName("") + 33989)).intern(), walletFlow);
        intent.putExtra(Constants.Navigation.BASE_64_OF_REQUEST, str);
        intent.putExtra(Constants.Navigation.CHECKSUM, str2);
        intent.putExtra(Constants.Navigation.WALLET_TYPE, wallet);
        intent.putExtra("url", str3);
        intent.putExtra(values((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, Process.getGidForName("") + 11, (char) (26659 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), d);
        Object[] objArr = null;
        if ((list == null ? 'b' : (char) 23) != 23) {
            int i = valueOf + 69;
            values = i % 128;
            if (i % 2 == 0) {
                int length = objArr.length;
            }
            arrayList = null;
        } else {
            arrayList = new ArrayList<>(list);
        }
        intent.putStringArrayListExtra(Constants.Navigation.OFFER_TAGS, arrayList);
        int i2 = valueOf + 79;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            c2 = 23;
            c = 23;
        } else {
            c = '\"';
            c2 = 23;
        }
        if (c != c2) {
            return intent;
        }
        int length2 = objArr.length;
        return intent;
    }

    private static String values(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((toString[move.values + i2] ^ (move.values * ag$a)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
