
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

public class Coordinate_ implements Serializable, Parcelable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("x")
    @Expose
    private Double x;
    @SerializedName("y")
    @Expose
    private Double y;
    public final static Parcelable.Creator<Coordinate_> CREATOR = new Creator<Coordinate_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Coordinate_ createFromParcel(Parcel in) {
            return new Coordinate_(in);
        }

        public Coordinate_[] newArray(int size) {
            return (new Coordinate_[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6230641742319820290L;

    protected Coordinate_(Parcel in) {
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.x = ((Double) in.readValue((Double.class.getClassLoader())));
        this.y = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    public Coordinate_() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Coordinate_ withType(String type) {
        this.type = type;
        return this;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Coordinate_ withX(Double x) {
        this.x = x;
        return this;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Coordinate_ withY(Double y) {
        this.y = y;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("x", x).append("y", y).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(x).append(y).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Coordinate_) == false) {
            return false;
        }
        Coordinate_ rhs = ((Coordinate_) other);
        return new EqualsBuilder().append(x, rhs.x).append(y, rhs.y).append(type, rhs.type).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(x);
        dest.writeValue(y);
    }

    public int describeContents() {
        return  0;
    }

}
