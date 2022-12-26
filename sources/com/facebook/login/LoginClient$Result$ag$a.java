package com.facebook.login;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import o.getTargetTypes;
import o.moveToFirst;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class LoginClient$Result$ag$a {
    private static int HaptikSDK$c = 1;
    private static char ag$a = 64985;
    private static char ah$a = 11046;
    private static char toString = 13160;
    private static char valueOf = 47099;
    private static int values;

    public /* synthetic */ LoginClient$Result$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private LoginClient$Result$ag$a() {
    }

    public final LoginClient.Result toString(LoginClient.Request request, AccessToken accessToken) {
        runAnimators.ag$a(accessToken, ag$a(new char[]{31518, 50125, 14132, 25539, 18375, 52452}, 5 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        LoginClient.Result result = new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, accessToken, null, null);
        int i = values + 119;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? (char) 11 : '>') != 11) {
            return result;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return result;
    }

    public final LoginClient.Result values(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
        LoginClient.Result result = new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, accessToken, authenticationToken, null, null);
        int i = values + 115;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        return result;
    }

    public final LoginClient.Result ah$a(LoginClient.Request request, String str) {
        LoginClient.Result result = new LoginClient.Result(request, LoginClient.Result.Code.CANCEL, null, str, null);
        int i = HaptikSDK$c + 41;
        values = i % 128;
        if (!(i % 2 != 0)) {
            return result;
        }
        Object obj = null;
        super.hashCode();
        return result;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0021, code lost:
        if (((r6 & 23) == 0) != true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.facebook.login.LoginClient.Result toString(com.facebook.login.LoginClient$Result$ag$a r1, com.facebook.login.LoginClient.Request r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.Object r7) {
        /*
            int r7 = com.facebook.login.LoginClient$Result$ag$a.HaptikSDK$c     // Catch: java.lang.Exception -> L3d
            int r7 = r7 + 89
            int r0 = r7 % 128
            com.facebook.login.LoginClient$Result$ag$a.values = r0     // Catch: java.lang.Exception -> L3d
            int r7 = r7 % 2
            r0 = 23
            if (r7 == 0) goto L11
            r7 = 23
            goto L13
        L11:
            r7 = 46
        L13:
            if (r7 == r0) goto L1a
            r6 = r6 & 8
            if (r6 == 0) goto L2e
            goto L23
        L1a:
            r6 = r6 & r0
            r7 = 1
            if (r6 == 0) goto L20
            r6 = 0
            goto L21
        L20:
            r6 = 1
        L21:
            if (r6 == r7) goto L2e
        L23:
            r5 = 0
            int r6 = com.facebook.login.LoginClient$Result$ag$a.HaptikSDK$c     // Catch: java.lang.Exception -> L3d
            int r6 = r6 + 77
            int r7 = r6 % 128
            com.facebook.login.LoginClient$Result$ag$a.values = r7     // Catch: java.lang.Exception -> L3d
            int r6 = r6 % 2
        L2e:
            com.facebook.login.LoginClient$Result r1 = r1.toString(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L3d
            int r2 = com.facebook.login.LoginClient$Result$ag$a.HaptikSDK$c
            int r2 = r2 + 75
            int r3 = r2 % 128
            com.facebook.login.LoginClient$Result$ag$a.values = r3
            int r2 = r2 % 2
            return r1
        L3d:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient$Result$ag$a.toString(com.facebook.login.LoginClient$Result$ag$a, com.facebook.login.LoginClient$Request, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):com.facebook.login.LoginClient$Result");
    }

    public final LoginClient.Result toString(LoginClient.Request request, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            int i = values + 79;
            HaptikSDK$c = i % 128;
            if (i % 2 != 0) {
                arrayList.add(str);
            } else {
                arrayList.add(str);
                int i2 = 36 / 0;
            }
        }
        if ((str2 != null ? (char) 19 : 'S') == 19) {
            arrayList.add(str2);
            int i3 = HaptikSDK$c + 25;
            values = i3 % 128;
            int i4 = i3 % 2;
        }
        try {
            try {
                return new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), str3);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ag$a(char[] cArr, int i) {
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
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + toString)) ^ ((cArr3[0] >>> 5) + valueOf)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ah$a)) ^ ((cArr3[1] >>> 5) + ag$a)));
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
