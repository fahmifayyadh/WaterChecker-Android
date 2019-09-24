package website.fahmifa.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class RealtimeCheck implements Parcelable {
    int ph, temp, o2;

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getO2() {
        return o2;
    }

    public void setO2(int o2) {
        this.o2 = o2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.ph);
        dest.writeInt(this.temp);
        dest.writeInt(this.o2);
    }

    public RealtimeCheck() {
    }

    protected RealtimeCheck(Parcel in) {
        this.ph = in.readInt();
        this.temp = in.readInt();
        this.o2 = in.readInt();
    }

    public static final Parcelable.Creator<RealtimeCheck> CREATOR = new Parcelable.Creator<RealtimeCheck>() {
        @Override
        public RealtimeCheck createFromParcel(Parcel source) {
            return new RealtimeCheck(source);
        }

        @Override
        public RealtimeCheck[] newArray(int size) {
            return new RealtimeCheck[size];
        }
    };
}
