package o;

import com.fancode.payment.type.OrderStatus;
/* loaded from: classes4.dex */
public final /* synthetic */ class createHandle$ag$a {
    public static final /* synthetic */ int[] ah$a;

    static {
        int[] iArr = new int[OrderStatus.values().length];
        iArr[OrderStatus.FAILED.ordinal()] = 1;
        iArr[OrderStatus.PENDING.ordinal()] = 2;
        iArr[OrderStatus.REFUND_FAILED.ordinal()] = 3;
        iArr[OrderStatus.SUCCESS.ordinal()] = 4;
        iArr[OrderStatus.REFUND_INITIATED.ordinal()] = 5;
        iArr[OrderStatus.REFUNDED.ordinal()] = 6;
        iArr[OrderStatus.UNKNOWN__.ordinal()] = 7;
        ah$a = iArr;
    }
}
