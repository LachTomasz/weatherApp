package com.lach.weatherApp.WeatherbitObject;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;

import java.util.Objects;

public class WeatherbitResponseDetail {
    @JsonbProperty("app_max_temp")
    private Float appMaxTemp;                                 //app_max_temp: Apparent/"Feels Like" temperature at max_temp time (default Celsius)
    @JsonbProperty("app_min_temp")
    private Float appMinTemp;                                 //app_min_temp: Apparent/"Feels Like" temperature at min_temp time (default Celsius)
    @JsonbProperty("clouds")
    private Float clouds;                                     //clouds: Average total cloud coverage (%)
    @JsonbProperty("clouds_hi")
    private Float cloudsHi;                                   //clouds_hi: High-level (>5km AGL) cloud coverage (%)
    @JsonbProperty("clouds_low")
    private Float cloudsLow;                                  //clouds_low: Low-level (~0-3km AGL) cloud coverage (%)
    @JsonbProperty("clouds_mid")
    private Float cloudsMid;                                  //clouds_mid: Mid-level (~3-5km AGL) cloud coverage (%)
    @JsonbProperty("datetime")
    private String datetime;                                  //datetime:[DEPRECATED] Forecast valid date (YYYY-MM-DD)
    @JsonbProperty("dewpt")
    private Float dewpt;                                      //dewpt: Average dew point (default Celsius)
    @JsonbProperty("high_temp")
    private Float highTemp;                                   //high_temp: High Temperature "Day-time High" - Calculated from 7 AM to 7 PM local time (default Celsius)
    @JsonbProperty("low_temp")
    private Float lowTemp;                                    //low_temp: Low Temperature "Night-time Low" - Calculated from 7 PM to 7 AM local (default Celsius)
//    @JsonbProperty("max_dhi")
    @JsonbTransient
    private String maxDhi;                                    //max_dhi: [DEPRECATED] Maximum direct component of solar radiation (W/m^2)
    @JsonbProperty("max_temp")
    private Float maxTemp;                                    //max_temp: Maximum Temperature - Calculated from Midnight to Midnight local time (default Celsius)
    @JsonbProperty("min_temp")
    private Float minTemp;                                    //min_temp: Minimum Temperature - Calculated from Midnight to Midnight local time (default Celsius)
    @JsonbProperty("moon_phase")
    private Float moonPhase;                                  //moon_phase: Moon phase illumination fraction (0-1)
    @JsonbProperty("moon_phase_lunation")
    private Float moonPhaseLunation;                          //moon_phase_lunation: Moon lunation fraction (0 = New moon, 0.50 = Full Moon, 0.75 = Last quarter moon)
    @JsonbProperty("moonrise_ts")
    private Float moonriseTs;                                 //moonrise_ts: Moonrise time unix timestamp (UTC)
    @JsonbProperty("moonset_ts")
    private Float moonsetTs;                                  //moonset_ts: Moonset time unix timestamp (UTC)
    @JsonbProperty("ozone")
    private Float ozone;                                      //ozone: Average Ozone (Dobson units)
    @JsonbProperty("pop")
    private Float pop;                                        //pop: Probability of Precipitation (%)
    @JsonbProperty("precip")
    private Float precip;                                     //precip: Accumulated liquid equivalent precipitation (default mm)
    @JsonbProperty("pres")
    private Float pres;                                       //pres: Average pressure (mb)
    @JsonbProperty("rh")
    private Float rh;                                         //rh: Average relative humidity (%)
    @JsonbProperty("slp")
    private Float slp;                                        //slp: Average sea level pressure (mb)
    @JsonbProperty("snow")
    private Float snow;                                       //snow: Accumulated snowfall (default mm)
    @JsonbProperty("snow_depth")
    private Float snowDepth;                                  //snow_depth: Snow Depth (default mm)
    @JsonbProperty("sunrise_ts")
    private Float sunriseTs;                                  //sunrise_ts: Sunrise time unix timestamp (UTC)
    @JsonbProperty("sunset_ts")
    private Float sunsetTs;                                   //sunset_ts: Sunset time unix timestamp (UTC)
    @JsonbProperty("temp")
    private Float temp;                                       //temp: Average Temperature (default Celsius)
    @JsonbProperty("ts")
    private Float ts;                                         //ts: Forecast period start unix timestamp (UTC)
    @JsonbProperty("uv")
    private Float uv;                                         //uv: Maximum UV Index (0-11+)
    @JsonbProperty("valid_date")
    private String validDate;                                 //valid_date:Local date the forecast is valid for in format YYYY-MM-DD
    @JsonbProperty("vis")
    private Float vis;                                        //vis: Visibility (default KM)
    @JsonbProperty("weather")
    private WeatherbitResponseIconDescription weatherbitResponseIconDescription;    //weather: Icon and description of weather
    @JsonbProperty("wind_cdir")
    private String windCdir;                                  //wind_cdir: Abbreviated wind direction
    @JsonbProperty("wind_cdir_full")
    private String windCdirFull;                              //wind_cdir_full: Verbal wind direction
    @JsonbProperty("wind_dir")
    private Float windDir;                                    //wind_dir: Wind direction (degrees)
    @JsonbProperty("wind_gust_spd")
    private Float windGustSpd;                                //wind_gust_spd: Wind gust speed (Default m/s)
    @JsonbProperty("wind_spd")
    private Float windSpd;                                    //wind_spd: Wind speed (Default m/s)

    public WeatherbitResponseDetail() {
    }

    @JsonCreator
    public WeatherbitResponseDetail(@JsonProperty(value = "app_max_temp") Float appMaxTemp, @JsonProperty(value = "app_min_temp") Float appMinTemp,
                                    @JsonProperty(value = "clouds") Float clouds, @JsonProperty(value = "clouds_hi") Float cloudsHi,
                                    @JsonProperty(value = "clouds_low") Float cloudsLow, @JsonProperty(value = "clouds_mid") Float cloudsMid,
                                    @JsonProperty(value = "datetime") String datetime, @JsonProperty(value = "dewpt") Float dewpt,
                                    @JsonProperty(value = "high_temp") Float highTemp, @JsonProperty(value = "low_temp") Float lowTemp,
                                    @JsonProperty(value = "max_dhi") String maxDhi, @JsonProperty(value = "max_temp") Float maxTemp,
                                    @JsonProperty(value = "min_temp") Float minTemp, @JsonProperty(value = "moon_phase") Float moonPhase,
                                    @JsonProperty(value = "moon_phase_lunation") Float moonPhaseLunation, @JsonProperty(value = "moonrise_ts") Float moonriseTs,
                                    @JsonProperty(value = "moonset_ts") Float moonsetTs, @JsonProperty(value = "ozone") Float ozone,
                                    @JsonProperty(value = "pop") Float pop, @JsonProperty(value = "precip") Float precip,
                                    @JsonProperty(value = "pres") Float pres, @JsonProperty(value = "rh") Float rh,
                                    @JsonProperty(value = "slp") Float slp, @JsonProperty(value = "snow") Float snow,
                                    @JsonProperty(value = "snow_depth") Float snowDepth, @JsonProperty(value = "sunrise_ts") Float sunriseTs,
                                    @JsonProperty(value = "sunset_ts") Float sunsetTs, @JsonProperty(value = "temp") Float temp,
                                    @JsonProperty(value = "ts") Float ts, @JsonProperty(value = "uv") Float uv,
                                    @JsonProperty(value = "valid_date") String validDate, @JsonProperty(value = "vis") Float vis,
                                    @JsonProperty(value = "weather") WeatherbitResponseIconDescription weatherbitResponseIconDescription, @JsonProperty(value = "wind_cdir") String windCdir,
                                    @JsonProperty(value = "wind_cdir_full") String windCdirFull, @JsonProperty(value = "wind_dir") Float windDir,
                                    @JsonProperty(value = "wind_gust_spd") Float windGustSpd, @JsonProperty(value = "wind_spd") Float windSpd) {
        this.appMaxTemp = appMaxTemp;
        this.appMinTemp = appMinTemp;
        this.clouds = clouds;
        this.cloudsHi = cloudsHi;
        this.cloudsLow = cloudsLow;
        this.cloudsMid = cloudsMid;
        this.datetime = datetime;
        this.dewpt = dewpt;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        this.maxDhi = maxDhi;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.moonPhase = moonPhase;
        this.moonPhaseLunation = moonPhaseLunation;
        this.moonriseTs = moonriseTs;
        this.moonsetTs = moonsetTs;
        this.ozone = ozone;
        this.pop = pop;
        this.precip = precip;
        this.pres = pres;
        this.rh = rh;
        this.slp = slp;
        this.snow = snow;
        this.snowDepth = snowDepth;
        this.sunriseTs = sunriseTs;
        this.sunsetTs = sunsetTs;
        this.temp = temp;
        this.ts = ts;
        this.uv = uv;
        this.validDate = validDate;
        this.vis = vis;
        this.weatherbitResponseIconDescription = weatherbitResponseIconDescription;
        this.windCdir = windCdir;
        this.windCdirFull = windCdirFull;
        this.windDir = windDir;
        this.windGustSpd = windGustSpd;
        this.windSpd = windSpd;
    }

    public Float getAppMaxTemp() {
        return appMaxTemp;
    }

    public void setAppMaxTemp(Float appMaxTemp) {
        this.appMaxTemp = appMaxTemp;
    }

    public Float getAppMinTemp() {
        return appMinTemp;
    }

    public void setAppMinTemp(Float appMinTemp) {
        this.appMinTemp = appMinTemp;
    }

    public Float getClouds() {
        return clouds;
    }

    public void setClouds(Float clouds) {
        this.clouds = clouds;
    }

    public Float getCloudsHi() {
        return cloudsHi;
    }

    public void setCloudsHi(Float cloudsHi) {
        this.cloudsHi = cloudsHi;
    }

    public Float getCloudsLow() {
        return cloudsLow;
    }

    public void setCloudsLow(Float cloudsLow) {
        this.cloudsLow = cloudsLow;
    }

    public Float getCloudsMid() {
        return cloudsMid;
    }

    public void setCloudsMid(Float cloudsMid) {
        this.cloudsMid = cloudsMid;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Float getDewpt() {
        return dewpt;
    }

    public void setDewpt(Float dewpt) {
        this.dewpt = dewpt;
    }

    public Float getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(Float highTemp) {
        this.highTemp = highTemp;
    }

    public Float getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(Float lowTemp) {
        this.lowTemp = lowTemp;
    }

    public String getMaxDhi() {
        return maxDhi;
    }

    public void setMaxDhi(String maxDhi) {
        this.maxDhi = maxDhi;
    }

    public Float getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Float getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Float minTemp) {
        this.minTemp = minTemp;
    }

    public Float getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(Float moonPhase) {
        this.moonPhase = moonPhase;
    }

    public Float getMoonPhaseLunation() {
        return moonPhaseLunation;
    }

    public void setMoonPhaseLunation(Float moonPhaseLunation) {
        this.moonPhaseLunation = moonPhaseLunation;
    }

    public Float getMoonriseTs() {
        return moonriseTs;
    }

    public void setMoonriseTs(Float moonriseTs) {
        this.moonriseTs = moonriseTs;
    }

    public Float getMoonsetTs() {
        return moonsetTs;
    }

    public void setMoonsetTs(Float moonsetTs) {
        this.moonsetTs = moonsetTs;
    }

    public Float getOzone() {
        return ozone;
    }

    public void setOzone(Float ozone) {
        this.ozone = ozone;
    }

    public Float getPop() {
        return pop;
    }

    public void setPop(Float pop) {
        this.pop = pop;
    }

    public Float getPrecip() {
        return precip;
    }

    public void setPrecip(Float precip) {
        this.precip = precip;
    }

    public Float getPres() {
        return pres;
    }

    public void setPres(Float pres) {
        this.pres = pres;
    }

    public Float getRh() {
        return rh;
    }

    public void setRh(Float rh) {
        this.rh = rh;
    }

    public Float getSlp() {
        return slp;
    }

    public void setSlp(Float slp) {
        this.slp = slp;
    }

    public Float getSnow() {
        return snow;
    }

    public void setSnow(Float snow) {
        this.snow = snow;
    }

    public Float getSnowDepth() {
        return snowDepth;
    }

    public void setSnowDepth(Float snowDepth) {
        this.snowDepth = snowDepth;
    }

    public Float getSunriseTs() {
        return sunriseTs;
    }

    public void setSunriseTs(Float sunriseTs) {
        this.sunriseTs = sunriseTs;
    }

    public Float getSunsetTs() {
        return sunsetTs;
    }

    public void setSunsetTs(Float sunsetTs) {
        this.sunsetTs = sunsetTs;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Float getTs() {
        return ts;
    }

    public void setTs(Float ts) {
        this.ts = ts;
    }

    public Float getUv() {
        return uv;
    }

    public void setUv(Float uv) {
        this.uv = uv;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public Float getVis() {
        return vis;
    }

    public void setVis(Float vis) {
        this.vis = vis;
    }

    public WeatherbitResponseIconDescription getWeatherbitResponseIconDescription() {
        return weatherbitResponseIconDescription;
    }

    public void setWeatherbitResponseIconDescription(WeatherbitResponseIconDescription weatherbitResponseIconDescription) {
        this.weatherbitResponseIconDescription = weatherbitResponseIconDescription;
    }

    public String getWindCdir() {
        return windCdir;
    }

    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    public String getWindCdirFull() {
        return windCdirFull;
    }

    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    public Float getWindDir() {
        return windDir;
    }

    public void setWindDir(Float windDir) {
        this.windDir = windDir;
    }

    public Float getWindGustSpd() {
        return windGustSpd;
    }

    public void setWindGustSpd(Float windGustSpd) {
        this.windGustSpd = windGustSpd;
    }

    public Float getWindSpd() {
        return windSpd;
    }

    public void setWindSpd(Float windSpd) {
        this.windSpd = windSpd;
    }

    @Override
    public String toString() {
        return "WeatherbitResponseDetail{" +
                "appMaxTemp=" + appMaxTemp +
                ", appMinTemp=" + appMinTemp +
                ", clouds=" + clouds +
                ", cloudsHi=" + cloudsHi +
                ", cloudsLow=" + cloudsLow +
                ", cloudsMid=" + cloudsMid +
                ", datetime='" + datetime + '\'' +
                ", dewpt=" + dewpt +
                ", highTemp=" + highTemp +
                ", lowTemp=" + lowTemp +
                ", maxDhi='" + maxDhi + '\'' +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", moonPhase=" + moonPhase +
                ", moonPhaseLunation=" + moonPhaseLunation +
                ", moonriseTs=" + moonriseTs +
                ", moonsetTs=" + moonsetTs +
                ", ozone=" + ozone +
                ", pop=" + pop +
                ", precip=" + precip +
                ", pres=" + pres +
                ", rh=" + rh +
                ", slp=" + slp +
                ", snow=" + snow +
                ", snowDepth=" + snowDepth +
                ", sunriseTs=" + sunriseTs +
                ", sunsetTs=" + sunsetTs +
                ", temp=" + temp +
                ", ts=" + ts +
                ", uv=" + uv +
                ", validDate='" + validDate + '\'' +
                ", vis=" + vis +
                ", weatherbitResponseIconDescription=" + weatherbitResponseIconDescription +
                ", windCdir='" + windCdir + '\'' +
                ", windCdirFull='" + windCdirFull + '\'' +
                ", windDir=" + windDir +
                ", windGustSpd=" + windGustSpd +
                ", windSpd=" + windSpd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherbitResponseDetail that = (WeatherbitResponseDetail) o;

        if (!Objects.equals(appMaxTemp, that.appMaxTemp)) return false;
        if (!Objects.equals(appMinTemp, that.appMinTemp)) return false;
        if (!Objects.equals(clouds, that.clouds)) return false;
        if (!Objects.equals(cloudsHi, that.cloudsHi)) return false;
        if (!Objects.equals(cloudsLow, that.cloudsLow)) return false;
        if (!Objects.equals(cloudsMid, that.cloudsMid)) return false;
        if (!Objects.equals(datetime, that.datetime)) return false;
        if (!Objects.equals(dewpt, that.dewpt)) return false;
        if (!Objects.equals(highTemp, that.highTemp)) return false;
        if (!Objects.equals(lowTemp, that.lowTemp)) return false;
        if (!Objects.equals(maxDhi, that.maxDhi)) return false;
        if (!Objects.equals(maxTemp, that.maxTemp)) return false;
        if (!Objects.equals(minTemp, that.minTemp)) return false;
        if (!Objects.equals(moonPhase, that.moonPhase)) return false;
        if (!Objects.equals(moonPhaseLunation, that.moonPhaseLunation)) return false;
        if (!Objects.equals(moonriseTs, that.moonriseTs)) return false;
        if (!Objects.equals(moonsetTs, that.moonsetTs)) return false;
        if (!Objects.equals(ozone, that.ozone)) return false;
        if (!Objects.equals(pop, that.pop)) return false;
        if (!Objects.equals(precip, that.precip)) return false;
        if (!Objects.equals(pres, that.pres)) return false;
        if (!Objects.equals(rh, that.rh)) return false;
        if (!Objects.equals(slp, that.slp)) return false;
        if (!Objects.equals(snow, that.snow)) return false;
        if (!Objects.equals(snowDepth, that.snowDepth)) return false;
        if (!Objects.equals(sunriseTs, that.sunriseTs)) return false;
        if (!Objects.equals(sunsetTs, that.sunsetTs)) return false;
        if (!Objects.equals(temp, that.temp)) return false;
        if (!Objects.equals(ts, that.ts)) return false;
        if (!Objects.equals(uv, that.uv)) return false;
        if (!Objects.equals(validDate, that.validDate)) return false;
        if (!Objects.equals(vis, that.vis)) return false;
        if (!Objects.equals(weatherbitResponseIconDescription, that.weatherbitResponseIconDescription)) return false;
        if (!Objects.equals(windCdir, that.windCdir)) return false;
        if (!Objects.equals(windCdirFull, that.windCdirFull)) return false;
        if (!Objects.equals(windDir, that.windDir)) return false;
        if (!Objects.equals(windGustSpd, that.windGustSpd)) return false;
        return Objects.equals(windSpd, that.windSpd);
    }

    @Override
    public int hashCode() {
        int result = appMaxTemp != null ? appMaxTemp.hashCode() : 0;
        result = 31 * result + (appMinTemp != null ? appMinTemp.hashCode() : 0);
        result = 31 * result + (clouds != null ? clouds.hashCode() : 0);
        result = 31 * result + (cloudsHi != null ? cloudsHi.hashCode() : 0);
        result = 31 * result + (cloudsLow != null ? cloudsLow.hashCode() : 0);
        result = 31 * result + (cloudsMid != null ? cloudsMid.hashCode() : 0);
        result = 31 * result + (datetime != null ? datetime.hashCode() : 0);
        result = 31 * result + (dewpt != null ? dewpt.hashCode() : 0);
        result = 31 * result + (highTemp != null ? highTemp.hashCode() : 0);
        result = 31 * result + (lowTemp != null ? lowTemp.hashCode() : 0);
        result = 31 * result + (maxDhi != null ? maxDhi.hashCode() : 0);
        result = 31 * result + (maxTemp != null ? maxTemp.hashCode() : 0);
        result = 31 * result + (minTemp != null ? minTemp.hashCode() : 0);
        result = 31 * result + (moonPhase != null ? moonPhase.hashCode() : 0);
        result = 31 * result + (moonPhaseLunation != null ? moonPhaseLunation.hashCode() : 0);
        result = 31 * result + (moonriseTs != null ? moonriseTs.hashCode() : 0);
        result = 31 * result + (moonsetTs != null ? moonsetTs.hashCode() : 0);
        result = 31 * result + (ozone != null ? ozone.hashCode() : 0);
        result = 31 * result + (pop != null ? pop.hashCode() : 0);
        result = 31 * result + (precip != null ? precip.hashCode() : 0);
        result = 31 * result + (pres != null ? pres.hashCode() : 0);
        result = 31 * result + (rh != null ? rh.hashCode() : 0);
        result = 31 * result + (slp != null ? slp.hashCode() : 0);
        result = 31 * result + (snow != null ? snow.hashCode() : 0);
        result = 31 * result + (snowDepth != null ? snowDepth.hashCode() : 0);
        result = 31 * result + (sunriseTs != null ? sunriseTs.hashCode() : 0);
        result = 31 * result + (sunsetTs != null ? sunsetTs.hashCode() : 0);
        result = 31 * result + (temp != null ? temp.hashCode() : 0);
        result = 31 * result + (ts != null ? ts.hashCode() : 0);
        result = 31 * result + (uv != null ? uv.hashCode() : 0);
        result = 31 * result + (validDate != null ? validDate.hashCode() : 0);
        result = 31 * result + (vis != null ? vis.hashCode() : 0);
        result = 31 * result + (weatherbitResponseIconDescription != null ? weatherbitResponseIconDescription.hashCode() : 0);
        result = 31 * result + (windCdir != null ? windCdir.hashCode() : 0);
        result = 31 * result + (windCdirFull != null ? windCdirFull.hashCode() : 0);
        result = 31 * result + (windDir != null ? windDir.hashCode() : 0);
        result = 31 * result + (windGustSpd != null ? windGustSpd.hashCode() : 0);
        result = 31 * result + (windSpd != null ? windSpd.hashCode() : 0);
        return result;
    }
}
