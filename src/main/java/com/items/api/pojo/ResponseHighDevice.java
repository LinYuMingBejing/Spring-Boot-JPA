package com.items.api.pojo;

public class ResponseHighDevice {

    private String device_type;
    private long pv_valid;

    public ResponseHighDevice(String device_type, long pv_valid) {
        this.device_type = device_type;
        this.pv_valid = pv_valid;
    }

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }

    public long getPv_valid() {
        return pv_valid;
    }

    public void setPv_valid(long pv_valid) {
        this.pv_valid = pv_valid;
    }
}
