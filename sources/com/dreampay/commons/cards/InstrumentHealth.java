package com.dreampay.commons.cards;

import com.dreampay.commons.HealthStatus;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class InstrumentHealth {
    private final String backgroundColor;
    private final boolean disablePayment;
    private final HealthStatus healthStatus;
    private final String iconUrl;
    private final String message;
    private final boolean shouldBlockOnDownHealth;
    private final String textColor;

    public static /* synthetic */ InstrumentHealth copy$default(InstrumentHealth instrumentHealth, HealthStatus healthStatus, String str, boolean z, String str2, String str3, String str4, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            healthStatus = instrumentHealth.healthStatus;
        }
        if ((i & 2) != 0) {
            str = instrumentHealth.message;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            z = instrumentHealth.disablePayment;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str2 = instrumentHealth.iconUrl;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = instrumentHealth.textColor;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = instrumentHealth.backgroundColor;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            z2 = instrumentHealth.shouldBlockOnDownHealth;
        }
        return instrumentHealth.copy(healthStatus, str5, z3, str6, str7, str8, z2);
    }

    public final HealthStatus component1() {
        return this.healthStatus;
    }

    public final String component2() {
        return this.message;
    }

    public final boolean component3() {
        return this.disablePayment;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final String component5() {
        return this.textColor;
    }

    public final String component6() {
        return this.backgroundColor;
    }

    public final boolean component7() {
        return this.shouldBlockOnDownHealth;
    }

    public final InstrumentHealth copy(HealthStatus healthStatus, String str, boolean z, String str2, String str3, String str4, boolean z2) {
        runAnimators.ag$a(healthStatus, "healthStatus");
        runAnimators.ag$a(str, "message");
        runAnimators.ag$a(str2, "iconUrl");
        runAnimators.ag$a(str3, "textColor");
        runAnimators.ag$a(str4, "backgroundColor");
        return new InstrumentHealth(healthStatus, str, z, str2, str3, str4, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstrumentHealth) {
            InstrumentHealth instrumentHealth = (InstrumentHealth) obj;
            return this.healthStatus == instrumentHealth.healthStatus && runAnimators.values((Object) this.message, (Object) instrumentHealth.message) && this.disablePayment == instrumentHealth.disablePayment && runAnimators.values((Object) this.iconUrl, (Object) instrumentHealth.iconUrl) && runAnimators.values((Object) this.textColor, (Object) instrumentHealth.textColor) && runAnimators.values((Object) this.backgroundColor, (Object) instrumentHealth.backgroundColor) && this.shouldBlockOnDownHealth == instrumentHealth.shouldBlockOnDownHealth;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.healthStatus.hashCode();
        int hashCode2 = this.message.hashCode();
        boolean z = this.disablePayment;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = this.iconUrl.hashCode();
        int hashCode4 = this.textColor.hashCode();
        int hashCode5 = this.backgroundColor.hashCode();
        boolean z2 = this.shouldBlockOnDownHealth;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "InstrumentHealth(healthStatus=" + this.healthStatus + ", message=" + this.message + ", disablePayment=" + this.disablePayment + ", iconUrl=" + this.iconUrl + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", shouldBlockOnDownHealth=" + this.shouldBlockOnDownHealth + ')';
    }

    public InstrumentHealth(HealthStatus healthStatus, String str, boolean z, String str2, String str3, String str4, boolean z2) {
        runAnimators.ag$a(healthStatus, "healthStatus");
        runAnimators.ag$a(str, "message");
        runAnimators.ag$a(str2, "iconUrl");
        runAnimators.ag$a(str3, "textColor");
        runAnimators.ag$a(str4, "backgroundColor");
        this.healthStatus = healthStatus;
        this.message = str;
        this.disablePayment = z;
        this.iconUrl = str2;
        this.textColor = str3;
        this.backgroundColor = str4;
        this.shouldBlockOnDownHealth = z2;
    }

    public /* synthetic */ InstrumentHealth(HealthStatus healthStatus, String str, boolean z, String str2, String str3, String str4, boolean z2, int i, getTargetTypes gettargettypes) {
        this(healthStatus, str, z, str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? false : z2);
    }

    public final HealthStatus getHealthStatus() {
        return this.healthStatus;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getDisablePayment() {
        return this.disablePayment;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean getShouldBlockOnDownHealth() {
        return this.shouldBlockOnDownHealth;
    }
}
