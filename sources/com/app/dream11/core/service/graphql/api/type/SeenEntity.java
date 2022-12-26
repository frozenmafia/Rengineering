package com.app.dream11.core.service.graphql.api.type;

import android.text.TextUtils;
import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.isLast;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SeenEntity implements ComponentActivity.AnonymousClass6 {
    private final AwardType awardType;
    private final int id;

    public static /* synthetic */ SeenEntity copy$default(SeenEntity seenEntity, AwardType awardType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            awardType = seenEntity.awardType;
        }
        if ((i2 & 2) != 0) {
            i = seenEntity.id;
        }
        return seenEntity.copy(awardType, i);
    }

    public final AwardType component1() {
        return this.awardType;
    }

    public final int component2() {
        return this.id;
    }

    public final SeenEntity copy(AwardType awardType, int i) {
        runAnimators.ag$a(awardType, "awardType");
        return new SeenEntity(awardType, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeenEntity) {
            SeenEntity seenEntity = (SeenEntity) obj;
            return this.awardType == seenEntity.awardType && this.id == seenEntity.id;
        }
        return false;
    }

    public int hashCode() {
        return (this.awardType.hashCode() * 31) + this.id;
    }

    public String toString() {
        AwardType awardType = this.awardType;
        int i = this.id;
        return "SeenEntity(awardType=" + awardType + ", id=" + i + ")";
    }

    public SeenEntity(AwardType awardType, int i) {
        runAnimators.ag$a(awardType, "awardType");
        this.awardType = awardType;
        this.id = i;
    }

    public final AwardType getAwardType() {
        return this.awardType;
    }

    public final int getId() {
        return this.id;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.SeenEntity$marshaller$$inlined$invoke$1
            private static int HaptikSDK$a = 1;
            private static int HaptikSDK$b = 0;
            private static boolean ah$a = true;
            private static int toString = 265;
            private static boolean valueOf = true;
            private static char[] values = {370, 365};

            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                int i = HaptikSDK$b + 79;
                HaptikSDK$a = i % 128;
                int i2 = i % 2;
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ah$a("awardType", SeenEntity.this.getAwardType().getRawValue());
                onBackPressedCallback.ag$a(valueOf(null, null, 127 - TextUtils.getCapsMode("", 0, 0), new byte[]{-126, -127}).intern(), Integer.valueOf(SeenEntity.this.getId()));
                int i3 = HaptikSDK$a + 27;
                HaptikSDK$b = i3 % 128;
                int i4 = i3 % 2;
            }

            private static String valueOf(char[] cArr, int[] iArr, int i, byte[] bArr) {
                synchronized (isLast.valueOf) {
                    char[] cArr2 = values;
                    int i2 = toString;
                    if (valueOf) {
                        int length = bArr.length;
                        isLast.values = length;
                        char[] cArr3 = new char[length];
                        isLast.toString = 0;
                        while (isLast.toString < isLast.values) {
                            cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                            isLast.toString++;
                        }
                        return new String(cArr3);
                    } else if (ah$a) {
                        int length2 = cArr.length;
                        isLast.values = length2;
                        char[] cArr4 = new char[length2];
                        isLast.toString = 0;
                        while (isLast.toString < isLast.values) {
                            cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                            isLast.toString++;
                        }
                        return new String(cArr4);
                    } else {
                        int length3 = iArr.length;
                        isLast.values = length3;
                        char[] cArr5 = new char[length3];
                        isLast.toString = 0;
                        while (isLast.toString < isLast.values) {
                            cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                            isLast.toString++;
                        }
                        return new String(cArr5);
                    }
                }
            }
        };
    }
}
