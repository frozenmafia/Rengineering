package o;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
/* loaded from: classes5.dex */
public final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda4 {
    private AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0 ag$a;
    private Mode ah$a;
    private int toString = -1;
    private bindString valueOf;
    private ErrorCorrectionLevel values;

    public static boolean values(int i) {
        return i >= 0 && i < 8;
    }

    public AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0 valueOf() {
        return this.ag$a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.ah$a);
        sb.append("\n ecLevel: ");
        sb.append(this.values);
        sb.append("\n version: ");
        sb.append(this.valueOf);
        sb.append("\n maskPattern: ");
        sb.append(this.toString);
        if (this.ag$a == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.ag$a);
        }
        sb.append(">>\n");
        return sb.toString();
    }

    public void values(Mode mode) {
        this.ah$a = mode;
    }

    public void ag$a(ErrorCorrectionLevel errorCorrectionLevel) {
        this.values = errorCorrectionLevel;
    }

    public void toString(bindString bindstring) {
        this.valueOf = bindstring;
    }

    public void ah$a(int i) {
        this.toString = i;
    }

    public void valueOf(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0 autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0) {
        this.ag$a = autoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0;
    }
}
