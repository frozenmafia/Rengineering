package o;

import java.io.IOException;
/* loaded from: classes3.dex */
final class getHyphenationFrequency {
    private int ah$a;
    private final C$default$setContentDescription toString = new C$default$setContentDescription(8);

    public boolean toString(getExitDir getexitdir) throws IOException {
        long ag$a;
        int i;
        long ah$a = getexitdir.ah$a();
        long j = android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        int i2 = (ah$a > (-1L) ? 1 : (ah$a == (-1L) ? 0 : -1));
        if (i2 != 0 && ah$a <= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = ah$a;
        }
        int i3 = (int) j;
        getexitdir.ag$a(this.toString.ah$a(), 0, 4);
        long onPostMessage = this.toString.onPostMessage();
        this.ah$a = 4;
        while (onPostMessage != 440786851) {
            int i4 = this.ah$a + 1;
            this.ah$a = i4;
            if (i4 == i3) {
                return false;
            }
            getexitdir.ag$a(this.toString.ah$a(), 0, 1);
            onPostMessage = ((onPostMessage << 8) & (-256)) | (this.toString.ah$a()[0] & 255);
        }
        long ag$a2 = ag$a(getexitdir);
        long j2 = this.ah$a;
        if (ag$a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + ag$a2 >= ah$a) {
            return false;
        }
        while (true) {
            int i5 = (this.ah$a > (j2 + ag$a2) ? 1 : (this.ah$a == (j2 + ag$a2) ? 0 : -1));
            if (i5 >= 0) {
                return i5 == 0;
            } else if (ag$a(getexitdir) != Long.MIN_VALUE && (ag$a(getexitdir)) >= 0 && ag$a <= 2147483647L) {
                if (i != 0) {
                    int i6 = (int) ag$a;
                    getexitdir.ah$a(i6);
                    this.ah$a += i6;
                }
            }
        }
    }

    private long ag$a(getExitDir getexitdir) throws IOException {
        int i = 0;
        getexitdir.ag$a(this.toString.ah$a(), 0, 1);
        int i2 = this.toString.ah$a()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        getexitdir.ag$a(this.toString.ah$a(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (i5 << 8) + (this.toString.ah$a()[i] & 255);
        }
        this.ah$a += i4 + 1;
        return i5;
    }
}
