package com.dreampay.cards;
/* loaded from: classes4.dex */
public final /* synthetic */ class CardWebViewActivity$ah$a {
    public static final /* synthetic */ int[] toString;

    static {
        int[] iArr = new int[CardTransactionType.values().length];
        iArr[CardTransactionType.ACS.ordinal()] = 1;
        iArr[CardTransactionType.SAVE_CARD_AND_PAY.ordinal()] = 2;
        iArr[CardTransactionType.SFA_ENROLMENT_FOR_NEW_CARD.ordinal()] = 3;
        iArr[CardTransactionType.SFA_ENROLMENT_FOR_EXISTING_CARD.ordinal()] = 4;
        toString = iArr;
    }
}
