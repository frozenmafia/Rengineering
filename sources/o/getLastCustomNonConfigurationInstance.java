package o;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.authorization.User;
import defpackage.ch;
/* loaded from: classes.dex */
public final class getLastCustomNonConfigurationInstance {
    private User ag$a;
    private String ah$a;
    private String toString;
    private String valueOf;
    private String values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getLastCustomNonConfigurationInstance(Bundle bundle) {
        this(bundle, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getLastCustomNonConfigurationInstance(Bundle bundle, User user) {
        this.toString = bundle.getString(ch.b.TOKEN.f19a);
        this.ah$a = bundle.getString(ch.b.AUTHORIZATION_CODE.f19a);
        this.valueOf = bundle.getString(ch.b.CLIENT_ID.f19a);
        this.values = bundle.getString(ch.b.REDIRECT_URI.f19a);
        this.ag$a = user;
    }

    public String ag$a() {
        return this.ah$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            getLastCustomNonConfigurationInstance getlastcustomnonconfigurationinstance = (getLastCustomNonConfigurationInstance) obj;
            String str = this.toString;
            if (str == null) {
                if (getlastcustomnonconfigurationinstance.toString != null) {
                    return false;
                }
            } else if (!str.equals(getlastcustomnonconfigurationinstance.toString)) {
                return false;
            }
            String str2 = this.ah$a;
            if (str2 == null) {
                if (getlastcustomnonconfigurationinstance.ah$a != null) {
                    return false;
                }
            } else if (!str2.equals(getlastcustomnonconfigurationinstance.ah$a)) {
                return false;
            }
            User user = this.ag$a;
            if (user == null) {
                if (getlastcustomnonconfigurationinstance.ag$a != null) {
                    return false;
                }
            } else if (!user.equals(getlastcustomnonconfigurationinstance.ag$a)) {
                return false;
            }
            String str3 = this.valueOf;
            if (str3 == null) {
                if (getlastcustomnonconfigurationinstance.valueOf != null) {
                    return false;
                }
            } else if (!str3.equals(getlastcustomnonconfigurationinstance.valueOf)) {
                return false;
            }
            String str4 = this.values;
            String str5 = getlastcustomnonconfigurationinstance.values;
            if (str4 == null) {
                if (str5 != null) {
                    return false;
                }
            } else if (!str4.equals(str5)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.toString;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ah$a;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        User user = this.ag$a;
        int hashCode3 = user == null ? 0 : user.hashCode();
        String str3 = this.valueOf;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.values;
        return ((((((((hashCode + 31) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String valueOf() {
        return this.values;
    }

    public String values() {
        return this.valueOf;
    }
}
