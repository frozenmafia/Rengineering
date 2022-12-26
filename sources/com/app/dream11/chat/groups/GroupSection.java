package com.app.dream11.chat.groups;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import o.moveToLast;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupSection {
    private static int HaptikSDK$b = 0;
    private static int HaptikSDK$c = 1;
    private static int ag$a = 119;
    private static int ah$a = 513998172;
    private static short[] toString = null;
    private static int valueOf = -979603801;
    private static byte[] values = {-125, -126, -107, Byte.MAX_VALUE, 0};
    private final ArrayList<GroupBottomSheetItemVM> list;
    private final int sectionType;
    private final String title;

    public GroupSection(int i, String str, ArrayList<GroupBottomSheetItemVM> arrayList) {
        runAnimators.ag$a(str, ag$a((byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) - 114, (-513998056) - TextUtils.getOffsetAfter("", 0), (short) (118 - View.MeasureSpec.makeMeasureSpec(0, 0)), View.MeasureSpec.getMode(0) + 979603801).intern());
        runAnimators.ag$a(arrayList, "list");
        this.sectionType = i;
        this.title = str;
        this.list = arrayList;
    }

    public final ArrayList<GroupBottomSheetItemVM> getList() {
        int i = HaptikSDK$c + 3;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        ArrayList<GroupBottomSheetItemVM> arrayList = this.list;
        int i3 = HaptikSDK$b + 33;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return arrayList;
    }

    public final int getSectionType() {
        int i = HaptikSDK$b + 55;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        try {
            int i3 = this.sectionType;
            int i4 = HaptikSDK$b + 9;
            try {
                HaptikSDK$c = i4 % 128;
                if (!(i4 % 2 != 0)) {
                    int i5 = 36 / 0;
                    return i3;
                }
                return i3;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getTitle() {
        int i = HaptikSDK$b + 15;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.title;
        try {
            int i3 = HaptikSDK$b + 45;
            HaptikSDK$c = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (((com.app.dream11.chat.groups.GroupSection) r4).sectionType == r3.sectionType) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        if ((r4 == r0 ? 'D' : '&') != '&') goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        r4 = com.app.dream11.chat.groups.GroupSection.HaptikSDK$c + 69;
        com.app.dream11.chat.groups.GroupSection.HaptikSDK$b = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.app.dream11.chat.groups.GroupSection
            r1 = 1
            if (r0 == 0) goto L46
            int r0 = com.app.dream11.chat.groups.GroupSection.HaptikSDK$c
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.app.dream11.chat.groups.GroupSection.HaptikSDK$b = r2
            int r0 = r0 % 2
            r2 = 71
            if (r0 == 0) goto L15
            r0 = 71
            goto L17
        L15:
            r0 = 53
        L17:
            if (r0 == r2) goto L24
            com.app.dream11.chat.groups.GroupSection r4 = (com.app.dream11.chat.groups.GroupSection) r4     // Catch: java.lang.Exception -> L22
            int r4 = r4.sectionType     // Catch: java.lang.Exception -> L22
            int r0 = r3.sectionType     // Catch: java.lang.Exception -> L22
            if (r4 != r0) goto L46
            goto L39
        L22:
            r4 = move-exception
            throw r4
        L24:
            com.app.dream11.chat.groups.GroupSection r4 = (com.app.dream11.chat.groups.GroupSection) r4
            int r4 = r4.sectionType
            int r0 = r3.sectionType
            r2 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L44
            r2 = 38
            if (r4 != r0) goto L35
            r4 = 68
            goto L37
        L35:
            r4 = 38
        L37:
            if (r4 == r2) goto L46
        L39:
            int r4 = com.app.dream11.chat.groups.GroupSection.HaptikSDK$c
            int r4 = r4 + 69
            int r0 = r4 % 128
            com.app.dream11.chat.groups.GroupSection.HaptikSDK$b = r0
        L41:
            int r4 = r4 % 2
            goto L50
        L44:
            r4 = move-exception
            throw r4
        L46:
            r1 = 0
            int r4 = com.app.dream11.chat.groups.GroupSection.HaptikSDK$b
            int r4 = r4 + 93
            int r0 = r4 % 128
            com.app.dream11.chat.groups.GroupSection.HaptikSDK$c = r0
            goto L41
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.chat.groups.GroupSection.equals(java.lang.Object):boolean");
    }

    private static String ag$a(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ag$a;
            boolean z = i4 == -1;
            if (z) {
                if (values != null) {
                    i4 = (byte) (values[valueOf + i3] + ag$a);
                } else {
                    i4 = (short) (toString[valueOf + i3] + ag$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + valueOf + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + ah$a);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (values != null) {
                        byte[] bArr = values;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = toString;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
