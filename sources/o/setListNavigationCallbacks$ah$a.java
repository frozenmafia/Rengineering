package o;

import com.app.dream11.core.event.EventType;
/* loaded from: classes.dex */
public final /* synthetic */ class setListNavigationCallbacks$ah$a {
    public static final /* synthetic */ int[] values;

    static {
        int[] iArr = new int[EventType.values().length];
        iArr[EventType.SCROLLVIEW_SCROLL_STARTED.ordinal()] = 1;
        iArr[EventType.SCROLLVIEW_SCROLL_ENDED.ordinal()] = 2;
        iArr[EventType.SCROLLVIEW_SCROLLED_UP.ordinal()] = 3;
        iArr[EventType.SCROLLVIEW_SCROLLED_DOWN.ordinal()] = 4;
        iArr[EventType.REDIRECT_TO_NETWORK_TAB.ordinal()] = 5;
        values = iArr;
    }
}
