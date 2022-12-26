package o;

import kotlin.coroutines.CoroutineContext$plus$1;
import kotlin.coroutines.EmptyCoroutineContext;
/* loaded from: classes5.dex */
public final class PropertyValuesHolderUtils$ah$a {
    public static PropertyValuesHolderUtils valueOf(PropertyValuesHolderUtils propertyValuesHolderUtils, PropertyValuesHolderUtils propertyValuesHolderUtils2) {
        runAnimators.ag$a(propertyValuesHolderUtils2, "context");
        return propertyValuesHolderUtils2 == EmptyCoroutineContext.INSTANCE ? propertyValuesHolderUtils : (PropertyValuesHolderUtils) propertyValuesHolderUtils2.fold(propertyValuesHolderUtils, CoroutineContext$plus$1.INSTANCE);
    }
}
