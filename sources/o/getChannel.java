package o;
/* loaded from: classes5.dex */
public class getChannel {
    float ah$a;
    float toString;
    float valueOf;
    float values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getChannel(float f, float f2, float f3, float f4) {
        this.values = f;
        this.toString = f2;
        this.valueOf = f3;
        this.ah$a = f4;
    }

    public boolean values(getChannel getchannel) {
        if (this == getchannel) {
            return true;
        }
        return this.values == getchannel.values && this.toString == getchannel.toString && this.valueOf == getchannel.valueOf && this.ah$a == getchannel.ah$a;
    }
}
