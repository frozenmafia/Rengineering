package o;

import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
/* loaded from: classes7.dex */
public class autoGenerate {
    public static boolean ah$a(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a = curve.getA();
        BigInteger b2 = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p).equals(bigInteger.pow(3).add(a.multiply(bigInteger)).add(b2).mod(p));
    }
}
