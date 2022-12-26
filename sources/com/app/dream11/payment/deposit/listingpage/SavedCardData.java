package com.app.dream11.payment.deposit.listingpage;

import com.dreampay.commons.cards.SavedCardModel;
import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class SavedCardData implements Serializable {
    private final String base64;
    private final String checkSum;
    private final SavedCardModel savedCard;

    public static /* synthetic */ SavedCardData copy$default(SavedCardData savedCardData, String str, String str2, SavedCardModel savedCardModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedCardData.base64;
        }
        if ((i & 2) != 0) {
            str2 = savedCardData.checkSum;
        }
        if ((i & 4) != 0) {
            savedCardModel = savedCardData.savedCard;
        }
        return savedCardData.copy(str, str2, savedCardModel);
    }

    public final String component1() {
        return this.base64;
    }

    public final String component2() {
        return this.checkSum;
    }

    public final SavedCardModel component3() {
        return this.savedCard;
    }

    public final SavedCardData copy(String str, String str2, SavedCardModel savedCardModel) {
        runAnimators.ag$a(str, "base64");
        runAnimators.ag$a(str2, "checkSum");
        runAnimators.ag$a(savedCardModel, "savedCard");
        return new SavedCardData(str, str2, savedCardModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SavedCardData) {
            SavedCardData savedCardData = (SavedCardData) obj;
            return runAnimators.values((Object) this.base64, (Object) savedCardData.base64) && runAnimators.values((Object) this.checkSum, (Object) savedCardData.checkSum) && runAnimators.values(this.savedCard, savedCardData.savedCard);
        }
        return false;
    }

    public int hashCode() {
        return (((this.base64.hashCode() * 31) + this.checkSum.hashCode()) * 31) + this.savedCard.hashCode();
    }

    public String toString() {
        String str = this.base64;
        String str2 = this.checkSum;
        SavedCardModel savedCardModel = this.savedCard;
        return "SavedCardData(base64=" + str + ", checkSum=" + str2 + ", savedCard=" + savedCardModel + ")";
    }

    public SavedCardData(String str, String str2, SavedCardModel savedCardModel) {
        runAnimators.ag$a(str, "base64");
        runAnimators.ag$a(str2, "checkSum");
        runAnimators.ag$a(savedCardModel, "savedCard");
        this.base64 = str;
        this.checkSum = str2;
        this.savedCard = savedCardModel;
    }

    public final String getBase64() {
        return this.base64;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public final SavedCardModel getSavedCard() {
        return this.savedCard;
    }
}
