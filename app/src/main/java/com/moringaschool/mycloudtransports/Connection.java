
package com.moringaschool.mycloudtransports;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Connection implements Serializable, Parcelable
{

    @SerializedName("from")
    @Expose
    private From from;
    @SerializedName("to")
    @Expose
    private List<Object> to = null;
    public final static Parcelable.Creator<Connection> CREATOR = new Creator<Connection>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Connection createFromParcel(Parcel in) {
            return new Connection(in);
        }

        public Connection[] newArray(int size) {
            return (new Connection[size]);
        }

    }
    ;
    private final static long serialVersionUID = -4780820183374823867L;

    protected Connection(Parcel in) {
        this.from = ((From) in.readValue((From.class.getClassLoader())));
        in.readList(this.to, (java.lang.Object.class.getClassLoader()));
    }

    public Connection() {
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public Connection withFrom(From from) {
        this.from = from;
        return this;
    }

    public List<Object> getTo() {
        return to;
    }

    public void setTo(List<Object> to) {
        this.to = to;
    }

    public Connection withTo(List<Object> to) {
        this.to = to;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("from", from).append("to", to).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(from).append(to).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Connection) == false) {
            return false;
        }
        Connection rhs = ((Connection) other);
        return new EqualsBuilder().append(from, rhs.from).append(to, rhs.to).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(from);
        dest.writeList(to);
    }

    public int describeContents() {
        return  0;
    }

}
