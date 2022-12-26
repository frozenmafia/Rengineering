package o;

import com.app.dream11.core.service.graphql.api.type.MyConnectionStatus;
/* loaded from: classes3.dex */
public final /* synthetic */ class getBadgeIconType$valueOf$ah$a {
    public static final /* synthetic */ int[] ag$a;

    static {
        int[] iArr = new int[MyConnectionStatus.values().length];
        iArr[MyConnectionStatus.BLOCK.ordinal()] = 1;
        iArr[MyConnectionStatus.BLOCKED_BY.ordinal()] = 2;
        iArr[MyConnectionStatus.BOTH.ordinal()] = 3;
        iArr[MyConnectionStatus.FOLLOWING.ordinal()] = 4;
        ag$a = iArr;
    }
}
