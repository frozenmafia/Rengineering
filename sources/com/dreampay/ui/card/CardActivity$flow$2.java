package com.dreampay.ui.card;

import android.os.Process;
import java.io.Serializable;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.moveToFirst;
/* loaded from: classes4.dex */
final class CardActivity$flow$2 extends Lambda implements Styleable.ArcMotion<String> {
    private static int HaptikSDK$c = 1;
    private static char ag$a = 14940;
    private static int ah$a = 0;
    private static char toString = 7824;
    private static char valueOf = 59193;
    private static char values = 27901;
    final /* synthetic */ CardActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardActivity$flow$2(CardActivity cardActivity) {
        super(0);
        this.this$0 = cardActivity;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ String invoke() {
        String invoke2;
        int i = HaptikSDK$c + 121;
        ah$a = i % 128;
        if (!(i % 2 == 0)) {
            invoke2 = invoke2();
            int i2 = 11 / 0;
        } else {
            invoke2 = invoke2();
        }
        try {
            int i3 = HaptikSDK$c + 5;
            ah$a = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 3 : (char) 7) != 3) {
                return invoke2;
            }
            int i4 = 0 / 0;
            return invoke2;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String invoke2() {
        Serializable serializableExtra = this.this$0.getIntent().getSerializableExtra(ag$a(new char[]{28910, 28621, 14038, 29855}, 4 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
        if (serializableExtra == null) {
            int i = ah$a + 25;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
        } else {
            String obj = serializableExtra.toString();
            if (obj != null) {
                return obj;
            }
            int i3 = ah$a + 29;
            HaptikSDK$c = i3 % 128;
            int i4 = i3 % 2;
        }
        return "";
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
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ag$a)) ^ ((cArr3[0] >>> 5) + valueOf)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + toString)) ^ ((cArr3[1] >>> 5) + values)));
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
