package o;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.app.dream11.core.service.graphql.api.fragment.UserFollowFollowerData;
import java.util.List;
/* loaded from: classes3.dex */
public final class setFullScreenIntent extends androidx.databinding.BaseObservable {
    private static long HaptikSDK$d = 0;
    private static int a = 0;
    private static char aj$a = 1067;
    private static int ak = 0;
    private static int isLogoutPending = 1;
    @androidx.databinding.Bindable
    private String HaptikSDK$a;
    private final boolean HaptikSDK$b;
    private boolean HaptikSDK$c;
    private final String HaptikSDK$e;
    private final String HaptikWebView;
    private final makeBigContentView ag$a;
    private UserFollowFollowerData ah$a;
    private final boolean ah$b;
    private final int getInitSettings;
    private final String getSignupData;
    private final String invoke;
    private final String toString;
    private final boolean valueOf;
    private final valueOf values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void valueOf(setFullScreenIntent setfullscreenintent);
    }

    public final valueOf values() {
        try {
            int i = isLogoutPending + 87;
            ak = i % 128;
            if (!(i % 2 != 0)) {
                return this.values;
            }
            valueOf valueof = this.values;
            Object[] objArr = null;
            int length = objArr.length;
            return valueof;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean HaptikSDK$e() {
        boolean z;
        int i = isLogoutPending + 59;
        ak = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? '[' : (char) 1) != 1) {
            z = this.HaptikSDK$b;
            int length = objArr.length;
        } else {
            try {
                z = this.HaptikSDK$b;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = ak + 71;
        isLogoutPending = i2 % 128;
        if (!(i2 % 2 == 0)) {
            return z;
        }
        super.hashCode();
        return z;
    }

    public final makeBigContentView valueOf() {
        makeBigContentView makebigcontentview;
        int i = isLogoutPending + 93;
        ak = i % 128;
        try {
            if ((i % 2 != 0 ? (char) 28 : 'I') != 28) {
                makebigcontentview = this.ag$a;
            } else {
                makebigcontentview = this.ag$a;
                Object obj = null;
                super.hashCode();
            }
            int i2 = ak + 69;
            isLogoutPending = i2 % 128;
            int i3 = i2 % 2;
            return makebigcontentview;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String HaptikSDK$b() {
        int i = ak + 1;
        isLogoutPending = i % 128;
        int i2 = i % 2;
        try {
            String str = this.invoke;
            int i3 = ak + 101;
            isLogoutPending = i3 % 128;
            if ((i3 % 2 == 0 ? '`' : ',') != ',') {
                int i4 = 84 / 0;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String ah$a() {
        int i = isLogoutPending + 63;
        ak = i % 128;
        int i2 = i % 2;
        String str = this.toString;
        try {
            int i3 = ak + 3;
            isLogoutPending = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String invoke() {
        try {
            int i = ak + 43;
            isLogoutPending = i % 128;
            int i2 = i % 2;
            String str = this.HaptikSDK$e;
            int i3 = isLogoutPending + 55;
            ak = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 29 : '2') != 29) {
                return str;
            }
            int i4 = 76 / 0;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String HaptikSDK$c() {
        int i = isLogoutPending + 17;
        ak = i % 128;
        int i2 = i % 2;
        try {
            String str = this.getSignupData;
            int i3 = isLogoutPending + 65;
            ak = i3 % 128;
            if ((i3 % 2 != 0 ? '*' : (char) 18) != '*') {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String ah$b() {
        int i = ak + 105;
        isLogoutPending = i % 128;
        if (i % 2 == 0) {
            String str = this.HaptikWebView;
            Object obj = null;
            super.hashCode();
            return str;
        }
        return this.HaptikWebView;
    }

    public setFullScreenIntent(valueOf valueof, UserFollowFollowerData userFollowFollowerData, makeBigContentView makebigcontentview, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, int i, boolean z3) {
        int i2;
        runAnimators.ag$a(userFollowFollowerData, "userFollowFollowerData");
        runAnimators.ag$a(makebigcontentview, "followUnFollowInputData");
        runAnimators.ag$a(str, "loadInstanceId");
        String str6 = "";
        runAnimators.ag$a(str2, ah$a((-1) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{21088, 29097, 49766, 56301}, new char[]{0, 0, 0, 0}, (char) (60866 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), new char[]{63071, 63427, 52371, 59501, 52747, 8517}).intern());
        runAnimators.ag$a(str3, "eventName");
        runAnimators.ag$a(str4, "profilePicDesc");
        runAnimators.ag$a(str5, "profileCardDesc");
        this.values = valueof;
        this.ag$a = makebigcontentview;
        this.HaptikSDK$b = z;
        this.invoke = str;
        this.HaptikSDK$e = str2;
        this.toString = str3;
        this.HaptikWebView = str4;
        this.getSignupData = str5;
        this.valueOf = z2;
        this.getInitSettings = i;
        this.ah$b = z3;
        this.ah$a = userFollowFollowerData;
        List<UserFollowFollowerData.OfficialTick> officialTick = userFollowFollowerData.getOfficialTick();
        if (officialTick != null) {
            UserFollowFollowerData.OfficialTick officialTick2 = (UserFollowFollowerData.OfficialTick) reserveEndViewTransition.invoke((List<? extends Object>) officialTick);
            if (officialTick2 == null) {
                i2 = isLogoutPending + 43;
            } else {
                String src = officialTick2.getSrc();
                if (src == null) {
                    i2 = isLogoutPending + 1;
                } else {
                    str6 = src;
                }
            }
            ak = i2 % 128;
            int i3 = i2 % 2;
        }
        this.HaptikSDK$a = str6;
        int i4 = ak + 33;
        isLogoutPending = i4 % 128;
        int i5 = i4 % 2;
    }

    public final UserFollowFollowerData ag$a() {
        int i = isLogoutPending + 9;
        ak = i % 128;
        int i2 = i % 2;
        UserFollowFollowerData userFollowFollowerData = this.ah$a;
        int i3 = ak + 47;
        isLogoutPending = i3 % 128;
        if (i3 % 2 != 0) {
            return userFollowFollowerData;
        }
        Object obj = null;
        super.hashCode();
        return userFollowFollowerData;
    }

    public final String HaptikSDK$a() {
        try {
            int i = isLogoutPending + 107;
            ak = i % 128;
            int i2 = i % 2;
            String str = this.HaptikSDK$a;
            int i3 = isLogoutPending + 15;
            ak = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean HaptikWebView() {
        if (this.ah$b) {
            return false;
        }
        int i = isLogoutPending + 81;
        ak = i % 128;
        int i2 = i % 2;
        try {
            if (this.HaptikSDK$c) {
                return false;
            }
            int i3 = isLogoutPending + 99;
            ak = i3 % 128;
            int i4 = i3 % 2;
            this.HaptikSDK$c = true;
            if ((this.valueOf ? '/' : '\"') != '/') {
                return false;
            }
            int i5 = ak + 7;
            isLogoutPending = i5 % 128;
            if ((i5 % 2 == 0 ? 'c' : '(') != 'c') {
                if (this.getInitSettings >= 7) {
                    return false;
                }
            } else if (this.getInitSettings >= 45) {
                return false;
            }
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ah$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ HaptikSDK$d) ^ a) ^ aj$a);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
