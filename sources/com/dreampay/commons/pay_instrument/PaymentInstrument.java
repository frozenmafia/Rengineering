package com.dreampay.commons.pay_instrument;

import com.dreampay.commons.cards.InstrumentHealth;
import o.getTargetTypes;
/* loaded from: classes6.dex */
public abstract class PaymentInstrument {
    private String errorMessage;
    private InstrumentHealth health;
    private final String iconUrl;
    private boolean isAvailable;
    private final String primarySubtitle;
    private String promotionText;
    private final String secondarySubtitle;
    private final String title;

    public /* synthetic */ PaymentInstrument(String str, String str2, String str3, String str4, String str5, boolean z, String str6, InstrumentHealth instrumentHealth, getTargetTypes gettargettypes) {
        this(str, str2, str3, str4, str5, z, str6, instrumentHealth);
    }

    private PaymentInstrument(String str, String str2, String str3, String str4, String str5, boolean z, String str6, InstrumentHealth instrumentHealth) {
        this.title = str;
        this.primarySubtitle = str2;
        this.secondarySubtitle = str3;
        this.iconUrl = str4;
        this.errorMessage = str5;
        this.isAvailable = z;
        this.promotionText = str6;
        this.health = instrumentHealth;
    }

    public /* synthetic */ PaymentInstrument(String str, String str2, String str3, String str4, String str5, boolean z, String str6, InstrumentHealth instrumentHealth, int i, getTargetTypes gettargettypes) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : instrumentHealth, null);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPrimarySubtitle() {
        return this.primarySubtitle;
    }

    public final String getSecondarySubtitle() {
        return this.secondarySubtitle;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final void setAvailable(boolean z) {
        this.isAvailable = z;
    }

    public final String getPromotionText() {
        return this.promotionText;
    }

    public final void setPromotionText(String str) {
        this.promotionText = str;
    }

    public final InstrumentHealth getHealth() {
        return this.health;
    }

    public final void setHealth(InstrumentHealth instrumentHealth) {
        this.health = instrumentHealth;
    }
}
