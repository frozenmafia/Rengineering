package o;

import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes6.dex */
public final class rollbackContentChanged {
    static final char[] values = new char[0];
    private char[] HaptikSDK$a;
    private char[] HaptikSDK$b;
    private int HaptikSDK$c;
    private final unregisterListener ag$a;
    private boolean ah$a;
    private String ah$b;
    private int getInitSettings;
    private ArrayList<char[]> getSignupData;
    private int invoke;
    private int toString;
    private char[] valueOf;

    public rollbackContentChanged(unregisterListener unregisterlistener) {
        this.ag$a = unregisterlistener;
    }

    protected rollbackContentChanged(unregisterListener unregisterlistener, char[] cArr) {
        this.ag$a = unregisterlistener;
        this.valueOf = cArr;
        this.toString = cArr.length;
        this.invoke = -1;
    }

    public static rollbackContentChanged ah$a(char[] cArr) {
        return new rollbackContentChanged(null, cArr);
    }

    public void ah$a() {
        if (this.ag$a == null) {
            HaptikSDK$b();
        } else if (this.valueOf != null) {
            HaptikSDK$b();
            char[] cArr = this.valueOf;
            this.valueOf = null;
            this.ag$a.toString(2, cArr);
        }
    }

    public void HaptikSDK$b() {
        this.invoke = -1;
        this.toString = 0;
        this.HaptikSDK$c = 0;
        this.HaptikSDK$a = null;
        this.ah$b = null;
        this.HaptikSDK$b = null;
        if (this.ah$a) {
            HaptikSDK$a();
        }
    }

    private void HaptikSDK$a() {
        this.ah$a = false;
        this.getSignupData.clear();
        this.getInitSettings = 0;
        this.toString = 0;
    }

    public int ah$b() {
        if (this.invoke >= 0) {
            return this.HaptikSDK$c;
        }
        char[] cArr = this.HaptikSDK$b;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.ah$b;
        if (str != null) {
            return str.length();
        }
        return this.getInitSettings + this.toString;
    }

    public String ag$a() {
        if (this.ah$b == null) {
            char[] cArr = this.HaptikSDK$b;
            if (cArr != null) {
                this.ah$b = new String(cArr);
            } else {
                int i = this.invoke;
                if (i >= 0) {
                    int i2 = this.HaptikSDK$c;
                    if (i2 < 1) {
                        this.ah$b = "";
                        return "";
                    }
                    this.ah$b = new String(this.HaptikSDK$a, i, i2);
                } else {
                    int i3 = this.getInitSettings;
                    int i4 = this.toString;
                    if (i3 == 0) {
                        this.ah$b = i4 != 0 ? new String(this.valueOf, 0, i4) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.getSignupData;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.getSignupData.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.valueOf, 0, this.toString);
                        this.ah$b = sb.toString();
                    }
                }
            }
        }
        return this.ah$b;
    }

    public char[] values() {
        char[] cArr = this.HaptikSDK$b;
        if (cArr == null) {
            char[] invoke = invoke();
            this.HaptikSDK$b = invoke;
            return invoke;
        }
        return cArr;
    }

    public void valueOf(int i) {
        this.toString = i;
    }

    public char[] valueOf() {
        if (this.getSignupData == null) {
            this.getSignupData = new ArrayList<>();
        }
        this.ah$a = true;
        this.getSignupData.add(this.valueOf);
        int length = this.valueOf.length;
        this.getInitSettings += length;
        this.toString = 0;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > 65536) {
            i = 65536;
        }
        char[] rollbackcontentchanged = toString(i);
        this.valueOf = rollbackcontentchanged;
        return rollbackcontentchanged;
    }

    public String toString() {
        return ag$a();
    }

    private char[] invoke() {
        int i;
        String str = this.ah$b;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.invoke;
        if (i2 >= 0) {
            int i3 = this.HaptikSDK$c;
            if (i3 < 1) {
                return values;
            }
            if (i2 == 0) {
                return Arrays.copyOf(this.HaptikSDK$a, i3);
            }
            return Arrays.copyOfRange(this.HaptikSDK$a, i2, i3 + i2);
        }
        int ah$b = ah$b();
        if (ah$b < 1) {
            return values;
        }
        char[] rollbackcontentchanged = toString(ah$b);
        ArrayList<char[]> arrayList = this.getSignupData;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = this.getSignupData.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, rollbackcontentchanged, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.valueOf, 0, rollbackcontentchanged, i, this.toString);
        return rollbackcontentchanged;
    }

    private char[] toString(int i) {
        return new char[i];
    }
}
