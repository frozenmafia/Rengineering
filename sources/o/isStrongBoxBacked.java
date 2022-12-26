package o;

import droidninja.filepicker.models.FileType;
import droidninja.filepicker.models.sort.SortingTypes;
import droidninja.filepicker.utils.Orientation;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import o.MasterKey;
/* loaded from: classes5.dex */
public class isStrongBoxBacked {
    private static isStrongBoxBacked valueOf = new isStrongBoxBacked();
    private boolean HaptikWebView;
    private boolean getInitSettings;
    private String invoke;
    private int ah$b = -1;
    private boolean HaptikSDK$d = true;
    private int values = MasterKey.AnonymousClass1.toString.ic_search;
    private SortingTypes isLogoutPending = SortingTypes.none;
    private int aj$a = MasterKey.AnonymousClass1.invoke._res_0x7f1301d0;
    private String a = null;
    private boolean getSignupData = false;
    private boolean ag$a = true;
    private boolean toString = true;
    private Orientation HaptikSDK$a = Orientation.UNSPECIFIED;
    private boolean HaptikSDK$e = true;
    private ArrayList<String> HaptikSDK$b = new ArrayList<>();
    private ArrayList<String> ah$a = new ArrayList<>();
    private LinkedHashSet<FileType> HaptikSDK$c = new LinkedHashSet<>();

    public static isStrongBoxBacked valueOf() {
        return valueOf;
    }

    private isStrongBoxBacked() {
    }

    public void valueOf(int i) {
        extraCallback();
        this.ah$b = i;
    }

    public int invoke() {
        return this.ah$b;
    }

    public int ah$b() {
        return this.HaptikSDK$b.size() + this.ah$a.size();
    }

    public void ag$a(String str, int i) {
        if (str == null || !extraCallbackWithResult()) {
            return;
        }
        if (!this.HaptikSDK$b.contains(str) && i == 1) {
            this.HaptikSDK$b.add(str);
        } else if (this.ah$a.contains(str) || i != 2) {
        } else {
            this.ah$a.add(str);
        }
    }

    public void ah$a(ArrayList<String> arrayList, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ag$a(arrayList.get(i2), i);
        }
    }

    public void ah$a(String str, int i) {
        if (i == 1 && this.HaptikSDK$b.contains(str)) {
            this.HaptikSDK$b.remove(str);
        } else if (i == 2) {
            this.ah$a.remove(str);
        }
    }

    public boolean extraCallbackWithResult() {
        return this.ah$b == -1 || ah$b() < this.ah$b;
    }

    public ArrayList<String> getSignupData() {
        return this.HaptikSDK$b;
    }

    public ArrayList<String> HaptikSDK$e() {
        return this.ah$a;
    }

    public void extraCallback() {
        this.ah$a.clear();
        this.HaptikSDK$b.clear();
        this.HaptikSDK$c.clear();
        this.ah$b = -1;
    }

    public void ah$a() {
        this.HaptikSDK$b.clear();
        this.ah$a.clear();
    }

    public void valueOf(ArrayList<String> arrayList) {
        this.HaptikSDK$b.removeAll(arrayList);
    }

    public int HaptikWebView() {
        return this.aj$a;
    }

    public void ag$a(int i) {
        this.aj$a = i;
    }

    public String HaptikSDK$d() {
        return this.a;
    }

    public boolean ak$b() {
        return this.getInitSettings;
    }

    public boolean ak$a() {
        return this.HaptikSDK$d;
    }

    public boolean onXdkEvent() {
        return this.HaptikWebView;
    }

    public boolean aj$a() {
        return this.HaptikSDK$e;
    }

    public void ag$a() {
        this.HaptikSDK$c.add(new FileType("PDF", new String[]{"pdf"}, MasterKey.AnonymousClass1.toString.ic_search));
    }

    public ArrayList<FileType> HaptikSDK$c() {
        return new ArrayList<>(this.HaptikSDK$c);
    }

    public boolean a() {
        return this.ag$a;
    }

    public boolean ak() {
        return this.toString;
    }

    public void ag$a(boolean z) {
        this.toString = z;
    }

    public Orientation HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public void valueOf(Orientation orientation) {
        this.HaptikSDK$a = orientation;
    }

    public String HaptikSDK$b() {
        return this.invoke;
    }

    public void ah$a(String str) {
        this.invoke = str;
    }

    public int values() {
        return this.values;
    }

    public boolean isLogoutPending() {
        return this.ah$b == -1 && this.getSignupData;
    }

    public SortingTypes getInitSettings() {
        return this.isLogoutPending;
    }
}
