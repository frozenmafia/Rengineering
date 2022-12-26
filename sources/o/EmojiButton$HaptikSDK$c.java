package o;

import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.upi.UpiApp;
import com.dreampay.commons.upi.UpiCollectAvailability;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class EmojiButton$HaptikSDK$c extends EmojiButton {
    private final String ag$a;
    private final UpiCollectAvailability ah$a;
    private final int toString;
    private final ArrayList<UpiApp> valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmojiButton$HaptikSDK$c) {
            EmojiButton$HaptikSDK$c emojiButton$HaptikSDK$c = (EmojiButton$HaptikSDK$c) obj;
            return runAnimators.values((Object) this.values, (Object) emojiButton$HaptikSDK$c.values) && runAnimators.values((Object) this.ag$a, (Object) emojiButton$HaptikSDK$c.ag$a) && runAnimators.values(this.valueOf, emojiButton$HaptikSDK$c.valueOf) && runAnimators.values(this.ah$a, emojiButton$HaptikSDK$c.ah$a) && this.toString == emojiButton$HaptikSDK$c.toString;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.values.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.ah$a.hashCode()) * 31) + this.toString;
    }

    public String toString() {
        return "UPIIntentFragmentArguments(base64Request=" + this.values + ", checksum=" + this.ag$a + ", upiEnabledApps=" + this.valueOf + ", upiCollectAvailability=" + this.ah$a + ", requestCode=" + this.toString + ')';
    }

    public final String ah$a() {
        return this.values;
    }

    public final String values() {
        return this.ag$a;
    }

    public final ArrayList<UpiApp> ah$b() {
        return this.valueOf;
    }

    public final UpiCollectAvailability valueOf() {
        return this.ah$a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiButton$HaptikSDK$c(String str, String str2, ArrayList<UpiApp> arrayList, UpiCollectAvailability upiCollectAvailability, int i) {
        super(null);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(arrayList, "upiEnabledApps");
        runAnimators.ag$a(upiCollectAvailability, "upiCollectAvailability");
        this.values = str;
        this.ag$a = str2;
        this.valueOf = arrayList;
        this.ah$a = upiCollectAvailability;
        this.toString = i;
    }

    public final int ag$a() {
        return this.toString;
    }
}
