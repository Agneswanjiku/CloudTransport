
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

public class RecyclerView implements Serializable, Parcelable
{

    @SerializedName("SeatID")
    @Expose
    private String seatID;
    @SerializedName("Transport")
    @Expose
    private Transport_ transport;
    public final static Parcelable.Creator<RecyclerView> CREATOR = new Creator<RecyclerView>() {


        @SuppressWarnings({
            "unchecked"
        })
        public RecyclerView createFromParcel(Parcel in) {
            return new RecyclerView(in);
        }

        public RecyclerView[] newArray(int size) {
            return (new RecyclerView[size]);
        }

    }
    ;
    private final static long serialVersionUID = 367797487531319066L;

    protected RecyclerView(Parcel in) {
        this.seatID = ((String) in.readValue((String.class.getClassLoader())));
        this.transport = ((Transport_) in.readValue((Transport_.class.getClassLoader())));
    }

    public RecyclerView() {
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public RecyclerView withSeatID(String seatID) {
        this.seatID = seatID;
        return this;
    }

    public Transport_ getTransport() {
        return transport;
    }

    public void setTransport(Transport_ transport) {
        this.transport = transport;
    }

    public RecyclerView withTransport(Transport_ transport) {
        this.transport = transport;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("seatID", seatID).append("transport", transport).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(seatID).append(transport).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecyclerView) == false) {
            return false;
        }
        RecyclerView rhs = ((RecyclerView) other);
        return new EqualsBuilder().append(seatID, rhs.seatID).append(transport, rhs.transport).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(seatID);
        dest.writeValue(transport);
    }

    public int describeContents() {
        return  0;
    }

}
