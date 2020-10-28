
package com.moringaschool.mycloudtransports;
//
//import android.os.Parcel;
//import android.os.Parcelable;
////
////import com.google.gson.annotations.Expose;
////import com.google.gson.annotations.SerializedName;
//
////import org.apache.commons.lang.builder.EqualsBuilder;
//import org.apache.commons.lang.builder.HashCodeBuilder;
//import org.apache.commons.lang.builder.ToStringBuilder;
//
//import java.io.Serializable;
//
//public class Example implements Serializable, Parcelable
//{
//
//    @SerializedName("foo")
//    @Expose
//    private String foo;
//    @SerializedName("bar")
//    @Expose
//    private Long bar;
//    @SerializedName("baz")
//    @Expose
//    private Boolean baz;
//    public final static Parcelable.Creator<Example> CREATOR = new Creator<Example>() {
//
//
//        @SuppressWarnings({
//            "unchecked"
//        })
//        public Example createFromParcel(Parcel in) {
//            return new Example(in);
//        }
//
//        public Example[] newArray(int size) {
//            return (new Example[size]);
//        }
//
//    }
//    ;
//    private final static long serialVersionUID = -4756281698975570725L;
//
//    protected Example(Parcel in) {
//        this.foo = ((String) in.readValue((String.class.getClassLoader())));
//        this.bar = ((Long) in.readValue((Long.class.getClassLoader())));
//        this.baz = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
//    }
//
//    public Example() {
//    }
//
//    public String getFoo() {
//        return foo;
//    }
//
//    public void setFoo(String foo) {
//        this.foo = foo;
//    }
//
//    public Example withFoo(String foo) {
//        this.foo = foo;
//        return this;
//    }
//
//    public Long getBar() {
//        return bar;
//    }
//
//    public void setBar(Long bar) {
//        this.bar = bar;
//    }
//
//    public Example withBar(Long bar) {
//        this.bar = bar;
//        return this;
//    }
//
//    public Boolean getBaz() {
//        return baz;
//    }
//
//    public void setBaz(Boolean baz) {
//        this.baz = baz;
//    }
//
//    public Example withBaz(Boolean baz) {
//        this.baz = baz;
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("foo", foo).append("bar", bar).append("baz", baz).toString();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(bar).append(baz).append(foo).toHashCode();
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof Example) == false) {
//            return false;
//        }
//        Example rhs = ((Example) other);
//        return new EqualsBuilder().append(bar, rhs.bar).append(baz, rhs.baz).append(foo, rhs.foo).isEquals();
//    }
//
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeValue(foo);
//        dest.writeValue(bar);
//        dest.writeValue(baz);
//    }
//
//    public int describeContents() {
//        return  0;
//    }
//
//    private class EqualsBuilder {
//    }
//
//    private class HashCodeBuilder {
//    }
//
//    private class ToStringBuilder {
//        public ToStringBuilder(Example example) {
//        }
//    }
//}
