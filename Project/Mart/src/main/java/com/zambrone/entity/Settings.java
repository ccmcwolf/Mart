package com.zambrone.entity;

import javax.persistence.*;

/**
 * Created by Chamith on 24/09/2017.
 */
@Entity
public class Settings {
    private Integer settingsId;
    private Double serviceCharg;
    private Double vat;

    @Id
    @Column(name = "settings_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getSettingsId() {
        return settingsId;
    }

    public void setSettingsId(Integer settingsId) {
        this.settingsId = settingsId;
    }

    @Basic
    @Column(name = "service_charg")
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

        if (settingsId != null ? !settingsId.equals(settings.settingsId) : settings.settingsId != null) return false;
        if (serviceCharg != null ? !serviceCharg.equals(settings.serviceCharg) : settings.serviceCharg != null)
            return false;
        if (vat != null ? !vat.equals(settings.vat) : settings.vat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = settingsId != null ? settingsId.hashCode() : 0;
        result = 31 * result + (serviceCharg != null ? serviceCharg.hashCode() : 0);
        result = 31 * result + (vat != null ? vat.hashCode() : 0);
        return result;
    }
}
