package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class onPostMessage$ag$a<A, B> extends onPostMessage<A, B> {
    private final onPostMessage<A, onPostMessage<A, B>> toString;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof onPostMessage$ag$a) && runAnimators.values(this.toString, ((onPostMessage$ag$a) obj).toString);
        }
        return true;
    }

    public int hashCode() {
        onPostMessage<A, onPostMessage<A, B>> onpostmessage = this.toString;
        if (onpostmessage != null) {
            return onpostmessage.hashCode();
        }
        return 0;
    }

    @Override // o.onPostMessage
    public String toString() {
        return "AndThen.Join(...)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onPostMessage$ag$a(onPostMessage<A, onPostMessage<A, B>> onpostmessage) {
        super(null);
        runAnimators.valueOf(onpostmessage, "fa");
        this.toString = onpostmessage;
    }

    public final onPostMessage<A, onPostMessage<A, B>> valueOf() {
        return this.toString;
    }
}
