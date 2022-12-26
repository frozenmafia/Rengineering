package o;

import com.fasterxml.jackson.core.JsonParser;
/* loaded from: classes6.dex */
public class registerListener extends isReset {
    protected static final int[] ak$b;
    private static final int[] newSessionWithExtras;
    protected byte[] onNavigationEvent;
    private static final int mayLaunchUrl = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int newSession = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int ICustomTabsCallback$Stub$Proxy = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int ICustomTabsService = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int onTransact = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int getInterfaceDescriptor = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int extraCommand = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    static {
        int[] iArr;
        iArr = getSelection.HaptikSDK$b;
        newSessionWithExtras = iArr;
        ak$b = getSelection.invoke();
    }

    public registerListener(onStopLoading onstoploading, int i, isStarted isstarted) {
        super(onstoploading, i, isstarted);
        this.onNavigationEvent = extraCallback;
    }
}
