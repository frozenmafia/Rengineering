package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import com.appsflyer.AFLogger;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b {
    private static int AFInAppEventParameterName = 1;
    private static int valueOf;
    private static int[] AFKeystoreWrapper = {-1561070057, 514484915, 930939875, 301799129, -1732453763, 2117582934, 45892617, 527080290, -475401890, 1909085415, 1501949576, 1209623277, 100102418, 1725391356, 261332508, -2136743842, 1926168337, 853198554};
    private static long AFInAppEventType = 1208377450132544418L;

    b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String valueOf(android.content.Context r19, long r20) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.b.valueOf(android.content.Context, long):java.lang.String");
    }

    private static String valueOf(String str, Long l) {
        int i = AFInAppEventParameterName;
        valueOf = (i + 5) % 128;
        if (!(str == null) && l != null) {
            int i2 = i + 21;
            valueOf = i2 % 128;
            if ((i2 % 2 != 0) ? str.length() == 105 : str.length() == 32) {
                StringBuilder sb = new StringBuilder(str);
                String obj = l.toString();
                long j = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < obj.length(); i4++) {
                    i3 += Character.getNumericValue(obj.charAt(i4));
                }
                String hexString = Integer.toHexString(i3);
                sb.replace(7, hexString.length() + 7, hexString);
                valueOf = (AFInAppEventParameterName + 5) % 128;
                int i5 = 0;
                while (true) {
                    if (i5 >= sb.length()) {
                        break;
                    }
                    j += Character.getNumericValue(sb.charAt(i5));
                    i5++;
                }
                while (true) {
                    if ((j > 100 ? (char) 7 : (char) 25) == 25) {
                        break;
                    }
                    int i6 = valueOf + 1;
                    AFInAppEventParameterName = i6 % 128;
                    j = i6 % 2 == 0 ? j & 100 : j % 100;
                }
                sb.insert(23, (int) j);
                if (j < 10) {
                    sb.insert(23, valueOf(new int[]{800975718, 1188862115}, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
                }
                String obj2 = sb.toString();
                AFInAppEventParameterName = (valueOf + 39) % 128;
                return obj2;
            }
        }
        return valueOf(new int[]{1802321378, -951457527, -1819654011, -20136054, 1414463443, 2024286047, -280389489, -614427551, 1395119073, 355582374, -181284088, 1734397673, -1098400086, -1844892891, -1303208920, -1462041732}, View.MeasureSpec.makeMeasureSpec(0, 0) + 32).intern();
    }

    private static boolean AFInAppEventType(String str) {
        int i = valueOf + 35;
        AFInAppEventParameterName = i % 128;
        int i2 = i % 2;
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String AFKeystoreWrapper(String str) {
        AFInAppEventParameterName = (valueOf + 43) % 128;
        Object[] objArr = null;
        if (str.contains(AFInAppEventParameterName("蘏鶃").intern())) {
            String[] split = str.split(AFInAppEventParameterName("훙촧똾").intern());
            int length = split.length;
            StringBuilder sb = new StringBuilder();
            int i = length - 1;
            sb.append(split[i]);
            sb.append(AFInAppEventParameterName("蘏鶃").intern());
            int i2 = 1;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                int i3 = AFInAppEventParameterName + 29;
                valueOf = i3 % 128;
                if (i3 % 2 != 0) {
                    sb.append(split[i2]);
                    sb.append(AFInAppEventParameterName("蘏鶃").intern());
                    i2 += 46;
                } else {
                    sb.append(split[i2]);
                    sb.append(AFInAppEventParameterName("蘏鶃").intern());
                    i2++;
                }
            }
            sb.append(split[0]);
            String obj = sb.toString();
            int i4 = valueOf + 93;
            AFInAppEventParameterName = i4 % 128;
            if ((i4 % 2 == 0 ? 'J' : '/') != 'J') {
                return obj;
            }
            int length2 = objArr.length;
            return obj;
        }
        int i5 = AFInAppEventParameterName;
        int i6 = i5 + 11;
        valueOf = i6 % 128;
        if (i6 % 2 != 0) {
            int length3 = objArr.length;
        }
        int i7 = i5 + 65;
        valueOf = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        int i8 = 13 / 0;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        if ((java.lang.System.getProperties().containsKey(valueOf(new int[]{1141018980, -98311195, 450320629, -863775449, -1220162186, -1527388840, 1565031198, -886603873}, 32 - android.text.TextUtils.getCapsMode("", 0, 1)).intern()) ? 29 : ']') != 29) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (java.lang.System.getProperties().containsKey(valueOf(new int[]{1141018980, -98311195, 450320629, -863775449, -1220162186, -1527388840, 1565031198, -886603873}, 14 - android.text.TextUtils.getCapsMode("", 0, 0)).intern()) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        r7 = java.util.regex.Pattern.compile(AFInAppEventParameterName("㹣◯李ꂤ\ue272ⰾ淚꼿\ue894⫳瑕").intern()).matcher(r7.getCacheDir().getPath().replace(AFInAppEventParameterName("귧뙪䀏ቶ걝繉ࢭ").intern(), ""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        if (r7.find() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
        r4 = r7.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
        com.appsflyer.internal.b.AFInAppEventParameterName = (com.appsflyer.internal.b.valueOf + 53) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
        r0 = com.appsflyer.internal.ap.AFInAppEventParameterName();
        r1 = valueOf(new int[]{1152416525, -164918015, -2080163619, 1801793819, -948359309, -2043990532, 59265054, 669102890, 1548748609, 1430423480}, 17 - android.text.TextUtils.indexOf("", "", 0, 0)).intern();
        r2 = new java.lang.StringBuilder();
        r2.append(AFInAppEventParameterName("寫䀏강ࠊ瑢큐㱄飯쒎₎責\ue8dc哃넹ᵘ礄ꕳŚ浌즶㗞醕ﷱ始藂\ue271下ꨂᙢ牕\ude08㪲暺슊⻱諳\uf6da匼뼯ᬁ䜠ꌡ").intern());
        r2.append(r7);
        r0.valueOf(null, r1, r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d6, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String values(android.content.Context r7) {
        /*
            int r0 = com.appsflyer.internal.b.AFInAppEventParameterName
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.appsflyer.internal.b.valueOf = r1
            int r0 = r0 % 2
            r1 = 54
            if (r0 == 0) goto L11
            r0 = 40
            goto L13
        L11:
            r0 = 54
        L13:
            r2 = 8
            r3 = 1
            r4 = 0
            java.lang.String r5 = ""
            r6 = 0
            if (r0 == r1) goto L44
            java.util.Properties r0 = java.lang.System.getProperties()
            int[] r1 = new int[r2]
            r1 = {x00e0: FILL_ARRAY_DATA  , data: [1141018980, -98311195, 450320629, -863775449, -1220162186, -1527388840, 1565031198, -886603873} // fill-array
            int r2 = android.text.TextUtils.getCapsMode(r5, r6, r3)
            int r2 = 32 - r2
            java.lang.String r1 = valueOf(r1, r2)
            java.lang.String r1 = r1.intern()
            boolean r0 = r0.containsKey(r1)
            r1 = 29
            if (r0 == 0) goto L3e
            r0 = 29
            goto L40
        L3e:
            r0 = 93
        L40:
            if (r0 == r1) goto L61
            goto Ld7
        L44:
            java.util.Properties r0 = java.lang.System.getProperties()
            int[] r1 = new int[r2]
            r1 = {x00f4: FILL_ARRAY_DATA  , data: [1141018980, -98311195, 450320629, -863775449, -1220162186, -1527388840, 1565031198, -886603873} // fill-array
            int r2 = android.text.TextUtils.getCapsMode(r5, r6, r6)
            int r2 = 14 - r2
            java.lang.String r1 = valueOf(r1, r2)
            java.lang.String r1 = r1.intern()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Ld7
        L61:
            java.io.File r7 = r7.getCacheDir()     // Catch: java.lang.Exception -> L9c
            java.lang.String r7 = r7.getPath()     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = "귧뙪䀏ቶ걝繉ࢭ"
            java.lang.String r0 = AFInAppEventParameterName(r0)     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L9c
            java.lang.String r7 = r7.replace(r0, r5)     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = "㹣◯李ꂤ\ue272ⰾ淚꼿\ue894⫳瑕"
            java.lang.String r0 = AFInAppEventParameterName(r0)     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L9c
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Exception -> L9c
            java.util.regex.Matcher r7 = r0.matcher(r7)     // Catch: java.lang.Exception -> L9c
            boolean r0 = r7.find()     // Catch: java.lang.Exception -> L9c
            if (r0 == 0) goto Ld7
            java.lang.String r4 = r7.group(r3)     // Catch: java.lang.Exception -> L9c
            int r7 = com.appsflyer.internal.b.valueOf
            int r7 = r7 + 53
            int r7 = r7 % 128
            com.appsflyer.internal.b.AFInAppEventParameterName = r7
            goto Ld7
        L9c:
            r7 = move-exception
            com.appsflyer.internal.ap r0 = com.appsflyer.internal.ap.AFInAppEventParameterName()
            r1 = 10
            int[] r1 = new int[r1]
            r1 = {x0108: FILL_ARRAY_DATA  , data: [1152416525, -164918015, -2080163619, 1801793819, -948359309, -2043990532, 59265054, 669102890, 1548748609, 1430423480} // fill-array
            int r2 = android.text.TextUtils.indexOf(r5, r5, r6, r6)
            int r2 = 17 - r2
            java.lang.String r1 = valueOf(r1, r2)
            java.lang.String r1 = r1.intern()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "寫䀏강ࠊ瑢큐㱄飯쒎₎責\ue8dc哃넹ᵘ礄ꕳŚ浌즶㗞醕ﷱ始藂\ue271下ꨂᙢ牕\ude08㪲暺슊⻱諳\uf6da匼뼯ᬁ䜠ꌡ"
            java.lang.String r5 = AFInAppEventParameterName(r5)
            java.lang.String r5 = r5.intern()
            r2.append(r5)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.String[] r2 = new java.lang.String[r3]
            r2[r6] = r7
            r0.valueOf(r4, r1, r2)
            return r4
        Ld7:
            int r7 = com.appsflyer.internal.b.valueOf
            int r7 = r7 + 107
            int r7 = r7 % 128
            com.appsflyer.internal.b.AFInAppEventParameterName = r7
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.b.values(android.content.Context):java.lang.String");
    }

    private static String AFInAppEventType(Context context) {
        int i = valueOf + 11;
        AFInAppEventParameterName = i % 128;
        if (i % 2 == 0) {
        }
        Object obj = null;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i2 = valueOf + 83;
            AFInAppEventParameterName = i2 % 128;
            if ((i2 % 2 == 0 ? '@' : ')') != ')') {
                super.hashCode();
                return str;
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String AFInAppEventType(Context context, String str) {
        Iterator it;
        try {
            it = ((List) PackageManager.class.getDeclaredMethod(AFInAppEventParameterName("\uf847\ue382\ueb49\uf303\ufaf7슯쩻툧\ud9fbꆱ꤈냊뢒聸蠰韻龾杼漿皆繚䘘䷗喭嵹").intern(), Integer.TYPE).invoke(context.getPackageManager(), 0)).iterator();
        } catch (IllegalAccessException e2) {
            ap AFInAppEventParameterName2 = ap.AFInAppEventParameterName();
            String intern = valueOf(new int[]{1152416525, -164918015, -2080163619, 1801793819, 202274972, -1779018482, 588742499, -570880358, -772689434, -1383085093, -842074354, 276130351}, Color.blue(0) + 24).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(AFInAppEventParameterName("靉貭㕑\ude10䛪\uefaa遰㥽ꆃ䩝\uf30e鯮ಥ땲幼욗潗ဝ룬↬쩵猫ᮁ豉㕚\uddee䚭\uef65逶㢈ꅈ䩕\uf2f5鮢\u0c64딱巆왊漌\u17de뢯Ⅳ쨬犈ᭁ谙㒆\udde5").intern());
            sb.append(e2);
            AFInAppEventParameterName2.valueOf(null, intern, sb.toString());
        } catch (NoSuchMethodException e3) {
            ap AFInAppEventParameterName3 = ap.AFInAppEventParameterName();
            String intern2 = valueOf(new int[]{1152416525, -164918015, -2080163619, 1801793819, 202274972, -1779018482, 588742499, -570880358, -772689434, -1383085093, -842074354, 276130351}, View.getDefaultSize(0, 0) + 24).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AFInAppEventParameterName("靉貭㕑\ude10䛪\uefaa遰㥽ꆃ䩝\uf30e鯮ಥ땲幼욗潗ဝ룬↬쩵猫ᮁ豉㕚\uddee䚭\uef65逶㢈ꅈ䩕\uf2f5鮢\u0c64딱巆왊漌\u17de뢯Ⅳ쨬犈ᭁ谙㒆\udde5").intern());
            sb2.append(e3);
            AFInAppEventParameterName3.valueOf(null, intern2, sb2.toString());
        } catch (InvocationTargetException e4) {
            ap AFInAppEventParameterName4 = ap.AFInAppEventParameterName();
            String intern3 = valueOf(new int[]{1152416525, -164918015, -2080163619, 1801793819, 202274972, -1779018482, 588742499, -570880358, -772689434, -1383085093, -842074354, 276130351}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(AFInAppEventParameterName("靉貭㕑\ude10䛪\uefaa遰㥽ꆃ䩝\uf30e鯮ಥ땲幼욗潗ဝ룬↬쩵猫ᮁ豉㕚\uddee䚭\uef65逶㢈ꅈ䩕\uf2f5鮢\u0c64딱巆왊漌\u17de뢯Ⅳ쨬犈ᭁ谙㒆\udde5").intern());
            sb3.append(e4);
            AFInAppEventParameterName4.valueOf(null, intern3, sb3.toString());
        }
        do {
            if ((it.hasNext() ? '`' : 'Z') == 'Z') {
                valueOf = (AFInAppEventParameterName + 5) % 128;
                String obj = Boolean.FALSE.toString();
                int i = valueOf + 113;
                AFInAppEventParameterName = i % 128;
                if ((i % 2 == 0 ? (char) 25 : 'E') != 'E') {
                    int i2 = 78 / 0;
                    return obj;
                }
                return obj;
            }
        } while (!((PackageItemInfo) ((ApplicationInfo) it.next())).packageName.equals(str));
        valueOf = (AFInAppEventParameterName + 75) % 128;
        return Boolean.TRUE.toString();
    }

    /* loaded from: classes3.dex */
    static final class e extends HashMap<String, Object> {
        private static int AFInAppEventType = 86;
        private static int AFLogger$LogLevel = 0;
        private static int AFVersionDeclaration = 1;
        private static char AppsFlyer2dXConversionCallback = 57255;
        private static char getLevel = 2410;
        private static char valueOf = 21906;
        private static char values = 34592;
        private final Context AFInAppEventParameterName;
        private final Map<String, Object> AFKeystoreWrapper;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Map<String, Object> map, Context context) {
            this.AFKeystoreWrapper = map;
            this.AFInAppEventParameterName = context;
            put(valueOf(), AFInAppEventType());
        }

        private static StringBuilder values(String... strArr) throws Exception {
            int charAt;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if ((i < 3 ? (char) 23 : '\"') == '\"') {
                    break;
                }
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < intValue; i2++) {
                AFLogger$LogLevel = (AFVersionDeclaration + 37) % 128;
                Integer num = null;
                int i3 = 0;
                while (true) {
                    if ((i3 < 3 ? (char) 30 : (char) 27) != 27) {
                        int i4 = AFVersionDeclaration + 79;
                        AFLogger$LogLevel = i4 % 128;
                        if (i4 % 2 != 0) {
                            charAt = strArr[i3].charAt(i2);
                            int i5 = 17 / 0;
                            if (num == null) {
                                num = Integer.valueOf(charAt);
                                i3++;
                            }
                            charAt ^= num.intValue();
                            num = Integer.valueOf(charAt);
                            i3++;
                        } else {
                            charAt = strArr[i3].charAt(i2);
                            if (num == null) {
                                num = Integer.valueOf(charAt);
                                i3++;
                            }
                            charAt ^= num.intValue();
                            num = Integer.valueOf(charAt);
                            i3++;
                        }
                    }
                }
                sb.append(Integer.toHexString(num.intValue()));
            }
            return sb;
        }

        private String valueOf() {
            AFVersionDeclaration = (AFLogger$LogLevel + 59) % 128;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.AFKeystoreWrapper.get(AFKeystoreWrapper(View.MeasureSpec.getMode(0) + 6, "\u0003\uffff\n\ufff5￼\ufff7\u0006\u0003\ufff7\n\t\ufffb", !Gravity.isHorizontal(0), (Process.myTid() >> 22) + 192, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12).intern()).toString();
                String obj2 = this.AFKeystoreWrapper.get(AFInAppEventType("韒卷铹⭨\udcdb婮").intern()).toString();
                if ((obj2 == null ? '5' : '4') != '4') {
                    AFLogger$LogLevel = (AFVersionDeclaration + 81) % 128;
                    obj2 = AFKeystoreWrapper((ViewConfiguration.getTapTimeout() >> 16) + 4, "\ufff6\u0013\u0003\u0002\ufff8\u0002\ufff5\u0006", URLUtil.isHttpUrl("http://"), (ViewConfiguration.getTouchSlop() >> 8) + 162, Color.red(0) + 8).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder values2 = values(num, obj2, sb.toString());
                int length = values2.length();
                if (length > 4) {
                    values2.delete(4, length);
                } else {
                    while (true) {
                        if (length >= 4) {
                            break;
                        }
                        length++;
                        values2.append('1');
                    }
                }
                values2.insert(0, AFInAppEventType("\uf1b1ﱾ\ue4d9蹳").intern());
                return values2.toString();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AFInAppEventType("埀ᮘ\uda49ஔ螋犱듃ꓚ茝ꉷ랺⓸铹⭨␎㓇֬屧苊蔐\ue4d9蹳苊蔐墸╄\uebdf늙잶뙟⡵歐늤\u0012뷧ᬳ\uf618篩螧搞ᰆ甥긏ԥ").intern());
                sb2.append(e);
                AFLogger.AFInAppEventType(sb2.toString());
                return AFInAppEventType("낣⒨\ue4d9蹳칗㗇칗㗇").intern();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x01d7, code lost:
            if (r0.contains(AFKeystoreWrapper(4 % (android.view.ViewConfiguration.getFadingEdgeLength() - 52), ",￬￪", android.webkit.URLUtil.isDataUrl("data:") | true, 23977 >>> (android.view.ViewConfiguration.getDoubleTapTimeout() << 90), 4 - android.view.View.MeasureSpec.getMode(0)).intern()) != false) goto L27;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.String AFInAppEventType() {
            /*
                Method dump skipped, instructions count: 711
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.b.e.AFInAppEventType():java.lang.String");
        }

        /* loaded from: classes3.dex */
        public static final class a {
            public final String AFKeystoreWrapper;
            Boolean valueOf;
            public final Boolean values;

            a() {
            }

            static byte[] AFInAppEventParameterName(String str) throws Exception {
                return str.getBytes();
            }

            static byte[] AFInAppEventType(byte[] bArr) throws Exception {
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }

            static String AFKeystoreWrapper(byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArr) {
                    String hexString = Integer.toHexString(b2);
                    if (hexString.length() == 1) {
                        hexString = SessionDescription.SUPPORTED_SDP_VERSION.concat(String.valueOf(hexString));
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public a(String str, Boolean bool) {
                this.AFKeystoreWrapper = str;
                this.values = bool;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v12, types: [char[]] */
        private static String AFKeystoreWrapper(int i, String str, boolean z, int i2, int i3) {
            if ((str != 0 ? '\"' : '!') == '\"') {
                str = str.toCharArray();
            }
            char[] cArr = (char[]) str;
            char[] cArr2 = new char[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                AFLogger$LogLevel = (AFVersionDeclaration + 17) % 128;
                cArr2[i4] = (char) (cArr[i4] + i2);
                cArr2[i4] = (char) (cArr2[i4] - AFInAppEventType);
            }
            if ((i > 0 ? 'D' : 'B') == 'D') {
                AFVersionDeclaration = (AFLogger$LogLevel + 69) % 128;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                int i5 = i3 - i;
                System.arraycopy(cArr3, 0, cArr2, i5, i);
                System.arraycopy(cArr3, i, cArr2, 0, i5);
            }
            if (z) {
                int i6 = AFLogger$LogLevel + 3;
                AFVersionDeclaration = i6 % 128;
                int i7 = i6 % 2;
                char[] cArr4 = new char[i3];
                for (int i8 = 0; i8 < i3; i8++) {
                    cArr4[i8] = cArr2[(i3 - i8) - 1];
                }
                cArr2 = cArr4;
            }
            return new String(cArr2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r10 != null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
            r10 = r10.toCharArray();
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r10 != null) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String AFInAppEventType(java.lang.String r10) {
            /*
                int r0 = com.appsflyer.internal.b.e.AFLogger$LogLevel
                int r0 = r0 + 63
                int r1 = r0 % 128
                com.appsflyer.internal.b.e.AFVersionDeclaration = r1
                r1 = 2
                int r0 = r0 % r1
                if (r0 != 0) goto L15
                r0 = 0
                super.hashCode()     // Catch: java.lang.Throwable -> L13
                if (r10 == 0) goto L1b
                goto L17
            L13:
                r10 = move-exception
                throw r10
            L15:
                if (r10 == 0) goto L1b
            L17:
                char[] r10 = r10.toCharArray()
            L1b:
                char[] r10 = (char[]) r10
                int r0 = r10.length
                char[] r0 = new char[r0]
                char[] r1 = new char[r1]
                int r2 = com.appsflyer.internal.b.e.AFLogger$LogLevel
                int r2 = r2 + 125
                int r2 = r2 % 128
                com.appsflyer.internal.b.e.AFVersionDeclaration = r2
                r2 = 0
                r3 = 0
            L2c:
                int r4 = r10.length
                r5 = 86
                if (r3 >= r4) goto L34
                r4 = 86
                goto L36
            L34:
                r4 = 70
            L36:
                r6 = 1
                if (r4 == r5) goto L41
                char r10 = r0[r2]
                java.lang.String r1 = new java.lang.String
                r1.<init>(r0, r6, r10)
                return r1
            L41:
                int r4 = com.appsflyer.internal.b.e.AFLogger$LogLevel
                int r4 = r4 + 83
                int r4 = r4 % 128
                com.appsflyer.internal.b.e.AFVersionDeclaration = r4
                char r4 = r10[r3]
                r1[r2] = r4
                int r4 = r3 + 1
                char r5 = r10[r4]
                r1[r6] = r5
                char r5 = com.appsflyer.internal.b.e.values
                char r7 = com.appsflyer.internal.b.e.valueOf
                char r8 = com.appsflyer.internal.b.e.getLevel
                char r9 = com.appsflyer.internal.b.e.AppsFlyer2dXConversionCallback
                com.appsflyer.internal.cd.AFKeystoreWrapper(r1, r5, r7, r8, r9)
                char r5 = r1[r2]
                r0[r3] = r5
                char r5 = r1[r6]
                r0[r4] = r5
                int r3 = r3 + 2
                goto L2c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.b.e.AFInAppEventType(java.lang.String):java.lang.String");
        }
    }

    private static String valueOf(int[] iArr, int i) {
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = (int[]) AFKeystoreWrapper.clone();
        int i2 = 0;
        while (true) {
            if (!(i2 < iArr.length)) {
                break;
            }
            AFInAppEventParameterName = (valueOf + 107) % 128;
            cArr[0] = (char) (iArr[i2] >> 16);
            cArr[1] = (char) iArr[i2];
            int i3 = i2 + 1;
            cArr[2] = (char) (iArr[i3] >> 16);
            cArr[3] = (char) iArr[i3];
            ce.AFInAppEventParameterName(cArr, iArr2, false);
            int i4 = i2 << 1;
            cArr2[i4] = cArr[0];
            cArr2[i4 + 1] = cArr[1];
            cArr2[i4 + 2] = cArr[2];
            cArr2[i4 + 3] = cArr[3];
            i2 += 2;
        }
        String str = new String(cArr2, 0, i);
        int i5 = valueOf + 79;
        AFInAppEventParameterName = i5 % 128;
        if ((i5 % 2 == 0 ? (char) 21 : 'F') != 21) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4, types: [char[]] */
    private static String AFInAppEventParameterName(String str) {
        int i = valueOf;
        AFInAppEventParameterName = (i + 115) % 128;
        if ((str != 0 ? ')' : (char) 16) != 16) {
            AFInAppEventParameterName = (i + 123) % 128;
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        char c = cArr[0];
        int i2 = 1;
        char[] cArr2 = new char[cArr.length - 1];
        while (true) {
            if ((i2 < cArr.length ? 'J' : 'U') != 'U') {
                cArr2[i2 - 1] = (char) ((cArr[i2] ^ (i2 * c)) ^ AFInAppEventType);
                i2++;
            } else {
                return new String(cArr2);
            }
        }
    }
}
