package o;

import com.app.dream11.contest.BaseContestPresenter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class supportRequestWindowFeature {
    String HaptikSDK$a;
    int HaptikSDK$b;
    List<Integer> HaptikSDK$c;
    String HaptikWebView;
    String ag$a;
    String ah$a;
    int ah$b;
    int invoke;
    String toString;
    String valueOf;
    boolean values;

    public supportRequestWindowFeature(int i, int i2, String str, int i3, String str2, boolean z, List<Integer> list) {
        this.HaptikSDK$a = "Others";
        this.invoke = BaseContestPresenter.PROXY_SECTION_ID_CONTEST_HOME_LISTING;
        this.values = false;
        this.HaptikSDK$c = new ArrayList();
        this.HaptikSDK$b = i;
        this.ah$b = i2;
        this.valueOf = str;
        this.invoke = i3;
        this.HaptikWebView = str2;
        this.values = z;
        this.HaptikSDK$c = list;
    }

    public supportRequestWindowFeature(int i, int i2, String str, String str2, String str3, int i3, String str4, String str5, boolean z, List<Integer> list) {
        this.HaptikSDK$a = "Others";
        this.invoke = BaseContestPresenter.PROXY_SECTION_ID_CONTEST_HOME_LISTING;
        this.values = false;
        this.HaptikSDK$c = new ArrayList();
        this.HaptikSDK$b = i;
        this.ah$b = i2;
        this.valueOf = str;
        this.HaptikSDK$a = str2;
        this.ag$a = str3;
        this.invoke = i3;
        this.toString = str4;
        this.HaptikWebView = str5;
        this.values = z;
        this.HaptikSDK$c = list;
    }

    public supportRequestWindowFeature(int i, int i2, String str, String str2, String str3, int i3, String str4, String str5, boolean z, List<Integer> list, String str6) {
        this.HaptikSDK$a = "Others";
        this.invoke = BaseContestPresenter.PROXY_SECTION_ID_CONTEST_HOME_LISTING;
        this.values = false;
        this.HaptikSDK$c = new ArrayList();
        this.HaptikSDK$b = i;
        this.ah$b = i2;
        this.valueOf = str;
        this.HaptikSDK$a = str2;
        this.ag$a = str3;
        this.invoke = i3;
        this.toString = str4;
        this.HaptikWebView = str5;
        this.values = z;
        this.HaptikSDK$c = list;
        this.ah$a = str6;
    }

    public String valueOf() {
        return this.valueOf;
    }

    public int ag$a() {
        return this.ah$b;
    }

    public String invoke() {
        return this.HaptikSDK$a;
    }

    public String values() {
        return this.ag$a;
    }

    public int ah$b() {
        return this.invoke;
    }

    public String ah$a() {
        return this.toString;
    }

    public String HaptikSDK$a() {
        return this.HaptikWebView;
    }

    public boolean HaptikSDK$e() {
        return this.values;
    }

    public List<Integer> HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public boolean HaptikSDK$c() {
        String str = this.ah$a;
        return (str == null || str.isEmpty()) ? false : true;
    }
}
