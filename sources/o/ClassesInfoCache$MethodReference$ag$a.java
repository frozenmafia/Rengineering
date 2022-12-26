package o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import o.ClassesInfoCache;
/* loaded from: classes4.dex */
public final class ClassesInfoCache$MethodReference$ag$a {
    public final ClassesInfoCache.MethodReference.toString[] valueOf;

    public ClassesInfoCache$MethodReference$ag$a(ClassesInfoCache.MethodReference.toString[] tostringArr) {
        this.valueOf = tostringArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final ClassesInfoCache$MethodReference$ag$a ah$a(DataInput dataInput) throws IOException {
        if (dataInput.readByte() != 1) {
            throw new RuntimeException("wrong dso manifest version");
        }
        int readInt = dataInput.readInt();
        if (readInt < 0) {
            throw new RuntimeException("illegal number of shared libraries");
        }
        ClassesInfoCache.MethodReference.toString[] tostringArr = new ClassesInfoCache.MethodReference.toString[readInt];
        for (int i = 0; i < readInt; i++) {
            tostringArr[i] = new ClassesInfoCache.MethodReference.toString(dataInput.readUTF(), dataInput.readUTF());
        }
        return new ClassesInfoCache$MethodReference$ag$a(tostringArr);
    }

    public final void ah$a(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(1);
        dataOutput.writeInt(this.valueOf.length);
        int i = 0;
        while (true) {
            ClassesInfoCache.MethodReference.toString[] tostringArr = this.valueOf;
            if (i >= tostringArr.length) {
                return;
            }
            dataOutput.writeUTF(tostringArr[i].toString);
            dataOutput.writeUTF(this.valueOf[i].ah$a);
            i++;
        }
    }
}
