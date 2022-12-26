package o;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import o.ItemTouchHelper;
import o.ItemTouchHelper.ViewDropHandler;
/* loaded from: classes7.dex */
public final class prepareForDrop<T_WRAPPER extends ItemTouchHelper.ViewDropHandler<T_ENGINE>, T_ENGINE> {
    private static final List<Provider> HaptikSDK$b;
    public static final prepareForDrop<ItemTouchHelper$ViewDropHandler$HaptikSDK$b, MessageDigest> HaptikSDK$c;
    public static final prepareForDrop<ItemTouchHelper$ViewDropHandler$ah$a, KeyFactory> ag$a;
    public static final prepareForDrop<ItemTouchHelper.ViewDropHandler.values, Cipher> ah$a;
    private static final java.util.logging.Logger ah$b = java.util.logging.Logger.getLogger(prepareForDrop.class.getName());
    public static final prepareForDrop<ItemTouchHelper$ViewDropHandler$ah$b, Signature> invoke;
    public static final prepareForDrop<ItemTouchHelper.ViewDropHandler.toString, Mac> toString;
    public static final prepareForDrop<ItemTouchHelper.ViewDropHandler.valueOf, KeyAgreement> valueOf;
    public static final prepareForDrop<ItemTouchHelper$ViewDropHandler$ag$a, KeyPairGenerator> values;
    private T_WRAPPER HaptikSDK$a;
    private List<Provider> getSignupData = HaptikSDK$b;
    private boolean getInitSettings = true;

    static {
        if (fixLayoutStartGap.ag$a()) {
            HaptikSDK$b = valueOf(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
        } else {
            HaptikSDK$b = new ArrayList();
        }
        ah$a = new prepareForDrop<>(new ItemTouchHelper.ViewDropHandler.values());
        toString = new prepareForDrop<>(new ItemTouchHelper.ViewDropHandler.toString());
        invoke = new prepareForDrop<>(new ItemTouchHelper.ViewDropHandler<Signature>() { // from class: o.ItemTouchHelper$ViewDropHandler$ah$b
            @Override // o.ItemTouchHelper.ViewDropHandler
            /* renamed from: ag$a */
            public Signature ah$a(String str, Provider provider) throws GeneralSecurityException {
                if (provider == null) {
                    return Signature.getInstance(str);
                }
                return Signature.getInstance(str, provider);
            }
        });
        HaptikSDK$c = new prepareForDrop<>(new ItemTouchHelper.ViewDropHandler<MessageDigest>() { // from class: o.ItemTouchHelper$ViewDropHandler$HaptikSDK$b
            @Override // o.ItemTouchHelper.ViewDropHandler
            /* renamed from: values */
            public MessageDigest ah$a(String str, Provider provider) throws GeneralSecurityException {
                if (provider == null) {
                    return MessageDigest.getInstance(str);
                }
                return MessageDigest.getInstance(str, provider);
            }
        });
        valueOf = new prepareForDrop<>(new ItemTouchHelper.ViewDropHandler.valueOf());
        values = new prepareForDrop<>(new ItemTouchHelper.ViewDropHandler<KeyPairGenerator>() { // from class: o.ItemTouchHelper$ViewDropHandler$ag$a
            @Override // o.ItemTouchHelper.ViewDropHandler
            /* renamed from: ag$a */
            public KeyPairGenerator ah$a(String str, Provider provider) throws GeneralSecurityException {
                if (provider == null) {
                    return KeyPairGenerator.getInstance(str);
                }
                return KeyPairGenerator.getInstance(str, provider);
            }
        });
        ag$a = new prepareForDrop<>(new ItemTouchHelper.ViewDropHandler<KeyFactory>() { // from class: o.ItemTouchHelper$ViewDropHandler$ah$a
            @Override // o.ItemTouchHelper.ViewDropHandler
            /* renamed from: toString */
            public KeyFactory ah$a(String str, Provider provider) throws GeneralSecurityException {
                if (provider == null) {
                    return KeyFactory.getInstance(str);
                }
                return KeyFactory.getInstance(str, provider);
            }
        });
    }

    public static List<Provider> valueOf(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                ah$b.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public prepareForDrop(T_WRAPPER t_wrapper) {
        this.HaptikSDK$a = t_wrapper;
    }

    public T_ENGINE ah$a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : this.getSignupData) {
            try {
                return (T_ENGINE) this.HaptikSDK$a.ah$a(str, provider);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (this.getInitSettings) {
            return (T_ENGINE) this.HaptikSDK$a.ah$a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
