//
//package com.moringaschool.mycloudtransports;
//
//import java.io.Serializable;
//import java.util.List;
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
//    @SerializedName("connections")
//    @Expose
//    private List<Connection> connections = null;
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
//    private final static long serialVersionUID = -3124116609686260988L;
//
//    protected Example(Parcel in) {
//        in.readList(this.connections, (com.moringaschool.mycloudtransports.Connection.class.getClassLoader()));
//    }
//
//    public Example() {
//    }
//
//    public List<Connection> getConnections() {
//        return connections;
//    }
//
//    public void setConnections(List<Connection> connections) {
//        this.connections = connections;
//    }
//
//    public Example withConnections(List<Connection> connections) {
//        this.connections = connections;
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("connections", connections).toString();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(connections).toHashCode();
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
//        return new EqualsBuilder().append(connections, rhs.connections).isEquals();
//    }
//
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeList(connections);
//    }
//
//    public int describeContents() {
//        return  0;
//    }
//
//}
