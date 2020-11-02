
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

public class Means implements Serializable, Parcelable
{

    @SerializedName("Train")
    @Expose
    private Train train;
    public final static Parcelable.Creator<Means> CREATOR = new Creator<Means>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Means createFromParcel(Parcel in) {
            return new Means(in);
        }

        public Means[] newArray(int size) {
            return (new Means[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3485532126809091938L;

    protected Means(Parcel in) {
        this.train = ((Train) in.readValue((Train.class.getClassLoader())));
    }

    public Means() {
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Means withTrain(Train train) {
        this.train = train;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("train", train).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(train).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Means) == false) {
            return false;
        }
        Means rhs = ((Means) other);
        return new EqualsBuilder().append(train, rhs.train).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(train);
    }

    public int describeContents() {
        return  0;
    }

}
