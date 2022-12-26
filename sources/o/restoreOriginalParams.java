package o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import o.PercentLayoutHelper;
import o.ZipUtil;
/* loaded from: classes7.dex */
public final class restoreOriginalParams implements getPositiveButtonText {
    private static final Set<ZipUtil.CentralDirectory> HaptikSDK$b;
    public static final restoreOriginalParams ag$a;
    static final String ah$a;
    private static final String toString;
    public static final restoreOriginalParams valueOf;
    static final String values;
    private final String HaptikSDK$a;
    private final String invoke;

    @Override // o.getDialogMessage
    public String HaptikSDK$b() {
        return "cct";
    }

    static {
        String percentLayoutInfo = PercentLayoutHelper.PercentLayoutInfo.toString("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        ah$a = percentLayoutInfo;
        String percentLayoutInfo2 = PercentLayoutHelper.PercentLayoutInfo.toString("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        values = percentLayoutInfo2;
        String percentLayoutInfo3 = PercentLayoutHelper.PercentLayoutInfo.toString("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        toString = percentLayoutInfo3;
        HaptikSDK$b = Collections.unmodifiableSet(new HashSet(Arrays.asList(ZipUtil.CentralDirectory.values("proto"), ZipUtil.CentralDirectory.values("json"))));
        valueOf = new restoreOriginalParams(percentLayoutInfo, null);
        ag$a = new restoreOriginalParams(percentLayoutInfo2, percentLayoutInfo3);
    }

    public restoreOriginalParams(String str, String str2) {
        this.HaptikSDK$a = str;
        this.invoke = str2;
    }

    @Override // o.getDialogMessage
    public byte[] valueOf() {
        return values();
    }

    @Override // o.getPositiveButtonText
    public Set<ZipUtil.CentralDirectory> invoke() {
        return HaptikSDK$b;
    }

    public String ah$a() {
        return this.invoke;
    }

    public String ag$a() {
        return this.HaptikSDK$a;
    }

    public byte[] values() {
        String str = this.invoke;
        if (str == null && this.HaptikSDK$a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.HaptikSDK$a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public static restoreOriginalParams ah$a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new restoreOriginalParams(str2, str3);
    }
}
