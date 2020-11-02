
package com.moringaschool.mycloudtransports;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Train implements Serializable, Parcelable
{

    @SerializedName("Name")
    @Expose
    private String name;
    public final static Parcelable.Creator<Train> CREATOR = new Creator<Train>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Train createFromParcel(Parcel in) {
            return new Train(in);
        }

        public Train[] newArray(int size) {
            return (new Train[size]);
        }

    }
    ;
    private final static long serialVersionUID = 1694491435702934384L;

    protected Train(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Train() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Train withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Train) == false) {
            return false;
        }
        Train rhs = ((Train) other);
        return new EqualsBuilder().append(name, rhs.name).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
    }

    public int describeContents() {
        return  0;
    }

}
