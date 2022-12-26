package o;

import com.giphy.sdk.ui.GPHSearchSuggestionType;
/* loaded from: classes6.dex */
public final /* synthetic */ class setForceLegacyBehavior {
    public static final /* synthetic */ int[] ag$a;

    static {
        int[] iArr = new int[GPHSearchSuggestionType.values().length];
        ag$a = iArr;
        iArr[GPHSearchSuggestionType.Trending.ordinal()] = 1;
        iArr[GPHSearchSuggestionType.None.ordinal()] = 2;
        iArr[GPHSearchSuggestionType.Autocomplete.ordinal()] = 3;
        iArr[GPHSearchSuggestionType.Text.ordinal()] = 4;
        iArr[GPHSearchSuggestionType.Recents.ordinal()] = 5;
        iArr[GPHSearchSuggestionType.Channels.ordinal()] = 6;
    }
}
