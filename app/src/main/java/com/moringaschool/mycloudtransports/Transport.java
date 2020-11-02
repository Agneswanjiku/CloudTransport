
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

public class Transport implements Serializable, Parcelable
{

    @SerializedName("RecyclerView")
    @Expose
    private RecyclerView recyclerView;
    public final static Parcelable.Creator<Transport> CREATOR = new Creator<Transport>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Transport createFromParcel(Parcel in) {
            return new Transport(in);
        }

        public Transport[] newArray(int size) {
            return (new Transport[size]);
        }

    }
    ;
    private final static long serialVersionUID = 537230706855157914L;

    protected Transport(Parcel in) {
        this.recyclerView = ((RecyclerView) in.readValue((RecyclerView.class.getClassLoader())));
    }

    public Transport() {
    }

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public Transport withRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("recyclerView", recyclerView).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recyclerView).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transport) == false) {
            return false;
        }
        Transport rhs = ((Transport) other);
        return new EqualsBuilder().append(recyclerView, rhs.recyclerView).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(recyclerView);
    }

    public int describeContents() {
        return  0;
    }

}
