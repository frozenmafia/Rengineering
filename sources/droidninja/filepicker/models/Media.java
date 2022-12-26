package droidninja.filepicker.models;
/* loaded from: classes5.dex */
public class Media extends BaseFile {
    public int ah$a;

    public Media(int i, String str, String str2, int i2) {
        super(i, str, str2);
        this.ah$a = i2;
    }

    public Media() {
        super(0, null, null);
    }

    @Override // droidninja.filepicker.models.BaseFile
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Media) && this.toString == ((Media) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    @Override // droidninja.filepicker.models.BaseFile
    public String ag$a() {
        return this.ag$a != null ? this.ag$a : "";
    }

    @Override // droidninja.filepicker.models.BaseFile
    public int valueOf() {
        return this.toString;
    }

    public int ah$a() {
        return this.ah$a;
    }
}
