package com.dreampay.wallets;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.dreampay.wallets.models.WalletFlow;
import java.io.Serializable;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.moveToLast;
/* loaded from: classes4.dex */
final class WalletActivity$flow$2 extends Lambda implements Styleable.ArcMotion<WalletFlow> {
    private static int HaptikSDK$b = 1;
    private static int ag$a = 47;
    private static int ah$a = -1863308858;
    private static int ah$b = 0;
    private static int toString = -1993328560;
    private static byte[] valueOf = {-115, -120, -117, 0};
    private static short[] values;
    final /* synthetic */ WalletActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletActivity$flow$2(WalletActivity walletActivity) {
        super(0);
        this.this$0 = walletActivity;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ WalletFlow invoke() {
        try {
            int i = HaptikSDK$b + 95;
            ah$b = i % 128;
            int i2 = i % 2;
            WalletFlow invoke = invoke();
            int i3 = ah$b + 87;
            HaptikSDK$b = i3 % 128;
            if ((i3 % 2 == 0 ? '(' : '/') != '/') {
                int i4 = 59 / 0;
                return invoke;
            }
            return invoke;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final WalletFlow invoke() {
        Serializable serializableExtra = this.this$0.getIntent().getSerializableExtra(valueOf((byte) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) - 42, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1863308960, (short) (123 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.indexOf("", "") + 1993328560).intern());
        WalletFlow walletFlow = serializableExtra instanceof WalletFlow ? (WalletFlow) serializableExtra : null;
        if (!(walletFlow != null)) {
            int i = ah$b + 33;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            WalletFlow walletFlow2 = WalletFlow.NONE;
            int i3 = ah$b + 87;
            HaptikSDK$b = i3 % 128;
            int i4 = i3 % 2;
            return walletFlow2;
        }
        return walletFlow;
    }

    private static String valueOf(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ag$a;
            boolean z = i4 == -1;
            if (z) {
                if (valueOf != null) {
                    i4 = (byte) (valueOf[toString + i3] + ag$a);
                } else {
                    i4 = (short) (values[toString + i3] + ag$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + toString + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + ah$a);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (valueOf != null) {
                        byte[] bArr = valueOf;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = values;
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
