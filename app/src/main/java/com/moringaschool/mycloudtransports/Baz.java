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
//public class Baz implements Serializable, Parcelable
//{
//
//    @SerializedName("type")
//    @Expose
//    private String type;
//    public final static Parcelable.Creator<Baz> CREATOR = new Creator<Baz>() {
//
//
//        @SuppressWarnings({
//            "unchecked"
//        })
//        public Baz createFromParcel(Parcel in) {
//            return new Baz(in);
//        }
//
//        public Baz[] newArray(int size) {
//            return (new Baz[size]);
//        }
//
//    }
//    ;
//    private final static long serialVersionUID = -3410532857555466923L;
//
//    protected Baz(Parcel in) {
//        this.type = ((String) in.readValue((String.class.getClassLoader())));
//    }
//
//    public Baz() {
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public Baz withType(String type) {
//        this.type = type;
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("type", type).toString();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(type).toHashCode();
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof Baz) == false) {
//            return false;
//        }
//        Baz rhs = ((Baz) other);
//        return new EqualsBuilder().append(type, rhs.type).isEquals();
//    }
//
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeValue(type);
//    }
//
//    public int describeContents() {
//        return  0;
//    }
//
//}
