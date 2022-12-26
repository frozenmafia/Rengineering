package com.google.api.client.http;

import java.io.IOException;
import o.PrintHelper;
import o.applyAdd;
import o.markViewHoldersUpdated;
import o.systemSupportsPrint;
/* loaded from: classes7.dex */
public class HttpResponseException$ag$a {
    PrintHelper ag$a;
    String ah$a;
    String toString;
    int valueOf;
    String values;

    public HttpResponseException$ag$a(int i, String str, PrintHelper printHelper) {
        toString(i);
        toString(str);
        valueOf(printHelper);
    }

    public HttpResponseException$ag$a(systemSupportsPrint systemsupportsprint) {
        this(systemsupportsprint.values(), systemsupportsprint.HaptikSDK$b(), systemsupportsprint.valueOf());
        try {
            String HaptikSDK$a = systemsupportsprint.HaptikSDK$a();
            this.ah$a = HaptikSDK$a;
            if (HaptikSDK$a.length() == 0) {
                this.ah$a = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        StringBuilder computeMessageBuffer = HttpResponseException.computeMessageBuffer(systemsupportsprint);
        if (this.ah$a != null) {
            computeMessageBuffer.append(applyAdd.toString);
            computeMessageBuffer.append(this.ah$a);
        }
        this.toString = computeMessageBuffer.toString();
    }

    public HttpResponseException$ag$a toString(int i) {
        markViewHoldersUpdated.values(i >= 0);
        this.valueOf = i;
        return this;
    }

    public HttpResponseException$ag$a toString(String str) {
        this.values = str;
        return this;
    }

    public HttpResponseException$ag$a valueOf(PrintHelper printHelper) {
        this.ag$a = (PrintHelper) PrintHelper.PrintUriAdapter.AnonymousClass1.ag$a(printHelper);
        return this;
    }
}
