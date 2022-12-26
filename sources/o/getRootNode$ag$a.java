package o;

import com.dreampay.commons.cards.CardConsentFlowEnum;
import com.dreampay.commons.cards.ConsentType;
/* loaded from: classes4.dex */
public final /* synthetic */ class getRootNode$ag$a {
    public static final /* synthetic */ int[] ag$a;
    public static final /* synthetic */ int[] values;

    static {
        int[] iArr = new int[CardConsentFlowEnum.values().length];
        iArr[CardConsentFlowEnum.ADD_CARD.ordinal()] = 1;
        iArr[CardConsentFlowEnum.ADD_CARD_AND_PAY.ordinal()] = 2;
        iArr[CardConsentFlowEnum.SAVED_CARD.ordinal()] = 3;
        values = iArr;
        int[] iArr2 = new int[ConsentType.values().length];
        iArr2[ConsentType.IMPLICIT.ordinal()] = 1;
        ag$a = iArr2;
    }
}
