package com.company;

public abstract class DispositivoDeRede {
    private String enderecoIP;
    private String enderecoMac;

    public abstract String getEnderecoIP();

    public abstract void setEnderecoIP(String enderecoIP);

    public abstract String getEnderecoMac();

    public abstract void setEnderecoMac(String enderecoMac);
}
