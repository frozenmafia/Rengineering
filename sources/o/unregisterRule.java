package o;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpHead;
/* loaded from: classes5.dex */
public final class unregisterRule {
    public static final unregisterRule values = new unregisterRule();

    private unregisterRule() {
    }

    public final boolean valueOf(String str) {
        runAnimators.ag$a(str, "method");
        return runAnimators.values((Object) str, (Object) "POST") || runAnimators.values((Object) str, (Object) "PATCH") || runAnimators.values((Object) str, (Object) "PUT") || runAnimators.values((Object) str, (Object) HttpDelete.METHOD_NAME) || runAnimators.values((Object) str, (Object) "MOVE");
    }

    public static final boolean values(String str) {
        runAnimators.ag$a(str, "method");
        return runAnimators.values((Object) str, (Object) "POST") || runAnimators.values((Object) str, (Object) "PUT") || runAnimators.values((Object) str, (Object) "PATCH") || runAnimators.values((Object) str, (Object) "PROPPATCH") || runAnimators.values((Object) str, (Object) "REPORT");
    }

    public static final boolean toString(String str) {
        runAnimators.ag$a(str, "method");
        return (runAnimators.values((Object) str, (Object) "GET") || runAnimators.values((Object) str, (Object) HttpHead.METHOD_NAME)) ? false : true;
    }

    public final boolean ah$a(String str) {
        runAnimators.ag$a(str, "method");
        return runAnimators.values((Object) str, (Object) "PROPFIND");
    }

    public final boolean ag$a(String str) {
        runAnimators.ag$a(str, "method");
        return !runAnimators.values((Object) str, (Object) "PROPFIND");
    }
}
