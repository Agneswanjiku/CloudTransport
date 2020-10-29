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
//public class Properties implements Serializable, Parcelable
//{
//
//    @SerializedName("foo")
//    @Expose
//    private Foo foo;
//    @SerializedName("bar")
//    @Expose
//    private Bar bar;
//    @SerializedName("baz")
//    @Expose
//    private Baz baz;
//    public final static Parcelable.Creator<Properties> CREATOR = new Creator<Properties>() {
//
//
//        @SuppressWarnings({
//            "unchecked"
//        })
//        public Properties createFromParcel(Parcel in) {
//            return new Properties(in);
//        }
//
//        public Properties[] newArray(int size) {
//            return (new Properties[size]);
//        }
//
//    }
//    ;
//    private final static long serialVersionUID = -492950942177290933L;
//
//    protected Properties(Parcel in) {
//        this.foo = ((Foo) in.readValue((Foo.class.getClassLoader())));
//        this.bar = ((Bar) in.readValue((Bar.class.getClassLoader())));
//        this.baz = ((Baz) in.readValue((Baz.class.getClassLoader())));
//    }
//
//    public Properties() {
//    }
//
//    public Foo getFoo() {
//        return foo;
//    }
//
//    public void setFoo(Foo foo) {
//        this.foo = foo;
//    }
//
//    public Properties withFoo(Foo foo) {
//        this.foo = foo;
//        return this;
//    }
//
//    public Bar getBar() {
//        return bar;
//    }
//
//    public void setBar(Bar bar) {
//        this.bar = bar;
//    }
//
//    public Properties withBar(Bar bar) {
//        this.bar = bar;
//        return this;
//    }
//
//    public Baz getBaz() {
//        return baz;
//    }
//
//    public void setBaz(Baz baz) {
//        this.baz = baz;
//    }
//
//    public Properties withBaz(Baz baz) {
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
//        if ((other instanceof Properties) == false) {
//            return false;
//        }
//        Properties rhs = ((Properties) other);
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
//}
