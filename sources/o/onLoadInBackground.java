package o;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
/* loaded from: classes6.dex */
public abstract class onLoadInBackground extends JsonGenerator {
    protected static final int ag$a = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
    protected loadInBackground HaptikSDK$a;
    protected int ah$a;
    protected Loader ah$b;
    protected boolean toString;
    protected boolean values;

    protected abstract void ah$a();

    /* JADX INFO: Access modifiers changed from: protected */
    public onLoadInBackground(int i, loadInBackground loadinbackground) {
        this.ah$a = i;
        this.HaptikSDK$a = loadinbackground;
        this.ah$b = Loader.ag$a(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? abandon.values(this) : null);
        this.values = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    public final boolean values(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.ah$a) != 0;
    }

    public executePendingTask values() {
        return this.ah$b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.toString = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int ag$a(int i, int i2) throws IOException {
        if (i2 < 56320 || i2 > 57343) {
            toString("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2));
        }
        return ((i - 55296) << 10) + 65536 + (i2 - 56320);
    }
}
