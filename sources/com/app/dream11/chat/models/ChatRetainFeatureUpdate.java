package com.app.dream11.chat.models;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.app.dream11.core.event.EventType;
import com.app.dream11.model.FeatureUpdate;
import o.isFirst;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatRetainFeatureUpdate extends FeatureUpdate {
    private static char ag$a = 3;
    private static int ah$a = 0;
    private static char[] valueOf = {13801, 13813, 13803, 13823, 13804, 13802, 13817, 13800, 13807};
    private static int values = 1;
    private final String channelUrl;
    private final String chatType;
    private final String profilePic;
    private final String source;

    public final String getChannelUrl() {
        int i = ah$a + 9;
        values = i % 128;
        int i2 = i % 2;
        try {
            String str = this.channelUrl;
            int i3 = ah$a + 71;
            values = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getProfilePic() {
        int i = values + 61;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = this.profilePic;
        try {
            int i3 = ah$a + 37;
            values = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRetainFeatureUpdate(String str, String str2, String str3, String str4) {
        super(EventType.CURRENT_RETAIN_CHAT);
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(str3, "chatType");
        runAnimators.ag$a(str4, ah$a((byte) (33 - (ViewConfiguration.getWindowTouchSlop() >> 8)), new char[]{1, 2, 6, '\b', 0, 6}, 5 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        this.channelUrl = str;
        this.profilePic = str2;
        this.chatType = str3;
        this.source = str4;
    }

    public final String getChatType() {
        int i = ah$a + 91;
        values = i % 128;
        int i2 = i % 2;
        String str = this.chatType;
        try {
            int i3 = values + 75;
            ah$a = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 16 : (char) 3) != 3) {
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getSource() {
        try {
            int i = values + 99;
            ah$a = i % 128;
            int i2 = i % 2;
            String str = this.source;
            int i3 = ah$a + 91;
            values = i3 % 128;
            if ((i3 % 2 == 0 ? '>' : '_') != '>') {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ah$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = valueOf;
            char c = ag$a;
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
