package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;
/* loaded from: classes6.dex */
public abstract class getSelectionArgs extends JsonParser {
    protected static final BigDecimal HaptikSDK$e;
    protected static final BigDecimal HaptikWebView;
    protected static final BigDecimal a;
    protected static final BigInteger aj$a;
    protected static final BigInteger ak;
    protected static final BigInteger extraCallbackWithResult;
    protected static final BigDecimal isLogoutPending;
    protected static final BigInteger onXdkEvent;
    protected JsonToken ICustomTabsCallback;
    protected static final byte[] extraCallback = new byte[0];
    protected static final int[] ak$a = new int[0];

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        ak = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        aj$a = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        extraCallbackWithResult = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        onXdkEvent = valueOf4;
        isLogoutPending = new BigDecimal(valueOf3);
        HaptikWebView = new BigDecimal(valueOf4);
        a = new BigDecimal(valueOf);
        HaptikSDK$e = new BigDecimal(valueOf2);
    }

    protected getSelectionArgs() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public getSelectionArgs(int i) {
        super(i);
    }
}
