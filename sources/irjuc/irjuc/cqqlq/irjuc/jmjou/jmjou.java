package irjuc.irjuc.cqqlq.irjuc.jmjou;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.dreampay.commons.constants.Constants;
import com.sendbird.android.constant.StringSet;
import irjuc.irjuc.cqqlq.irjuc.rmqfk.adjic;
import irjuc.irjuc.cqqlq.irjuc.zihjx.krrvc;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.UUID;
import o.beginAsyncSectionFallback;
import o.handleException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class jmjou implements Parcelable {
    public static Context valueOf;
    public static String values = UUID.randomUUID().toString();
    public static jmjou$ag$a ag$a = new jmjou$ag$a();
    public static final Parcelable.Creator<jmjou> CREATOR = new valueOf();

    /* loaded from: classes5.dex */
    public static class chmha extends HashMap<String, Object> implements handleException {
        @Override // o.handleException
        public void init(jmjou jmjouVar, chmha chmhaVar) {
        }

        public <T> T irjuc(String str, T t) {
            return super.containsKey(str) ? (T) super.get(str) : t;
        }

        @Override // o.handleException
        public boolean isCachingAllowed() {
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public static final class valueOf implements Parcelable.Creator<jmjou> {
        @Override // android.os.Parcelable.Creator
        public jmjou createFromParcel(Parcel parcel) {
            return new jmjou();
        }

        @Override // android.os.Parcelable.Creator
        public jmjou[] newArray(int i) {
            return new jmjou[i];
        }
    }

    public jmjou() {
    }

    public jmjou(Context context) {
        beginAsyncSectionFallback.values("ObjectFactory", "validating context provided to sdk ...");
        if (beginAsyncSectionFallback.toString(context, "ObjectFactory", "context") || beginAsyncSectionFallback.toString(context.getApplicationContext(), "ObjectFactory", "appContext")) {
            throw new RuntimeException("Application context is required for initialization.");
        }
        beginAsyncSectionFallback.valueOf("ObjectFactory", "context provided is valid");
        valueOf = context.getApplicationContext();
    }

    public <T> boolean ag$a(String str, T t) {
        if (beginAsyncSectionFallback.toString(t, "ObjectFactory", str)) {
            return false;
        }
        ag$a.ah$a.put(str, t);
        return true;
    }

    public Bundle ah$a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("data_factory", this);
        return bundle;
    }

    public JSONObject ah$a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            beginAsyncSectionFallback.valueOf("ObjectFactory", String.format("JSONException with msg = {%s} for the key {%s}", e.getMessage(), str), e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends handleException> T toString(Class<T> cls, chmha chmhaVar) {
        String format;
        InstantiationException instantiationException;
        try {
            T newInstance = cls.newInstance();
            newInstance.init(this, chmhaVar);
            return newInstance;
        } catch (IllegalAccessException e) {
            format = String.format("IllegalAccessException for class = {%s} caught,exception message = {%s}. Make sure class has public default constructor available.", cls.getName(), e.getMessage());
            instantiationException = e;
            beginAsyncSectionFallback.valueOf("ObjectFactory", format, instantiationException);
            valueOf().ah$a("ObjectFactory", "This should not happen, there is something wrong with PhonePe SDK", krrvc.irjuc.LOW);
            return null;
        } catch (InstantiationException e2) {
            format = String.format("InstantiationException for class = {%s} caught,exception message = {%s}.", cls.getName(), e2.getMessage());
            instantiationException = e2;
            beginAsyncSectionFallback.valueOf("ObjectFactory", format, instantiationException);
            valueOf().ah$a("ObjectFactory", "This should not happen, there is something wrong with PhonePe SDK", krrvc.irjuc.LOW);
            return null;
        }
    }

    public <T> Intent valueOf(Context context, Class<T> cls, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public adjic valueOf(String str) {
        char c;
        adjic adjicVar = (adjic) values(adjic.class);
        str.hashCode();
        switch (str.hashCode()) {
            case -1149187101:
                if (str.equals(Constants.Upi.PHONEPE_SUCCESS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -879828873:
                if (str.equals("NETWORK_ERROR")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -591252731:
                if (str.equals("EXPIRED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -137465490:
                if (str.equals("USER_CANCEL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1570819351:
                if (str.equals("TRX_FAILED_REPORTED_BY_UPI_APP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1687978510:
                if (str.equals("RETRY_LIMIT_EXCEEDED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2066319421:
                if (str.equals("FAILED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                adjicVar.put("statusCode", Constants.Upi.PHONEPE_SUCCESS);
                break;
            case 1:
                adjicVar.put("statusCode", "NETWORK_ERROR");
                break;
            case 2:
                adjicVar.put("statusCode", "EXPIRED");
                break;
            case 3:
                adjicVar.put("statusCode", "USER_CANCEL");
                break;
            case 4:
                adjicVar.put("statusCode", "TRX_FAILED_REPORTED_BY_UPI_APP");
                break;
            case 5:
                adjicVar.put("statusCode", "RETRY_LIMIT_EXCEEDED");
                break;
            case 6:
                adjicVar.put("statusCode", "FAILED");
                break;
        }
        return adjicVar;
    }

    public krrvc valueOf() {
        return (krrvc) values(krrvc.class);
    }

    public JSONArray values(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e) {
            beginAsyncSectionFallback.valueOf("ObjectFactory", String.format("JSONException with msg = {%s} for the key {%s}", e.getMessage(), str), e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public <T extends handleException> T values(Class<T> cls) {
        if (ag$a.values(cls)) {
            return (T) ag$a.ah$a.get(cls.getCanonicalName());
        }
        T t = (T) toString(cls, null);
        return t.isCachingAllowed() ? (T) ag$a.values(cls, t) : t;
    }

    public String ag$a() {
        try {
            jmjou$ag$a jmjou_ag_a = ag$a;
            jmjou_ag_a.getClass();
            if (beginAsyncSectionFallback.toString("signature_digest", "ObjectFactory", StringSet.key) ? false : jmjou_ag_a.ah$a.containsKey("signature_digest")) {
                return (String) ag$a.ah$a.get("signature_digest");
            }
            byte[] byteArray = valueOf.getPackageManager().getPackageInfo(valueOf.getPackageName(), 64).signatures[0].toByteArray();
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1);
            messageDigest.update(byteArray);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            ag$a.ah$a.put("signature_digest", encodeToString);
            return encodeToString;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public <T> T toString(String str) {
        jmjou$ag$a jmjou_ag_a = ag$a;
        jmjou_ag_a.getClass();
        if (beginAsyncSectionFallback.toString(str, "ObjectFactory", StringSet.key) ? false : jmjou_ag_a.ah$a.containsKey(str)) {
            return (T) ag$a.ah$a.get(str);
        }
        return null;
    }
}
