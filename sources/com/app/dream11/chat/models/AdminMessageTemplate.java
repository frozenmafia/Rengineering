package com.app.dream11.chat.models;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class AdminMessageTemplate {
    private final AdminMessageCTA cta;
    private final String icon;
    private final String subtitle;
    private final String title;
    private final String type;

    public AdminMessageTemplate() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AdminMessageTemplate copy$default(AdminMessageTemplate adminMessageTemplate, String str, String str2, AdminMessageCTA adminMessageCTA, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adminMessageTemplate.title;
        }
        if ((i & 2) != 0) {
            str2 = adminMessageTemplate.subtitle;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            adminMessageCTA = adminMessageTemplate.cta;
        }
        AdminMessageCTA adminMessageCTA2 = adminMessageCTA;
        if ((i & 8) != 0) {
            str3 = adminMessageTemplate.icon;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = adminMessageTemplate.type;
        }
        return adminMessageTemplate.copy(str, str5, adminMessageCTA2, str6, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final AdminMessageCTA component3() {
        return this.cta;
    }

    public final String component4() {
        return this.icon;
    }

    public final String component5() {
        return this.type;
    }

    public final AdminMessageTemplate copy(String str, String str2, AdminMessageCTA adminMessageCTA, String str3, String str4) {
        return new AdminMessageTemplate(str, str2, adminMessageCTA, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdminMessageTemplate) {
            AdminMessageTemplate adminMessageTemplate = (AdminMessageTemplate) obj;
            return runAnimators.values((Object) this.title, (Object) adminMessageTemplate.title) && runAnimators.values((Object) this.subtitle, (Object) adminMessageTemplate.subtitle) && runAnimators.values(this.cta, adminMessageTemplate.cta) && runAnimators.values((Object) this.icon, (Object) adminMessageTemplate.icon) && runAnimators.values((Object) this.type, (Object) adminMessageTemplate.type);
        }
        return false;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        AdminMessageCTA adminMessageCTA = this.cta;
        int hashCode3 = adminMessageCTA == null ? 0 : adminMessageCTA.hashCode();
        String str3 = this.icon;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.type;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        AdminMessageCTA adminMessageCTA = this.cta;
        String str3 = this.icon;
        String str4 = this.type;
        return "AdminMessageTemplate(title=" + str + ", subtitle=" + str2 + ", cta=" + adminMessageCTA + ", icon=" + str3 + ", type=" + str4 + ")";
    }

    public AdminMessageTemplate(String str, String str2, AdminMessageCTA adminMessageCTA, String str3, String str4) {
        this.title = str;
        this.subtitle = str2;
        this.cta = adminMessageCTA;
        this.icon = str3;
        this.type = str4;
    }

    public /* synthetic */ AdminMessageTemplate(String str, String str2, AdminMessageCTA adminMessageCTA, String str3, String str4, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : adminMessageCTA, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AdminMessageCTA getCta() {
        return this.cta;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getType() {
        return this.type;
    }
}
