
package ui;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Member {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("accuracy")
    @Expose
    private Integer accuracy;
    @SerializedName("station_code")
    @Expose
    private String stationCode;
    @SerializedName("tiploc_code")
    @Expose
    private String tiplocCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Member() {
    }

    /**
     * 
     * @param stationCode
     * @param latitude
     * @param name
     * @param tiplocCode
     * @param accuracy
     * @param type
     * @param longitude
     */
    public Member(String type, String name, Double latitude, Double longitude, Integer accuracy, String stationCode, String tiplocCode) {
        super();
        this.type = type;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.accuracy = accuracy;
        this.stationCode = stationCode;
        this.tiplocCode = tiplocCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getTiplocCode() {
        return tiplocCode;
    }

    public void setTiplocCode(String tiplocCode) {
        this.tiplocCode = tiplocCode;
    }

}
