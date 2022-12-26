package androidx.browser.trusted;

import java.util.Comparator;
/* loaded from: classes5.dex */
public final /* synthetic */ class TokenContents$$ExternalSyntheticLambda0 implements Comparator {
    public static final /* synthetic */ TokenContents$$ExternalSyntheticLambda0 INSTANCE = new TokenContents$$ExternalSyntheticLambda0();

    private /* synthetic */ TokenContents$$ExternalSyntheticLambda0() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareByteArrays;
        compareByteArrays = TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
        return compareByteArrays;
    }
}
