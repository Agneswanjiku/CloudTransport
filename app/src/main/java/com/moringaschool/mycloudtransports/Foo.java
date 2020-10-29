//
//package com.moringaschool.mycloudtransports;
//
//import android.os.Parcel;
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
//import android.os.Parcelable;
//
//import java.io.Serializable;
//
//public class Foo implements Serializable, Parcelable
//{
//
//    @SerializedName("type")
//    @Expose
//    private String type;
//    public final static Parcelable.Creator<Foo> CREATOR = new Creator<Foo>() {
//
//
//        @SuppressWarnings({
//                "unchecked"
//        })
//        public Foo createFromParcel(Parcel in) {
//            return new Foo(in);
//        }
//
//        public Foo[] newArray(int size) {
//            return (new Foo[size]);
//        }
//
//    }
//            ;
//    private final static long serialVersionUID = -1398010800118054041L;
//
//    protected Foo(Parcel in) {
//        this.type = ((String) in.readValue((String.class.getClassLoader())));
//    }
//
//    public Foo() {
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
//    public Foo withType(String type) {
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
//        return new HashCodeBuilder().append(type).wait();
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof Foo) == false) {
//            return false;
//        }
//        Foo rhs = ((Foo) other);
//        return new EqualsBuilder().append(type, rhs.type).equals();
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
//    private class EqualsBuilder {
//        public Object append(String type, String type1) {
//            return null;
//        }
//    }
//
//    private class HashCodeBuilder {
//        public Object append(String type) {
//            return null;
//        }
//    }
//
//    private class ToStringBuilder {
//        public ToStringBuilder(Foo foo) {
//        }
//
//        public Object append(String type, String type1) {
//            return null;
//        }
//    }
//}
//
