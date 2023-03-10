package com.clevertap.android.sdk.inapp;

import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public enum CTInAppType {
    CTInAppTypeHTML("html"),
    CTInAppTypeCoverHTML("coverHtml"),
    CTInAppTypeInterstitialHTML("interstitialHtml"),
    CTInAppTypeHeaderHTML("headerHtml"),
    CTInAppTypeFooterHTML("footerHtml"),
    CTInAppTypeHalfInterstitialHTML("halfInterstitialHtml"),
    CTInAppTypeCover("cover"),
    CTInAppTypeInterstitial("interstitial"),
    CTInAppTypeHalfInterstitial("half-interstitial"),
    CTInAppTypeHeader("header-template"),
    CTInAppTypeFooter("footer-template"),
    CTInAppTypeAlert("alert-template"),
    CTInAppTypeCoverImageOnly("cover-image"),
    CTInAppTypeInterstitialImageOnly("interstitial-image"),
    CTInAppTypeHalfInterstitialImageOnly("half-interstitial-image");
    
    private final String inAppType;

    CTInAppType(String str) {
        this.inAppType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.inAppType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static CTInAppType fromString(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1698613420:
                if (str.equals("half-interstitial-image")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1258935355:
                if (str.equals("cover-image")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1160074422:
                if (str.equals("halfInterstitialHtml")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1141304454:
                if (str.equals("interstitial-image")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -728863497:
                if (str.equals("interstitialHtml")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -334055316:
                if (str.equals("footer-template")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -37253685:
                if (str.equals("alert-template")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3213227:
                if (str.equals("html")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 94852023:
                if (str.equals("cover")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                if (str.equals("interstitial")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 894039686:
                if (str.equals("half-interstitial")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1189018554:
                if (str.equals("header-template")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1420225510:
                if (str.equals("footerHtml")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1977176024:
                if (str.equals("headerHtml")) {
                    c = TokenParser.CR;
                    break;
                }
                c = 65535;
                break;
            case 1979390978:
                if (str.equals("coverHtml")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return CTInAppTypeHalfInterstitialImageOnly;
            case 1:
                return CTInAppTypeCoverImageOnly;
            case 2:
                return CTInAppTypeHalfInterstitialHTML;
            case 3:
                return CTInAppTypeInterstitialImageOnly;
            case 4:
                return CTInAppTypeInterstitialHTML;
            case 5:
                return CTInAppTypeFooter;
            case 6:
                return CTInAppTypeAlert;
            case 7:
                return CTInAppTypeHTML;
            case '\b':
                return CTInAppTypeCover;
            case '\t':
                return CTInAppTypeInterstitial;
            case '\n':
                return CTInAppTypeHalfInterstitial;
            case 11:
                return CTInAppTypeHeader;
            case '\f':
                return CTInAppTypeFooterHTML;
            case '\r':
                return CTInAppTypeHeaderHTML;
            case 14:
                return CTInAppTypeCoverHTML;
            default:
                return null;
        }
    }
}
