package o;

import com.fasterxml.jackson.core.JsonLocation;
import java.io.IOException;
/* loaded from: classes6.dex */
public abstract class isReset extends CursorLoader {
    protected int ICustomTabsCallback$Default;
    protected final isStarted ICustomTabsCallback$Stub;
    protected boolean asBinder;
    protected int[] asInterface;
    protected int getDefaultImpl;
    protected int onPostMessage;
    protected int setDefaultImpl;
    protected static final String[] onRelationshipValidationResult = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    protected static final double[] onMessageChannelReady = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};

    public isReset(onStopLoading onstoploading, int i, isStarted isstarted) {
        super(onstoploading, i);
        this.asInterface = new int[8];
        this.asBinder = false;
        this.ICustomTabsCallback$Default = 0;
        this.onPostMessage = 1;
        this.ICustomTabsCallback$Stub = isstarted;
        this.ICustomTabsCallback = null;
        this.setDefaultImpl = 0;
        this.getDefaultImpl = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.CursorLoader
    public void ag$a() throws IOException {
        super.ag$a();
        this.ICustomTabsCallback$Stub.valueOf();
    }

    @Override // o.CursorLoader
    protected void valueOf() throws IOException {
        this.ICustomTabsCallback$Default = 0;
        this.ah$b = 0;
    }

    @Override // o.CursorLoader, com.fasterxml.jackson.core.JsonParser
    public JsonLocation values() {
        int i = this.HaptikSDK$b;
        int i2 = this.values;
        int max = Math.max(this.valueOf, this.onPostMessage);
        return new JsonLocation(ah$a(), (this.HaptikSDK$b - this.ICustomTabsCallback$Default) + this.ah$a, -1L, max, (i - i2) + 1);
    }
}
