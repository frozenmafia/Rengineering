package o;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.io.Reader;
/* loaded from: classes6.dex */
public class isAbandoned extends CursorLoader {
    protected Reader ICustomTabsCallback$Default;
    protected final onAbandon getDefaultImpl;
    protected final int onMessageChannelReady;
    protected loadInBackground onNavigationEvent;
    protected boolean onPostMessage;
    protected char[] onRelationshipValidationResult;
    private static final int getInterfaceDescriptor = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int onTransact = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int ICustomTabsCallback$Stub$Proxy = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int setDefaultImpl = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int asBinder = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int asInterface = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int ICustomTabsCallback$Stub = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int extraCommand = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    protected static final int[] ak$b = getSelection.invoke();

    public isAbandoned(onStopLoading onstoploading, int i, Reader reader, loadInBackground loadinbackground, onAbandon onabandon, char[] cArr, int i2, int i3, boolean z) {
        super(onstoploading, i);
        this.ICustomTabsCallback$Default = reader;
        this.onRelationshipValidationResult = cArr;
        this.HaptikSDK$b = i2;
        this.ah$b = i3;
        this.onNavigationEvent = loadinbackground;
        this.getDefaultImpl = onabandon;
        this.onMessageChannelReady = onabandon.valueOf();
        this.onPostMessage = z;
    }

    public isAbandoned(onStopLoading onstoploading, int i, Reader reader, loadInBackground loadinbackground, onAbandon onabandon) {
        super(onstoploading, i);
        this.ICustomTabsCallback$Default = reader;
        this.onRelationshipValidationResult = onstoploading.values();
        this.HaptikSDK$b = 0;
        this.ah$b = 0;
        this.onNavigationEvent = loadinbackground;
        this.getDefaultImpl = onabandon;
        this.onMessageChannelReady = onabandon.valueOf();
        this.onPostMessage = true;
    }

    @Override // o.CursorLoader
    protected void valueOf() throws IOException {
        if (this.ICustomTabsCallback$Default != null) {
            if (this.invoke.invoke() || valueOf(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.ICustomTabsCallback$Default.close();
            }
            this.ICustomTabsCallback$Default = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.CursorLoader
    public void ag$a() throws IOException {
        char[] cArr;
        super.ag$a();
        this.getDefaultImpl.ah$a();
        if (!this.onPostMessage || (cArr = this.onRelationshipValidationResult) == null) {
            return;
        }
        this.onRelationshipValidationResult = null;
        this.invoke.toString(cArr);
    }

    @Override // o.CursorLoader, com.fasterxml.jackson.core.JsonParser
    public JsonLocation values() {
        int i = this.HaptikSDK$b;
        int i2 = this.values;
        return new JsonLocation(ah$a(), -1L, this.HaptikSDK$b + this.ah$a, this.valueOf, (i - i2) + 1);
    }
}
