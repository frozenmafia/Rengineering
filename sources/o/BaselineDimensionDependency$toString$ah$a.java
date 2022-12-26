package o;

import com.app.dream11.core.service.graphql.api.type.UserVerificationStatus;
/* loaded from: classes3.dex */
public final /* synthetic */ class BaselineDimensionDependency$toString$ah$a {
    public static final /* synthetic */ int[] ah$a;

    static {
        int[] iArr = new int[UserVerificationStatus.values().length];
        iArr[UserVerificationStatus.REJECTED.ordinal()] = 1;
        iArr[UserVerificationStatus.INREVIEW.ordinal()] = 2;
        iArr[UserVerificationStatus.UNLINKED.ordinal()] = 3;
        iArr[UserVerificationStatus.NOT_SUBMITTED.ordinal()] = 4;
        ah$a = iArr;
    }
}
