package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.io.CharacterEscapes;
/* loaded from: classes6.dex */
public class isLoadInBackgroundCanceled extends waitForLoader<JsonFactory, isLoadInBackgroundCanceled> {
    public char ag$a;
    public setUpdateThrottle ah$a;
    public int toString;
    public CharacterEscapes values;

    public isLoadInBackgroundCanceled() {
        this.ag$a = '\"';
        this.ah$a = JsonFactory.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.toString = 0;
    }

    public isLoadInBackgroundCanceled(JsonFactory jsonFactory) {
        super(jsonFactory);
        this.ag$a = '\"';
        this.values = jsonFactory.getCharacterEscapes();
        this.ah$a = jsonFactory._rootValueSeparator;
        this.toString = jsonFactory._maximumNonEscapedChar;
    }
}
