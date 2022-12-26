package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import o.waitForLoader;
/* loaded from: classes6.dex */
public abstract class waitForLoader<F extends JsonFactory, B extends waitForLoader<F, B>> {
    public int HaptikSDK$b;
    public int HaptikSDK$e;
    public int HaptikWebView;
    public OutputDecorator ah$b;
    public InputDecorator invoke;
    protected static final int valueOf = JsonFactory.Feature.collectDefaults();
    protected static final int HaptikSDK$a = JsonParser.Feature.collectDefaults();
    protected static final int HaptikSDK$c = JsonGenerator.Feature.collectDefaults();

    /* JADX INFO: Access modifiers changed from: protected */
    public waitForLoader() {
        this.HaptikSDK$b = valueOf;
        this.HaptikWebView = HaptikSDK$a;
        this.HaptikSDK$e = HaptikSDK$c;
        this.invoke = null;
        this.ah$b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public waitForLoader(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
    }

    protected waitForLoader(int i, int i2, int i3) {
        this.HaptikSDK$b = i;
        this.HaptikWebView = i2;
        this.HaptikSDK$e = i3;
    }
}
