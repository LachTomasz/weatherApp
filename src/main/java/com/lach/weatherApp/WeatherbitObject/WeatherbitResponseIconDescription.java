package com.lach.weatherApp.WeatherbitObject;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.json.bind.annotation.JsonbProperty;

import java.util.Objects;

public class WeatherbitResponseIconDescription {
    @JsonbProperty("icon")
    private String icon;          //icon: Weather icon code
    @JsonbProperty("description")
    private String description;   //description: Text weather description
    @JsonbProperty("code")
    private String code;          //code: Weather code

    public WeatherbitResponseIconDescription() {
    }

    @JsonCreator
    public WeatherbitResponseIconDescription(@JsonProperty(value = "code") String code, @JsonProperty(value = "icon") String icon, @JsonProperty(value = "description") String description) {
        this.icon = icon;
        this.description = description;
        this.code = code;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "WeatherbitResponseIconDescription{" +
                "icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherbitResponseIconDescription that = (WeatherbitResponseIconDescription) o;

        if (!Objects.equals(icon, that.icon)) return false;
        if (!Objects.equals(description, that.description)) return false;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        int result = icon != null ? icon.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
