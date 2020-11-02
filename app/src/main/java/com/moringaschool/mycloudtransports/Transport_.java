
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

public class Transport_ implements Serializable, Parcelable
{

    @SerializedName("Means")
    @Expose
    private Means means;
    public final static Parcelable.Creator<Transport_> CREATOR = new Creator<Transport_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Transport_ createFromParcel(Parcel in) {
            return new Transport_(in);
        }

        public Transport_[] newArray(int size) {
            return (new Transport_[size]);
        }

    }
    ;
    private final static long serialVersionUID = -9043756047862098463L;

    protected Transport_(Parcel in) {
        this.means = ((Means) in.readValue((Means.class.getClassLoader())));
    }

    public Transport_() {
    }

    public Means getMeans() {
        return means;
    }

    public void setMeans(Means means) {
        this.means = means;
    }

    public Transport_ withMeans(Means means) {
        this.means = means;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("means", means).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(means).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transport_) == false) {
            return false;
        }
        Transport_ rhs = ((Transport_) other);
        return new EqualsBuilder().append(means, rhs.means).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(means);
    }

    public int describeContents() {
        return  0;
    }

}
