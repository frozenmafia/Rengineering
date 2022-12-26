package o;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class setTransactionSuccessful {
    private SymbolShapeHint HaptikSDK$a;
    private int HaptikSDK$b;
    private AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda0 HaptikSDK$c;
    int ag$a;
    private final StringBuilder ah$a;
    private int invoke;
    private lambda$setMaxSqlCacheSize$11 toString;
    private final String valueOf;
    private lambda$setMaxSqlCacheSize$11 values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTransactionSuccessful(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.valueOf = sb.toString();
        this.HaptikSDK$a = SymbolShapeHint.FORCE_NONE;
        this.ah$a = new StringBuilder(str.length());
        this.HaptikSDK$b = -1;
    }

    public void valueOf(SymbolShapeHint symbolShapeHint) {
        this.HaptikSDK$a = symbolShapeHint;
    }

    public void ah$a(lambda$setMaxSqlCacheSize$11 lambda_setmaxsqlcachesize_11, lambda$setMaxSqlCacheSize$11 lambda_setmaxsqlcachesize_112) {
        this.values = lambda_setmaxsqlcachesize_11;
        this.toString = lambda_setmaxsqlcachesize_112;
    }

    public String valueOf() {
        return this.valueOf;
    }

    public void ag$a(int i) {
        this.invoke = i;
    }

    public char values() {
        return this.valueOf.charAt(this.ag$a);
    }

    public StringBuilder ah$a() {
        return this.ah$a;
    }

    public void values(String str) {
        this.ah$a.append(str);
    }

    public void values(char c) {
        this.ah$a.append(c);
    }

    public int ag$a() {
        return this.ah$a.length();
    }

    public int invoke() {
        return this.HaptikSDK$b;
    }

    public void values(int i) {
        this.HaptikSDK$b = i;
    }

    public void ah$b() {
        this.HaptikSDK$b = -1;
    }

    public boolean HaptikSDK$a() {
        return this.ag$a < HaptikWebView();
    }

    private int HaptikWebView() {
        return this.valueOf.length() - this.invoke;
    }

    public int HaptikSDK$b() {
        return HaptikWebView() - this.ag$a;
    }

    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda0 HaptikSDK$c() {
        return this.HaptikSDK$c;
    }

    public void getInitSettings() {
        valueOf(ag$a());
    }

    public void valueOf(int i) {
        AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda0 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda0 = this.HaptikSDK$c;
        if (autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda0 == null || i > autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda0.ah$a()) {
            this.HaptikSDK$c = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda0.toString(i, this.HaptikSDK$a, this.values, this.toString, true);
        }
    }

    public void HaptikSDK$e() {
        this.HaptikSDK$c = null;
    }
}
