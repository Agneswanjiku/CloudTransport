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
//public class Bar implements Serializable, Parcelable
//{
//
//    @SerializedName("type")
//    @Expose
//    private String type;
//    public final static Parcelable.Creator<Bar> CREATOR = new Creator<Bar>() {
//
//
//        @SuppressWarnings({
//            "unchecked"
//        })
//        public Bar createFromParcel(Parcel in) {
//            return new Bar(in);
//        }
//
//        public Bar[] newArray(int size) {
//            return (new Bar[size]);
//        }
//
//    }
//    ;
//    private final static long serialVersionUID = 5988367689560165612L;
//
//    protected Bar(Parcel in) {
//        this.type = ((String) in.readValue((String.class.getClassLoader())));
//    }
//
//    public Bar() {
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
//    public Bar withType(String type) {
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
//        if ((other instanceof Bar) == false) {
//            return false;
//        }
//        Bar rhs = ((Bar) other);
////        return new EqualsBuilder().append(type, rhs.type).isEquals();
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
//    private class ToStringBuilder {
//        public ToStringBuilder(Bar bar) {
//        }
//    }
//}
