package com.app.dream11.social.contactsync.flowstates;

import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.app.dream11.model.FlowState;
import com.app.dream11.social.contactsync.features.ContactsType;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Objects;
import o.isFirst;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ContactSyncFlowState extends FlowState {
    private static int ag$a = 1;
    private static char ah$a = 3;
    private static char[] toString = {13801, 13804, 13817, 13802, 13803, 13807, 13813, 13800, 13823};
    private static int valueOf;

    /* renamed from: default  reason: not valid java name */
    private final String f29default;
    private final String shareType;

    public ContactSyncFlowState() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSyncFlowState(ContactsType contactsType, boolean z, String str) {
        super(FlowStates.CONTACT_SYNC, null, 2, null);
        runAnimators.ag$a(contactsType, "type");
        runAnimators.ag$a(str, values((byte) (30 - View.MeasureSpec.makeMeasureSpec(0, 0)), new char[]{3, 0, 4, '\b', 5, 2}, 6 - Color.green(0)).intern());
        this.f29default = "type";
        this.shareType = "shareType";
        putExtra("type", contactsType);
        putExtra("shareType", Boolean.valueOf(z));
        putExtra(values((byte) (View.resolveSizeAndState(0, 0, 0) + 30), new char[]{3, 0, 4, '\b', 5, 2}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6).intern(), str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ContactSyncFlowState(com.app.dream11.social.contactsync.features.ContactsType r2, boolean r3, java.lang.String r4, int r5, o.getTargetTypes r6) {
        /*
            r1 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L1d
            int r2 = com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.ag$a
            int r2 = r2 + 85
            int r6 = r2 % 128
            com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.valueOf = r6
            int r2 = r2 % 2
            com.app.dream11.social.contactsync.features.ContactsType r2 = com.app.dream11.social.contactsync.features.ContactsType.NONE     // Catch: java.lang.Exception -> L1b
            int r6 = com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.valueOf
            int r6 = r6 + 95
            int r0 = r6 % 128
            com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.ag$a = r0
            int r6 = r6 % 2
            goto L1d
        L1b:
            r2 = move-exception
            throw r2
        L1d:
            r6 = r5 & 2
            if (r6 == 0) goto L2c
            r3 = 0
            int r6 = com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.ag$a
            int r6 = r6 + 19
            int r0 = r6 % 128
            com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.valueOf = r0
            int r6 = r6 % 2
        L2c:
            r5 = r5 & 4
            r6 = 44
            if (r5 == 0) goto L35
            r5 = 44
            goto L37
        L35:
            r5 = 97
        L37:
            if (r5 == r6) goto L3a
            goto L3c
        L3a:
            java.lang.String r4 = ""
        L3c:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.<init>(com.app.dream11.social.contactsync.features.ContactsType, boolean, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r1 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        if ((r0 instanceof com.app.dream11.social.contactsync.features.ContactsType ? '(' : '2') != '2') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        r0 = (com.app.dream11.social.contactsync.features.ContactsType) r0;
        r1 = com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.ag$a + 121;
        com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.valueOf = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.app.dream11.social.contactsync.features.ContactsType getDefaultType() {
        /*
            r4 = this;
            int r0 = com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.ag$a
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.valueOf = r1
            int r0 = r0 % 2
            r1 = 25
            if (r0 == 0) goto L11
            r0 = 90
            goto L13
        L11:
            r0 = 25
        L13:
            r2 = 0
            if (r0 == r1) goto L26
            java.lang.String r0 = r4.f29default
            java.io.Serializable r0 = r4.getExtra(r0)
            boolean r1 = r0 instanceof com.app.dream11.social.contactsync.features.ContactsType
            super.hashCode()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L46
            goto L39
        L24:
            r0 = move-exception
            throw r0
        L26:
            java.lang.String r0 = r4.f29default     // Catch: java.lang.Exception -> L63
            java.io.Serializable r0 = r4.getExtra(r0)     // Catch: java.lang.Exception -> L63
            boolean r1 = r0 instanceof com.app.dream11.social.contactsync.features.ContactsType     // Catch: java.lang.Exception -> L63
            r3 = 50
            if (r1 == 0) goto L35
            r1 = 40
            goto L37
        L35:
            r1 = 50
        L37:
            if (r1 == r3) goto L46
        L39:
            com.app.dream11.social.contactsync.features.ContactsType r0 = (com.app.dream11.social.contactsync.features.ContactsType) r0
            int r1 = com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.ag$a
            int r1 = r1 + 121
            int r3 = r1 % 128
            com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.valueOf = r3
            int r1 = r1 % 2
            goto L47
        L46:
            r0 = r2
        L47:
            if (r0 != 0) goto L62
            int r0 = com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.valueOf     // Catch: java.lang.Exception -> L60
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.ag$a = r1     // Catch: java.lang.Exception -> L63
            int r0 = r0 % 2
            if (r0 != 0) goto L5d
            com.app.dream11.social.contactsync.features.ContactsType r0 = com.app.dream11.social.contactsync.features.ContactsType.NONE
            super.hashCode()     // Catch: java.lang.Throwable -> L5b
            goto L62
        L5b:
            r0 = move-exception
            throw r0
        L5d:
            com.app.dream11.social.contactsync.features.ContactsType r0 = com.app.dream11.social.contactsync.features.ContactsType.NONE
            goto L62
        L60:
            r0 = move-exception
            throw r0
        L62:
            return r0
        L63:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.social.contactsync.flowstates.ContactSyncFlowState.getDefaultType():com.app.dream11.social.contactsync.features.ContactsType");
    }

    public final boolean getShareLanguage() {
        try {
            int i = valueOf + 125;
            ag$a = i % 128;
            if (!(i % 2 != 0)) {
                Serializable extra = getExtra(this.shareType);
                Objects.requireNonNull(extra, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) extra).booleanValue();
                Object[] objArr = null;
                int length = objArr.length;
                return booleanValue;
            }
            Serializable extra2 = getExtra(this.shareType);
            Objects.requireNonNull(extra2, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) extra2).booleanValue();
        } catch (Exception e) {
            throw e;
        }
    }

    private static String values(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = toString;
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
