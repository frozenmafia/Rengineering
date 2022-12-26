package com.app.dream11.payment;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.app.dream11Pro.R;
import o.move;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public enum PaymentType {
    Wallet(1, "Wallet", "Wallets", R.drawable.wallet_1),
    NetBanking(2, ag$a((Process.myTid() >> 22) + 10, TextUtils.indexOf((CharSequence) "", '0') + 1, (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), "Net Banking", R.drawable.bank_2),
    Cards(3, "Cards", "Debit / Credit Card", R.drawable.credit_card),
    UPI(4, ag$a((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 3, 10 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ExpandableListView.getPackedPositionType(0)).intern(), ag$a(3 - TextUtils.indexOf("", ""), 10 - ExpandableListView.getPackedPositionType(0), (char) TextUtils.getOffsetAfter("", 0)).intern(), R.drawable.upi);
    
    private static int ag$a = 1;
    private static char[] ah$a;
    private static long toString;
    private static int valueOf;
    private final String header;
    private final int icon;
    private final int id;
    private final String title;

    static void ah$a() {
        toString = 7842596921500091142L;
        ah$a = new char[]{'N', 50019, 34424, 18768, 3193, 53104, 37455, 21827, 6238, 56145, 'U', 50006, 34373};
    }

    public static PaymentType valueOf(String str) {
        int i = valueOf + 93;
        ag$a = i % 128;
        int i2 = i % 2;
        PaymentType paymentType = (PaymentType) Enum.valueOf(PaymentType.class, str);
        int i3 = ag$a + 63;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return paymentType;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PaymentType[] valuesCustom() {
        int i = valueOf + 73;
        ag$a = i % 128;
        if (i % 2 == 0) {
            PaymentType[] paymentTypeArr = (PaymentType[]) values().clone();
            Object[] objArr = null;
            int length = objArr.length;
            return paymentTypeArr;
        }
        return (PaymentType[]) values().clone();
    }

    static {
        ah$a();
        int i = valueOf + 39;
        ag$a = i % 128;
        int i2 = i % 2;
    }

    PaymentType(int i, String str, String str2, int i2) {
        this.id = i;
        this.header = str2;
        this.icon = i2;
        this.title = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = valueOf + 11;
        ag$a = i % 128;
        if ((i % 2 == 0 ? '^' : (char) 2) == '^') {
            int i2 = 64 / 0;
            return this.title;
        }
        try {
            return this.title;
        } catch (Exception e) {
            throw e;
        }
    }

    public int getId() {
        int i;
        int i2 = ag$a + 99;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            i = this.id;
        } else {
            i = this.id;
            int i3 = 22 / 0;
        }
        int i4 = ag$a + 37;
        valueOf = i4 % 128;
        if ((i4 % 2 != 0 ? TokenParser.CR : '\t') != '\r') {
            return i;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return i;
    }

    public String getHeader() {
        int i = valueOf + 15;
        ag$a = i % 128;
        int i2 = i % 2;
        String str = this.header;
        int i3 = valueOf + 13;
        ag$a = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public String getTitle() {
        String str;
        int i = valueOf + 27;
        ag$a = i % 128;
        if (!(i % 2 != 0)) {
            try {
                str = this.title;
                int i2 = 25 / 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.title;
        }
        try {
            int i3 = valueOf + 77;
            ag$a = i3 % 128;
            if ((i3 % 2 == 0 ? '3' : '&') != '3') {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int getIcon() {
        int i = valueOf + 47;
        ag$a = i % 128;
        int i2 = i % 2;
        try {
            int i3 = this.icon;
            int i4 = valueOf + 115;
            ag$a = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ag$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((ah$a[move.values + i2] ^ (move.values * toString)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
