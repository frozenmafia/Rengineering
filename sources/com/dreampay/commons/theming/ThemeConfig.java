package com.dreampay.commons.theming;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ThemeConfig {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_BRAND_LOGO = "https://www.dreampay.tech/public/imgs/dp2x.png";
    public static final String DEFAULT_BRAND_NAME = "DREAM PAY";
    public static final String DEFAULT_BUTTON_PRIMARY_COLOR = "#1c82f8";
    public static final String DEFAULT_BUTTON_PRIMARY_TEXT_COLOR = "#FFFFFF";
    public static final String DEFAULT_HEADER_COLOR = "#ad0000";
    public static final String DEFAULT_HEADER_TEXT_COLOR = "#FFFFFF";
    private final String brandLogo;
    private final String brandName;
    private final String buttonPrimaryColor;
    private final String buttonPrimaryTextColor;
    private final String headerColor;
    private final String headerTextColor;

    public ThemeConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        runAnimators.ag$a(str, "brandName");
        runAnimators.ag$a(str2, "brandLogo");
        runAnimators.ag$a(str3, "headerColor");
        runAnimators.ag$a(str4, "headerTextColor");
        runAnimators.ag$a(str5, "buttonPrimaryColor");
        runAnimators.ag$a(str6, "buttonPrimaryTextColor");
        this.brandName = str;
        this.brandLogo = str2;
        this.headerColor = str3;
        this.headerTextColor = str4;
        this.buttonPrimaryColor = str5;
        this.buttonPrimaryTextColor = str6;
    }

    public /* synthetic */ ThemeConfig(String str, String str2, String str3, String str4, String str5, String str6, int i, getTargetTypes gettargettypes) {
        this(str, str2, str3, str4, (i & 16) != 0 ? DEFAULT_BUTTON_PRIMARY_COLOR : str5, (i & 32) != 0 ? "#FFFFFF" : str6);
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getBrandLogo() {
        return this.brandLogo;
    }

    public final String getHeaderColor() {
        return this.headerColor;
    }

    public final String getHeaderTextColor() {
        return this.headerTextColor;
    }

    public final String getButtonPrimaryColor() {
        return this.buttonPrimaryColor;
    }

    public final String getButtonPrimaryTextColor() {
        return this.buttonPrimaryTextColor;
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }
}
