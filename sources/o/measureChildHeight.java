package o;

import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class measureChildHeight {
    @isFullSpan(valueOf = "pages")
    private ArrayList<viewIsOpaque> HaptikSDK$b = null;
    @isFullSpan(valueOf = ViewProps.ENABLED)
    private Boolean ag$a;
    @isFullSpan(valueOf = easypay.manager.Constants.EXTRA_BANK_SCHEME)
    private String ah$a;
    @isFullSpan(valueOf = "bankName")
    private String toString;
    @isFullSpan(valueOf = "etag")
    private String valueOf;
    @isFullSpan(valueOf = "payMode")
    private String values;

    public String valueOf() {
        return this.ah$a;
    }

    public String ah$a() {
        return this.toString;
    }

    public String HaptikSDK$a() {
        return this.values;
    }

    public ArrayList<viewIsOpaque> invoke() {
        return this.HaptikSDK$b;
    }

    public Boolean ag$a() {
        return this.ag$a;
    }

    public String values() {
        return this.valueOf;
    }

    public void ah$a(String str) {
        this.valueOf = str;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof measureChildHeight)) {
            if (obj == this) {
                return true;
            }
            measureChildHeight measurechildheight = (measureChildHeight) obj;
            return (ah$a() + HaptikSDK$a() + valueOf()).equals(measurechildheight.ah$a() + measurechildheight.HaptikSDK$a() + measurechildheight.valueOf());
        }
        return false;
    }

    public String toString() {
        return ah$a() + HaptikSDK$a() + valueOf();
    }
}
