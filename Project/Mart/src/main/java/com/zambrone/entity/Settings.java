package com.zambrone.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Chamith on 22/06/2017.
 */
@Entity
public class Settings {
    private Integer settingsid;
    private Double serviceCharg;
    private Double vat;

    @Id
    @Column(name = "settingsid")
    public Integer getSettingsid() {
        return settingsid;
    }

    public void setSettingsid(Integer settingsid) {
        this.settingsid = settingsid;
    }

    @Basic
    @Column(name = "serviceCharg")
    public Double getServiceCharg() {
        return serviceCharg;
    }

    public void setServiceCharg(Double serviceCharg) {
        this.serviceCharg = serviceCharg;
    }

    @Basic
    @Column(name = "vat")
    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Settings settings = (Settings) o;

        if (settingsid != null ? !settingsid.equals(settings.settingsid) : settings.settingsid != null) return false;
        if (serviceCharg != null ? !serviceCharg.equals(settings.serviceCharg) : settings.serviceCharg != null)
            return false;
        if (vat != null ? !vat.equals(settings.vat) : settings.vat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = settingsid != null ? settingsid.hashCode() : 0;
        result = 31 * result + (serviceCharg != null ? serviceCharg.hashCode() : 0);
        result = 31 * result + (vat != null ? vat.hashCode() : 0);
        return result;
    }
}
