package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
/* loaded from: classes5.dex */
public final class onViewRecycled {
    static final BigInteger toString = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    private static final double values = Math.log(10.0d);
    private static final double valueOf = Math.log(2.0d);

    public static BigInteger valueOf(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
