package o;

import defpackage.ah;
import java.util.Date;
/* loaded from: classes.dex */
public class onAudioInfoChanged extends ah {
    public onAudioInfoChanged() {
        this.ah$a = ah.a.ACCESS;
    }

    public onAudioInfoChanged(String str, String str2, String str3, long j, byte[] bArr) {
        this(str, str2, str3, new Date(), j, bArr);
    }

    public onAudioInfoChanged(String str, String str2, String str3, Date date, long j, byte[] bArr) {
        this(str, str2, str3, date, new Date(date.getTime() + j), bArr);
    }

    public onAudioInfoChanged(String str, String str2, String str3, Date date, Date date2, byte[] bArr) {
        super(str, str2, str3, date, date2, bArr, ah.a.ACCESS);
    }
}
