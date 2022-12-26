package com.dreampay.commons.cards;

import com.dreampay.commons.constants.Constants;
import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public enum CardCategoryEnum implements Serializable {
    DEBIT(1, Constants.DEBIT),
    CREDIT(2, Constants.CREDIT),
    OTHER(3, "OTHERS");
    
    public static final Companion Companion = new Companion(null);
    private final int typeInt;
    private final String typeString;

    CardCategoryEnum(int i, String str) {
        this.typeInt = i;
        this.typeString = str;
    }

    public final int getTypeInt() {
        return this.typeInt;
    }

    public final String getTypeString() {
        return this.typeString;
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final CardCategoryEnum getObject(String str) {
            CardCategoryEnum cardCategoryEnum;
            runAnimators.ag$a(str, "type");
            CardCategoryEnum[] values = CardCategoryEnum.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cardCategoryEnum = null;
                    break;
                }
                cardCategoryEnum = values[i];
                String typeString = cardCategoryEnum.getTypeString();
                String upperCase = str.toUpperCase();
                runAnimators.ah$a(upperCase, "(this as java.lang.String).toUpperCase()");
                if (typeString.equals(upperCase)) {
                    break;
                }
                i++;
            }
            return cardCategoryEnum == null ? CardCategoryEnum.DEBIT : cardCategoryEnum;
        }
    }
}
