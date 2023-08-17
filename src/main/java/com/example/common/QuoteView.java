package com.example.common;

import javax.el.MethodExpression;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionListener;
import java.io.PipedReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ManagedBean
@SessionScoped
public class QuoteView implements Serializable {

    private Integer airQuote = 0;
    private Integer landQuote = 0;
    private Integer seaQuote = 0;
    private List<Port> airPorts = new ArrayList<>();
    private List<Port> landPorts = new ArrayList<>();
    private List<Port> seaPorts = new ArrayList<>();


    private Integer totalQuote = 1000;
    private Integer remainQuote = 1000;
    private Integer airRemaingQuote = 0;
    private Integer landRemaingQuote = 0;
    private Integer seaRemaingQuote = 0;
    private Integer airCurrentPort;
    private Integer airCurrentQuote;
    public void handleQuoteRemain() {
            remainQuote = totalQuote - (airQuote + landQuote + seaQuote);
            airRemaingQuote = airQuote;
        if((airQuote + landQuote + seaQuote) > totalQuote) {
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Quote is over."));
        } else {
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Quote is valid."));
        }
    }
    public Integer getTotalQuote() {
        return totalQuote;
    }

    public void setTotalQuote(Integer totalQuote) {
        this.totalQuote = totalQuote;
    }

    public Integer getAirQuote() {
        return airQuote;
    }

    public void setAirQuote(Integer airQuote) {
        System.out.println("remainQuote: " + this.totalQuote);
        this.airQuote = airQuote;
    }

    public Integer getLandQuote() {
        return landQuote;
    }

    public void setLandQuote(Integer landQuote) {
        this.landQuote = landQuote;
    }

    public Integer getSeaQuote() {
        return seaQuote;
    }

    public void setSeaQuote(Integer seaQuote) {
        this.seaQuote = seaQuote;
    }

    public Integer getRemainQuote() {
        return remainQuote;
    }

    public void setRemainQuote(Integer remainQuote) {
        this.remainQuote = remainQuote;
    }
    public Map<String,Integer> getLuPorts() {
        return PortService.getLuPortList();
    }

    public Integer getAirCurrentPort() {
        return airCurrentPort;
    }

    public void setAirCurrentPort(Integer airCurrentPort) {
        this.airCurrentPort = airCurrentPort;
    }

    public Integer getAirCurrentQuote() {
        return airCurrentQuote;
    }

    public void setAirCurrentQuote(Integer airCurrentQuote) {
        this.airCurrentQuote = airCurrentQuote;
    }

    public void addAirQuote() {
        System.out.println("airCurrentPort: " + this.airCurrentPort);
        System.out.println("airCurrentQuote: " + this.airCurrentQuote);
        this.airRemaingQuote = this.airRemaingQuote - this.airCurrentQuote;
        LuPort port = PortService.getById(this.airCurrentPort);
        this.airPorts.add(new Port(this.airCurrentQuote,port ));
        this.airCurrentQuote = 0;
    }

    public List<Port> getAirPorts() {
        return airPorts;
    }

    public void setAirPorts(List<Port> airPorts) {
        this.airPorts = airPorts;
    }

    public Integer getAirRemaingQuote() {
        return airRemaingQuote;
    }

    public void setAirRemaingQuote(Integer airRemaingQuote) {
        this.airRemaingQuote = airRemaingQuote;
    }

    public void deleteAir(Port port) {
        this.airRemaingQuote = this.airRemaingQuote + port.getQuote();
        this.airPorts.remove(port);
    }
}
