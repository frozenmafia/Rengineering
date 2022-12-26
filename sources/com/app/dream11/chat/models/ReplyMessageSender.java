package com.app.dream11.chat.models;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.ExpandableListView;
import o.isFullSpan;
import o.moveToLast;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ReplyMessageSender {
    private static int HaptikSDK$c = 1;
    private static int ag$a = 15;
    private static short[] ah$a = null;
    private static int invoke = 0;
    private static byte[] toString = {-13, 118};
    private static int valueOf = -1013732376;
    private static int values = -2048463339;
    @isFullSpan(valueOf = "encryptedData")
    private final String encryptedData;
    @isFullSpan(valueOf = "id")
    private final String id;
    @isFullSpan(valueOf = "nickName")
    private final String nickName;
    @isFullSpan(valueOf = "profilePic")
    private final String profilePicEncrypted;

    public static /* synthetic */ ReplyMessageSender copy$default(ReplyMessageSender replyMessageSender, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = invoke + 33;
        HaptikSDK$c = i2 % 128;
        if ((i2 % 2 == 0 ? 'P' : '+') == 'P' ? (i ^ 1) != 0 : (i & 1) != 0) {
            str = replyMessageSender.id;
            int i3 = HaptikSDK$c + 87;
            invoke = i3 % 128;
            int i4 = i3 % 2;
        }
        if (((i & 2) != 0 ? 'b' : (char) 29) != 29) {
            str2 = replyMessageSender.nickName;
            int i5 = invoke + 21;
            HaptikSDK$c = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr = null;
        if ((i & 4) != 0) {
            int i7 = HaptikSDK$c + 13;
            invoke = i7 % 128;
            if (i7 % 2 != 0) {
                str3 = replyMessageSender.encryptedData;
                super.hashCode();
            } else {
                str3 = replyMessageSender.encryptedData;
            }
        }
        if ((i & 8) != 0) {
            try {
                int i8 = invoke + 63;
                HaptikSDK$c = i8 % 128;
                if (i8 % 2 == 0) {
                    try {
                        str4 = replyMessageSender.profilePicEncrypted;
                        int length = objArr.length;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    str4 = replyMessageSender.profilePicEncrypted;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return replyMessageSender.copy(str, str2, str3, str4);
    }

    public final String component1() {
        String str;
        try {
            int i = HaptikSDK$c + 79;
            invoke = i % 128;
            if (i % 2 != 0) {
                str = this.id;
                Object obj = null;
                super.hashCode();
            } else {
                try {
                    str = this.id;
                } catch (Exception e) {
                    throw e;
                }
            }
            int i2 = invoke + 123;
            HaptikSDK$c = i2 % 128;
            if ((i2 % 2 != 0 ? (char) 28 : (char) 1) != 28) {
                int i3 = 20 / 0;
                return str;
            }
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component2() {
        try {
            int i = invoke + 23;
            try {
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                String str = this.nickName;
                int i3 = invoke + 63;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component3() {
        try {
            int i = invoke + 93;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            String str = this.encryptedData;
            try {
                int i3 = invoke + 43;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component4() {
        try {
            int i = invoke + 25;
            HaptikSDK$c = i % 128;
            if ((i % 2 == 0 ? (char) 23 : '\f') != 23) {
                return this.profilePicEncrypted;
            }
            int i2 = 88 / 0;
            return this.profilePicEncrypted;
        } catch (Exception e) {
            throw e;
        }
    }

    public final ReplyMessageSender copy(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, valueOf((byte) Gravity.getAbsoluteGravity(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 17, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1013732480, (short) ((-124) - Process.getGidForName("")), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2048463340).intern());
        runAnimators.ag$a(str2, "nickName");
        ReplyMessageSender replyMessageSender = new ReplyMessageSender(str, str2, str3, str4);
        int i = invoke + 65;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        return replyMessageSender;
    }

    public boolean equals(Object obj) {
        if (!(this != obj)) {
            try {
                int i = HaptikSDK$c + 51;
                invoke = i % 128;
                return i % 2 == 0;
            } catch (Exception e) {
                throw e;
            }
        } else if (!(obj instanceof ReplyMessageSender)) {
            int i2 = HaptikSDK$c + 125;
            invoke = i2 % 128;
            int i3 = i2 % 2;
            return false;
        } else {
            ReplyMessageSender replyMessageSender = (ReplyMessageSender) obj;
            if (!(runAnimators.values((Object) this.id, (Object) replyMessageSender.id))) {
                return false;
            }
            if (!(runAnimators.values((Object) this.nickName, (Object) replyMessageSender.nickName))) {
                int i4 = invoke + 93;
                HaptikSDK$c = i4 % 128;
                int i5 = i4 % 2;
                return false;
            } else if (!runAnimators.values((Object) this.encryptedData, (Object) replyMessageSender.encryptedData)) {
                int i6 = invoke + 89;
                HaptikSDK$c = i6 % 128;
                int i7 = i6 % 2;
                return false;
            } else {
                try {
                    if ((!runAnimators.values((Object) this.profilePicEncrypted, (Object) replyMessageSender.profilePicEncrypted) ? '(' : 'b') == '(') {
                        int i8 = HaptikSDK$c + 23;
                        invoke = i8 % 128;
                        int i9 = i8 % 2;
                        return false;
                    }
                    int i10 = invoke + 117;
                    HaptikSDK$c = i10 % 128;
                    if (i10 % 2 == 0) {
                        Object obj2 = null;
                        super.hashCode();
                        return true;
                    }
                    return true;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode();
        int hashCode3 = this.nickName.hashCode();
        String str = this.encryptedData;
        int i = 0;
        if (str != null) {
            try {
                hashCode = str.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i2 = invoke + 93;
            HaptikSDK$c = i2 % 128;
            int i3 = i2 % 2;
            hashCode = 0;
        }
        String str2 = this.profilePicEncrypted;
        if (str2 != null) {
            i = str2.hashCode();
            try {
                int i4 = invoke + 17;
                HaptikSDK$c = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }
        return (((((hashCode2 * 31) + hashCode3) * 31) + hashCode) * 31) + i;
    }

    public String toString() {
        String str = "ReplyMessageSender(id=" + this.id + ", nickName=" + this.nickName + ", encryptedData=" + this.encryptedData + ", profilePicEncrypted=" + this.profilePicEncrypted + ")";
        int i = HaptikSDK$c + 11;
        invoke = i % 128;
        int i2 = i % 2;
        return str;
    }

    public ReplyMessageSender(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, valueOf((byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-16) - Gravity.getAbsoluteGravity(0, 0), 1013732480 - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 122), TextUtils.getTrimmedLength("") + 2048463339).intern());
        runAnimators.ag$a(str2, "nickName");
        this.id = str;
        this.nickName = str2;
        this.encryptedData = str3;
        this.profilePicEncrypted = str4;
    }

    public final String getId() {
        try {
            int i = invoke + 67;
            HaptikSDK$c = i % 128;
            if ((i % 2 == 0 ? (char) 25 : (char) 2) != 2) {
                String str = this.id;
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return this.id;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getNickName() {
        String str;
        int i = HaptikSDK$c + 101;
        invoke = i % 128;
        Object[] objArr = null;
        if (i % 2 != 0) {
            str = this.nickName;
            super.hashCode();
        } else {
            str = this.nickName;
        }
        int i2 = invoke + 65;
        HaptikSDK$c = i2 % 128;
        if (i2 % 2 == 0) {
            int length = objArr.length;
            return str;
        }
        return str;
    }

    public final String getEncryptedData() {
        String str;
        int i = HaptikSDK$c + 33;
        invoke = i % 128;
        if ((i % 2 != 0 ? '8' : ',') != ',') {
            try {
                str = this.encryptedData;
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                str = this.encryptedData;
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i2 = HaptikSDK$c + 121;
        invoke = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String getProfilePicEncrypted() {
        String str;
        int i = invoke + 31;
        HaptikSDK$c = i % 128;
        if (!(i % 2 == 0)) {
            str = this.profilePicEncrypted;
        } else {
            str = this.profilePicEncrypted;
            int i2 = 37 / 0;
        }
        int i3 = HaptikSDK$c + 109;
        invoke = i3 % 128;
        if ((i3 % 2 != 0 ? '!' : 'c') != '!') {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    private static String valueOf(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ag$a;
            boolean z = i4 == -1;
            if (z) {
                if (toString != null) {
                    i4 = (byte) (toString[values + i3] + ag$a);
                } else {
                    i4 = (short) (ah$a[values + i3] + ag$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + values + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + valueOf);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (toString != null) {
                        byte[] bArr = toString;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = ah$a;
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
