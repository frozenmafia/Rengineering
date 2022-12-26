package droidninja.filepicker.models;

import java.io.File;
import o.access$getFoldingFeature;
/* loaded from: classes5.dex */
public class Document extends BaseFile {
    private String HaptikSDK$a;
    private FileType ah$a;
    private String valueOf;

    public Document(int i, String str, String str2) {
        super(i, str, str2);
    }

    public Document() {
        super(0, null, null);
    }

    @Override // droidninja.filepicker.models.BaseFile
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Document) && this.toString == ((Document) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    @Override // droidninja.filepicker.models.BaseFile
    public String ag$a() {
        return this.ag$a;
    }

    @Override // droidninja.filepicker.models.BaseFile
    public int valueOf() {
        return this.toString;
    }

    public void valueOf(String str) {
        this.valueOf = str;
    }

    public String ah$a() {
        return this.HaptikSDK$a;
    }

    public void values(String str) {
        this.HaptikSDK$a = str;
    }

    public String HaptikSDK$a() {
        return new File(this.ag$a).getName();
    }

    public boolean values(String[] strArr) {
        return access$getFoldingFeature.values(strArr, this.ag$a);
    }

    public FileType values() {
        return this.ah$a;
    }

    public void values(FileType fileType) {
        this.ah$a = fileType;
    }
}
