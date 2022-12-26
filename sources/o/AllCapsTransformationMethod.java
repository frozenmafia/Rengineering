package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.app.dream11.dream11.DreamApplication;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class AllCapsTransformationMethod implements enableHomeButtonByDefault {
    public static final AllCapsTransformationMethod ag$a = new AllCapsTransformationMethod();
    private static final Resources ah$a;

    private AllCapsTransformationMethod() {
    }

    static {
        DreamApplication valueOf = DreamApplication.valueOf();
        Configuration configuration = new Configuration(valueOf.getResources().getConfiguration());
        configuration.setLocale(Locale.ENGLISH);
        Resources resources = valueOf.createConfigurationContext(configuration).getResources();
        runAnimators.ah$a(resources, "context.createConfigurat…Context(config).resources");
        ah$a = resources;
    }

    @Override // o.enableHomeButtonByDefault
    public int ag$a(int i) {
        return androidx.core.content.ContextCompat.getColor(DreamApplication.values(), i);
    }

    @Override // o.enableHomeButtonByDefault
    public Drawable valueOf(int i) {
        return androidx.core.content.ContextCompat.getDrawable(DreamApplication.valueOf(), i);
    }

    @Override // o.enableHomeButtonByDefault
    public String ah$a(int i, int i2, Object... objArr) {
        runAnimators.ag$a(objArr, "args");
        String quantityString = DreamApplication.values().getResources().getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        runAnimators.ah$a(quantityString, "getCurrentActivityContex…ring(id, quantity, *args)");
        return quantityString;
    }

    @Override // o.enableHomeButtonByDefault
    public CharSequence values(CharSequence charSequence, List<getStackedTabMaxWidth> list) {
        runAnimators.ag$a(charSequence, "text");
        runAnimators.ag$a(list, "list");
        hasEmbeddedTabs hasembeddedtabs = hasEmbeddedTabs.ag$a;
        Context values = DreamApplication.values();
        runAnimators.ah$a(values, "getCurrentActivityContext()");
        return hasembeddedtabs.ah$a(charSequence, list, values);
    }

    @Override // o.enableHomeButtonByDefault
    public String valueOf(int i, Object... objArr) {
        runAnimators.ag$a(objArr, "args");
        String string = DreamApplication.values().getString(i, Arrays.copyOf(objArr, objArr.length));
        runAnimators.ah$a(string, "getCurrentActivityContext().getString(id, *args)");
        return string;
    }

    @Override // o.enableHomeButtonByDefault
    public int ah$a(int i) {
        return DreamApplication.values().getResources().getInteger(i);
    }

    @Override // o.enableHomeButtonByDefault
    public float toString(int i) {
        return DreamApplication.values().getResources().getDimension(i);
    }

    @Override // o.enableHomeButtonByDefault
    public int values(int i) {
        return DreamApplication.values().getResources().getDimensionPixelSize(i);
    }

    @Override // o.enableHomeButtonByDefault
    public String ah$a(String str) {
        runAnimators.ag$a(str, "string");
        Context values = DreamApplication.values();
        runAnimators.ah$a(values, "getCurrentActivityContext()");
        return getFinalX.values(values, str);
    }

    @Override // o.enableHomeButtonByDefault
    public String ah$a(int i, Object... objArr) {
        runAnimators.ag$a(objArr, "args");
        String string = ah$a.getString(i, Arrays.copyOf(objArr, objArr.length));
        runAnimators.ah$a(string, "defaultLocaleResource.getString(string, *args)");
        return string;
    }
}
