package o;

import com.app.dream11.dream11.messagepool.MessageTypeCode;
import com.app.dream11.dream11.messagepool.NotifyType;
/* loaded from: classes.dex */
public class setPaddingRelative extends setRadius {
    private NotifyType valueOf;

    public setPaddingRelative(NotifyType notifyType) {
        super(MessageTypeCode.NOTIFY);
        this.valueOf = notifyType;
    }

    public NotifyType valueOf() {
        return this.valueOf;
    }
}
