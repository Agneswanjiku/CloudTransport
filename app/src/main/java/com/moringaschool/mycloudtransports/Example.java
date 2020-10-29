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
//public class Example implements Serializable, Parcelable
//{
//
//    @SerializedName("type")
//    @Expose
//    private String type;
//    @SerializedName("properties")
//    @Expose
//    private Properties properties;
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
//    private final static long serialVersionUID = -1060724873025571437L;
//
//    protected Example(Parcel in) {
//        this.type = ((String) in.readValue((String.class.getClassLoader())));
//        this.properties = ((Properties) in.readValue((Properties.class.getClassLoader())));
//    }
//
//    public Example() {
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
//    public Example withType(String type) {
//        this.type = type;
//        return this;
//    }
//
//    public Properties getProperties() {
//        return properties;
//    }
//
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }
//
//    public Example withProperties(Properties properties) {
//        this.properties = properties;
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("type", type).append("properties", properties).toString();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(type).append(properties).toHashCode();
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
//        return new EqualsBuilder().append(type, rhs.type).append(properties, rhs.properties).isEquals();
//    }
//
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeValue(type);
//        dest.writeValue(properties);
//    }
//
//    public int describeContents() {
//        return  0;
//    }
//
//    private class HashCodeBuilder {
//    }
//
//    private class EqualsBuilder {
//        public EqualsBuilder append(String type, String type1) {
//        }
//    }
//}
