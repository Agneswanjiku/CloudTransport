//
//package com.moringaschool.mycloudtransports;
//
//import java.io.Serializable;
//import android.os.Parcel;
//import android.os.Parcelable;
//import android.os.Parcelable.Creator;
//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.EqualsBuilder;
//import org.apache.commons.lang.builder.HashCodeBuilder;
//import org.apache.commons.lang.builder.ToStringBuilder;
//
//public class Prognosis implements Serializable, Parcelable
//{
//
//    @SerializedName("platform")
//    @Expose
//    private Object platform;
//    @SerializedName("arrival")
//    @Expose
//    private Object arrival;
//    @SerializedName("departure")
//    @Expose
//    private String departure;
//    @SerializedName("capacity1st")
//    @Expose
//    private Object capacity1st;
//    @SerializedName("capacity2nd")
//    @Expose
//    private Object capacity2nd;
//    public final static Parcelable.Creator<Prognosis> CREATOR = new Creator<Prognosis>() {
//
//
//        @SuppressWarnings({
//            "unchecked"
//        })
//        public Prognosis createFromParcel(Parcel in) {
//            return new Prognosis(in);
//        }
//
//        public Prognosis[] newArray(int size) {
//            return (new Prognosis[size]);
//        }
//
//    }
//    ;
//    private final static long serialVersionUID = -3290166956186627325L;
//
//    protected Prognosis(Parcel in) {
//        this.platform = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.arrival = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.departure = ((String) in.readValue((String.class.getClassLoader())));
//        this.capacity1st = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.capacity2nd = ((Object) in.readValue((Object.class.getClassLoader())));
//    }
//
//    public Prognosis() {
//    }
//
//    public Object getPlatform() {
//        return platform;
//    }
//
//    public void setPlatform(Object platform) {
//        this.platform = platform;
//    }
//
//    public Prognosis withPlatform(Object platform) {
//        this.platform = platform;
//        return this;
//    }
//
//    public Object getArrival() {
//        return arrival;
//    }
//
//    public void setArrival(Object arrival) {
//        this.arrival = arrival;
//    }
//
//    public Prognosis withArrival(Object arrival) {
//        this.arrival = arrival;
//        return this;
//    }
//
//    public String getDeparture() {
//        return departure;
//    }
//
//    public void setDeparture(String departure) {
//        this.departure = departure;
//    }
//
//    public Prognosis withDeparture(String departure) {
//        this.departure = departure;
//        return this;
//    }
//
//    public Object getCapacity1st() {
//        return capacity1st;
//    }
//
//    public void setCapacity1st(Object capacity1st) {
//        this.capacity1st = capacity1st;
//    }
//
//    public Prognosis withCapacity1st(Object capacity1st) {
//        this.capacity1st = capacity1st;
//        return this;
//    }
//
//    public Object getCapacity2nd() {
//        return capacity2nd;
//    }
//
//    public void setCapacity2nd(Object capacity2nd) {
//        this.capacity2nd = capacity2nd;
//    }
//
//    public Prognosis withCapacity2nd(Object capacity2nd) {
//        this.capacity2nd = capacity2nd;
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("platform", platform).append("arrival", arrival).append("departure", departure).append("capacity1st", capacity1st).append("capacity2nd", capacity2nd).toString();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(capacity2nd).append(departure).append(arrival).append(platform).append(capacity1st).toHashCode();
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof Prognosis) == false) {
//            return false;
//        }
//        Prognosis rhs = ((Prognosis) other);
//        return new EqualsBuilder().append(capacity2nd, rhs.capacity2nd).append(departure, rhs.departure).append(arrival, rhs.arrival).append(platform, rhs.platform).append(capacity1st, rhs.capacity1st).isEquals();
//    }
//
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeValue(platform);
//        dest.writeValue(arrival);
//        dest.writeValue(departure);
//        dest.writeValue(capacity1st);
//        dest.writeValue(capacity2nd);
//    }
//
//    public int describeContents() {
//        return  0;
//    }
//
//}
