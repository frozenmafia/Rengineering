package com.appsflyer.internal;
/* loaded from: classes3.dex */
public class d {
    private static int AppsFlyerConversionListener = 0;
    private static int AppsFlyerInAppPurchaseValidatorListener = 0;
    private static int AppsFlyerLib = 0;
    private static int getInstance = 1;
    public static byte[] onAppOpenAttribution;
    private static Object onConversionDataFail;
    private static Object onConversionDataSuccess;
    public static byte[] onDeepLinking;
    public static final int onValidateInApp = 0;
    public static final byte[] onValidateInAppFailure = null;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0042 -> B:10:0x0051). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r9, short r10, byte r11) {
        /*
            int r0 = com.appsflyer.internal.d.AppsFlyerConversionListener
            int r0 = r0 + 114
            r1 = 1
            int r0 = r0 - r1
            int r0 = r0 % 128
            com.appsflyer.internal.d.getInstance = r0
            byte[] r2 = com.appsflyer.internal.d.onValidateInAppFailure
            r3 = r11 & 1
            r11 = r11 | r1
            int r3 = r3 + r11
            int r9 = -r9
            int r10 = -r10
            int r10 = ~r10
            int r10 = 963 - r10
            int r10 = r10 - r1
            byte[] r11 = new byte[r3]
            int r3 = r3 - r1
            r4 = 0
            if (r2 != 0) goto L1e
            r5 = 0
            goto L1f
        L1e:
            r5 = 1
        L1f:
            if (r5 == 0) goto L2c
            r0 = r9 | 119(0x77, float:1.67E-43)
            int r0 = r0 << r1
            r9 = r9 ^ 119(0x77, float:1.67E-43)
            int r0 = r0 - r9
            r5 = 0
            r8 = r3
            r3 = r0
            r0 = r8
            goto L51
        L2c:
            r9 = r0 ^ 73
            r0 = r0 & 73
            int r0 = r0 << r1
            int r9 = r9 + r0
            int r9 = r9 % 128
            com.appsflyer.internal.d.AppsFlyerConversionListener = r9
            r0 = r9 & 119(0x77, float:1.67E-43)
            r9 = r9 | 119(0x77, float:1.67E-43)
            int r0 = r0 + r9
            int r0 = r0 % 128
            com.appsflyer.internal.d.getInstance = r0
            r9 = r10
            r0 = r3
            r5 = 0
        L42:
            r6 = r10 | (-48)
            int r6 = r6 << r1
            r10 = r10 ^ (-48)
            int r6 = r6 - r10
            r10 = r6 ^ 49
            r6 = r6 & 49
            int r6 = r6 << r1
            int r10 = r10 + r6
            int r9 = -r9
            int r9 = r9 + r3
            r3 = r9
        L51:
            byte r9 = (byte) r3
            r11[r5] = r9
            if (r5 != r0) goto L5c
            java.lang.String r9 = new java.lang.String
            r9.<init>(r11, r4)
            return r9
        L5c:
            int r5 = r5 + 1
            r9 = r2[r10]
            int r6 = com.appsflyer.internal.d.AppsFlyerConversionListener
            r7 = r6 ^ 11
            r6 = r6 & 11
            int r6 = r6 << r1
            int r7 = r7 + r6
            int r7 = r7 % 128
            com.appsflyer.internal.d.getInstance = r7
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.d.$$c(int, short, byte):java.lang.String");
    }

    public static Object AFInAppEventParameterName(int i, int i2, char c) {
        int i3 = AppsFlyerConversionListener;
        getInstance = ((i3 + 4) - 1) % 128;
        Object obj = onConversionDataSuccess;
        getInstance = ((i3 + 76) - 1) % 128;
        getInstance = ((i3 & 119) + (i3 | 119)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            byte[] bArr = onValidateInAppFailure;
            return Class.forName($$c(bArr[72], bArr[184], bArr[435]), true, (ClassLoader) onConversionDataFail).getMethod($$c(bArr[93], (short) 370, bArr[556]), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFInAppEventType(Object obj) {
        Object obj2;
        int i = (AppsFlyerConversionListener + 58) - 1;
        getInstance = i % 128;
        if (i % 2 != 0) {
            obj2 = onConversionDataSuccess;
        } else {
            obj2 = onConversionDataSuccess;
            Object obj3 = null;
            super.hashCode();
        }
        int i2 = AppsFlyerConversionListener;
        getInstance = ((i2 ^ 105) + ((i2 & 105) << 1)) % 128;
        try {
            Object[] objArr = {obj};
            byte[] bArr = onValidateInAppFailure;
            return ((Integer) Class.forName($$c(bArr[72], bArr[184], bArr[435]), true, (ClassLoader) onConversionDataFail).getMethod($$c(bArr[93], (short) 370, bArr[556]), Object.class).invoke(obj2, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFKeystoreWrapper(int i) {
        int i2 = AppsFlyerConversionListener;
        int i3 = ((i2 ^ 123) + ((i2 & 123) << 1)) % 128;
        getInstance = i3;
        Object obj = onConversionDataSuccess;
        AppsFlyerConversionListener = (i3 + 73) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = onValidateInAppFailure;
            int intValue = ((Integer) Class.forName($$c(bArr[72], bArr[184], bArr[435]), true, (ClassLoader) onConversionDataFail).getMethod($$c(bArr[93], (short) 370, bArr[556]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i4 = getInstance;
            AppsFlyerConversionListener = ((i4 & 51) + (i4 | 51)) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        getInstance = ((AppsFlyerConversionListener + 124) - 1) % 128;
        byte[] bArr = new byte[981];
        System.arraycopy("s%??<\t??\u00153????A????\u000f\u0000\u0001??\r\u0001\u001b??????\u0001!??\u0002\r\u0004??\t??\u00153??\u000b??\u00079????\u0006??\u000f????\u0003\u0000\r????3??\u0000\u0004\u0003\u0006\u0002??\u000b??\u0001??\u0002>????\u0000??\r????\u0014??C??????\u000f??\u0004\r??=??@????\n??\u0003\u0006\u00056????E????\u0003\f????\u0000\t??\u00153??\u0005??A????\u0005\u000f#??\u000f\u0000\u0001????\n??\u0003\u0006\u00056????E????\f??\b@??\u0011????\n??\u0001\t??\u00153????A????\u0005\u000f$??\u0000\u0011??0??????\u0001!??\u0002\r\u0004??\u0003????\r??=????\u0006??\u000f???????!??????????5????5??\u000b??\u0000'??\u000e??????\r\u0004??\u001e??\t\u0000????\u0002>????\u0000??\r????\u0014??C??????\u000f??\u0004\r??=???\u0000\u0002??.????\u0007??/??????\n????)??\u0005\t??\u000f\u0002??1??????\u0003!????\r\u0004??\u0003????\r??=????\u0006??\u000f?????????2????\u0007??\u000b??\u0006??\u0002????\u0003\u0003????\r??=????\u0006??\u000f?????????\u000e!????5??\u000b??\u0000'??\u000e??????\u0002??1??\u000b??\"??????\u0003!??????\u000b\u000b\u0015??\u0017??????O??\u0005??\u0000\n\u0001??????S??\u0007????K\u0015??\u0016??\u0015??\u0014??\u0015??\u0018??\t??\u00153??\u000b??\u00079????\u000b??\u0000'??\u000e????????\n??\u0003\u0006\u00056????\u0000B????\u0000)????\r\u0001????\u0002??/??\u0004\u000f??\u0004\r??\u0019??\u0005??\u0011??\u0002!????\r\u0002??\u0005????????\u0002>????\u0000??\r????\u0014??C??????\u000f??\u0004\r??=??5\t??\u00153????A??????\u0013\u0018??????\u0001!??\u0002\r\u0004????\u000e?? ????\t??\u00153????A????\u0005\u000f$??\u0000\u0011??*??\u0001\u0004??\u0001!??\u0002\r\u0004????\n??\u0003\u0006\u00056????E??????\r??\u0003\u0001\u0001\b????\u0015????\u0010??\b\u0002??\u0002??1??\u000b??\u0000'??\u000e????????\u0003??\u00132??\u0003??\u00132????\u0007??\u000f\u0002??.\u0002????????\u0006??\u0005??\r\u000e??\u0011??\u0000\u000b??\u000f????\u0016????\r??\u000b??\u0011\u0019??\u0007??\u0011????)????\f#??\u0007??\b????\u0001??????\u000e????\u0002>????\u0000??\r????\u0014??C??????\u000f??\u0004\r??=??4\t??\u00153????A??\u0007??\f????\u0002??$??\u0003??\u000b??????\u0002??3????\u0004\u0003??\u0001\u000f\u0015????\f??\n??\u0003\u0006\u00056????\u0000B??????\u000b??\r????%????\r\u0004??\t??\u00153????A??????\u0007\u0016??\u0001\u0004??\u0001!??\u0002\r\u0004??\u0002??\u0017??\t??\u000f\t??\u00153????A????\n??\u0015??????\u000b??\u0001??\n??\u0003\u0006\u00056??\u000f??\u0004F??????\u0004\u001f??\u000b????\u000f??\f\u001c??????\u0002??+??\u0005??\u000b\b??+??\u0000\u0004\u0003\u0006\u0002??\u000b??\u0001\t??\u00153????A??????\u0007\u0015??\u0013????\u0003\u0000\r???? ????\b\u0018????\u0000\u0003??\t??\u00153????A??????\u0007!????\u0010??\t????\u0005??\u0005-??\u0005\u000f$??\u0000\u0011????\u000e??!??\u000b??\u0000??%??\u0005??\u0002?????\u0000??\r????\u0014??D??????\u000f??\u0004\r??>???\u0000??\u0002?????\u0000??\r????\u0014??\u0005\u0011??\r??\u000b??\u0011\u0019??\u0007??\u0011????5????\r\u0002??\u0005??\t\u0004??\t??\u00153????A????????\u0001!??\u0002\r\u0004??".getBytes("ISO-8859-1"), 0, bArr, 0, 981);
        onValidateInAppFailure = bArr;
        onValidateInApp = 141;
        getInstance = ((AppsFlyerConversionListener + 16) - 1) % 128;
    }

    private d() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:2|3|(1:5)(1:674)|6|7|8|(41:10|(2:661|662)|(1:13)(1:660)|(38:15|16|(1:18)(1:657)|19|(34:653|654|(32:649|650|24|(4:26|(1:28)(1:640)|29|(3:31|32|33))(3:(1:642)(1:648)|643|(1:645)(2:646|647))|(4:40|41|42|43)|(1:45)(1:639)|46|(2:49|50)|51|52|53|54|55|56|(1:58)(1:637)|(1:60)(1:636)|61|(1:63)(1:635)|64|(1:66)(1:634)|67|(1:69)(1:633)|70|(1:72)(1:632)|73|(1:75)(1:631)|76|77|(3:79|(1:81)(1:628)|(1:625)(3:83|(16:88|89|90|(8:92|(1:94)(1:105)|(2:96|97)|99|100|101|102|104)|(11:486|487|489|490|491|492|493|494|(16:(1:497)(1:(1:608)(2:(1:610)(1:614)|(1:612)(1:613)))|498|499|500|501|502|503|(4:(1:506)(1:523)|507|(6:509|510|511|(1:513)(1:517)|514|515)(2:521|522)|516)|524|525|526|527|(7:529|530|531|532|533|534|535)(4:549|(1:551)(1:595)|552|(3:554|555|556)(2:560|(2:562|563)(14:564|565|566|567|568|569|570|571|572|573|574|575|576|538)))|536|537|538)|615|616)(1:107)|108|109|110|111|112|113|114|115|116|117|(13:118|119|120|121|122|(1:124)(1:482)|125|(14:127|128|129|130|131|132|133|134|135|136|137|138|139|140)(7:473|(1:475)(1:481)|476|477|478|479|480)|141|142|(38:353|354|(3:356|(2:358|359)|360)(1:453)|(1:362)(1:452)|363|364|365|366|(2:(1:368)(1:448)|(2:446|447)(5:370|371|372|373|(4:375|376|377|378)(1:398)))|399|400|401|402|403|404|405|406|407|408|409|410|411|412|413|414|415|416|417|418|419|420|421|422|423|(1:425)(1:433)|426|(4:428|429|430|431)|432)(33:144|145|146|147|148|149|150|151|152|153|(4:154|155|156|(7:158|159|160|161|(1:163)(1:344)|164|(7:166|167|168|169|170|171|172)(1:183))(1:348))|184|185|186|187|188|190|191|192|193|194|195|196|197|198|199|200|201|(2:(1:203)(1:323)|(4:205|206|207|208)(1:216))|217|218|(1:220)|221)|(9:223|224|225|226|227|228|229|(1:231)|232)(3:309|310|311)|(14:234|235|236|237|238|239|240|241|242|243|244|245|246|247)(3:302|303|304)))(2:85|86)|87))|629|626|627)|23|24|(0)(0)|(0)|(0)(0)|46|(2:49|50)|51|52|53|54|55|56|(0)(0)|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|77|(0)|629|626|627)|21|(0)|23|24|(0)(0)|(0)|(0)(0)|46|(0)|51|52|53|54|55|56|(0)(0)|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|77|(0)|629|626|627)|659|(0)(0)|19|(0)|21|(0)|23|24|(0)(0)|(0)|(0)(0)|46|(0)|51|52|53|54|55|56|(0)(0)|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|77|(0)|629|626|627)|668|669|(0)(0)|(0)|659|(0)(0)|19|(0)|21|(0)|23|24|(0)(0)|(0)|(0)(0)|46|(0)|51|52|53|54|55|56|(0)(0)|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|77|(0)|629|626|627) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x044d, code lost:
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r7[r12], (short) (com.appsflyer.internal.d.onValidateInApp - 4), r7[r8])).getMethod($$c(r7[72], (short) 210, r7[37]), null).invoke(r13, null)).booleanValue() != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be A[Catch: Exception -> 0x195b, TRY_ENTER, TRY_LEAVE, TryCatch #60 {Exception -> 0x195b, blocks: (B:3:0x000d, B:5:0x0025, B:52:0x0160, B:67:0x01be, B:78:0x0241, B:88:0x02cc, B:90:0x035d, B:98:0x039c, B:106:0x03ae, B:110:0x03b7, B:114:0x03c0, B:118:0x03ca, B:129:0x03ef, B:752:0x1875, B:767:0x1899, B:779:0x1914, B:768:0x18a6, B:755:0x187a, B:757:0x187d, B:63:0x0172, B:68:0x01cd, B:64:0x0192, B:79:0x0255, B:770:0x18ba, B:771:0x18ef, B:87:0x0297, B:70:0x020d), top: B:908:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x185d  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x1898  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:828:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:841:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:855:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:911:0x18a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0392  */
    static {
        /*
            Method dump skipped, instructions count: 6499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.d.<clinit>():void");
    }
}
