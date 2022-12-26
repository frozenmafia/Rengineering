package o;

import o.PercentLayoutHelper;
/* loaded from: classes7.dex */
final class restoreMarginLayoutParams extends PercentLayoutHelper.PercentMarginLayoutParams {
    private final String HaptikSDK$a;
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private final String HaptikSDK$e;
    private final String ag$a;
    private final String ah$a;
    private final String ah$b;
    private final Integer getInitSettings;
    private final String invoke;
    private final String toString;
    private final String valueOf;
    private final String values;

    private restoreMarginLayoutParams(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.getInitSettings = num;
        this.ah$b = str;
        this.values = str2;
        this.ah$a = str3;
        this.HaptikSDK$e = str4;
        this.invoke = str5;
        this.HaptikSDK$b = str6;
        this.ag$a = str7;
        this.HaptikSDK$c = str8;
        this.toString = str9;
        this.HaptikSDK$a = str10;
        this.valueOf = str11;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public Integer getSignupData() {
        return this.getInitSettings;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String HaptikSDK$e() {
        return this.ah$b;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String HaptikSDK$c() {
        return this.values;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String ah$a() {
        return this.ah$a;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String HaptikSDK$d() {
        return this.HaptikSDK$e;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String getInitSettings() {
        return this.invoke;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String invoke() {
        return this.HaptikSDK$b;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String ah$b() {
        return this.ag$a;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String valueOf() {
        return this.toString;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    @Override // o.PercentLayoutHelper.PercentMarginLayoutParams
    public String ag$a() {
        return this.valueOf;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.getInitSettings + ", model=" + this.ah$b + ", hardware=" + this.values + ", device=" + this.ah$a + ", product=" + this.HaptikSDK$e + ", osBuild=" + this.invoke + ", manufacturer=" + this.HaptikSDK$b + ", fingerprint=" + this.ag$a + ", locale=" + this.HaptikSDK$c + ", country=" + this.toString + ", mccMnc=" + this.HaptikSDK$a + ", applicationBuild=" + this.valueOf + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PercentLayoutHelper.PercentMarginLayoutParams) {
            PercentLayoutHelper.PercentMarginLayoutParams percentMarginLayoutParams = (PercentLayoutHelper.PercentMarginLayoutParams) obj;
            Integer num = this.getInitSettings;
            if (num != null ? num.equals(percentMarginLayoutParams.getSignupData()) : percentMarginLayoutParams.getSignupData() == null) {
                String str = this.ah$b;
                if (str != null ? str.equals(percentMarginLayoutParams.HaptikSDK$e()) : percentMarginLayoutParams.HaptikSDK$e() == null) {
                    String str2 = this.values;
                    if (str2 != null ? str2.equals(percentMarginLayoutParams.HaptikSDK$c()) : percentMarginLayoutParams.HaptikSDK$c() == null) {
                        String str3 = this.ah$a;
                        if (str3 != null ? str3.equals(percentMarginLayoutParams.ah$a()) : percentMarginLayoutParams.ah$a() == null) {
                            String str4 = this.HaptikSDK$e;
                            if (str4 != null ? str4.equals(percentMarginLayoutParams.HaptikSDK$d()) : percentMarginLayoutParams.HaptikSDK$d() == null) {
                                String str5 = this.invoke;
                                if (str5 != null ? str5.equals(percentMarginLayoutParams.getInitSettings()) : percentMarginLayoutParams.getInitSettings() == null) {
                                    String str6 = this.HaptikSDK$b;
                                    if (str6 != null ? str6.equals(percentMarginLayoutParams.invoke()) : percentMarginLayoutParams.invoke() == null) {
                                        String str7 = this.ag$a;
                                        if (str7 != null ? str7.equals(percentMarginLayoutParams.ah$b()) : percentMarginLayoutParams.ah$b() == null) {
                                            String str8 = this.HaptikSDK$c;
                                            if (str8 != null ? str8.equals(percentMarginLayoutParams.HaptikSDK$b()) : percentMarginLayoutParams.HaptikSDK$b() == null) {
                                                String str9 = this.toString;
                                                if (str9 != null ? str9.equals(percentMarginLayoutParams.valueOf()) : percentMarginLayoutParams.valueOf() == null) {
                                                    String str10 = this.HaptikSDK$a;
                                                    if (str10 != null ? str10.equals(percentMarginLayoutParams.HaptikSDK$a()) : percentMarginLayoutParams.HaptikSDK$a() == null) {
                                                        String str11 = this.valueOf;
                                                        if (str11 == null) {
                                                            if (percentMarginLayoutParams.ag$a() == null) {
                                                                return true;
                                                            }
                                                        } else if (str11.equals(percentMarginLayoutParams.ag$a())) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.getInitSettings;
        int hashCode = num == null ? 0 : num.hashCode();
        String str = this.ah$b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.values;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ah$a;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.HaptikSDK$e;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.invoke;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.HaptikSDK$b;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.ag$a;
        int hashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.HaptikSDK$c;
        int hashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.toString;
        int hashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.HaptikSDK$a;
        int hashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.valueOf;
        return ((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ (str11 != null ? str11.hashCode() : 0);
    }
}
